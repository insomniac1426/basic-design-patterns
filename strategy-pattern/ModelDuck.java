public class ModelDuck extends Duck {
  public ModelDuck() {
    quackBehavior = new MuteQuack();
    flyBehavior = new FlyNoWay();
  }

  @Override
  public void display() {
    System.out.println("Hey I am a model duck !! there's nothing I can do about that .. now can I ?");
  }
}
