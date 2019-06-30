package com.example.linebot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Push {
    @GetMapping("test")
    public String hello(HttpServletRequest request){
        return "Get form:" + request.getRequestURL();
    }

    public String pushAnalog(){
        Judge judge = new Judge();
        return "状態は..." +judge.analog_data_analysis();
    }

    public String pushHumidity(){
        return "";
    }

    public String pushCelsius_degree(){
        return "";
    }

    public String pushMoisture(){
        return "";
    }
}
