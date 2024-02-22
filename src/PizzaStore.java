import java.util.Scanner;

public class PizzaStore {

    public static Pizza getPizza(int choice){
        Scanner sc = new Scanner(System.in);
        Pizza p = null;

        switch (choice){
            case 1:
                {
                    System.out.println("请输入披萨的大小：");
                    int size = sc.nextInt();
                    System.out.println("请输入披萨的价格：");
                    int price = sc.nextInt();
                    System.out.println("请输入披萨的重量：");
                    int weight = sc.nextInt();
                    BaconPizza bp = new BaconPizza("培根披萨",size,price,weight);
                    p = bp;
                }
                break;
            case 2:
                {
                    System.out.println("请输入披萨的大小：");
                    int size = sc.nextInt();
                    System.out.println("请输入披萨的价格：");
                    int price = sc.nextInt();
                    System.out.println("请输入披萨的水果：");
                    String fruits = sc.next();
                    FruitPizza fp = new FruitPizza("水果披萨",size,price,fruits);
                    p = fp;
                }
                break;
        }

        return p;
    }

}
