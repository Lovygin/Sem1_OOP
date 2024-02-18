package Services;

public class CoinDispenser {
    private int nominal;

    public CoinDispenser(int nominal){
        this.nominal = nominal;
    }

    public String toString(){
        return "The denomination of the coin is " + nominal;
    }

    public int getSum(int insertCoin, int outCoin){
        int sumCoin;
        sumCoin = insertCoin + outCoin;
        return  sumCoin;
    }

    public int giveChange(int sumCoin, int price){
        int change;
        if(price < sumCoin){
            change = sumCoin - price;
        }
        else if(price < sumCoin){
            change = sumCoin - price;
        }
        else change = 0;
        return change;
    }

    public  boolean dispense(int price) {
        return false;
    }
}

