<!DOCTYPE html>
<%@page import="com.rating.domain.User"%>
<html lang="en">
  <head>
  
  <!-- 
  
<%
User u = (User)session.getAttribute("user");
String uid = u.getUsername();
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
						<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/" width="100px" height="100px">
					</div>
					<div class="col-lg-1">
						 <span class="label label-default" id="username">Max Mustermann</span> 
						<button type="button" onclick="Logout()" class="btn btn-default">
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
								<table class="table table-responsive">
									<tr>	
										<td>
											<label>AWP</label>
										</td>
										<td style= "text-align: right">
											<a href="Kursseite_Dozent.html" class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> Kurs einsehen</a>
											<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-remove"></span>Kurs löschen</a>
											<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-ok"></span> Bewertung freigeben</a>
										</td>
									</tr>
									<tr>
										<td>
											<label>EWI</label>
										</td>
										<td style= "text-align: right">
											<a href="Kursseite_Dozent.html" class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> Kurs einsehen</a>
											<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-remove"></span>Kurs l&ouml;schen</a>
											<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-ok"></span> Bewertung freigeben</a>
										</td>
									</tr>
								</table>
							
							<h3 class="text-left">
								Vorlagen
							</h3>
							<div class="row">
								<div class="col-lg-12" >
									<table class="table table-responsive">
										<tr>	
											<td>
												<label style="text-align: center">AWP</label>
											</td>
											<td>
											</td>
											<td style="text-align: right">
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-file"></span> Vorlage duplizieren</a>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-pencil"></span> Vorlage bearbeiten</a>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-remove"></span> Vorlage löschen</a>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-plus"></span> Kurs anlegen</a>
											</td>
										</tr>
										<tr>
											<td>
												<label style="text-align: center">EWI</label>
											</td>
											<td>
											</td>
											<td style= "text-align: right">
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-file"></span> Vorlage duplizieren</a>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-pencil"></span> Vorlage bearbeiten</a>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-remove"></span> Vorlage löschen</a>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-plus"></span> Kurs anlegen</a>
											</td>
										</tr>
										<tr>
											<td>
												<a href="#" class="btn btn-default"><span class="glyphicon glyphicon-plus"></span> Neue Vorlage</a>
											</td>
										</tr>
									</table>
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
    <script src="js/main.js"></script>
    <script src="js/scripts.js"></script>
    <script type="text/javascript">
   	function getdata() {
    $.ajax({
			type: "GET",
			url: "https://localhost:8443/ratingp/rest/courses/student/<%=uid%>",
			dataType: 'json',
			success: function(data){
				if (data != null){
					alert(JSON.stringify(data));
				}
				else{
					alert("Incorrect username or password!");
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