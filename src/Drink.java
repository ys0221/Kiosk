import java.util.Scanner;

public class Drink extends Menu {
    double price; // 상품 가격
    // 각 상품별 주문 개수
    int[] drinkNum = new int[6];
    String[] drink_name = new String[6];
    public Drink() {
        // 상속
    }
    public Drink(String title, double price, String description) {
        this.drinkTitle = title;
        this.price = price;
        this.drinkDescription = description;
    }
    public void printDrink(int num) {
        System.out.println(num+1 + ". " + drinkTitle + " | W "  + price + " | " + drinkDescription);
    }
    public void orderDrink(int n) {
        printDrink(n);
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1.확인            2.취소");
    }
    public int next() {
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        if (select == 1) {
            return 1;
        } else if (select == 2){
            return 2;
        } else {
            return 0;
        }
    }
    public void plusDrink(int drinknum) {
        if (drinknum == 1) {
            drinkNum[0]++;
        } else if (drinknum == 2) {
            drinkNum[1]++;
        } else if (drinknum == 3) {
            drinkNum[2]++;
        } else if (drinknum == 4) {
            drinkNum[3]++;
        } else if(drinknum == 5){
            drinkNum[4]++;
        } else if(drinknum == 6){
            drinkNum[5]++;
        } else {
            // nothing
        }
    }
    public String drinkName() {
        if (drinkNum[0] >= 1) {
            drink_name[0] = "Shack-made Lemonade";
            return drink_name[0];
            // return "ShackBurger";
        } else if (drinkNum[1] >= 1) {
            drink_name[1] = "Fresh Brewed Iced Tea";
            return drink_name[1];
        } else if (drinkNum[2]>= 1) {
            drink_name[2] = "Fifty/Fifty";
            return drink_name[2];
        } else if (drinkNum[3]>= 1) {
            drink_name[3] = "Fountain Soda";
            return drink_name[3];
        } else if (drinkNum[4] >= 1) {
            drink_name[4] = "Abita Root Beer";
            return drink_name[4];
        } else if (drinkNum[5] >= 1) {
            drink_name[5] = "Bottled Water";
            return drink_name[5];
        } else {
            return null;
        }
    }
}
