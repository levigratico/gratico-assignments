<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First Assignment</title>
<link rel="stylesheet" href="../../webjars/bootstrap/3.3.7/css/bootstrap.css">
<style>
	.jumbotron {
		margin-top: 20px;
	}
	
	.panel-custom {
		padding-left: 0px;
		padding-right: 0px;
		margin-top: 0px !important;
	}
	
	.btn-group-wrap {
		text-align: center;
	}
	
	div.btn-group {
		margin: 0 auto; 
	    text-align: center;
	    width: inherit;
	}
	
	div.btn-group button {
	    float: left;   
	}
	
</style>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<div class="panel-group row">
			    <div class="panel panel-default col-lg-4 panel-custom">
			      <div class="panel-heading">Converter</div>
			      <div class="panel-body">
			      	<div class="btn-group-wrap">
				      	<div class="btn-group btn-group-sm" style="">
						    <button id="temperature" type="button" class="btn btn-primary">Temperature</button>
						    <button id="distance" type="button" class="btn btn-primary">Distance</button>
						    <button type="button" class="btn btn-primary">Weight</button>
						 </div>
					 </div>
					 <div style="margin-top: 5px;">
					 	<div class="form-group">
						  <label for="usr" id="labelConverterFirst">Kilometer:</label>
						  <input type="number" class="form-control" id="valueA">
						</div>
						<div class="form-group">
						  <label for="pwd" id="labelConverterSecond" >Meter:</label>
						  <input type="number" class="form-control" id="valueB" value="0" readonly="readonly">
						</div>
					 </div>
					 <div class="btn-group-wrap" style="margin-top: 5px;">
				      	<div class="btn-group btn-group-sm" style="">
						    <button type="button" id="convert" class="btn btn-primary">Convert</button>
						    <button type="button" class="btn btn-primary">Reverse</button>
						 </div>
					 </div>
			      </div>
			    </div>
			    <div class="panel panel-default col-lg-4 panel-custom">
			      <div class="panel-heading">Sorting</div>
			      <div class="panel-body">
			      	<div style="padding: 0 60px;">
					    <label class="radio-inline"><input id="asc" type="radio" name="optradio">Ascending</label>
						<label class="radio-inline"><input id="desc"  type="radio" name="optradio">Descending</label>
				    </div>
				    <div style="margin-top: 5px;">
					 	<div class="form-group">
						  <label for="usr">Input:</label>
						  <input type="text" class="form-control" id="valueC">
						</div>
						<div class="form-group">
						  <label for="pwd">Output:</label>
						  <input type="text" class="form-control" id="valueD" value="0" readonly="readonly">
						</div>
					 </div>
					 <div style="margin-top: 20px;">
					 	<button type="button" class="btn btn-primary btn-block">Sort</button>
					 </div>
			      </div>
			    </div>
			    <div class="panel panel-default col-lg-4 panel-custom">
			      <div class="panel-heading">Palindrome</div>
			      <div class="panel-body">
			      	<div style="margin-top: 5px;">
					   <div class="form-group">
						  <label for="usr">Input:</label>
						  <input type="text" class="form-control" id="valueE">
						</div>
						<div class="form-group">
						  <label for="pwd">Output:</label>
						  <input type="text" class="form-control" id="valueF" value="0" readonly="readonly">
						</div>
					 </div>
					 <div style="margin-top: 40px;">
					 	<button type="button" class="btn btn-primary btn-block" id="check">Check</button>
					 </div>
			      </div>
			    </div>
			  </div>
		</div>
	</div>
</body>
<script src="../../webjars/jquery/3.3.1/dist/jquery.min.js"></script>
<script src="../../webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="../../resources/js/keme.js"></script>
<script>
	
	var converterFlag = 0;

	document.getElementById('check').addEventListener('click', function() {
		window.alert("Levi");
	});
	
	document.getElementById('temperature').addEventListener('click', function() {
		// for temperature
		document.getElementById('labelConverterFirst').textContent = 'Celsius:';
		document.getElementById('labelConverterSecond').textContent = 'Fahrenheit:';
		converterFlag = 0;
		
	});
	
	document.getElementById('distance').addEventListener('click', function() {
		// for Distance
		converterFlag = 1;
		
	});
	
	document.getElementById('convert').addEventListener('click', function() {
		switch(converterFlag) {
		case 0: // Temperature
			for(var i = 0; i < 2; i++) {
				console.log(i);
			}
			
		if(document.getElementById('asc').checked) {
			// for ascending
			window.alert('levi');
		}
		
		if(document.getElementById('desc').checked) {
			// for descending
			window.alert('noe');
		}
			
		break;
		case 1: // Distance
			window.alert("Levi");
		break;
		case 2: // Weight
		break;
		}
	});
	
	
	
	
	
	
</script>
</html>