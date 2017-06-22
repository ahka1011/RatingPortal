
<!-- Autor: Eric Adam, Erstelldatum: 19.05.2017 -->

<!--
	-- Dokumentation zur Datei "Einzelseiten.jsp" --
		
		Pfad im Portal: Login -> Startseite (Dozentensicht) -> konkreter Kurs auswaehlen -> Kursseite
		
		In dieser JSP-File wurde das "Einzelnoten" Fenster implementiert, welche der Dozent sieht, wenn er auf 
		einer Kursseite den Einzelnoten-Button einer konkreten Gruppe auswaehlt.
		Das "Einzelnoten" Fenster einer Gruppe zeigt alle Gruppenmitglieder in Form einer Tabelle an. 
		
		Hierzu wurden die Technologien HTML, CSS, JavaScript und AJAX verwendet.
		Das Design ist ganzheitlich durch Bootstrap und grundsaetzlichen HTML-Elementen gegeben.
		Bootstrap verwendet hierbei Komponenten von JQuery.
		
		Implementiert wurde eine Tabelle mit den Spalten: Name, alle Kriterien, Gesamtnote, Korrekturnote und Notizbox.
		
		Die Zellen einer Zeile und Person ergeben sich jeweils pro Kriterium aus dem Bewertungs-Algorithmus.
		
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
		<title>Einzelnoten</title>

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
					
					<!-- Main-Teil der Einzelnoten-Seite 
							Die Einträge auf dieser Seite sind bis dato mit statischen Daten versorgt. Hier müsste eine dynamische Fütterung mit Daten erfolgen.
							Dies lässt sich mit JS AJAX Funktionen implementieren.
					-->
					<div>
						<!-- Pfadanzeige (Bootstrap Breadcrumbs)-->
						<ol class="breadcrumb">
							<li><a href="Navigationsseite.html">Meine Kurse</a></li>
							<li><a href="Kursseite_Dozent.jsp">AWP</a></li>
							<li class="active">Einzelnoten</li>
						</ol>
					</div>
					<div class="row">
						<div class="col-lg-5">
							<h2>Gruppe 1: <b>HSKA TeamRating-Portal</b></h2>
							<h3>Einzelnoten</h3>
							<p>
								<em>Hier sind die Einzelnoten pro Kriterium fuer diese Gruppe.
									<br><br>
									Jede Einzelnote einer Person wurde hierbei pro Kriterium unter Beruecksichtigung der Gruppennote und der Bewertung von den restlichen Teammitgliedern mit dem implementierten Algorithmus berechnet.
									<br><br>
									Die Gesamtnote ergibt sich aus der summierten Gewichtung der Einzelnoten.
									<br>
								</em>
							</p>
						</div>
						<div class="col-lg-7"></div>
					</div>
					<div class="row">
						<div class="col-lg-2">
							<h3><strong>Gruppennote: 1.7</strong><br></h3>
						</div>
						<div class="col-lg-10"></div>
					</div>
					
					<script lang="javascript">
						/* SaveFinalMarkButton() 
							Diese Methode speichert die "Eingetragene Note" in die Datenbank über den Save Button am Ende der Textbox.
						*/
						function SaveFinalMarkButton(){
							/*var finalmark = new XMLHttpRequest ();
							finalmark.onreadystatechange = function (){
								if (this.readyState == 4 && this.status == 200){
									// TODO - Eingetragene Note in Datenbank speichern
								}
							};
							finalmark.open("POST", /*"Server file location*, true);
							finalmark.send(string);*/
						}
						
						/* SaveNoteButton() 
							Diese Methode speichert die optionale Notiz zur eingetragenen Note in die Datenbank über den Save Button am Ende der Textbox.
						*/
						function SaveNoteButton(){
							/*var note = new XMLHttpRequest ();
							note.onreadystatechange = function (){
								if (this.readyState == 4 && this.status == 200){
									// TODO - Notiz in Datenbank speichern
								}
							};
							note.open("POST", /*"Server file location*, true);
							note.send(string);*/
						}
					</script>
					
					<!-- Responsive Tabelle mit den Gruppen -->
					<div class="row">
						<div class="col-lg-12">
							<div class="table table-responsive">
								<table class="table">
									<thead>
										<tr>
											<!-- Kopfzeile der Tabelle -->
											<th>Name</th>												<!-- Spalte 1-->
											<th style="text-align: center;">Qualitaet</th> 				<!-- Spalte 2-->
											<th style="text-align: center;">Teamfaehigkeit</th>			<!-- Spalte 3-->
											<th style="text-align: center;">Kommunikation</th>			<!-- Spalte 4-->
											<th style="text-align: center;">Technische<br>Kompetenz</th><!-- Spalte 5-->
											<th style="text-align: center;">Fachliche<br>Kompetenz</th>	<!-- Spalte 6-->
											<th style="text-align: center;">Engagement</th>				<!-- Spalte 7-->
											<th style="text-align: center;">Errechnete<br>Gesamtnote</th> 	<!-- Spalte 8-->
											<th style="text-align: left;">Eingetragene Gesamtnote</th> 	<!-- Spalte 9-->
											<th style="text-align: left;">Notizen</th> 					<!-- Spalte 10-->
										</tr>
									</thead>
									<tbody>
										<!-- Datensaetze -->
										<!-- TODO Datenbank-Zugriff: Autoread der Datensaetze mit In Place -->
										<!-- Beispiel Datensatz 1 -->
										<tr>
											<!-- Spalteneintraege -->
											<td style="vertical-align: middle;">Jonas Friedmann</td> <!-- Name Sp1 -->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Qualitaet Sp2-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Teamfaehigkeit Sp3-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Kommunikation Sp4-->
											<td style="text-align: center; vertical-align: middle;"><strong>3.0</strong></td> <!--Technische Kompetenz Sp5-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.3</strong></td> <!--Fachliche Kompetenz Sp6-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Engagement Sp7-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;" id="mark"><strong>2.0</strong></td> <!-- / Errechnete Note Sp8-->
											<td style="text-align: center; vertical-align: middle;"> <!-- Eingetragene Note Sp9-->
												<div class="input-group">
													<input type="text" class="form-control" placeholder="2.0" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note Sp9-->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld Sp10-->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld Sp10-->
										</tr>
										<!-- Beispiel Datensatz 2 -->
										<tr>
											<td style="vertical-align: middle;">Frank Vogel</td>
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Qualitaet-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Teamfaehigkeit-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Kommunikation-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.3</strong></td> <!--Technische Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Fachliche Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Engagement-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;"><strong>1.7</strong></td> <!--/ Errechnete Note-->
											<td style="text-align: center; vertical-align: middle;">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="1.7" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note -->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld -->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld -->
										</tr>
										<!-- Beispiel Datensatz 3 -->
										<tr>
											<td style="vertical-align: middle;">Stefanie Bergmann</td>
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Qualitaet-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.0</strong></td> <!--Teamfaehigkeit-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.0</strong></td> <!--Kommunikation-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Technische Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Fachliche Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Engagement-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;"><strong>1.3</strong></td> <!--/ Errechnete Note-->
											<td style="text-align: center; vertical-align: middle;">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="1.3" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note -->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld -->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld -->
										</tr>
										<!-- Beispiel Datensatz 4 -->
										<tr>
											<td style="vertical-align: middle;">Eric Adam</td>
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Qualitaet-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Teamfaehigkeit-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Kommunikation-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Technische Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Fachliche Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Engagement-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;"><strong>1.7</strong></td> <!--/ Errechnete Note-->
											<td style="text-align: center; vertical-align: middle;">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="1.7" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note -->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld -->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld -->
										</tr>
										<!-- Beispiel Datensatz 5 -->
										<tr>
											<td style="vertical-align: middle;">Thomas Miller</td>
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Qualitaet-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Teamfaehigkeit-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Kommunikation-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Technische Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Fachliche Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Engagement-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;"><strong>1.7</strong></td>  <!--/ Errechnete Note-->
											<td style="text-align: center; vertical-align: middle;">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="1.7" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note -->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld -->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld -->
										</tr>
										<!-- Beispiel Datensatz 6 -->
										<tr>
											<td style="vertical-align: middle;">Sophia Hertzog</td>
											<td style="text-align: center; vertical-align: middle;"><strong>2.3</strong></td> <!--Qualitaet-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Teamfaehigkeit-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Kommunikation-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Technische Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.3</strong></td> <!--Fachliche Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.0</strong></td> <!--Engagement-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;"><strong>2.0</strong></td>  <!--/ Errechnete Note-->
											<td style="text-align: center; vertical-align: middle;">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="2.0" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note -->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld -->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld -->
										</tr>
										<!-- Beispiel Datensatz 7 -->
										<tr>
											<td style="vertical-align: middle;">Franziska Kaufmann</td>
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Qualitaet-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.3</strong></td> <!--Teamfaehigkeit-->
											<td style="text-align: center; vertical-align: middle;"><strong>3.0</strong></td> <!--Kommunikation-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.3</strong></td> <!--Technische Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>1.7</strong></td> <!--Fachliche Kompetenz-->
											<td style="text-align: center; vertical-align: middle;"><strong>2.3</strong></td> <!--Engagement-->
											<td style="text-align: center; font-size: 20px; vertical-align: middle;"><strong>2.0</strong></td> <!--/ Errechnete Note-->
											<td style="text-align: center; vertical-align: middle;">
												<div class="input-group">
													<input type="text" class="form-control" placeholder="2.0" id="finalmark">
													<span class="input-group-btn">
														<a href="#" class="btn btn-primary" onclick="SaveFinalMarkButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Eingetragene Note -->
											<td style="text-align: center; vertical-align: middle;"> <!-- Notizfeld -->
												<div class="input-group">
													<!-- Textbox für Notizen -->
													<input type="text" class="form-control" placeholder="Notizen" id="notes">
													<!-- Save Button für Notizen --> 
													<span class="input-group-btn">
														<a href="#" class="btn btn-info" onclick="SaveNoteButton()"><span class="glyphicon glyphicon-floppy-disk"></span></a>
													</span>
												</div>
											</td> <!-- / Notizfeld -->
										</tr>
										<!-- weitere Datensaetze -->
										<!-- ... -->
									</tbody>
								</table>
							</div> <!-- / Table-Responsive -->
						</div> <!-- / 12er Columne fuer Table -->
					</div><!-- / row fuer Table-->
				</div> <!-- / 12er Columne fuer Seite -->
			</div> <!-- / row fuer Seite -->
		</div> <!-- / container fluid -->
	</body>
</html>