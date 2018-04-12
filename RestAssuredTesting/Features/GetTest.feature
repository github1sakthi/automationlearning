Feature: Test GET Http method
  Description: This feature will get the REST API Url and tests

  @GetTest
  Scenario Outline: Search country Name by 2 character alphanumeric code
    Given the api is up and running for "http://www.groupkt.com/home.htm"
    When the user performs get request to "<country_cd>"
    Then the Status Code is 200
    And ressponse includes the following
      | RestResponse.result.name        | India |
      | RestResponse.result.alpha2_code | IN    |
      | RestResponse.result.alpha3_code | IND   |

    Examples: 
      | country_cd |
      | IN         |

  #  | US         |
  # | AU         |

  @GetTest
  Scenario Outline: Search country Name by a text string
    Given the api is up and running for "http://services.groupkt.com/country/search?text=tt"
    When the user performs get search to "<text>"
    Then the Status Code is 200
    And ressponse includes the following in any order
      | RestResponse.result[0].name       | Mayotte |
      | RestResponse.result[0].alpha2_code | YT    |
      | RestResponse.result[0].alpha3_code | MYT   |
      | RestResponse.result[1].name        | Saint Kitts and Nevis |
      | RestResponse.result[1].alpha2_code | KN    |
      | RestResponse.result[1].alpha3_code | KNA   |
      | RestResponse.result[2].name        | Trinidad and Tobago |
      | RestResponse.result[2].alpha2_code | TT    |
      | RestResponse.result[2].alpha3_code | TTO   |

    Examples: 
      | text |
      | tt   |
