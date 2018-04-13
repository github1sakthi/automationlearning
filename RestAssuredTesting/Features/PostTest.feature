Feature: Post Action Test
  Description: This feature will post data to a URL and test the output

  # https://api.twitter.com/1.1/lists/create.json?name=Goonies&mode=public&description=For%20life
  # https://api.twitter.com/1.1/lists/update.json?list_id=1234&mode=public&name=Party%20Time
  @PostTest
  Scenario Outline: Create list " https://jsonplaceholder.typicode.com/posts/"
    Given the api is up and running for " https://jsonplaceholder.typicode.com/posts/"
    When the user performs posts request with "<userId>""<id>""<title>""<body>"
    Then the Code Returned is "<code>"
    And the body includes the following
      | userId |                   2 |
      | id     |                 200 |
      | title  | Post Test data |
      | body   | Post Test Sample data for verification           |

    Examples: 
      | userId | id  | title               | body     | code |
      |      2 | 200 | Post Test data | Post Test Sample data for verification |  201 |
