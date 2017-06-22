$(document).on("click", "#submit", function () {
	alert("ok");
	var user = $('#inputBenutzername').val();
	var pw = $('#inputPassword3').val();

	if(user != "" && pw != ""){
		$.ajax({
			type: "GET",
			url: "https://localhost:8443/rating/start",
			dataType: "JSONP",
			data: {username: user, password: pw},
			success: function(data){
				alert(data);
			},
			error: function(request, status, error) {
				alert("Request failed!");
				console.log("Request: " + request);
				console.log("Status: " + status);
				console.log("Error: " + error);
			}
		});
	}
	return false;
});
