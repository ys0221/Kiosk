import java.util.Scanner;

public class FrozenCustard extends Menu {
    double price; // 상품 가격
    // 각 상품별 주문 개수
    int frozencustardNum[] = new int[6];
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
        int select = input.nextInt();
        if (select == 1) {
            return 1;
        } else if (select == 2) {
            return 2;
        } else {
            return 0;
        }
    }
    public void plusFrozenCustard(int frozen_custard_num) {
        if (frozen_custard_num == 1) {
            frozencustardNum[0]++;
        } else if (frozen_custard_num == 2) {
            frozencustardNum[1]++;
        } else if (frozen_custard_num == 3) {
            frozencustardNum[2]++;
        } else if (frozen_custard_num == 4) {
            frozencustardNum[3]++;
        } else if (frozen_custard_num == 5) {
            frozencustardNum[4]++;
        } else if (frozen_custard_num == 6) {
            frozencustardNum[5]++;
        } else {
            // nothing
        }
    }
    public String frozencustardName() {
        if (frozencustardNum[0] >= 1) {
            frozencustard_name[0] = "Shakes";
            return frozencustard_name[0];
        } else if (frozencustardNum[1] >= 1) {
            frozencustard_name[1] = "Shake of the Week";
            return frozencustard_name[1];
        } else if (frozencustardNum[2] >= 1) {
            frozencustard_name[2] = "Red Bean Shake";
            return frozencustard_name[2];
        } else if (frozencustardNum[3] >= 1) {
            frozencustard_name[3] = "Floats";
            return frozencustard_name[3];
        } else if (frozencustardNum[4] >= 1) {
            frozencustard_name[4] = "Cups & Cones";
            return frozencustard_name[4];
        } else if (frozencustardNum[5] >= 1) {
            frozencustard_name[5] = "Concretes";
            return frozencustard_name[5];
        } else {
            return null;
        }
    }
}
