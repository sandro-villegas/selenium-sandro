@google
Feature:Hacer consutas en gooogle
    Scenario: Navegar a Google
        Given Entro a la Pagina de google
        When ingreso enter a search critiria
        And click en search button
        Then veo los resultados de la búsqueda
