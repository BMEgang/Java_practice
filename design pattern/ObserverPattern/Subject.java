package ObserverPattern;



public interface Subject {
    public void register(Observe observer);
    public void remove(Observe observer);
    public void notifyObserve();
}
