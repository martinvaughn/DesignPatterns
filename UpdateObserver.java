public class UpdateObserver implements IObservable {
  IObserver[] observers; // should be animals
  
  UpdateObserver(IObserver[] ol){
    observers = ol;
  }

  public void notifyMe() {
        for (IObserver x : observers){
          x.update();
      }
    }
  public void getUpdates() {
    for (int i = 0; i < 1000; i++){
      if (i == 100) {
        notifyMe();
      }
  }
}
}