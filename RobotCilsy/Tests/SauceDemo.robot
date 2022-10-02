*** Settings ***
Library  SeleniumLibrary
*** Variables ***

*** Test Cases ***
As a guest, i want to rest saucedemo website
    Open Browser  https://www.saucedemo.com/  chrome
    Input Text    id=user-name    standard_user
    Input Text    id=password    secret_sauce
    Click Button    id=login-button
    Get Title
    Get Text    class=title
    Close Browser