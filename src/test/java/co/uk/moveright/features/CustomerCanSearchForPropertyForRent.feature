Feature: Search Property for rent
  As a customer
  I want the ability to search for any property of my choice in any location
  so that i can rent the property

Scenario Outline: Customer can search for property
  Given I navigate to rightmove homepage
  When I enter a'<Location>'in search text box
  And I click on for rent button
  And I select'<Mile>' from search radius
  And I select'<MinPrice>' with'<MaxPrice>' from price range
  And I select '<MinBed>' with'<MaxBed>' from No. of bed
  And I select '<Property>' from property type
  And I select'<TimeAdded>'from Anytime
  And I click For rent button
  Then a list of property on rent in'<Location>' are displayed
  And I save property of my choice
Examples:
  |Location |Mile | MinPrice |MaxPrice |MinBed |MaxBed |Property |TimeAddded |
  |Manchester |Within ¼ mile |50,000 |50,000 |Studio |Studio |Houses |Anytime|
  |M21 |Within ½ mile |60,000 |60,000 |1 |1 |Flats/Apartment |Last 24 hours|
  |M21 0YL |Within 1 mile |70,000 |70,000 |2 |2 |Bungalows |Last 3 days |
  |Piccadilly |Within 3 mile |80,000 |80,000 |3 |3 |Land |Last 7 days |

Scenario Outline: Customer Cannot search for property with missing values
  Given I navigate to rightmove homepage
  When I enter a'<Location>'in search text box
  And I click on for rent button
  And I select'<Mile>' from search radius
  And I select'<MinPrice>' with'<MaxPrice>' from price range
  And I select '<MinBed>' with'<MaxBed>' from No. of bed
  And I select '<Property>' from property type
  And I select'<TimeAdded>'from Anytime
  And I click on For rent button
  Then an error message is displayed
Examples:
|Location |Mile | MinPrice |MaxPrice |MinBed |MaxBed |Property |TimeAddded |
|M221XC |Within ¼ mile |50,000 |50,000 |Studio |Studio |Houses |Anytime|

