public class BaconPizza extends Pizza{

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BaconPizza() {
        super();
    }

    public BaconPizza(String name, int size, int price ,int weight) {
        super(name, size, price);
        this.weight = weight;
    }

    @Override
    public String showPizza() {
        return super.showPizza() + "\n披萨" + weight + "克";
    }
}
