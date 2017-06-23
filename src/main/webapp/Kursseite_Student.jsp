<!-- Autor: Tolga Duman, Erstelldatum: 23.05.2017 -->

<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<title>AWP</title>
		
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
			table {
			   width:25%;
			}
			td {
			  border: 1px solid black;
			  align:centre;
			  vertical-align:top;
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
					<li class="active">AWP</li>
				</ol>
			</div>
			<div class="row">
				<div class="col-lg-5">
					<h3><b>Anwendungsprojekt SS 2017</b></h3>
					<h4>Veranstaltung: Anwendungsprojekt</h4>
					<h4>Semester: Sommersemester 2017</h4>
					<h4>Betreuer: Prof.Dr.Ingo Stengel/Irina Wölfel</h4>
					<h4>Gruppe:</h4>
				</div>
			</div>
			<table border ="1" width="30">
			  <colgroup width="200" span="4"></colgroup>
				<tr align="center" width="30">
					<th align="center" width="30">#</th>
					<th align="center" width="30">Vorname</th>
					<th align="center" width="30">Nachname</th>
				</tr>
				<tr>
					<td align="center" width="30">1</td>
					<td align="center" width="30">Tolga</td>
					<td align="center" width="30">Duman</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
				<tr>
					<td align="center" width="30">2</td>
					<td align="center" width="30">Tülin</td>
					<td align="center" width="30">Duman</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
				<tr>
					<td align="center" width="30">3</td>
					<td align="center" width="30">Eric</td>
					<td align="center" width="30">Adam</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
				<tr>
					<td align="center" width="30">4</td>
					<td align="center" width="30">Burcu</td>
					<td align="center" width="30">Kulaksiz</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
				<tr>
					<td align="center" width="30">5</td>
					<td align="center" width="30">Sakine</td>
					<td align="center" width="30">Ayaz</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
				<tr>
					<td align="center" width="30">6</td>
					<td align="center" width="30">Kaleem</td>
					<td align="center" width="30">Ahmed</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
				<tr>
					<td align="center" width="30">7</td>
					<td align="center" width="30">Son</td>
					<td align="center" width="30">Hoang</td>
					<td align="center" width="30" span="4"><button type="button" class="btn btn-default">
						 Bewerten
					    </button>
					</td>	
				</tr>
			</table>
		</div>
	</div>
	</div>
	</body>
</html>