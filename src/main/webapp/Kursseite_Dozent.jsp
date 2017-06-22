
<!-- Autor: Eric Adam, Erstelldatum: 19.05.2017 -->

<!--
	-- Dokumentation zur Datei "Kursseite.jsp" --
		
		Pfad im Portal: Login -> Startseite (Dozentensicht) -> konkreter Kurs auswaehlen -> Kursseite
		
		In dieser JSP-File wurde die "Kursseite" implementiert, welche der Dozent sieht, wenn er auf 
		seiner Startseite einen konkreten, laufenden Kurs, z.B. eBusiness, auswaehlt.
		Die "Kursseite" eines Kurses zeigt alle Gruppen des gewaehlten Kurses in Form einer Tabelle an. 
		
		Hierzu wurden die Technologien HTML, CSS, JavaScript und AJAX verwendet.
		Das Design ist ganzheitlich durch Bootstrap und grundsaetzlichen HTML-Elementen gegeben.
		Bootstrap verwendet hierbei Komponenten von JQuery.
		
		Implementiert wurde eine Tabelle mit den Spalten: Nr., Name, Beschreibung, Gruppennote, 
		Einzelnoten-Button (pro Zeile, bzw. Gruppe) sowie Loeschen-Button (pro Zeile, bzw. Gruppe). 
		
		Der Einzelnoten-Button ist lediglich eine Verknuepfung zu den Einzelnoten der jeweiligen Gruppe.
		Der Loeschen-Button realisiert die Moeglichkeit des Loeschens einer Gruppe, bzw. Zeile.
		
		Bei jeder GUI Komponente wurde jeweils direkt davor kommentiert, um welche Komponente es sich handelt
		und gegebenenfalls welche Technologie im Einzelnen verwendet wurde.
