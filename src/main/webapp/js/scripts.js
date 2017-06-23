function Logout(){
		if (window.confirm ("Wollen Sie sich wirklich abmelden?") == true){
			$.ajax({
				type: "POST",
				url: "https://localhost:8443/ratingp/rest/session/logout",
				dataType: 'json',
				data: {token: t},
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
