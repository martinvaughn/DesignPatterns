abstract public class Animal implements IObserver {
  private int health;
  private int limbs;
  private String name;
  private String team;
  boolean isHungry;
  private static String whoHasHolyGrail = "No ONE";
  public FightBehavior fightBehavior;
  public FlyBehavior flyBehavior;

  public void update(){
    System.out.println("I "+name+" HAVE BEEN UPDATED");
  }
  public static void changeWhoHas(String name){
    whoHasHolyGrail = name;
  }
  public static String getWhoHas() {return whoHasHolyGrail;}

  public Animal(String name, int health, int limbs, String team) {
    this.name = name;
    this.health = health;
    this.limbs = limbs;
    this.team = team;
    isHungry = false;
  }
  abstract void eat();
  public String getName(){return name;}
  public void fly(){
    System.out.println("Animal is flying");
  }

  public void run(){
    System.out.println("Animal is running");
  }

  public void setFightBehavior(FightBehavior fb) {
    fightBehavior = fb;
  }

  public void setFlyBehavior(FlyBehavior flb){
    flyBehavior = flb; 
  }

  public void fight() {
    fightBehavior.fight();
    isHungry = true;
  }
  public void attemptFly() {
    flyBehavior.fly();
    isHungry = false;
  }

}