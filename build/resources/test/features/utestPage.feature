# Author:

@stories
Feature: create new user
  As a user, I want register an user in the platform Utest
  @scenario1
  Scenario: register an user
    Given than santiago need register in platform utest
    When he register can navegation in platform
    | strNameUser | strLastName | strEmail            | strBirthMonth | strBirthDay | strBirthYear | strCity | strPostalCode | strCountry | strPhone | strModel | strOperatingSystem | strPassword |
    | Jose       | Pelaez       | pruebas1@preubas.com |  May          | 13          |  1983        | Bogota  | 110111        | Colombia   | Samsung  | Galaxy A | Android 7.1.1      | Prueba12123 |
    Then can see your activity
    | strFinalText   |
    | Complete Setup |