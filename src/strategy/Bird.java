package strategy;

public class Bird {
    IRunBehavior run;
    IEatBehavior eat;
    IFlyBehavior fly;

    public Bird(IRunBehavior run, IEatBehavior eat, IFlyBehavior fly) {
        this.run = run;
        this.eat = eat;
        this.fly = fly;
    }
}
