public class FrozenCustardOrder extends FrozenCustard{
    double total_frozencustard_price = 0.0;
    public FrozenCustardOrder(String title, double price, String explain) {
        this.frozencustardTitle = title;
        this.price = price;
        this.frozencustardDescription = explain;
    }
    public void printOrderFrozenCustard(int n) {
        printFrozenCustard(n);
    }
    public double frozencustardPrice(int num) {
        return price;
    }
}
