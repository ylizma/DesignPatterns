package factory;

public class Test {
    public static void main(String[] args) {
        Computer server = new ComputerFactory().getComputer("server", "12gb", "200gb", "12cpu");
        Computer pc = new ComputerFactory().getComputer("pc", "8gb", "200gb", "8cpu");
        System.out.println(pc);
    }
}
