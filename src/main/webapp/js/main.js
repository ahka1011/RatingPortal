$(document).on("click", "#submit", function () {
	alert("ok");
	var user = $('#inputBenutzername').val();
	var pw = $('#inputPassword3').val();

	if(user != "" && pw != ""){
		$.ajax({
			type: "POST",
			url: "https://localhost:8443/ratingp/rest/session/login",
			dataType: 'json',
			data: {username: user, password: pw},
			success: function(data){
				if (data != null){
				alert(JSON.stringify(data));
				window.location.href = "Navigationsseite.jsp";
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
	else{
		alert("Bitte geben Sie Ihre Anmeldedaten ein.");
	}
	return false;
});
