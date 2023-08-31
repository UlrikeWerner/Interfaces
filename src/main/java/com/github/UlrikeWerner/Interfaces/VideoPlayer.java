package com.github.UlrikeWerner.Interfaces;

public class VideoPlayer implements Playable{
    private static final String video = "Dancing On The Ceiling";
    @Override
    public void play() {
        System.out.println("VideoPlayer spielt " + video + "ab.");
    }
}
