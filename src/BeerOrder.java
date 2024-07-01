public class BeerOrder extends Beer {
    double total_beer_price = 0.0;
    public BeerOrder(String title, double price, String explain) {
        this.beerTitle = title;
        this.price = price;
        this.beerDescription = explain;
    }
    public void printOrderBeer(int n) {
        printBeer(n);
    }
    public double beerPrice(int num) {
        return price;
    }
    public double totalBeer(double beer_price) {
        total_beer_price += beer_price;
        return total_beer_price;
    }
}
