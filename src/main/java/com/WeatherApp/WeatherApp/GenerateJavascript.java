package com.WeatherApp.WeatherApp;

public class GenerateJavascript {

    public String map(String osloIcon, String stavangerIcon, String bergenIcon, String tromsøIcon, String trondheimIcon) {
        String variable =
                "<script>\n" +
                        "\n" +
                        "      var map;\n" +
                        "      function initMap() {\n" +
                        "        map = new google.maps.Map(document.getElementById('map'), {\n" +
                        "          zoom: 10,\n" +
                        "          center: new google.maps.LatLng(59.911491, 10.757933),\n" +
                        "          mapTypeId: 'roadmap'\n" +
                        "        });\n" +
                        "\n" +
                        "        var iconBase = 'https://api.met.no/weatherapi/weathericon/1.1?content_type=image%2Fpng&symbol=';\n" +
                        "        var icons = {\n" +
                        "          parking: {\n" +
                        "            icon: iconBase + '1'\n" +
                        "          },\n" +
                        "          library: {\n" +
                        "            icon: iconBase + '10'\n" +
                        "          },\n" +
                        "          info: {\n" +
                        "            icon: iconBase + '50'\n" +
                        "          }\n" +
                        "        };\n" +
                        "\n" +
                        "        var features = [\n" +
                        "          {\n" +
                        "            position: new google.maps.LatLng(59.911491, 10.757933),\n" +
                        "            type: '"+osloIcon+"' \n" +
                        "          },  {\n" +
                        "            position: new google.maps.LatLng(60.39299, 5.32415),\n" +
                        "            type: '"+bergenIcon+"'\n" +
                        "          },  {\n" +
                        "            position: new google.maps.LatLng(63.446827, 10.421906),\n" +
                        "            type: '"+trondheimIcon+"'\n" +
                        "          }, {\n" +
                        "            position: new google.maps.LatLng( 69.649208, 18.955324),\n" +
                        "            type: '"+tromsøIcon+"'\n" +
                        "          }, {\n" +
                        "            position: new google.maps.LatLng(58.969975, 5.733107),\n" +
                        "            type: '"+stavangerIcon+"'\n" +
                        "          },  {\n" +
                        "            position: new google.maps.LatLng(59.911491, 10.777933),\n" +
                        "            type: 'parking'\n" +
                        "          }, {\n" +
                        "            position: new google.maps.LatLng(-33.91727341958453, 151.23348314155578),\n" +
                        "            type: 'library'\n" +
                        "          }\n" +
                        "        ];\n" +
                        "\n" +
                        "        // Create markers.\n" +
                        "        features.forEach(function(feature) {\n" +
                        "          var marker = new google.maps.Marker({\n" +
                        "            position: feature.position,\n" +
                        "            icon: icons[feature.type].icon,\n" +
                        "            map: map\n" +
                        "          });\n" +
                        "        });\n" +
                        "      }\n" +
                        "    </script>";
                return variable;
    }

}
