Feature: Fonctionnalités de ma page d'evenement
	Scenario: Verifier si je suis sur la page d'evenement
		Given je suis sur evenement


    Scenario: Verifier le nombre d'evenement
        Given je suis sur evenement
        Then le nombre d'evenements doit etre 15


    Scenario: Un lien permet d'afficher tous les événement de la marque
        Given je suis sur evenement
        Then le lien pour voir tous les evenements existe grâce à la classe ".view-all"
        And envoyer à "./events"

    Scenario: Un lien permet d'afficher tous les événement de la marque
        Given je suis sur evenement
        Then je dois etre ".pager-next"
        And envoyer à "./events"

		Scenario: Je suis accessible depuis le Burger
		      Given je suis sur evenement
					When je clique sur le burger-menu
					And je clique sur events
		      Then je suis sur l'URL "https://www.tesla.com/fr_FR/events"


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
        Given je suis sur evenement
        Then je recois "n'est pas une adresse e-mail valide"

    Scenario: JE verifie recevoir les evenement du RoyaumeUni
        Given je suis sur evenement
        Then l'input doit etre "Royaume-Uni"
