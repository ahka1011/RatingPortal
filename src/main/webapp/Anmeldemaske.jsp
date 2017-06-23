<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

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
								<div class="col-lg-2">
									<h3><label>Login</label></h3>
									<form>
									    <div class="input-group">
										    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
										    <input type="text" id="inputBenutzername" class="form-control" placeholder="Benutzername" title="IZ-Kürzel">
									    </div>
									    <div class="input-group">
										    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
										    <input id="inputPassword3" type="password" class="form-control mx-sm-3" name="password" placeholder="Password">
									    </div>
									    <div>
									    <br>
											<button type="submit" id="submit" class="btn btn-default">
												Anmelden
											</button>
										</div>
								  	</form>
								</div>
								<div class="col-lg-10">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<script src="js/jquery.min.js"></script>
	<script src="js/scripts.js"></script>
	<script src="js/login.js"></script>
	</body>
</html>