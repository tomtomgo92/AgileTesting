Feature: Fonctionnalités de ma page de Autonomie
	Scenario: Verifier si je suis sur la page autonomie
		Given je suis sur la page autonomie
        
        
        
       Scenario: Verifier les autonomies
		Given je suis sur la page autonomie
         
        given "<Vitesse>"
		Then le lien doit être "https://www.tesla.com/fr_FR/models/design"
            | Vitesse | Temperature | clim | jante | 75D kms | 100D kms | P100D kms |
            | 100 | 20 | off | 19 | 466 | 594 | 572 |
            | 70 | 30 | off | 19 | 679 | 865 | 834 |
            | 120 | 10 | on | 21 | 333 | 430 | 406 |