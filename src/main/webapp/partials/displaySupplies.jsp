<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Example of Twitter Bootstrap 3 Tables with Alternate Background</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<style type="text/css">
    .bs-example{
    	margin: 20px;
    }
    
</style>
</head>
<body>
<div class="bs-example">
    <table class="table table-bordered">
        <thead>
            <tr>
                <th>Row</th>
                <th>Group</th>
                <th>Liters</th>
                <th>Blood Bank</th>
                <th>City</th>
            </tr>
        </thead>
        <tbody>
            <tr data-ng-repeat='row in suppliesReport.supplyDetail'>
  				<td>{{row.id}}</td>
  				<td>{{row.group}}</td>
  				<td>{{row.liters}}</td>
  				<td>{{row.bloodBank}}</td>
  				<td>{{row.city}}</td>					
			</tr>
        </tbody>
    </table>
</div>
</body>
</html>                                		