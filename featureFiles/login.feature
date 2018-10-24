Feature: Prueba de Login
  Yo como usuario de SDETraining 
  Quiero que cuando ingrese a la pagina de login
  Me pueda Loguear


 Scenario Outline: el usuario se puede logear con credenciales validas
    Given el usuario esta en la pagina de login
    When el usuario ingresa credenciales validas "<email>" 
    And y el password "<password>"
    Then el usuario puede ver su panel de administracion "<message>"
      
    Examples: 
      | email              | password | message                      |
      | amarin@unac.edu.co | kjkszpj  | Logged in successfully       |


  Scenario Outline: El usuario no puede ingresar con credeciales erroneas.
   Given el usuario esta en la pagina de login
    When el usuario ingresa email erroneo "<email>" 
    And y el password incorrecto "<password>"
    Then el usuario no puede ver su panel de administracion "<message>"
    
    Examples: 
      | email            | password | message                      |
      | tim@testmail.com | 12345678 | Logged in successfully       |
    
