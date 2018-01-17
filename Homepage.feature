Feature: Fonctionnalités de ma page d'accueil
	Scenario: Verifier le titre de la page d'accueil
		Given je suis sur la homepage
		Then le titre doit être "Tesla"
		And la description doit être "Berlines et SUV 100% électriques haut de gamme"

	Scenario: Verifier la description
		Given je suis sur la homepage
		Then la description doit être "Créateur et constructeur de la berline électrique Model S et du SUV électrique Model X, Tesla a ouvert les réservations pour la Model 3, un véhicule électrique premium à partir de 35 000 $. Tesla produit également une gamme de batteries commerciales et domestiques"
		
    Scenario: Verifier le titre h1 de la page d'accueil
		Given je suis sur la homepage
		Then le titre doit être "Accélérations incomparables"
		And la description doit être "Autonomie inégalée. Sécurité active avancée. Sécurité active avancée.*"

    Scenario: Boutons presents sur la homepage
            Given je suis sur la homepage
            Then les bouton doivent être "4"
            And le bouton1 doit être "Configurer"
            And le bouton2 doit être "Modèle d'exposition"
            And le bouton3 doit être "Véhicules d'occasion"
            And le bouton4 doit être "essais"

    Scenario: Bouton Configurer
            Given je suis sur la homepage
            Then je dois etre "Configurer"
            And popUp à "./models/design" 

    Scenario: Bouton Modèle d'exposition
        Given je suis sur la homepage
        Then je dois etre "Modèle d'exposition"
        And envoyer à "./new" 

    Scenario: Bouton véhicules d'occasion
        Given je suis sur la homepage
        Then je dois etre "véhicules d'occasion"
        And envoyer à "./used" 

    Scenario: Bouton essais
        Given je suis sur la homepage
        Then je dois etre "essais"
        And popUp
		
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
