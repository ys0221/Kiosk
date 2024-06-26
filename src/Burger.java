import java.util.Scanner;
public class Burger extends Menu {
    double price; // 상품 가격
    // 햄버거 별 주문한 개수
    int one_burger = 0;
    int two_burger = 0;
    int three_burger = 0;
    int four_burger = 0;
    int five_burger = 0;
    public Burger(String title, double price, String description) {
        this.burgerTitle = title;
        this.price = price;
        this.burgerDescription = description;
    }
    public void printBurger(int num) {
        System.out.println(num+1 + ". " + burgerTitle + " | W "  + price + " | " + burgerDescription);
    }
    public void orderBurger(int n) {
        printBurger(n);
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
    public void plusBurger(int burgernum) {
        if (burgernum == 1) {
            one_burger++;
        } else if (burgernum == 2) {
            two_burger++;
        } else if (burgernum == 3) {
            three_burger++;
        } else if (burgernum == 4) {
            four_burger++;
        } else if(burgernum == 5){
            five_burger++;
        } else {
            // nothing
        }
    }
}
