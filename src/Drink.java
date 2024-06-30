import java.util.Scanner;

public class Drink extends Menu {
    double price; // 상품 가격
    // 각 상품별 주문 개수
    int one_drink = 0;
    int two_drink = 0;
    int three_drink = 0;
    int four_drink = 0;
    int five_drink = 0;
    int six_drink = 0;
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
        if (input.nextInt() == 1) {
            return 1;
        } else if (input.nextInt() == 2){
            return 2;
        } else {
            return 0;
        }
    }
    public void plusDrink(int drinknum) {
        if (drinknum == 1) {
            one_drink++;
        } else if (drinknum == 2) {
            two_drink++;
        } else if (drinknum == 3) {
            three_drink++;
        } else if (drinknum == 4) {
            four_drink++;
        } else if(drinknum == 5){
            five_drink++;
        } else if(drinknum == 6){
            six_drink++;
        } else {
            // nothing
        }
    }
    public String drinkName() {
        if (one_drink >= 1) {
            drink_name[0] = "Shack-made Lemonade";
            return drink_name[0];
            // return "ShackBurger";
        } else if (two_drink >= 1) {
            drink_name[1] = "Fresh Brewed Iced Tea";
            return drink_name[1];
        } else if (three_drink >= 1) {
            drink_name[2] = "Fifty/Fifty";
            return drink_name[2];
        } else if (four_drink >= 1) {
            drink_name[3] = "Fountain Soda";
            return drink_name[3];
        } else if (five_drink >= 1) {
            drink_name[4] = "Abita Root Beer";
            return drink_name[4];
        } else if (six_drink >= 1) {
            drink_name[5] = "Bottled Water";
            return drink_name[5];
        } else {
            return null;
        }
    }
}
