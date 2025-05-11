package org.design_pattern.facade_pattern;

public class Amplifier {

    private int volume;

    public void on() {
        System.out.println("Switch on Amplifier");
    }

    public void off() {
        System.out.println("Switch off Amplifier");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Set Amplifier volume to " + this.volume);
    }
}
