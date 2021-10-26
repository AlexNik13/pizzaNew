package salad;

public class Salad {
    private String name;
    private double cost;
    private int portion;

    public Salad(String name, double cost, int portion) {
        this.name = name;
        this.cost = cost;
        this.portion = portion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }
}
