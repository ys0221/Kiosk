import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num_menu = 6; // 메뉴의 총 개수 (주문과 취소까지 포함)
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
    }




}
