Feature: 	Ingresar nombre de usuario y contrase�a
Scenario: Verificacion de ingreso de usuario
Given Abrir Chrome
When ingresar Username "mespinoza" y Password "123"
Then inicia sesion