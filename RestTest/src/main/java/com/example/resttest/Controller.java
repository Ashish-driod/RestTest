package com.example.resttest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class Controller {

    @PostMapping(value = "/getTest")
    public TapiResponse getMappingTest(@RequestBody Person a){

        TapiResponse tapiResponse = new TapiResponse(TapiResponse.StatusCode.SUCCESS,TapiResponse.EMPTY_RESPONSE,TapiResponse.EMPTY_HEADERS);
        System.out.println(a.getAddr() + a.getName());
        return tapiResponse;
    }

}
