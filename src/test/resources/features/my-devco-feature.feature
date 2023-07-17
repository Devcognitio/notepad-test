Feature: Prueba devco

  @Escenario1
  Scenario: Nota enriquecida con negrilla
    Given el usuario inicia la pagina
    When el usuario selecciona la opcion de nota enriquecida y ingresa el texto Prueba
    Then el usuario deberia visualizar Prueba


  @Escenario2
  Scenario: Lista eliminar
    Given el usuario inicia la pagina
    When el usuario selecciona la opcion de lista y agrega 6 notas
    Then el usuario deberia visualizar Prueba
