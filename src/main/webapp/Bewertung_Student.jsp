<!-- Autor: Tolga Duman, Erstelldatum: 18.06.2017 -->

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>Bewertung der Gruppenmitglieder</title>

		<meta name="description" content="Source code generated using layoutit.com and modified by S.H.">
		<meta name="author" content="Tolga Duman">
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
		
		<!--Bootstrap, CSS-->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		
		<!--JavaScript, JQuery, Bootstrap-->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/scripts.js"></script>
	</head>

	
	<!-- BODY -->
	<body>
	<div class="container-fluid">
	<br>
	<div class="row">
		<div class="col-lg-12">
			<!-- HEADER -->
			<div class="row">
				<div class="col-lg-1">
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
				<!-- Abmelden Button -->
				<div class="col-lg-1">
					<script>
						function Logout(){
							if (window.confirm ("Wollen Sie sich wirklich abmelden?") == true){
								// TODO Logout durchführen
							}
						}
					</script>
					<span class="label label-default" style="font-size: 16px;">duto1013</span> 
					<button type="button" class="btn btn-default" onclick="Logout()">Abmelden</button>
				</div>
			</div>
			
			<!-- Kursseite -->
			<div>
				<!-- Pfadanzeige -->
				<ol class="breadcrumb">
					<li><a href="#">Meine Kurse</a></li>
					<li><a href="#">AWP</a></li>
					<li class="active">Bewertung</li>
				</ol>
			</div>
			<div class="row">
				<div class="col-lg-5">
					<h2>Gruppe 1: <b>HSKA TeamRating-Portal</b></h2>
					<h3>Bewertung der Gruppenmitglieder</h3>
					<p>
						Hier können Sie Ihre Gruppenmitglieder anhand von folgenden Kriterien bewerten:
							<br><br>
							<strong>Qualität, Teamfähigkeit,Kommunikation, Technische Kompetenz, Fachliche Kompetenz, Engagement</strong>
							<br><br>
							Die Gesamtnote ergibt sich aus der summierten Gewichtung der Einzelnoten.
							<br><br>
					</p>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-10">
					<div class="table-responsive">
						<!--Tabelle mit Gruppen-->
						<table class="table">
							<thead>
								<tr>
									<th>Name</th>
									<th>Qualität</th>
									<th>Teamfähigkeit</th>
									<th>Kommunikation</th>
									<th>Technische Kompetenz</th>
									<th>Fachliche Kompetenz</th>
									<th>Engagement</th>
								</tr>
							</thead>
							<tbody>
								<!-- Datensätze -->
								<!-- Beispiel Datensatz für Stundent 1 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Tolga Duman</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
								<!-- Beispiel Datensatz für Stundent 2 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Burcu Kulaksiz</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
								<!-- Beispiel Datensatz für Stundent 3 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Kaleem Ahmed</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
								<!-- Beispiel Datensatz für Stundent 4 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Eric Adam</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
								<!-- Beispiel Datensatz für Stundent 5 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Tülin Duman</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
								<!-- Beispiel Datensatz für Stundent 6 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Son Hoang</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
								<!-- Beispiel Datensatz für Stundent 7 bzgl. folgender Kriterien: Qualität,Teamfähigkeit,Kommunikation,Technische Kompetenz,Fachliche Kompetenz,Engagement -->
								<tr>
								    <!-- Beginn von Bewertung für Kriterium "Qualität" -->
									<td>Sakine Ayaz</td>
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Qualität" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Teamfähigkeit" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Teamfähigkeit" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Kommunikation" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Kommunikation" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Technische Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Technische Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Fachliche Kompetenz" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Fachliche Kompetenz" -->
									</td>
									<!-- Beginn von Bewertung für Kriterium "Engagement" -->
									<td>
									<input type="text" name="Noten" list="Noten">
										<datalist id="Noten">
											<option value="1,0" />
											<option value="1,3" />
											<option value="1,7" />
											<option value="2,0" />
											<option value="2,3" />
											<option value="2,7" />
											<option value="3,0" />
											<option value="3,3" />
											<option value="3,7" />
											<option value="4,0" />
										</datalist>
									</input>
									<!-- Ende von Bewertung für Kriterium "Engagement" -->
									</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	</body>
</html>