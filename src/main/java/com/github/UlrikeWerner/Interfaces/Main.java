package com.github.UlrikeWerner.Interfaces;

public class Main {
    public static void main(String[] args) {
        MediaController player = new MediaController();
        player.playMedia(new MusicPlayer());
        player.playMedia(new VideoPlayer());


    }
}
