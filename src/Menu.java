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

    // Q. 이것이 왜 필요한가?
    public Menu() {
    }

    public void printMenu(int num) {
        System.out.println(num+1 +"."+name + "          | " + explain);
    }
    public Menu(String name,String explain){
        this.name = name;
        this.explain = explain;;
    }
}
