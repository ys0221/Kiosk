public class Menu {
    String name;
    String explain;
    int num = 4; // 메뉴의 개수

    // Goods 클래스에서 상속받아 사용할 변수
    String title;
    String description;

    public void printMenu(int num) {
        System.out.println(num+1 +"."+name + "          | " + explain);
    }
    public Menu(String name,String explain){
        this.name = name;
        this.explain = explain;;
    }
    public goodsMenu(String title, int price, String description) {
        this.title = title;
        this.description = description;
    }

}
