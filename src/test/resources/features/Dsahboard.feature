Feature: Validate the Mahara Dashboard functionality

  Scenario: Validate the Login functionality
    Given I navigate to demo.mahara.org
    When I enter student in the field
    And I enter the password MaharaDemo
    And I click on the login button
    Then Mahara demo page is displayed

  Scenario Outline: validate profile functionality
    Given I login to mahara
    When Hover cursor on content
    And Enter <FName>,<Lastname>,<Student_Id>,<DisplayName>,Introduction
    And click on Save Profile
    Then Entered Profile saved

    Examples: 
      | FName   | Lastname | Student_Id | DisplayName |
      | mahesh  | Gantena  |       7657 | Mahesh      |
    #  | Supraja | Gantena  |       7658 | Sup         |

  Scenario: validate contact information functionality
    Given I login to demo mahara
    When click on contact information in profile
    And click on Radio button
    And Enter official,personal web address
    And Enter Blog,postal address
    And Enter Town,city/region,country
    And Enter Home,Business,Mobile phone ,Fax number
    And click on save profile
    Then profile saved succesfully

   Scenario: validate my group functionality
   Given mahara web page
   When click on groups
   And click on group
   And Enter group name
   And click on open,Request button,Friend invitation,Recommendation
   And Select create and edit
   And click on publicity viewable group,participation report
   And select start date and End date
   And select Group category,shared page notification,comment notification
   And select save group
   Then Group saved successfully
  