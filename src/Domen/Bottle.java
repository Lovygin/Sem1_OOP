package Domen;

public class Bottle extends Product {
    private double bottleVolume;

    public Bottle(int price, int place, String name, long id) {
        super(price, place, name, id);
        this.bottleVolume = -1;
    }
    public  Bottle (int price, int place, String name, long id, double bottleVolume){
        super(price, place, name, id);
        this.bottleVolume = bottleVolume;
    }

    public Bottle() {
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(double bottleVolume) {
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return super.toString() + "volume = " + bottleVolume;
    }
}
