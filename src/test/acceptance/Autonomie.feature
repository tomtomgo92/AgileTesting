Feature: Fonctionnalités de ma page de Autonomie
	Scenario: Verifier si je suis sur la page autonomie
		Given je suis sur la page autonomie
           
    Scenario: Verifier les autonomies
        Given je suis sur la page autonomie
        Then l'autonomie est "<Vitesse>" "<Temperature>" "<clim>" "<jante>" "<75D kms>" "<100D kms>" "<P100D kms>" 
            | Vitesse | Temperature | clim | jante | 75D kms | 100D kms | P100D kms |
            | 100 | 20 | off | 19 | 466 | 594 | 572 |
            | 70 | 30 | off | 19 | 679 | 865 | 834 |
            | 120 | 10 | on | 21 | 333 | 430 | 406 |

    Scenario: Un buger menu
		Given je suis sur la page autonomie
		Then le buger menu doit etre a "droite"
		And le lien1 doit être "Actualités"
        And le lien2 doit être "Modèles d'exposition"
        And le lien3 doit être "Véhicules d'occasion"
        And le lien4 doit être "Recharger"
        And le lien5 doit être "Nous trouver"
        And le lien6 doit être "Evénements"
        And le lien7 doit être "Empreinte carbone"
        And le lien8 doit être "Assistance"