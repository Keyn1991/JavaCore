package HomeWork1.Resolves.hw1;

public class Car {
    private String model;
    private int power;
    private double VolumeEngine;
    private boolean turbo;

    public String toString() {
        return STR."Car model \{model} , power \{power}, volumeEngine \{VolumeEngine}, turbo \{turbo}";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolumeEngine() {
        return VolumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        VolumeEngine = volumeEngine;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
}

