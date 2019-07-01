package com.example.linebot;

import com.linecorp.bot.model.message.TextMessage;

public class Analog extends Judge{
    private float analog;

    public float getAnalog(){
        return analog;
    }

    public void setAnalog(float analog){
        this.analog = analog;
    }

}
