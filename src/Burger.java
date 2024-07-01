import java.util.Scanner;
public class Burger extends Menu {
    // 햄버거 별 주문한 개수
    // 초기값 0으로 설정된 배열 생성
    int[] burgerNum = new int[5];
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
        int select = input.nextInt();
        if (select == 1) {
            return 1;
        } else if (select == 2) {
            return 2;
        } else {
            return 0;
        }
    }
    public void plusBurger(int burgernum) {
        if (burgernum == 1) {
            burgerNum[0]++;
        } else if (burgernum == 2) {
            burgerNum[1]++;
        } else if (burgernum == 3) {
            burgerNum[2]++;
        } else if (burgernum == 4) {
            burgerNum[3]++;
        } else if(burgernum == 5){
            burgerNum[4]++;
        } else {
            // nothing
        }
    }
    public String burgerName() {
        if (burgerNum[0] >= 1) {
            burger_name[0] = "ShackBurger";
            return burger_name[0];
            // return "ShackBurger";
        } else if (burgerNum[1] >= 1) {
            burger_name[1] = "SmokeBurger";
            return burger_name[1];
        } else if (burgerNum[2] >= 1) {
            burger_name[2] = "ShroomBurger";
            return burger_name[2];
        } else if (burgerNum[3] >= 1) {
            burger_name[3] = "CheeseBurger";
            return burger_name[3];
        } else if (burgerNum[4] >= 1) {
            burger_name[4] = "Hamburger";
            return burger_name[4];
        } else {
            return null;
        }
    }
}
