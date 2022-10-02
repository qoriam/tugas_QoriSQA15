Feature: Create Scenario testing in demoqa.com

  Background: user open https://demoqa.com

  Scenario: user use function behavior and web element
    Given user click menu widgets
    When user click button back
    And user clik button forward
    And user click button refresh

  Scenario: user use function input in frame
    Given user open menu tex-box
    When user input name "Sekolah QA"
    And user input email "sekolahqa@gmail.com"
    And user input address current "Alamat sekarang dimana"
    And user input permanent Address "Alamat permanen dimana"
    Then user click button submit


  Scenario:user use function element choose
    Given user open menu checkbox
    When user click checkbox Home
    Then checkbox is selected
    When user clik menu radio button
    And user clik button Impressive
    Then radio button Impressive is selected
    When user click menu selec-menu
    And user click menu Group1
    Then Group1 is selected

