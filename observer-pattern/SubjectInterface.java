public interface SubjectInterface {
  public void addObserver(ObserverInterface o);

  public void deleteObserver(ObserverInterface o);

  public void notifyObservers();
}
