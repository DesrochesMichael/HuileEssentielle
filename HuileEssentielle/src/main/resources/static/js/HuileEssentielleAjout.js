document.querySelectorAll('button[type="submit"]').forEach(lien=>
	{lien.addEventListener('click', (event) =>
	{event.preventDefault();
	let id =event.target.getAttribute('name');
	
	 
	if(id=="ajouterCat"){
		
		
		
		let myElement = document.createElement("li");
//		myElement.innerHTML ="<tr><th>Pseudo du joueur</th> " +
//				"<th>nombre de partie</th> " +
//				"<th>Nombre de victoire</th> " +
//				"<th>Nombre de maitre espion</th></tr>" +
//				"<tr><td>"+joueur.pseudo+"</td> " +
//				"<td>"+joueur.nbrPartie+"</td> " +
//				"<td>"+joueur.nbrVictoire+"</td> " +
//				"<td>"+joueur.nbrMaitreEspion+"</td></tr> "
				
		myElement.innerHTML	= "<li class="input-group mb-3">"
		<div class="input-group-prepend">
		<span class="input-group-text" id="basic-addon3">Categorie
			:</span>
	</div>
	<input th:field="*{categories[__${itemStat.index}__].libelle}" />
</li>"
				
			
			
		document.querySelector('li[name="cat"]').append(myElement);
	});


	
	
// const url = new
// URL("http://localhost:8080/HuileEssenteilleAjout/ajouterCat");
//	
// fetch (url, {
// method: 'GET',
// headers : {
// 'content-Type' : 'application/json'
// },
// body: JSON.stringify(joueur)
//		
// }).then(resp => resp.text())
// .then(a => {
//		
// if (a==0){
// alert("Ce joueur n'existe pas en base de données");
// }
//		
// else if (a==1){
// alert("Pas de correspondance avec le mdp");
// }
//		
// else if(a==2){
// alert("Joueur connecté");
//			
// }
// });
