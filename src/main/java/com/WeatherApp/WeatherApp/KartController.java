package com.WeatherApp.WeatherApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Oslo")

public class KartController {
    @GetMapping
    public String Oslo() {
        return "<iframe width=\"600\" height=\"450\" frameborder=\"0\" style=\"border:0\" src=\"https://www.google.com/maps/embed/v1/place?q=place_id:ChIJOfBn8mFuQUYRmh4j019gkn4&key=AIzaSyB0BmMIlJ9qZltweafsAoVOBuxXm62Nqqo\" allowfullscreen></iframe> ";

    }


}
