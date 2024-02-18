package Services;

import Domen.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDispenser coinDispenser;
    private  List<Product> assort;

    public VendingMachine(Holder holder, CoinDispenser coinDispenser, List<Product> assort, Display display) {
        this.holder = holder;
        this.display = display;
        this.coinDispenser = coinDispenser;
        this.assort = assort;
    }

    public VendingMachine() {
    }
    public List<Product> getProducts() {
        return assort;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }

    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }

    public List<Product> getAssort() {
        return assort;
    }

    public void setAssort(List<Product> assort) {
        this.assort = assort;
    }

    /**
     * @apiNote добавление продукта в аппарат
     * @param product объект добавляемого продукта
     */
    public void addProduct(Product product) {
        if (product.getPrice() <= 0) {
            product.setPrice(100);
        }
    }

    public void buyProduct(Product p, int price) {
        if (assort.contains(p) && holder.getBalance() >= price) {
            if(coinDispenser.dispense(price)) {
                releaseProduct(p, holder);
                display.print("You have successfully bought " + p.getName() + ".");
            }
            else {
                display.print("Product not available or insufficient balance.");
            }
        }
    }

    public void releaseProduct(Product p, Holder h) {
        h.release(0,0);
        assort.remove(p);
    }

    public void cancel() {
        coinDispenser.giveChange(0, 0);
    }
}
