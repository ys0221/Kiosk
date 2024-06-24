public class Drink extends Menu {
    double price; // 상품 가격
    public Drink(String title, double price, String description) {
        this.drinkTitle = title;
        this.price = price;
        this.drinkDescription = description;
    }
    public void printDrink(int num) {
        System.out.println(num+1 + ". " + drinkTitle + " | W "  + price + " | " + drinkDescription);
    }
}
