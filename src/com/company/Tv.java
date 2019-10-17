package com.company;

public class Tv {

    private String brand;
    private Integer channel;
    private Integer volume;

    public Tv() {}
    public Tv(String brand, Integer channel, Integer volume) {
        this.brand = brand;
        this.channel = channel;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "The" + brand +
                " TV is on channel " + channel +
                " at volume " + volume;
    }

    public void changeVolume(Integer amount) {
    this.volume += amount;
    if (this.volume > 100) {
        this.volume = 100;
    }
    if (this.volume < 0) {
        this.volume = 0;
    }
    }
}
