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
    And define la contraseña "<password>"
    And verifica la contraseña "<password>"
    And selecciona el país "<pais>"
    Then el usuario se registra exitosamente "<message>"
      
    Examples: 
      | email              | password | message                      |
      | amarin@unac.edu.co | kjkszpj  | Logged in successfully       |
    

    