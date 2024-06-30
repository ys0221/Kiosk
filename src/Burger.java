import java.util.Scanner;
public class Burger extends Menu {
    // 햄버거 별 주문한 개수
    int one_burger = 0;
    int two_burger = 0;
    int three_burger = 0;
    int four_burger = 0;
    int five_burger = 0;
    String burger_name[] = new String[5];
    double price; // 상품 가격
    // double price = 0;

    public Burger() {
        // 상속
    }
    public Burger(String title, double price, String description) {
        this.burgerTitle = title;
        this.price = price;
        this.burgerDescription = description;
    }
    public void printBurger(int num) {
        System.out.println(num+1 + ". " + burgerTitle + " | W "  + price + " | " + burgerDescription);
    }
    /*
    public void setBurgerName(int num) {
        burger_name[num] = burgerTitle;
    }

     */
    public void orderBurger(int n) {
        printBurger(n);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인            2.취소");
    }
    public int next() {
        Scanner input = new Scanner(System.in);
        if (input.nextInt() == 1) {
            return 1;
        } else if (input.nextInt() == 2) {
            return 2;
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
    public String burgerName() {
        if (one_burger >= 1) {
            burger_name[0] = "ShackBurger";
            return burger_name[0];
            // return "ShackBurger";
        } else if (two_burger >= 1) {
            burger_name[1] = "SmokeBurger";
            return burger_name[1];
        } else if (three_burger >= 1) {
            burger_name[2] = "ShroomBurger";
            return burger_name[2];
        } else if (four_burger >= 1) {
            burger_name[3] = "CheeseBurger";
            return burger_name[3];
        } else if (five_burger >= 1) {
            burger_name[4] = "Hamburger";
            return burger_name[4];
        } else {
            return null;
        }
    }
}
