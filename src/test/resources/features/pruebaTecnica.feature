@tag
Feature: The user created account and Add product in Shopping Cart
 @CreatedUser
  Scenario Outline: Register user in Advantage
    Given The user get in the webpage
    When create new account
       |<userName>|<email>|<password>|<firstName>|<lastName>|<phoneNumber>|<country>|<city>|<address>|<state>|<postalCode>|
    Then verify MY ACCOUNT
    Examples:
      |userName|email|password|firstName|lastName|phoneNumber|country|city|address|state|postalCode|
      |sebas9606|sebaslondono6@utp.edu.co|Tata0296|Sebas|Londono|3135418660|Colombia|Pereira|Mz 5 cs 17|Dosque|661001|

  @SignIn
  Scenario Outline: Sign in Advantage
    Given The user get in the webpage
    When sing in
      |<userName>|<password>|
    And see my account
    Then verify MY ACCOUNT
    Examples:
      |userName|password|
      |catica0296|Catica0296|

  @RegisterFormContact
  Scenario Outline: Sign in Advantage
    Given The user get in the webpage
    When sing in
      |<userName>|<password>|
    And see my account
    And edit account details
      |<firstName>|<lastName>|<phoneNumber>|<country>|<city>|<address>|<state>|<postalCode>|
    Then account details verify that
      |<address>|
    Examples:
      |userName|password|firstName|lastName|phoneNumber|country|city|address|state|postalCode|
      |catica0296|Catica0296|Catalina|Londono|3186018001|Colombia|Pereira|Bloque 4|Sabaneta2|661001|

  @AddProduct
  Scenario Outline: Sign in Advantage
    Given The user get in the webpage
    When sing in
      |<userName>|<password>|
    And add product of speaker of shopping cart
    Then check out product
    |<product>|
    Examples:
      |userName|password|product|
      |catica0296|Catica0296|BOSE SOUNDLINK BLUETOOTH SPEAKER III|