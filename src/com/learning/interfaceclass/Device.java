package com.learning.interfaceclass;

public class Device implements Mobilephone {
    @Override
    public void talk() {
        System.out.println("play mp3...");
    }

    @Override
    public void playMP3() {
        System.out.println("talk...");
    }
}
