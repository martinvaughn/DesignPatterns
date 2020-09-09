public class Tiger extends Animal{
  
  public Tiger(String name, int health, int limbs, String team) {
     super(name, health, limbs,team);
     setFlyBehavior(new CantFly());
     setFightBehavior(new AvgFighter());
   }
  public void eat(){
     if (isHungry){
    System.out.println("Tiger nom nom NOM!");
    }
   }
}