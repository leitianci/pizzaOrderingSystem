import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("请选择你想要购买的披萨：（1.培根披萨，2.水果披萨）：");
        choice = sc.nextInt();
        Pizza pizza = PizzaStore.getPizza(choice);
        System.out.println(pizza.showPizza());
    }
}
