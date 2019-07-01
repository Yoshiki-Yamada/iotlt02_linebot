package com.example.linebot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class Push {

    Judge judge = new Judge();

    @GetMapping("test")
    public String hello(HttpServletRequest request){
        return "Get form:" + request.getRequestURL();
    }

    public String pushAnalog(){
        //Judge judge = new Judge();
        return "状態は..." + judge.analog_data_analysis();
    }

    public String pushHumidity(){
       // Humidity humidity = new Humidity();
        return "状態は..." + judge.humidity_data_analysis();
    }

    public String pushCelsius_degree(){
      //  Celsius_degree celsius_degree = new Celsius_degree();
        return "状態は..." + judge.celsius_degree_data_analysis();
    }

    public String pushMoisture(){
      //  Moisture moisture = new Moisture();
        return "状態は..." + judge.moisture_data_analysis();
    }
}
