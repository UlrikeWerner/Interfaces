package com.github.UlrikeWerner.Interfaces;

public class MusicPlayer implements Playable{
    private static final String song = "The Final Countdown";

    @Override
    public void play() {
        System.out.println("MusicPlayer spielt " + song);
    }
}
