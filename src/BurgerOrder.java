public class BurgerOrder extends Burger {
    double total_burger_price = 0.0;
    public BurgerOrder(String title, double price, String explain) {
        this.burgerTitle = title;
        this.price = price;
        this.burgerDescription = explain;
    }
    public void printOrderBurger(int n) {
        printBurger(n);
    }
    public double burgerPrice(int num) {
        return price;
    }
    // 그냥 else if 를 사용해도 되는가? -> 사용하지 않은 이유 : else if 이면 one_burger가 0일 때 사용한다고 생각해서
    /*
    public void burgerCheck() {
        if (one_burger >= 1) {
            for (int i = 0; i <= one_burger; i++) {
                printOrderBurger(0);
            }
        }
        if (two_burger >= 1) {
            for (int i = 0; i <= two_burger; i++) {
                printOrderBurger(1);
            }
        }
        if (three_burger >= 1) {
            for (int i = 0; i <= three_burger; i++) {
                printOrderBurger(2);
            }
        }
        if (four_burger >= 1) {
            for (int i = 0; i <= four_burger; i++) {
                printOrderBurger(3);
            }
        }
        if (five_burger >= 1) {
            for (int i = 0; i <= five_burger; i++) {
                printOrderBurger(4);
            }
        }
    }

     */
    public double totalBurger(double burger_price) {
        total_burger_price += burger_price;
        return total_burger_price;
    }

}
