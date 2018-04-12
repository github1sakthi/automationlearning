$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("GetTest.feature");
formatter.feature({
  "line": 1,
  "name": "Test GET Http method",
  "description": "Description: This feature will get the REST API Url and tests",
  "id": "test-get-http-method",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Search country Name by 2 character alphanumeric code",
  "description": "",
  "id": "test-get-http-method;search-country-name-by-2-character-alphanumeric-code",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@GetTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the api is up and running for \"http://www.groupkt.com/home.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user performs get request to \"\u003ccountry_cd\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the Status Code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "ressponse includes the following",
  "rows": [
    {
      "cells": [
        "RestResponse.result.name",
        "India"
      ],
      "line": 10
    },
    {
      "cells": [
        "RestResponse.result.alpha2_code",
        "IN"
      ],
      "line": 11
    },
    {
      "cells": [
        "RestResponse.result.alpha3_code",
        "IND"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "test-get-http-method;search-country-name-by-2-character-alphanumeric-code;",
  "rows": [
    {
      "cells": [
        "country_cd"
      ],
      "line": 15,
      "id": "test-get-http-method;search-country-name-by-2-character-alphanumeric-code;;1"
    },
    {
      "cells": [
        "IN"
      ],
      "line": 16,
      "id": "test-get-http-method;search-country-name-by-2-character-alphanumeric-code;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 207606,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Search country Name by 2 character alphanumeric code",
  "description": "",
  "id": "test-get-http-method;search-country-name-by-2-character-alphanumeric-code;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@GetTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "the api is up and running for \"http://www.groupkt.com/home.htm\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user performs get request to \"IN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the Status Code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "ressponse includes the following",
  "rows": [
    {
      "cells": [
        "RestResponse.result.name",
        "India"
      ],
      "line": 10
    },
    {
      "cells": [
        "RestResponse.result.alpha2_code",
        "IN"
      ],
      "line": 11
    },
    {
      "cells": [
        "RestResponse.result.alpha3_code",
        "IND"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.groupkt.com/home.htm",
      "offset": 31
    }
  ],
  "location": "TestSteps.the_api_is_up_and_running_for(String)"
});
formatter.result({
  "duration": 3008230556,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "IN",
      "offset": 34
    }
  ],
  "location": "TestSteps.the_user_performs_get_request_to(String)"
});
formatter.result({
  "duration": 219007351,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "TestSteps.the_Status_Code_is(int)"
});
formatter.result({
  "duration": 2000489,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.ressponse_includes_the_following(String,String\u003e)"
});
formatter.result({
  "duration": 972514271,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 18,
      "value": "#  | US         |"
    },
    {
      "line": 19,
      "value": "# | AU         |"
    }
  ],
  "line": 22,
  "name": "Search country Name by a text string",
  "description": "",
  "id": "test-get-http-method;search-country-name-by-a-text-string",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@GetTest"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the api is up and running for \"http://services.groupkt.com/country/search?text\u003dtt\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the user performs get search to \"\u003ctext\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the Status Code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "ressponse includes the following in any order",
  "rows": [
    {
      "cells": [
        "RestResponse.result[0].name",
        "Mayotte"
      ],
      "line": 27
    },
    {
      "cells": [
        "RestResponse.result[0].alpha2_code",
        "YT"
      ],
      "line": 28
    },
    {
      "cells": [
        "RestResponse.result[0].alpha3_code",
        "MYT"
      ],
      "line": 29
    },
    {
      "cells": [
        "RestResponse.result[1].name",
        "Saint Kitts and Nevis"
      ],
      "line": 30
    },
    {
      "cells": [
        "RestResponse.result[1].alpha2_code",
        "KN"
      ],
      "line": 31
    },
    {
      "cells": [
        "RestResponse.result[1].alpha3_code",
        "KNA"
      ],
      "line": 32
    },
    {
      "cells": [
        "RestResponse.result[2].name",
        "Trinidad and Tobago"
      ],
      "line": 33
    },
    {
      "cells": [
        "RestResponse.result[2].alpha2_code",
        "TT"
      ],
      "line": 34
    },
    {
      "cells": [
        "RestResponse.result[2].alpha3_code",
        "TTO"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "test-get-http-method;search-country-name-by-a-text-string;",
  "rows": [
    {
      "cells": [
        "text"
      ],
      "line": 38,
      "id": "test-get-http-method;search-country-name-by-a-text-string;;1"
    },
    {
      "cells": [
        "tt"
      ],
      "line": 39,
      "id": "test-get-http-method;search-country-name-by-a-text-string;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 66714,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Search country Name by a text string",
  "description": "",
  "id": "test-get-http-method;search-country-name-by-a-text-string;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@GetTest"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "the api is up and running for \"http://services.groupkt.com/country/search?text\u003dtt\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "the user performs get search to \"tt\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "the Status Code is 200",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "ressponse includes the following in any order",
  "rows": [
    {
      "cells": [
        "RestResponse.result[0].name",
        "Mayotte"
      ],
      "line": 27
    },
    {
      "cells": [
        "RestResponse.result[0].alpha2_code",
        "YT"
      ],
      "line": 28
    },
    {
      "cells": [
        "RestResponse.result[0].alpha3_code",
        "MYT"
      ],
      "line": 29
    },
    {
      "cells": [
        "RestResponse.result[1].name",
        "Saint Kitts and Nevis"
      ],
      "line": 30
    },
    {
      "cells": [
        "RestResponse.result[1].alpha2_code",
        "KN"
      ],
      "line": 31
    },
    {
      "cells": [
        "RestResponse.result[1].alpha3_code",
        "KNA"
      ],
      "line": 32
    },
    {
      "cells": [
        "RestResponse.result[2].name",
        "Trinidad and Tobago"
      ],
      "line": 33
    },
    {
      "cells": [
        "RestResponse.result[2].alpha2_code",
        "TT"
      ],
      "line": 34
    },
    {
      "cells": [
        "RestResponse.result[2].alpha3_code",
        "TTO"
      ],
      "line": 35
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://services.groupkt.com/country/search?text\u003dtt",
      "offset": 31
    }
  ],
  "location": "TestSteps.the_api_is_up_and_running_for(String)"
});
formatter.result({
  "duration": 216067733,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tt",
      "offset": 33
    }
  ],
  "location": "TestSteps.the_user_performs_get_search_to(String)"
});
formatter.result({
  "duration": 203139200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 19
    }
  ],
  "location": "TestSteps.the_Status_Code_is(int)"
});
formatter.result({
  "duration": 701197,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.ressponse_includes_the_following_in_any_order(String,String\u003e)"
});
formatter.result({
  "duration": 354741084,
  "status": "passed"
});
});