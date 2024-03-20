@Navigation
Feature: Navigation
    To see the subpages
    Without logging in
    I can click the navigation bar links
    Background: I am on the Free Range Testers web without logging in.
        Given I navigate to www.freerangetesters.com
    Scenario Outline: I can access the subpages through the navigation bar
        When I go to <section> using the navigation bar       
        Examples:
            | section    |
            | Cursos     |
            | Recursos   |
            | Udemy      |
            | Mentorías  |
            | Newsletter |
    
    #@Courses    
    #Scenario: Courses are presented correctly to potential customers
        #Given I navigate to www.freerangetesters.com
        #When I go to Cursos using the navigation bar
        #And select Introducción al Testing       
    @Plans
    Scenario: Users can select a plan when signing up
        When I select Elegir Plan
        Then I can validate the options in the checkout page

    @Google
    Scenario: Navegar a Google
        Given Entro a la Pagina de google
        #When ingreso Dog en el campo de búsqueda
   #Then veo los resultados de la búsqueda
