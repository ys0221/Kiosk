public class DrinkOrder extends Drink {
    double total_drink_price = 0.0;
    public DrinkOrder(String title, double price, String explain) {
        this.drinkTitle = title;
        this.price = price;
        this.drinkDescription = explain;
    }
    public void printOrderDrink(int n) {
        printDrink(n);
    }
    public double drinkPrice(int num) {
        return price;
    }
}
