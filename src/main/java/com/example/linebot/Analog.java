package com.example.linebot;

import com.linecorp.bot.model.message.TextMessage;

public class Analog {
    private float analog;

    public float getAnalog(){
        return analog;
    }

    public void setAnalog(float analog){
        this.analog = analog;
    }

    public String analog_data_analysis(){
        if (analog > 20){return "すごくいい天気です！たくさん光合成しますね！！";}
        else if (analog > 10){return "普通です。これなら生きていける。";}
        else if (analog > 5){return "ちょっと光が足りないよ。このままはちょっと辛いかな。";}
        else if (analog > 0){return "もう限界、このままだと死んでしまう、なんとかしてください。";}
        else return "";
    }
}
