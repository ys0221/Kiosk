import javax.naming.BinaryRefAddr;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_menu = 6; // 메뉴의 총 개수 (주문과 취소까지 포함)
        int num_burger = 5;
        int num_frozencustard = 6;
        int num_drinks = 6;
        int num_beer = 2;
        // 객체 배열 사용
        Menu[] menu = new Menu[num_menu]; // 길이가 num_menu인 Menu 타입의 참조변수 배열
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

        // 메뉴 선택
        Scanner menu_scanner = new Scanner(System.in);
        int select_menu = menu_scanner.nextInt();

        // 잘못된 메뉴 선택 시 경고 후 재선택
        while (select_menu > 6) {
            System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
            select_menu = menu_scanner.nextInt();
        }

        // 버거 메뉴 선택
        Burger[] burgers = new Burger[num_burger];
        // Q. price 에서 float 대신 double 로 쓰면 오류가 나지 않는 이유
        burgers[0] = new Burger("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        burgers[1] = new Burger("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        burgers[2] = new Burger("Shroom Burger", 9.4, "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        burgers[3] = new Burger("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        burgers[4] = new Burger("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거");
        if (select_menu == 1) {
            System.out.println("[ Burgers Menu ]");
            for(int i=0; i<burgers.length; i++){
                burgers[i].printBurger(i);
            }
        }

        // 아이스크림 선택
        FrozenCustard[] frozen_custards = new FrozenCustard[num_frozencustard];
        frozen_custards[0] = new FrozenCustard("Shakes", 5.9, "바닐라, 초콜렛, 솔티드 카라멜, 블랙 & 화이트, 스트로베리, 피넛버터, 커피");
        frozen_custards[1] = new FrozenCustard("Shake of the Week", 6.5, "특별한 커스터드 플레이버");
        frozen_custards[2] = new FrozenCustard("Red Bean Shake", 6.5, "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
        frozen_custards[3] = new FrozenCustard("Floats", 5.9, "루트 비어, 퍼플 카우, 크림사클");
        frozen_custards[4] = new FrozenCustard("Cups & Cones", 4.9, "바닐라, 초콜렛, Flavor of the Week");
        frozen_custards[5] = new FrozenCustard("Concretes", 5.9, "쉐이크쉑의 쫀득한 커스터드와 다양한 믹스-인의 조합");
        if (select_menu == 2) {
            System.out.println("[ Frozen Custard Menu ]");
            for (int i=0; i<frozen_custards.length; i++){
                frozen_custards[i].printFrozenCustard(i);
            }
        }

        // 음료 선택
        Drink[] drinks = new Drink[num_drinks];
        drinks[0] = new Drink("Shack-made Lemonade", 3.9, "매장에서 직접 만드는 상큼한 레몬에이드(오리지날/시즈널)");
        drinks[1] = new Drink("Fresh Brewed Iced Tea", 3.4, "직접 유기농 홍차를 우려낸 아이스티");
        drinks[2] = new Drink("Fifty/Fifty", 3.5, "레몬에이드와 아이스티의 만남");
        drinks[3] = new Drink("Fountain Soda", 2.7, "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
        drinks[4] = new Drink("Abita Root Beer", 4.4, "청량감 있는 독특한 미국식 무알콜 탄산음료");
        drinks[5] = new Drink("Bottled Water", 1.0, "지리산 암반대수층으로 만든 프리미엄 생수");
        if (select_menu == 3) {
            System.out.println("[ Drinks Menu ]");
            for (int i=0; i<drinks.length; i++){
                drinks[i].printDrink(i);
            }
        }

        // 맥주 선택
        Beer[] beers = new Beer[num_beer];
        beers[0] = new Beer("ShackMeister Ale", 9.8, "쉐이크쉑 버거를 위해 뉴욕 브루클린 브루어리에서 특별히 양조한 에일 맥주");
        beers[1] = new Beer("Magpie Brewing Co.", 6.8, " ");
        if (select_menu == 4) {
            System.out.println("[ Beers Menu ]");
            for (int i=0; i<beers.length; i++){
                beers[i].printBeer(i);
            }
        }
    }


}
