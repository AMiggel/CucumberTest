Feature: Prueba Registro
  Yo como usuario de SDETraining 
  Quiero que cuando ingrese a la pagina de registro
  Me pueda registrar

  Scenario: El usuario ingresa sus datos en los campos
    Given El usuario esta en la pagina registro
    And el usuario ingresa sus datos 
    When el usuario debe ser registrado
    

    
    
 Scenario Outline: El usuario ingresa sus datos en los campos
    Given El usuario esta en la pagina registro
    When el usuario ingresa su nombre "<nombre>" 
    And y el email "<email>"
    And define la contrase�a "<password>"
    And verifica la contrase�a "<password>"
    And selecciona el pa�s "<pais>"
    Then el usuario se registra exitosamente "<message>"
      
    Examples: 
      | email              | password | message                      |
      | amarin@unac.edu.co | kjkszpj  | Logged in successfully       |
    

    