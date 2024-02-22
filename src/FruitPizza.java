public class FruitPizza extends Pizza{

    private String fruits;

    public String getFruits() {
        return fruits;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public FruitPizza() {
    }

    public FruitPizza(String name, int size, int price, String fruits) {
        super(name, size, price);
        this.fruits = fruits;
    }

    @Override
    public String showPizza() {
        return super.showPizza() + "\n披萨中的水果：" + fruits;
    }
}
