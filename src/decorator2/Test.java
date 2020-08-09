package decorator2;

public class Test {
    public static void main(String[] args) {
        Beverage beverage1 = new Espresso();
        Beverage milkedEspresso = new Milk(beverage1);
        System.out.println(milkedEspresso.cost());

    }
}
