package decorator2;

public abstract class Beverage {
    private String description ;
    abstract double cost();

    public String getDescription() {
        return description;
    }
}
