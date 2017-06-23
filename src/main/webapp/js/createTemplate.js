$(document).on("click", "#submitTemplate", function () {
	alert("ok");
	var title = $('#inputTitle').val();
	var sem = $('#inputSemester').val();
	var kursNr = $('#inputKursNr').val();
	var prof = $('#inputProf').val();

	if(title != "" && kursNr != ""){
		$.ajax({
			type: "POST",
			url: "https://localhost:8443/ratingp/rest/courses/prof/createcourse",
			dataType: 'json',
			data: {kursNummer: kursNr, kursName: title, semester: sem, kuerzel: prof},
			success: function(data){
					alert(data + "success");
					var table = document.getElementById("tableTemplate");
						var row = table.insertRow(1);
						var cell1 = row.insertCell(0);
						var cell2 = row.insertCell(1);
						var cell3 = row.insertCell(2);
						var cell4 = row.insertCell(3);
						cell1.innerHTML = kursNr;
						cell2.innerHTML = title;
						cell3.innerHTML = sem;
						cell4.innerHTML = prof;
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
		alert("Bitte alle Pflichtfelder ausfüllen!");
	}
	return false;
});