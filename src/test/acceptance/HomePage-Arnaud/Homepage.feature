Feature: Fonctionnalités de ma page d'accueil
  Scenario: Vérification du titre et description
		Given je suis sur la homepage
		Then le titre doit être "Tesla | Berlines et SUV 100% électriques haut de gamme"
		
  Scenario: Vérification des puchlines
		Given je suis sur la homepage
		Then la puchlines doit être "Accélérations incomparables. Autonomie inégalée. Sécurité active avancée."
		And la puchline ne finit pas par etoile "Accélérations incomparables. Autonomie inégalée. Sécurité active avancée.*"


  Scenario: Verification des boutons
		Given je suis sur la homepage
		Then il y a un bouton0 <"CONFIGURER">
		Then il y a un bouton1 <"MODÈLE D'EXPOSITION">
		Then il y a un bouton2 <"VÉHICULES D'OCCASION">
		Then il y a un bouton3 <"ESSAIS">
		Then le bouton configurer mène à <"https://www.tesla.com/fr_FR/#">
		Then le bouton modèle mène à <"https://www.tesla.com/fr_FR/new">
		Then le bouton Véhicules <"https://www.tesla.com/fr_FR/used">
		Then le bouton Essais mène à <"https://www.tesla.com/fr_FR/#">


  Scenario: Vérification du burger
    	Given je suis sur la homepage
    	When je clique sur le burger
		Then le burger à un bouton qui mène au lien Actualités <"Actualités">
		Then le burger à un bouton qui mène au lien Modèles d'exposition <"Modèles d'exposition">
		Then le burger à un bouton qui mène au lien Véhicules d'occasion <"Véhicules d'occasion">
		Then le burger à un bouton qui mène au lien Entreprises <"Entreprises">
		Then le burger à un bouton qui mène au lien Recharger <"Recharger">
		Then le burger à un bouton qui mène au lien Nous trouver <"Nous trouver">
		Then le burger à un bouton qui mène au lien Evénements <"Evénements">
		Then le burger à un bouton qui mène au lien Empreinte carbone <"Empreinte carbone">
		Then le burger à un bouton qui mène au lien <"Assistance">