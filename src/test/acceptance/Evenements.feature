Feature: Fonctionnalités de ma page de Configuration
	Scenario: Verifier si je suis sur la page de configuration
		Given je suis sur Configurateur Model S
		Then le lien doit être "https://www.tesla.com/fr_FR/models/design"

    Scenario: Verifier le prix par defaut
        Given Le prix du LOA
        Then le prix du LOA est "610"

    Scenario: 