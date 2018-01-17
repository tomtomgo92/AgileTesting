Feature: Fonctionnalités de ma page de Configuration
	Scenario: Verifier si je suis sur la page de configuration
		Given je suis sur Configurateur Model S
		Then le lien doit être "https://www.tesla.com/fr_FR/models/design"

    Scenario: Verifier le prix par defaut
        Given Le prix du LOA
        Then le prix du LOA est "610"

    Scenario: Selection 75D
        Given je selectionne "75D"
        Then le texte doit etre "le prix en LOA est à 610€/mois après économies de carburant et 780€/mois et le montant estimé du loyer est de 780€/mois"
    
    Scenario: Selection 100D
        Given je selectionne "100D"
        Then le texte doit etre "le prix en LOA est à 773€/mois après économies de carburant et le montant estimé du loyer est de 943€/mois"
    
    Scenario: Selection P100D
        Given je selectionne "P100D"
        Then le texte doit etre "le prix en LOA est à 1529€/mois après économies de carburant et le montant estimé du loyer est de 1699€/mois"
    
    Scenario: Selection Pilotage automatique amélioré sans Capacité de conduite entièrement autonome
        Given je selectionne "Pilotage automatique amélioré sans Capacité de conduite entièrement autonome"
        Then le prix doit etre "58"

    Scenario: Selection  Capacité de conduite entièrement autonome
        Given je selectionne " Capacité de conduite entièrement autonome"
        Then le prix doit etre "93"

    Scenario: Liste des localisations
        Given je suis sur la configuration
        Then  Je clic donc sur le lien en bas de page "Localisations"
        And envoyer à "https://www.tesla.com/fr_FR/findus/list" 
    