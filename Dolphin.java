public class Dolphin extends Animal {
  public Dolphin(String name, int health, int limbs, String team) {
     super(name, health, limbs,team);
     fightBehavior = new StrongFighter();
     flyBehavior = new CanFly();
   }
   
  public void eat(){
    if (isHungry){
    System.out.println("Dolphin nom nom");
    }
   }
}