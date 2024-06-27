import java.util.Scanner;

public class Beer extends Menu {
    double price; // 상품 가격
    // 각 상품별 주문 개수
    int one_beer = 0;
    int two_beer = 0;
    String[] beer_name = new String[2];

    public Beer(String title, double price, String description) {
        this.beerTitle = title;
        this.price = price;
        this.beerDescription = description;
    }
    public void printBeer(int num) {
        System.out.println(num+1 + ". " + beerTitle + " | W "  + price + " | " + beerDescription);
    }
    public void orderBeer(int n) {
        printBeer(n);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인            2.취소");
    }
    public int next() {
        Scanner input = new Scanner(System.in);
        if (input.nextInt() == 1) {
            return 1;
        } else {
            return 0;
        }
    }
    public void plusBeer(int beernum) {
        if (beernum == 1) {
            one_beer++;
        } else if (beernum == 2) {
            two_beer++;
        } else {
            // nothing
        }
    }
    public String beerName() {
        if (one_beer >= 1) {
            beer_name[0] = "ShackMeister Ale";
            return beer_name[0];
            // return "ShackBurger";
        } else if (two_beer == 1) {
            beer_name[1] = "Magpie Brewing Co.";
            return beer_name[1];
        } else {
            return null;
        }
    }
}
