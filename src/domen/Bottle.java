package domen;

public class Bottle extends Product {
    private double volume;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public Bottle() {
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" + super.toString() +
                "volume=" + volume +
                '}';
    }
}
