public class Panda extends Animal {
   
   public Panda(String name, int health, int limbs, String team) {
     super(name, health, limbs,team);
     fightBehavior = new WeakFighter();
     flyBehavior = new CantFly();
   }

   public void eat(){
     if (isHungry){
    System.out.println("Panda nom nom");
    }
   }
}