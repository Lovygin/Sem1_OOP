package Domen;

public class HotDrink extends  Bottle {
    private int temperature;
    public  HotDrink (int price, int place, String name, long id, double bottleVolume) {
        super(price, place, name, id, bottleVolume);
        this.temperature = 0;
    }
    public  HotDrink (int price, int place, String name, long id, double bottleVolume, int temperature) {
        super(price, place, name, id, bottleVolume);
        this.temperature = temperature;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() +"Temperature of the hot drink = " + temperature;
    }
}
