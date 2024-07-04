public class BurgerOrder extends Burger {
    double total_burger_price = 0.0;
    public BurgerOrder(String title, double price, String explain) {
        this.burgerTitle = title;
        this.price = price;
        this.burgerDescription = explain;
    }
    public void printOrderBurger(int n) {
        printBurger(n);
    }
    public double burgerPrice(int num) {
        return price;
    }
}