-->

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<!-- Dateiname, sowie Browser-Tab-Name -->
		<title>Kursseite_Dozent</title>

		<meta name="author" content="Eric Adam">
		
		<!-- Formatvorgaben fuer das Logo -->
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
		
		<!-- Einbindung von Komponenten zum Betrieb von Bootstrap 
			Damit das Design von Bootstrap in HTML implementiert und ausgefuehrt werden kann, muessen verschiedene
			Komponenten anderer Technologien eingebunden werden.

			Einbindung von CSS fuer Bootstrap 
			Die jeweiligen Komponenten muessen im Ordner "css", im gleichen Verzeichnis wie diese Datei, abgelegt werden.
		-->
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<link href="css/style.css" rel="stylesheet">
		
		<!-- Einbindung von JavaScript-Files zu Bootstrap und JQuery
			Die jeweiligen Komponenten sind im Ordner "js", im gleichen Verzeichnis wie diese Datei, abgelegt.
		-->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/scripts.js"></script>
	</head>

	<!-- 
		Bootstrap ist in Columnes aufgeteilt. Jede Row entspricht einer Zeile auf der Weboberfläche und hat jeweils 12 Columnes.
		Somit müssen sich die Anzahl der Columnes pro Row jeweils auf 12 summieren. 
		Mit den Columnes kann man den erforderlichen Platz für jedes Element auf der Weboberfläche einteilen. 
		Im Page-Header zum Beispiel lässt sich dies gut betrachten. 1 + 9 + 1 + 1 = 12 Columnes.
	-->
	
	<!-- BODY -->
	<body>
		<div class="container-fluid">
			<div class="row">
				<div class="col-lg-12">
					<!-- PAGE-HEADER -->
					<div class="page-header">
						<div class="row">
							<div class="col-lg-1">
								<img id="logo" alt="HSKA Logo" src="https://ilias.hs-karlsruhe.de/Customizing/global/skin/hska/images/HeaderIcon.svg">
							</div>
							<div class="col-lg-9">
									<h1>
										<!-- Seiten-Überschrift -->
										TeamRating - Portal
										<div>
											<img alt="HSKA IWI Logo" src="https://www.iwi.hs-karlsruhe.de/intranet/images/hska-wii_rot/iwi_ci_logo25.png?usn=263662077">
										</div>
									</h1>
							</div>
							<!-- beispielhaftes Profil-Bild -->
							<div class="col-lg-1">
								<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/" width="100px" height="100px">
							</div>
							<!-- Abmelden Button -->
							<div class="col-lg-1">
								<script lang="javascript">
									function Logout(){
										if (window.confirm ("Wollen Sie sich wirklich abmelden?") == true){
											/* AJAX - XMLHttpRequest
											var logout = new XMLHttpRequest ();
											logout.onreadystatechange = function (){
												if (this.readyState == 4 && this.status == 200){
													// TODO - Logout durchfuehren
												}
											};
											logout.open("POST", /*"Server file location*, true);
											logout.send(string);*/
										}
									}
								</script>
								<!-- IZ-Kuerzel Benutzerlabel und Logout Button-->
								<span class="label label-default" style="font-size: 16px;">ader1012</span> 
								<button type="button" class="btn btn-default" onclick="Logout()">Abmelden</button>
							</div>
						</div> <!-- / row für Page-Header -->
					<br>
					</div> <!-- / Page-Header -->
					
					<!-- Main-Teil der KURSSEITE 
							Die Einträge auf dieser Seite sind bis dato mit statischen Daten versorgt. Hier müsste eine dynamische Fütterung mit Daten erfolgen.
							Dies lässt sich mit JS AJAX Funktionen implementieren.
					-->
					<div>
						<!-- Pfadanzeige (Bootstrap Breadcrumbs)-->
						<ol class="breadcrumb">
							<li><a href="Navigationsseite.html">Meine Kurse</a></li>
							<li class="active">AWP</li>
						</ol>
					</div>
					
					<!-- DeleteGroupButton (JS Confirm Box, XMLHttpRequest)
						Diese Methode löscht eine Gruppe des aktuellen Kurses aus der Datenbank.
					-->
					<script lang="javascript">
						function DeleteGroupButton() {
							if (window.confirm("Wollen Sie diese Gruppe wirklich loeschen?") == true) {
								/*// XMLHttpRequest
								var del = new XMLHttpRequest ();
								del.onreadystatechange = function (){
									if (this.readyState == 4 && this.status == 200){
										// -> lösche Datensatz der Gruppe aus Datenbank
									}
								};
								del.open("POST", /*"Server file location*, true);
								del.send(string);*/
								
								alert ("Sie haben die Gruppe geloescht!");
							}
						}
					</script>
					
					
					<!-- KURSTABELLE mit allen Gruppen -->
					
					<!-- Überschriften -->
					<h2>Kurs: <strong>AWP</strong></h2>
					<h3>Gruppen</h3>
					<p><em>Hier sind die aktuellen Gruppen des gewaehlten Kurses.</em></p>
					
					<!-- JavaScript Funktionen für Buttons -->
					<script lang="javascript">
						/* AddGroupButton (JS Prompt Box, AJAX - XMLHttpRequest)
							Diese Methode fügt, unter Angabe von Gruppennamen und Beschreibung, eine neue Gruppe in den aktuellen Kurs hinzu.
						*/
						function AddGroupButton() {
							var groupname = window.prompt ("Bitte geben Sie den Gruppennamen ein:",""); <!-- Prompt -> Browser-Popup -->
							if (groupname == null | groupname == ""){
							} else {
								var groupdescription = window.prompt ("Bitte geben Sie eine Gruppenbeschreibung ein:","");
								if (groupdescription == null | groupdescription == ""){
									alert ("Sie haben keine Gruppenbeschreibung eingegeben! Der Vorgang wurde abgebrochen.");
								} else {
									/*/ AJAX - XMLHttpRequest
									var add = new XMLHttpRequest ();
									add.onreadystatechange = function (){
										if (this.readyState == 4 && this.status == 200){
											// -> Lade neue Gruppe in Datenbank
										}
									}
									<!-- Request wird ausgeführt mit POST, es werden groupname und groupdescription über die URI übergeben -->
									add.open ("POST", /*"Server file location?gname=" + groupname + "&gdescr=" + groupdescription*, true);
									add.send(string);*/
									alert ('Die Gruppe: "' + groupname + '" wurde erfolgreich erstellt.');
								}
							}
						}
						
						/* AddEmptyGroupButton (AJAX - XMLHttpRequest) 
							Diese Methode fügt eine leere Gruppe der Tabelle hinzu, also ohne Parameter.
						*/
						function AddEmptyGroupButton() {
							/*/ XMLHttpRequest
							var add = new XMLHttpRequest ();
							add.onreadystatechange = function (){
								if (this.readyState == 4 && this.status == 200){
									// -> Lade neue Gruppe in Datenbank
								}
							}
							add.open ("POST", /*"Server file location"*, true);
							add.send(string);*/
						}
					</script>
					<br>
					<div class="row">
						<div class="col-lg-1">
							<!-- HTML-Element für "AddGroupButton()" -->
							<a href="#" class="btn btn-success" onclick="AddGroupButton()"><span class="glyphicon glyphicon-plus"></span> Hinzufuegen </a>
						</div>
						<div class="col-lg-1">
							<!-- HTML-Element für "AddEmptyGroupButton()" -->
							<a href="#" class="btn btn-success" onclick="AddEmptyGroupButton()"><span class="glyphicon glyphicon-plus"></span> Leere Gruppe </a>
						</div> <!-- / AddGroupButton -->
						<div class="col-lg-10"></div>
					</div>
					<br>
					
					<!-- responsive Tabelle, welche alle Gruppen, des gewählten Kurses beinhaltet. -->
					<div class="row">
						<div class="col-lg-10">
							<div class="table-responsive">
								<!--Tabelle mit Gruppen-->
								<table class="table">
									<thead>
										<!-- Spalten -->
										<tr>
											<th>Nr.</th>
											<th>Name</th>
											<th>Beschreibung</th>
											<th>Gruppennote</th>
											<th>Einzelnoten</th>
											<th>Loeschen?</th>
										</tr>
									</thead>
									<tbody>
										<!-- statische Datensaetze -->
										<!-- Beispiel Datensatz 1 -->
										<tr>
											<!-- Zellen Einträge -->
											<td>1</td>
											<td>HSKA TeamRating-Portal</td>
											<td><p>Wir implementieren ein Online-Portal, welches eine transparente und faire Benotung innerhalb von Gruppenarbeiten ermoeglicht.</p></td>
											<td style="text-align: center; vertical-align: text-top; font-size: 16px"><strong>1.7</strong></td>
											<td style="text-align: center; vertical-align: text-top;"><a href="Einzelnoten.jsp" class="btn btn-primary" onclick="EinzelnotenButton()"><span class="glyphicon glyphicon-share"></span></a></td>
											<td style="text-align: center; vertical-align: text-top;"><a href="#" class="btn btn-danger" onclick="DeleteGroupButton()"><span class="glyphicon glyphicon-remove"></span></a></td>
										</tr>
										<!-- Beispiel Datensatz 2 -->
										<tr>
											<td>2</td>
											<td>SmartMirror</td>
											<td><p>Wir implementieren einen smarten Spiegel, welcher Wetterberichte, To-Do's, Erinnerungen und News anzeigt.</p></td>
											<td style="text-align: center; vertical-align: text-top; font-size: 16px"><strong>2.0</strong></td>
											<td style="text-align: center; vertical-align: text-top;"><a href="Einzelnoten.jsp" class="btn btn-primary" onclick="EinzelnotenButton()"><span class="glyphicon glyphicon-share"></span></a></td>
											<td style="text-align: center; vertical-align: text-top;"><a href="#" class="btn btn-danger" onclick="DeleteGroupButton()"><span class="glyphicon glyphicon-remove"></span></a></td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div class="col-lg-2"></div>
					</div> <!-- / row für Table -->
				</div> <!-- / 12er Columne für Seite -->
			</div> <!-- / row für Seite -->
		</div> <!-- / Container Fluid für Seite -->
	</body>
</html>