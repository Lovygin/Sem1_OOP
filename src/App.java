import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Domen.*;
import Services.*;

public class App {
    public static void main(String[] args) throws Exception {

        List<Product> assort = new ArrayList<>();
        long counterID = 1;
        Random rand = new Random();
        Product item1 = new Product(100, 1, "Lays");
        Product item2 = new Bottle(50, 2, "CocaCola", 0);
        Product item3 = new Bottle(100, 3, "Mineral water",0,0.5);

        Product item4 = new HotDrink(75, 4, "Hot chocolate",0, 0.200);
        Product item5 = new HotDrink(75, 5, "Americano", 0, 0.200);
        Product item6 = new HotDrink(50, 6, "Black tea", 0, 0.200);
        Product item7 = new HotDrink(50, 7, "Green tea", 0, 0.200);


        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);
        assort.add(item6);
        assort.add(item7);

        for (int i = 0; i < assort.size(); i++) {
            assort.get(i).setId(counterID++);
        }

        Holder hold1 = new Holder(4,4);
        CoinDispenser coinDispenser = new CoinDispenser(0);
        Display display = new Display();

        VendingMachine vendingMachine = new VendingMachine(hold1, coinDispenser, assort, display);

        for(Product product: vendingMachine.getProducts()){
            System.out.println(product);
        }

//        MainFrame myFrame = new MainFrame();
//        myFrame.initialize();


    }
}