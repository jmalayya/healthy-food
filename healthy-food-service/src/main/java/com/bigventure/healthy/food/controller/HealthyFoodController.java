package com.bigventure.healthy.food.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jweeta.malayya on 11/22/16.
 */
@RestController
public class HealthyFoodController {

    private static final String API_VERSION = "/v1.0";

    @RequestMapping(value = API_VERSION, method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public
    @ResponseBody
    String getMessage() {
        return "Welcome to healthy food service";
    }

}
