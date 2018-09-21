package com.WeatherApp.WeatherApp;

public class GenerateJavascript {

    public String map(String osloIcon, String stavangerIcon, String bergenIcon, String tromsøIcon, String trondheimIcon) {
        String variable =
                "<html>" +
                        "<head>" +
                        "<style>\n" +
                        "      #map {\n" +
                        "        height: 75%;\n" +
                        "        width: 50%;\n" +
                        "\n" +
                        "      }\n" +
                        "      html, body {\n" +
                        "        height: 100%;\n" +
                        "        margin: 0;\n" +
                        "        padding-top: 0%;\n" +
                        "        padding-left: 1%;\n" +
                        "      }\n" +
                        "    </style>"+
                        "</head>" +
                            "<body>" +
                        "<div id=\"map\"></div>"+

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
                        "          Sun: {\n" +
                        "            icon: iconBase + '1'\n" +
                        "          },\n" +
                        "          LightCloud: {\n" +
                        "            icon: iconBase + '2'\n" +
                        "          },\n" +
                        "          PartlyCloud: {\n" +
                        "            icon: iconBase + '3'\n" +
                        "          },\n" +
                        "          Cloud: {\n" +
                        "            icon: iconBase + '4'\n" +
                        "          },\n" +
                        "          LightRainSun: {\n" +
                        "            icon: iconBase + '5'\n" +
                        "          },\n" +
                        "          LightRainThunderSun: {\n" +
                        "            icon: iconBase + '6'\n" +
                        "          },\n" +
                        "          SleetSun: {\n" +
                        "            icon: iconBase + '7'\n" +
                        "          },\n" +
                        "          SnowSun: {\n" +
                        "            icon: iconBase + '8'\n" +
                        "          },\n" +
                        "          LightRain: {\n" +
                        "            icon: iconBase + '9'\n" +
                        "          },\n" +
                        "          Rain: {\n" +
                        "            icon: iconBase + '10'\n" +
                        "          },\n" +
                        "          RainThunder: {\n" +
                        "            icon: iconBase + '11'\n" +
                        "          },\n" +
                        "          Sleet: {\n" +
                        "            icon: iconBase + '12'\n" +
                        "          },\n" +
                        "          Snow: {\n" +
                        "            icon: iconBase + '13'\n" +
                        "          },\n" +
                        "          SnowThunder: {\n" +
                        "            icon: iconBase + '14'\n" +
                        "          },\n" +
                        "          Fog: {\n" +
                        "            icon: iconBase + '15'\n" +
                        "          },\n" +
                        "          SleetSunThunder: {\n" +
                        "            icon: iconBase + '20'\n" +
                        "          },\n" +
                        "          SnowSunThunder: {\n" +
                        "            icon: iconBase + '21'\n" +
                        "          },\n" +
                        "          LightRainThunder: {\n" +
                        "            icon: iconBase + '22'\n" +
                        "          },\n" +
                        "          SleetThunder: {\n" +
                        "            icon: iconBase + '23'\n" +
                        "          },\n" +
                        "          DrizzleThunderSun: {\n" +
                        "            icon: iconBase + '24'\n" +
                        "          },\n" +
                        "          RainThunderSun: {\n" +
                        "            icon: iconBase + '25'\n" +
                        "          },\n" +
                        "          LightSleetThunderSun: {\n" +
                        "            icon: iconBase + '26'\n" +
                        "          },\n" +
                        "          HeavySleetThunderSun: {\n" +
                        "            icon: iconBase + '27'\n" +
                        "          },\n" +
                        "          LightSnowThunderSun: {\n" +
                        "            icon: iconBase + '28'\n" +
                        "          },\n" +
                        "          HeavySnowThunderSun: {\n" +
                        "            icon: iconBase + '29'\n" +
                        "          },\n" +
                        "          DrizzleThunder: {\n" +
                        "            icon: iconBase + '30'\n" +
                        "          },\n" +
                        "          LightSleetThunder: {\n" +
                        "            icon: iconBase + '31'\n" +
                        "          },\n" +
                        "          HeavySleetThunder: {\n" +
                        "            icon: iconBase + '32'\n" +
                        "          },\n" +
                        "          LightSnowThunder: {\n" +
                        "            icon: iconBase + '33'\n" +
                        "          },\n" +
                        "          HeavySnowThunder: {\n" +
                        "            icon: iconBase + '34'\n" +
                        "          },\n" +
                        "          DrizzleSun: {\n" +
                        "            icon: iconBase + '40'\n" +
                        "          },\n" +
                        "          RainSun: {\n" +
                        "            icon: iconBase + '41'\n" +
                        "          },\n" +
                        "          LightSleetSun: {\n" +
                        "            icon: iconBase + '42'\n" +
                        "          },\n" +
                        "          HeavySleetSun: {\n" +
                        "            icon: iconBase + '43'\n" +
                        "          },\n" +
                        "          LightSnowSun: {\n" +
                        "            icon: iconBase + '44'\n" +
                        "          },\n" +
                        "          HeavySnowSun: {\n" +
                        "            icon: iconBase + '45'\n" +
                        "          },\n" +
                        "          Drizzle: {\n" +
                        "            icon: iconBase + '46'\n" +
                        "          },\n" +
                        "          LightSleet: {\n" +
                        "            icon: iconBase + '47'\n" +
                        "          },\n" +
                        "          HeavySleet: {\n" +
                        "            icon: iconBase + '48'\n" +
                        "          },\n" +
                        "          LightSnow: {\n" +
                        "            icon: iconBase + '49'\n" +
                        "          },\n" +
                        "          HeavySnow: {\n" +
                        "            icon: iconBase + '50'\n" +
                        "          }\n" +
                        "        };\n" +
                        "\n" +
                        "        var features = [\n" +
                        "          {\n" +
                        "            position: new google.maps.LatLng(59.911491, 10.757933),\n" +
                        "            type: '"+ osloIcon +"' \n" +
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
                        "    </script>" +
                        "<script async defer\n" +
                        "        src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyB0BmMIlJ9qZltweafsAoVOBuxXm62Nqqo&callback=initMap\">\n" +
                        "</script>"+
                "</body>" +
                "</html>";

                return variable;
    }

}
