Feature: Fonctionnalités de ma page de Configuration
    Scenario: Verifier si je suis sur la page de configuration
        Given je suis sur la homepage
        Then le bouton 1 doit être "CONFIGURER"
        And le bouton renvoi vers "https://www.tesla.com/fr_FR/#"
        And le bouton models renvoi vers "https://www.tesla.com/fr_FR/models/design"

    Scenario: Verifier le prix par defaut
        Given je suis sur la page de la configuration model s
        When je clic sur LOA "https://www.tesla.com/fr_FR/models/design#lease"
        Then le prix par defaut LOA est "620 € /mois"

    Scenario: Selection 75D
        Given je suis sur la page de la configuration model s
        When je suis sur LOA "https://www.tesla.com/fr_FR/models/design#lease"
        Then le prix en LOA est à "620 € /mois" 
        Then le text est "Après économies de carburant"
        Then le prix suivant est "790 € /mois"
        Then le text suivant est "Montant estimé du loyer"
