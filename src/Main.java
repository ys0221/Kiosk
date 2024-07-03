import javax.naming.BinaryRefAddr;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void menuField() {
        // 객체 배열 사용
        int num_menu = 6; // 주문과 취소까지 포함한 메뉴의 개수
        Menu[] menu = new Menu[num_menu]; // 길이가 num_menu 인 Menu 타입의 참조변수 배열
        // 객체를 생성해서 배열의 각 요소에 저장
        menu[0] = new Menu("Burgers","앵거스 비프 통살을 다져만든 버거");
        menu[1] = new Menu("Frozen Custard", "매장에서 신선하게 만드는 아이스크림");
        menu[2] = new Menu("Drinks", "매장에서 직접 만드는 음료");
        menu[3] = new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주");
        menu[4] = new Menu("Order", "장바구니를 확인 후 주문합니다.");
        menu[5] = new Menu("Cancel", "진행 중인 주문을 취소합니다.");
        // 메인 메뉴판 화면
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println(" ");
        System.out.println("[ SHAKESHACK MENU ]");
        for(int i=0; i<4; i++){
            menu[i].printMenu(i);
        }
        System.out.println(" ");
        System.out.println("[ ORDER MENU ]");

        for(int i=4; i<menu.length; i++){
            menu[i].printMenu(i);
        }
    }
    public static int order() {
        Scanner order_scanner = new Scanner(System.in);
        int select_order = order_scanner.nextInt();
        if (select_order == 1) {
            return 1;
        } else if (select_order == 2) {
            return 2;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        int num_burger = 5;
        int num_frozencustard = 6;
        int num_drinks = 6;
        int num_beer = 2;
        int num_customer = 1;
        double burger_price = 0.0;
        double total_burger_price = 0.0;
        double frozen_custard_price = 0.0;
        double total_frozen_custard_price = 0.0;
        double drink_price = 0.0;
        double total_drink_price = 0.0;
        double beer_price = 0.0;
        double total_beer_price = 0.0;
        // 메뉴판 출력
        menuField();
        // 메뉴 선택
        Scanner menu_scanner = new Scanner(System.in);
        int select_menu = menu_scanner.nextInt();

        // 잘못된 메뉴 선택 시 경고 후 재선택
        while (select_menu > 6) {
            System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
            select_menu = menu_scanner.nextInt();
        }

        // 버거 메뉴 선택
        Burger[] burgers = new Burger[num_burger];
        // Q. price 에서 float 대신 double 로 쓰면 오류가 나지 않는 이유
        burgers[0] = new Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgers[1] = new Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgers[2] = new Burger("Shroom Burger",9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        burgers[3] = new Burger("Cheeseburger",6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgers[4] = new Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        // 아이스크림 선택
        FrozenCustard[] frozen_custards = new FrozenCustard[num_frozencustard];
        frozen_custards[0] = new FrozenCustard("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피");
        frozen_custards[1] = new FrozenCustard("Shake of the Week", 6.5, "특별한 커스터드 플레이버");
        frozen_custards[2] = new FrozenCustard("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
        frozen_custards[3] = new FrozenCustard("Floats", 5.9, "루트 비어, 퍼플 카우, 크림사클");
        frozen_custards[4] = new FrozenCustard("Cups & Cones", 4.9, "바닐라, 초콜렛, Flavor of the Week");
        frozen_custards[5] = new FrozenCustard("Concretes", 5.9, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합");
        // 음료 선택
        Drink[] drinks = new Drink[num_drinks];
        drinks[0] = new Drink("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)");
        drinks[1] = new Drink("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티");
        drinks[2] = new Drink("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남");
        drinks[3] = new Drink("Fountain Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
        drinks[4] = new Drink("Abita Root Beer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료");
        drinks[5] = new Drink("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수");
        // 맥주 선택
        Beer[] beers = new Beer[num_beer];
        beers[0] = new Beer("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
        beers[1] = new Beer("Magpie Brewing Co.", 6.8, " ");

        if (select_menu == 1) {
            System.out.println("[ Burgers Menu ]");
            for(int i=0; i<burgers.length; i++){
                burgers[i].printBurger(i);
            }
            Scanner burger_scanner = new Scanner(System.in);
            int select_burger = burger_scanner.nextInt();
            if(select_burger > 5){
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                select_burger = burger_scanner.nextInt();
            }
            // Q. burgers.orderBurger(select_burger) 과의 차이점이 궁금
            burgers[select_burger-1].orderBurger(select_burger-1);
            int burger_next = burgers[select_burger-1].next();
            // Q. else if 에 사용하면 값이 올바르게 나타나지 않는 이유
            if (burger_next == 0) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                burger_next = burgers[select_burger - 1].next();
            }
            if (burger_next == 1) {
                burgers[select_burger-1].plusBurger(select_burger);
                String burger = burgers[select_burger-1].burgerName();
                System.out.println(burger + " 가 장바구니에 추가되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else if (burger_next == 2) {
                System.out.println("취소되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else {
                // nothing
            }
        }
        if (select_menu == 2) {
            System.out.println("[ Frozen Custard Menu ]");
            for (int i=0; i<frozen_custards.length; i++){
                frozen_custards[i].printFrozenCustard(i);
            }
            Scanner frozen_custard_scanner = new Scanner(System.in);
            int select_frozen_custard = frozen_custard_scanner.nextInt();
            if (select_frozen_custard > 6) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                select_frozen_custard = frozen_custard_scanner.nextInt();
            }
            frozen_custards[select_frozen_custard-1].orderFrozenCustard(select_frozen_custard-1);
            int frozen_custard_next = frozen_custards[select_frozen_custard-1].next();
            if(frozen_custard_next == 0) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                frozen_custard_next = frozen_custards[select_frozen_custard-1].next();
            }
            if (frozen_custard_next == 1) {
                frozen_custards[select_frozen_custard-1].plusFrozenCustard(select_frozen_custard);
                String frozen_custard = frozen_custards[select_frozen_custard-1].frozencustardName();
                System.out.println(frozen_custard + " 가 장바구니에 추가되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else if (frozen_custard_next == 2) {
                System.out.println("취소되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else {
                // nothing
            }
        }
        if (select_menu == 3) {
            System.out.println("[ Drinks Menu ]");
            for (int i=0; i<drinks.length; i++){
                drinks[i].printDrink(i);
            }
            Scanner drink_scanner = new Scanner(System.in);
            int select_drink = drink_scanner.nextInt();
            if (select_drink > 6) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                select_drink = drink_scanner.nextInt();
            }
            drinks[select_drink-1].orderDrink(select_drink-1);
            int drink_next = drinks[select_drink-1].next();
            if(drink_next == 0) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                drink_next = drinks[select_drink-1].next();
            }
            if (drink_next == 1) {
                drinks[select_drink-1].plusDrink(select_drink);
                String drink = drinks[select_drink-1].drinkName();
                System.out.println(drink+" 가 장바구니에 추가되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else if (drink_next == 2) {
                System.out.println("취소되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else {
                // nothing
            }

        }
        if (select_menu == 4) {
            System.out.println("[ Beers Menu ]");
            for (int i=0; i<beers.length; i++){
                beers[i].printBeer(i);
            }
            Scanner beers_scanner = new Scanner(System.in);
            int select_beer = beers_scanner.nextInt();
            if (select_beer > 2) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                select_beer = beers_scanner.nextInt();
            }
            beers[select_beer-1].orderBeer(select_beer-1);
            int beer_next = beers[select_beer-1].next();
            if (beer_next == 0) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                beer_next = beers[select_beer-1].next();
            }
            if (beer_next == 1) {
                beers[select_beer-1].plusBeer(select_beer);
                String beer = beers[select_beer-1].beerName();
                System.out.println(beer+ " 가 장바구니에 추가되었습니다.");
                menuField();
                select_menu = menu_scanner.nextInt();
            } else if (beer_next == 2) {
                menuField();
                select_menu = menu_scanner.nextInt();
            } else {
                // nothing
            }
        }
        // 클래스 메서드 사용할 때 먼저 클래스 선언하고 사용할 것
        BurgerOrder burger_order[] = new BurgerOrder[5];
        for (int i=0; i<burger_order.length; i++){
            burger_order[i] = new BurgerOrder(burgers[i].burgerTitle, burgers[i].price, burgers[i].burgerDescription);
        }
        FrozenCustardOrder frozen_custard_order[] = new FrozenCustardOrder[6];
        for (int i=0; i<frozen_custard_order.length; i++){
            frozen_custard_order[i] = new FrozenCustardOrder(frozen_custards[i].frozencustardTitle, frozen_custards[i].price, frozen_custards[i].frozencustardDescription);
        }
        DrinkOrder drink_order[] = new DrinkOrder[6];
        for (int i=0; i<drink_order.length; i++){
            drink_order[i]= new DrinkOrder(drinks[i].drinkTitle, drinks[i].price, drinks[i].drinkDescription);
        }
        BeerOrder beer_order[] = new BeerOrder[2];
        for (int i=0; i<beer_order.length; i++){
            beer_order[i] = new BeerOrder(beers[i].beerTitle, beers[i].price, beers[i].beerDescription);
        }
        if (select_menu == 5) {
            System.out.println("아래와 같이 주문하시겠습니까?");
            System.out.println("[ ORDERS ]");
            // burger
            for (int i = 0; i < 5; i++) {
                if (burgers[i].burgerNum[i] >= 1) {
                    for (int k = 0; k < burgers[i].burgerNum[i]; k++) {
                        burger_order[i].printOrderBurger(i);
                        burger_price = burger_order[i].burgerPrice(i);
                        total_burger_price = burger_order[i].totalBurger(burger_price);
                    }
                }
            }
            // frozencustard
            for (int j = 0; j < 6; j++) {
                if (frozen_custards[j].frozencustardNum[j] >= 1) {
                    for (int i = 0; i < frozen_custards[j].frozencustardNum[j]; i++) {
                        frozen_custard_order[j].printOrderFrozenCustard(j);
                        frozen_custard_price = frozen_custard_order[j].frozencustardPrice(j);
                        total_frozen_custard_price = frozen_custard_order[j].totalFrozenCustard(frozen_custard_price);
                    }
                }
            }
            // drink
            for (int x = 0; x < 6; x++) {
                if (drinks[x].drinkNum[x] >= 1) {
                    for (int i = 0; i < drinks[x].drinkNum[x]; i++) {
                        drink_order[x].printOrderDrink(x);
                        drink_price = drink_order[x].drinkPrice(x);
                        total_drink_price = drink_order[x].totalDrink(drink_price);
                    }
                }
            }
            // beer
            for (int y = 0; y < 2; y++) {
                if (beers[y].beerNum[y] >= 1) {
                    for (int i = 0; i < beers[y].beerNum[y]; i++) {
                        beer_order[y].printOrderBeer(y);
                        beer_price = beer_order[y].beerPrice(y);
                        total_beer_price = beer_order[y].totalBeer(beer_price);
                    }
                }
            }
            double total_price = total_burger_price + total_frozen_custard_price + total_drink_price + total_beer_price;
            // 소수점 둘째 자리까지만 출력
            String totalStr = String.format("%.2f", total_price);
            System.out.println("[ total ]");
            System.out.println("W " + totalStr);
            System.out.println("1. 주문           2. 메뉴판");
            int select_order = order();
            if(select_order == 0) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                select_order = order();
            }
            if (select_order == 1) {
                System.out.println("주문이 완료되었습니다!");
                System.out.println("");
                System.out.println("대기번호는 " +num_customer+ " 번 입니다."); // 변수로 받아야하는거 같음
                System.out.println("(3초 후 메뉴판으로 돌아갑니다)");
                // 장바구니 초기화
                // 1. 햄버거 초기화
                for (int i = 0; i < num_burger; i++) {
                    burgers[i].burgerNum[i] = 0;
                }
                // 2. FrozenCustard 초기화
                for (int i = 0; i < num_frozencustard; i++) {
                    frozen_custards[i].frozencustardNum[i] = 0;
                }
                // 3. Drink 초기화
                for (int i = 0; i < num_drinks; i++) {
                    drinks[i].drinkNum[i] = 0;
                }
                // 4. Beer 초기화
                for (int i = 0; i < num_beer; i++) {
                    beers[i].beerNum[i] = 0;
                }
                // 3초 후 메뉴판 출력
                try {
                    TimeUnit.SECONDS.sleep(3);
                    menuField();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                select_menu = menu_scanner.nextInt();
            } else if (select_order == 2) {
                menuField();
                select_menu = menu_scanner.nextInt();
            } else {
                // nothing
            }

        }
        if (select_menu == 6) {
            System.out.println("진행하던 주문을 취소하시겠습니까?");
            System.out.println("1. 확인           2. 취소");
            Scanner cancel_scanner = new Scanner(System.in);
            int cancel = cancel_scanner.nextInt();
            if (cancel != 1 && cancel != 2) {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
                cancel = cancel_scanner.nextInt();
            }
            if (cancel == 1) {
                System.out.println("진행하던 주문이 취소되었습니다.");
                // 장바구니 초기화
                // 1. 햄버거 초기화
                for (int i = 0; i < num_burger; i++) {
                    burgers[i].burgerNum[i] = 0;
                }
                // 2. FrozenCustard 초기화
                for (int i = 0; i < num_frozencustard; i++) {
                    frozen_custards[i].frozencustardNum[i] = 0;
                }
                // 3. Drink 초기화
                for (int i = 0; i < num_drinks; i++) {
                    drinks[i].drinkNum[i] = 0;
                }
                // 4. Beer 초기화
                for (int i = 0; i < num_beer; i++) {
                    beers[i].beerNum[i] = 0;
                }
                menuField();
                // select_menu 선언 안 됨
                select_menu = menu_scanner.nextInt();
            } else if (cancel == 2) {
                // select_menu 선언 안 됨
                select_menu = menu_scanner.nextInt();
                menuField();
            }
            // cancel 선언이 안 됨
            /*
            else {
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
                cancel = cancel_scanner.nextInt();
            }
             */
        }
    }


}
