public class Burger extends Menu {
    double price; // 상품 가격
    public Burger(String title, double price, String description) {
        this.burgerTitle = title;
        this.price = price;
        this.burgerDescription = description;
    }
    public void printBurger(int num) {
        System.out.println(num+1 + ". " + burgerTitle + " | W "  + price + " | " + burgerDescription);
    }
}
