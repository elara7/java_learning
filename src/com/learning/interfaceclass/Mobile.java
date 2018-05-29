package com.learning.interfaceclass;

//实现多个接口用逗号分开
public class Mobile implements USB,MP3 {
    @Override
    public void read() {
        System.out.println("from Mobile read...");
    }

    @Override
    public void write() {
        System.out.println("write to Moblie");
    }

    @Override
    public void playMP3() {
        System.out.println("play mp3...");
    }
}
