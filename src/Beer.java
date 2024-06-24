public class Beer extends Menu {
    double price; // 상품 가격
    public Beer(String title, double price, String description) {
        this.beerTitle = title;
        this.price = price;
        this.beerDescription = description;
    }
    public void printBeer(int num) {
        System.out.println(num+1 + ". " + beerTitle + " | W "  + price + " | " + beerDescription);
    }
}
