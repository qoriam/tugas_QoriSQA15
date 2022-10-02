Feature: As a user
  I want to input email with various conditions

  Scenario Outline: user input email
    Given user open web https://demoqa.com/text-box
    When user input <email> in form email
    Then email valid or not <output>

    Examples:
    |email|               |output|
    |sekolah@gmail.com|   |valid |
    |email            |   |invalid|
    |email@mail       |   |invalid|