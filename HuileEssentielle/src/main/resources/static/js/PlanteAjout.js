//document.querySelectorAll('button[type="submit"]').forEach(lien=>
//	{lien.addEventListener('click', (event) =>
//	{event.preventDefault();
//	let id =event.target.getAttribute('value');
//	
//	 
//	if(id=="Se connecter"){
//		
//		let joueur = {
//				pseudo : document.querySelector('input[name="pseudoconnect"]').value,
//				mdp : document.querySelector('input[name="mdpconnect"]').value
//		};
//				
//		
//		
//		const url = new URL("http://localhost:8080/codenames-web-final/Lobby/connect");
//		
//		fetch (url, {
//			method: 'POST',
//			headers : {
//				'content-Type' : 'application/json'
//			},
//			body: JSON.stringify(joueur)
//			
//		}).then(resp => resp.text())
//		.then(a => {
//			
//			if (a==0){
//				alert("Ce joueur n'existe pas en base de données");
//			}
//			
//			else if (a==1){
//				alert("Pas de correspondance avec le mdp");
//			}
//			
//			else if(a==2){
//				alert("Joueur connecté");
//				
//			}
//		});
//		
//	});