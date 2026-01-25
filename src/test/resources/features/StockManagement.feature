Feature: Stock Portfolio Management
  As a user of the Stock Tracker app
  I want to manage my watched stocks
  So that I can monitor my father's legal-pad stocks digitally

  Background:
    Given the user is logged into the Stock Tracker application

  @Regression @Smoke
    Scenario Outline: Add and verify a new stock
      When the user adds a new stock with symbol "<symbol>"
      Then the stock list should display "<symbol>"
      And the user removes the stock "<symbol>"
      Then the stock "<symbol>" should no longer be visible

      Examples:
        | symbol | lastClose |
        | MSFT   | $451.14   |
        | GOOGL  | $335.97   |