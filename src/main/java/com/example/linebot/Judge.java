package com.example.linebot;

public class Judge {
    public String analog_data_analysis(){
        Analog analog = new Analog();
        if (analog.getAnalog() > 20){return "すごくいい天気です！たくさん光合成しますね！！";}
        else if (analog.getAnalog() > 10){return "普通です。これなら生きていける。";}
        else if (analog.getAnalog() > 5){return "ちょっと光が足りないよ。このままはちょっと辛いかな。";}
        else if (analog.getAnalog() > 0){return "もう限界、このままだと死んでしまう、なんとかしてください。";}
        else return "";
    }
}
