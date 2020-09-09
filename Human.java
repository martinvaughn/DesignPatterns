public class Human implements IObserver {
  // aka HUman ISA Observer
  public String name;
  Human(String name){name=name;}
  
  public void update(){
    System.out.println("EVEN HUMAN HAS BEEN UPDATED");
  }
}