public class Menu {
    String name;
    String explain;
    int num; // 메뉴의 개수

    // Goods 클래스에서 상속받아 사용할 변수
    String burgerTitle;
    String burgerDescription;
    String frozencustardTitle;
    String frozencustardDescription;
    String drinkTitle;
    String drinkDescription;
    String beerTitle;
    String beerDescription;

    // Q. 상속에서 필요 -> 이것이 왜 필요한가?
    public Menu() {
    }
    /*
    public void menuField() {
        System.out.println("\"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println(" ");
        System.out.println("[ SHAKESHACK MENU ]");
        for(int i=0; i<4; i++){
            printMenu(i);
        }
        System.out.println(" ");
        System.out.println("[ ORDER MENU ]");

        for(int i=4; i<6; i++){
            printMenu(i);
        }
    }
     */
    public void printMenu(int num) {
        System.out.println(num+1 +"."+name + "          | " + explain);
    }
    public Menu(String name,String explain){
        this.name = name;
        this.explain = explain;
    }
}
