public class DuckCall {
  QuackBehavior quackBehavior;

  public DuckCall() {
    quackBehavior = new Quack();
  }

  public void callLikeADuck() {
    quackBehavior.quack();
  }
}