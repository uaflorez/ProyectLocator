# Author:

@stories
Feature: create new user
  As a user, I want register an user in the platform Utest
  @scenario1
  Scenario: register an user
    Given than santiago need register in platform utest
    When he register can navegation in platform
    | strNameUser | strLastName | strEmail            | strBirthMonth | strBirthDay | strBirthYear | strCity | strPostalCode | strCountry | strPhone | strModel | strOperatingSystem |
    | Pablo       | Perez       | pruebas@preubas.com |  May          | 10          |  1980        | Bogota  | 110111        | Colombia   | Samsung  | Galaxy A | Android 7.1.1      |
    Then can see your activity