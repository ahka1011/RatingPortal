function Logout(){
	if (window.confirm ("Wollen Sie sich wirklich abmelden?") == true){
		window.location.href= "Anmeldemaske.html";
		alert("Sie wurden abgemeldet");
	}
}