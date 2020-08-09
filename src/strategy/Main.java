package strategy;

public class Main {
    public static void main(String[] args) {
        Bird bird=new Bird(new RunA(),new EatB(),new FlyA());
        bird.eat.eat();
        bird.fly.fly();
        bird.run.run();
    }
}
