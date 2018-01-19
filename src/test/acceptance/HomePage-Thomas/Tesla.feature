Feature: Fonctionnalités de ma page d'accueil
	Scenario: Vérification du titre
		Given je suis sur la homepage
		Then le titre de la page d'accueil doit être "Tesla | Berlines et SUV 100% électriques haut de gamme"

	Scenario: Verification de la description
		Given je suis sur la homepage
		Then la description de la page d'accueil doit être "Créateur et constructeur de la berline électrique Model S et du SUV électrique Model X, Tesla a ouvert les réservations pour la Model 3, un véhicule électrique premium à partir de 35 000 $. Tesla produit également une gamme de batteries commerciales et domestiques."

	Scenario: Vérification de la punchline 
		Given je suis sur la homepage
		Then la punchline du site doit être "Accélérations incomparables. Autonomie inégalée. Sécurité active avancée."

	Scenario Outline: Vérification des boutons
		Given je suis sur la homepage
		Then le titre du bouton doit être "<nom>"
		When je clique sur le bouton "<nom>" qui a pour lien "<page>"		
		Then j arrive sur la page "<page>" a partir du lien "<nom>"
		Examples: 
		| nom | page |
		| Configurer | https://www.tesla.com/fr_FR/models/design |
		| Configurer | https://www.tesla.com/fr_FR/modelx/design |
		| Modèle d'exposition | https://www.tesla.com/fr_FR/new |
		| Véhicules d'occasion | https://www.tesla.com/fr_FR/used |
		| Essais |  |

	Scenario Outline: Vérification du burger menu
		Given je suis sur la homepage
		When je clique sur le burger menu
		And je clique sur le bouton "<nom>" qui a pour lien "<page>"		
		Then le lien suivant est disponible "<page>" pour "<nom>"
		Examples:
		| nom | page |
		| Actualités | https://www.tesla.com/fr_FR/blog |
		| Modèle d'exposition | https://www.tesla.com/fr_FR/new |
		| Véhicules d'occasion | https://www.tesla.com/fr_FR/used |
		| Entreprises | https://www.tesla.com/fr_FR/enterprise |
		| Recharger | https://www.tesla.com/fr_FR/charging |
		| Nous trouver | https://www.tesla.com/fr_FR/findus#/bounds/48.9021449,2.4699207999999544,48.815573,2.2241989999999987?search=store,service,supercharger,destination%20charger |
		| Événements | https://www.tesla.com/fr_FR/events |
		| Empreinte carbone | https://www.tesla.com/fr_FR/carbonimpact |
		| Assistance | https://www.tesla.com/fr_FR/support |
