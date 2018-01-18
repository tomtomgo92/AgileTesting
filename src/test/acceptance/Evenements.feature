Feature: Fonctionnalités de ma page d'evenement
	Scenario: Verifier si je suis sur la page d'evenement
		Given je suis sur evenement
		Then le lien doit être "https://www.tesla.com/fr_FR/events"

    Scenario: Verifier le nombre d'evenement
        Given les evenements via "view-content"
        Then le nombre d'evenements doit etre "15"

    Scenario: Un buger menu
		Given je suis sur la homepage
		Then le buger menu doit etre a "droite"
		And le lien1 doit être "Actualités"
        And le lien2 doit être "Modèles d'exposition"
        And le lien3 doit être "Véhicules d'occasion"
        And le lien4 doit être "Recharger"
        And le lien5 doit être "Nous trouver"
        And le lien6 doit être "Evénements"
        And le lien7 doit être "Empreinte carbone"
        And le lien8 doit être "Assistance"

    Scenario: Un lien permet d'afficher tous les événement de la marque
        Given je suis sur evenement
        Then je dois etre ".view-all"
        And envoyer à "./events" 

    Scenario: Un lien permet d'afficher tous les événement de la marque
        Given je suis sur evenement
        Then je dois etre ".pager-next"
        And envoyer à "./events"   

    Scenario: ce tenir informé des prochains événements de la marque
        Given je suis sur evenement
        And j'ai un formulaire "#test-drive-details"
        Then je doit contenir l'input "Prénom"
        And je doit contenir l'input "Nom"
        And je doit contenir l'input "email"
        And je doit contenir l'input "téléphone"
        And je doit contenir l'input "pays"
        And je doit contenir l'input "code postal"
        And je doit contenir la checkBox "Recevoir les News Tesla"
        And je valide avec un button value "Notify Me"

    Scenario: Je verifie que l'email est entré
        Given je verifie l'ID "#parsley-id-83"
        Then je recois "n'est pas une adresse e-mail valide"

    Scenario: JE verifie recevoir les evenement du RoyaumeUni
        Given je verie l'ID "#edit-geoautocomplete"
        Then l'input doit etre "Royaume-Uni"
    
    