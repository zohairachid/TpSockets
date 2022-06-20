

Execution des deux classes dans la ligne de commande, en commençant par la classe Serveur qui nous permet de créer un serveur utilisant un port spécifique et qui va attendre une demande de connexion via des listners.

![Capture d’écran (1)](https://user-images.githubusercontent.com/95504832/161427907-0ae03111-3663-4667-a695-6b65439af11f.png)

aprés la création du serveur, on lance le client qui va chercher ce dérnier sur le port déja spécifier; une fois le serveur trouver alors une connexion est établie.
Le serveur reste en écoute jusqu'à que le client lui envois une requette contenant un chiffre.
Lorsque le client envoi un chiffre, le serveur lit le contenu de la requette et réalise un traitement qui renvoi le résultat au client.
La dernière étape c'est la fermeture de la connexion.


![client](https://user-images.githubusercontent.com/95504832/161427908-8be3aa17-e404-48fc-a232-e6cc10ec85f0.PNG)
![serveur](https://user-images.githubusercontent.com/95504832/161427915-dd7d1e5c-2722-47f5-931b-34900b9b66c1.PNG)
