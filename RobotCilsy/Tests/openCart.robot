*** Settings ***
Library  SeleniumLibrary
*** Variables ***

*** Test Cases ***
As a user, i want to card PayPal Commerce Platform Integration
    Open Browser  https://www.opencart.com/  chrome
    Click Link    xpath=//*[@id="navbar-collapse-header"]/ul/li[3]/a
    Input Text    name=filter_search    paypal
    Click Button    id=button-search
    Click Element    class=extension-description
    Element Should Contain    xpath=//*[@id="marketplace-extension-info"]/div[2]/h3    PayPal Commerce Platform Integration
    Close Browser