<!DOCTYPE html>
<%@page import="com.rating.domain.User"%>
<html lang="en">
  <head>
  
  <!-- 
  
<%
User u = (User)session.getAttribute("user");
String uid = u.getUsername();
String t = u.getToken().toString();
String role = u.getRole();
%>
<%=u.toString()%>

  

   -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>TeamRating - Portal</title>

    <meta name="S.H." content="RatingPortal">
	<style>
		#logo{
			display: table-cell;
			text-align: center;
			vertical-align: middle;
			position: absolute;
			width: 120px;
			height: 120px;
			max-width: 100%;
		}
	</style>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
  </head>
  <body onload="getdata()">
    <div class="container-fluid">
		<div class="row">
			<div class="col-lg-12">
				<div class="row">
					<div class="col-lg-1">
					<p></p>
						<img id="logo" alt="HSKA IWI" src="https://ilias.hs-karlsruhe.de/Customizing/global/skin/hska/images/HeaderIcon.svg">
					</div>
					<div class="col-lg-9">
						<div class="page-header">
							<h1>
								TeamRating - Portal
								<div>
									<img alt="HSKA icon" src="https://www.iwi.hs-karlsruhe.de/intranet/images/hska-wii_rot/iwi_ci_logo25.png?usn=263662077">
								</div>
							</h1>
						</div>
					</div>
					<div class="col-lg-1">
						<img src="img/userIcon.png" width="100px" height="100px">
					</div>
					<div class="col-lg-1">
						 <h4><label id="username" style="text-align: center"></label></h4> 
						<button type="button" onclick="Logout()" class="btn btn-default" style="text-align: center">
							abmelden
						</button>
					</div>
				</div>
					<ol class="breadcrumb">
						<li class="active">Startseite</li>
					</ol>
				<div class="row">
					<div class="col-lg-12">
						<h3 class="text-left">
							Kurse
						</h3>
						<div class="row">
							<div class="col-lg-12" >
								<table class="table table-responsive" id="kursTabelle">
									<tr>
										<td>
											<h4><label>Nr.</label></h4>
										</td>
										<td>
											<h4><label>Titel</label></h4>
										</td>
										<td>
											<h4><label>Semester</label></h4>
										</td>
										<td>
											<h4><label>Prof.</label></h4>
										</td>
									</tr>
									<!-- 
									<tr>	
										<td>
											<label id="kursNr0">1</label>
										</td>
										<td>
											<label id="kursTitle0">AWP</label>
										</td>
										<td>
											<label id="kursSemester0">6</label>
										</td>
										<td>
											<label id="kursProf0">Hr. Stengel</label>
										</td>
										<td style= "text-align: right">
											<a href="Kursseite_Dozent.jsp" class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> Kurs einsehen</a>
											<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-remove"></span>Kurs l&ouml;schen</a>
											<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-ok"></span> Bewertung freigeben</a>
										</td>
									</tr>
									 -->
								</table>
							<div id=template>
							<h3 class="text-left">
								Vorlagen
							</h3>
							<div class="row">
								<div class="col-lg-12" >
									<table class="table table-responsive" id=tableTemplate>
										<tr>
											<td>
												<h4><label>Nr.</label></h4>
											</td>
											<td>
												<h4><label>Titel</label></h4>
											</td>
											<td>
												<h4><label>Semester</label></h4>
											</td>
											<td>
												<h4><label>Prof.</label></h4>
											</td>
										</tr>
										<tr>
											<td>
												<button class="btn btn-default" data-toggle="modal" data-target="#myModal"><span class="glyphicon glyphicon-plus"></span> Neue Vorlage</button>
											</td>
										</tr>
									</table>
									<!-- Modal -->
									  <div class="modal fade" id="myModal" role="dialog">
									    <div class="modal-dialog">
									    
									      <div class="modal-content">
									      	<div class="modal-header">
									        	<button type="button" class="close" data-dismiss="modal">&times;</button>
									        	<h4 class="modal-title">Neue Vorlage</h4>
									        </div>
									        <div class="modal-body">
									        	<p>Kurs Nr.: </p>
									        	<input type="text" id="inputKursNr" class="form-control" placeholder="Kursnummer">
									        	<p>Titel: </p>
									        	<input type="text" id="inputTitle" class="form-control" placeholder="Kurstitel">
									          	<p>Semester: </p>
									          	<input type="text" id="inputSemester" class="form-control" placeholder="Semester">
									          	<p>Professor: </p>
									          	<input type="text" id="inputProf" class="form-control" placeholder="Professor">
									        </div>
									        <div class="modal-footer">
									        	<button type="button" class="btn btn-default" data-dismiss="modal" id="submitTemplate">Create</button>
									        	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
									      	</div>
									    	</div>
									      
									    </div>
									  </div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/createTemplate.js"></script>
	<script type="text/javascript">
	function Logout(){
		if (window.confirm ("Wollen Sie sich wirklich abmelden?") == true){
			$.ajax({
				type: "POST",
				url: "https://localhost:8443/ratingp/rest/session/logout",
				dataType: 'json',
				data: {},
				success: function(data){
						alert(JSON.stringify(data));
						window.location.href = "Anmeldemaske.jsp";
				},
				error: function(request, status, error) {
					alert("Request failed!");
					console.log("Request: " + request);
					console.log("Status: " + status);
					console.log("Error: " + error);
				}
			});
		}
}
	</script>
    <script type="text/javascript">
    function getdata() {
    	$.ajaxSetup({
    	    beforeSend: function(xhr) {
    	        xhr.setRequestHeader('token', '<%=t%>');
    	    }
    	});
    	document.getElementById("username").innerHTML = "<%=uid%>";
    	document.getElementById("template").style.visibility = "hidden";
    	   	if("<%=role%>" == "Student"){
    	   	document.getElementById("template").style.visibility = "visible";
    	   	$.ajax({
 				type: "GET",
 				url: "https://localhost:8443/ratingp/rest/prof/templateList/<%=uid%>",
 				dataType: 'json',
 				success: function(data){
 					if (data != null){
 						var i = 0;
 						var table = document.getElementById("tableTemplate");
 						$.each(data, function() {
 							var row = table.insertRow(1);
 							var cell1 = row.insertCell(0);
 							var cell2 = row.insertCell(1);
 							var cell3 = row.insertCell(2);
 							var cell4 = row.insertCell(3);
 							cell1.innerHTML = data[i].kurs_nr;
 							cell2.innerHTML = data[i].bezeichnung_kurs;
 							cell3.innerHTML = data[i].semester_kurs;
 							cell4.innerHTML = data[i].iz_kuerzel;
 							++i;
 						});
 						var vorlage = document.getElementById("tableTemplate");
 					}
 					else{
 						alert("Data: null!");
 					}
 				},
 				error: function(request, status, error) {
 					alert("Request failed!");
 					console.log("Request: " + request);
 					console.log("Status: " + status);
 					console.log("Error: " + error);
 				}
 			});
    	   	 $.ajax({
 				type: "GET",
 				url: "https://localhost:8443/ratingp/rest/courses/prof/<%=uid%>",
 				dataType: 'json',
 				success: function(data){
 					if (data != null){
 						var i = 0;
 						var table = document.getElementById("kursTabelle");
 						$.each(data, function() {
 							var row = table.insertRow(1);
 							var cell1 = row.insertCell(0);
 							var cell2 = row.insertCell(1);
 							var cell3 = row.insertCell(2);
 							var cell4 = row.insertCell(3);
 							cell1.innerHTML = data[i].kurs_nr;
 							cell2.innerHTML = data[i].bezeichnung_kurs;
 							cell3.innerHTML = data[i].semester_kurs;
 							cell4.innerHTML = data[i].iz_kuerzel;++i;
 						});
 						var vorlage = document.getElementById("tableTemplate");
 					}
 					else{
 						alert("Data: null!");
 					}
 				},
 				error: function(request, status, error) {
 					alert("Request failed!");
 					console.log("Request: " + request);
 					console.log("Status: " + status);
 					console.log("Error: " + error);
 				}
 			});
    	   	}
    	   	else if ("<%=role%>" == "Studen"){
    	   		pfad = "student";
    	   	}
    	   	
    	    $.ajax({
    				type: "GET",
    				url: "https://localhost:8443/ratingp/rest/stud/courses/<%=uid%>",
    				dataType: 'json',
    				success: function(data){
    					if (data != null){
    						var i = 0;
    						var table = document.getElementById("kursTabelle");
    						$.each(data, function() {
    							var row = table.insertRow(1);
    							var cell1 = row.insertCell(0);
    							var cell2 = row.insertCell(1);
    							var cell3 = row.insertCell(2);
    							var cell4 = row.insertCell(3);
    							cell1.innerHTML = data[i].kurs_nr;
    							cell2.innerHTML = data[i].bezeichnung_kurs;
    							cell3.innerHTML = data[i].semester_kurs;
    							cell4.innerHTML = data[i].iz_kuerzel;
    							++i;
    						});
    					}
    					else{
    						alert("Data: null!");
    					}
    				},
    				error: function(request, status, error) {
    					alert("Request failed!");
    					console.log("Request: " + request);
    					console.log("Status: " + status);
    					console.log("Error: " + error);
    				}
    			});
    	}
    </script>
  </body>
</html>