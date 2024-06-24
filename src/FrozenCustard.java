public class FrozenCustard extends Menu {
    double price; // 상품 가격
    public FrozenCustard(String title, double price, String description) {
        this.frozencustardTitle = title;
        this.price = price;
        this.frozencustardDescription = description;
    }
    public void printFrozenCustard(int num) {
        System.out.println(num+1 + ". " + frozencustardTitle + " | W "  + price + " | " + frozencustardDescription);
    }
}
