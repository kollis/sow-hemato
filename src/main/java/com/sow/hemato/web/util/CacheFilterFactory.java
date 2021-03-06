/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sow.hemato.web.util;

import com.sun.jersey.api.model.AbstractMethod;
import com.sun.jersey.spi.container.ContainerRequest;
import com.sun.jersey.spi.container.ContainerRequestFilter;
import com.sun.jersey.spi.container.ContainerResponse;
import com.sun.jersey.spi.container.ContainerResponseFilter;
import com.sun.jersey.spi.container.ResourceFilter;
import com.sun.jersey.spi.container.ResourceFilterFactory;
import java.util.Collections;
import java.util.List;
import javax.ws.rs.core.HttpHeaders;

public class CacheFilterFactory implements ResourceFilterFactory {
    private static final List<ResourceFilter> NO_CACHE_FILTER = Collections.<ResourceFilter>singletonList(new CacheResponseFilter("no-cache"));

    @Override
    public List<ResourceFilter> create(AbstractMethod am) {
    	HematoCacheControl cch = am.getAnnotation(HematoCacheControl.class);
        if (cch == null) {
            return NO_CACHE_FILTER;
        } else {
            return Collections.<ResourceFilter>singletonList(new CacheResponseFilter(cch.cacheControl()));
        }
    }

    private static class CacheResponseFilter implements ResourceFilter, ContainerResponseFilter {
        private final String headerValue;

        CacheResponseFilter(String headerValue) {
            this.headerValue = headerValue;
        }

        @Override
        public ContainerRequestFilter getRequestFilter() {
            return null;
        }

        @Override
        public ContainerResponseFilter getResponseFilter() {
            return this;
        }

        @Override
        public ContainerResponse filter(ContainerRequest request, ContainerResponse response) {
            // attache Cache Control header to each response based on the annotation value
            response.getHttpHeaders().putSingle(HttpHeaders.CACHE_CONTROL, headerValue);
            return response;
        }
    }
}
