Feature: Autonomy
	Scenario Outline: Vérification de l'autonomie
		Given je suis sur la page models
		Then le premier model doit avoir une autonomie de "<75D kms>" pour une vitesse de "<Vitesse>" la température de "<Temperature>" le clim doit être "<clim>" et les jantes de "<jante>"
		Examples:
		| Vitesse | Temperature | clim | jante | 75D kms | 100D kms | P100D kms |
		| 100 		| 20 					| off  | 19 	 | 466 		 | 594 			| 572 			|
		| 70 			| 30 					| off  | 19 	 | 679 		 | 865 			| 834 			|
		| 120 		| 10 					| on   | 21 	 | 333 		 | 430 			| 406 			|
