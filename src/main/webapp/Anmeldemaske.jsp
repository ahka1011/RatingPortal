<!DOCTYPE html>
<html lang="en">
  <head>
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
  <body>

    <div class="container-fluid">
	<div class="row">
		<div class="col-lg-12">
			<div class="row">
				<div class="col-lg-1">
				<p></p>
					<img id="logo" alt="HSKA IWI" src="https://ilias.hs-karlsruhe.de/Customizing/global/skin/hska/images/HeaderIcon.svg">
				</div>
				<div class="col-lg-11">
					<div class="page-header">
						<h1>
							TeamRating - Portal
							<div>
								<img alt="HSKA icon" src="https://www.iwi.hs-karlsruhe.de/intranet/images/hska-wii_rot/iwi_ci_logo25.png?usn=263662077">
							</div>
						</h1>
					</div>
				</div>
			</div>
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<div class="row">
							<div class="col-lg-6">
								<h3><label>Login</label></h3>
								<form class="form-horizontal" role="form">
									<div class="form-group">
										<label for="inputBenutzername" style="text-align: left" class="col-sm-2 control-label" title="IZ-Kennung">
											Benutzername
										</label>
										<div class="col-sm-10">
											<input type="inputUsername" id="inputBenutzername" />
										</div>
									</div>
									<div class="form-group">
										 
										<label for="inputPassword3" style="text-align: left" class="col-sm-2 control-label">
											Passwort
										</label>
										<div class="col-sm-10">
											<input type="password" id="inputPassword3" />
										</div>
									</div>
									<div class="form-group">
										<div class="col-sm-offset-2 col-sm-10">
											<button type="submit" id="submit" class="btn btn-default">
												Anmelden
											</button>
										</div>
									</div>
								</form>
							</div>
							<div class="col-lg-6">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/main.js"></script>
	</body>
</html>