import java.util.Scanner;

public class FrozenCustard extends Menu {
    double price; // 상품 가격
    // 각 상품별 주문 개수
    int one_frozen_custard = 0;
    int two_frozen_custard = 0;
    int three_frozen_custard = 0;
    int four_frozen_custard = 0;
    int five_frozen_custard = 0;
    int six_frozen_custard = 0;
    String frozencustard_name[] = new String[6];

    public FrozenCustard() {
        // 상속
    }
    public FrozenCustard(String title, double price, String description) {
        this.frozencustardTitle = title;
        this.price = price;
        this.frozencustardDescription = description;
    }
    public void printFrozenCustard(int num) {
        System.out.println(num+1 + ". " + frozencustardTitle + " | W "  + price + " | " + frozencustardDescription);
    }
    public void orderFrozenCustard(int n) {
        printFrozenCustard(n);
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
    public void plusFrozenCustard(int frozen_custard_num) {
        if (frozen_custard_num == 1) {
            one_frozen_custard++;
        } else if (frozen_custard_num == 2) {
            two_frozen_custard++;
        } else if (frozen_custard_num == 3) {
            three_frozen_custard++;
        } else if (frozen_custard_num == 4) {
            four_frozen_custard++;
        } else if (frozen_custard_num == 5) {
            five_frozen_custard++;
        } else if (frozen_custard_num == 6) {
            six_frozen_custard++;
        } else {
            // nothing
        }
    }
    public String frozencustardName() {
        if (one_frozen_custard == 1) {
            frozencustard_name[0] = "Shakes";
            return frozencustard_name[0];
            // return "ShackBurger";
        } else if (two_frozen_custard >= 1) {
            frozencustard_name[1] = "Shake of the Week";
            return frozencustard_name[1];
        } else if (three_frozen_custard >= 1) {
            frozencustard_name[2] = "Red Bean Shake";
            return frozencustard_name[2];
        } else if (four_frozen_custard >= 1) {
            frozencustard_name[3] = "Floats";
            return frozencustard_name[3];
        } else if (five_frozen_custard >= 1) {
            frozencustard_name[4] = "Cups & Cones";
            return frozencustard_name[4];
        } else if (six_frozen_custard >= 1) {
            frozencustard_name[5] = "Concretes";
            return frozencustard_name[5];
        } else {
            return null;
        }
    }
}
