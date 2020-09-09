public class AnimalFactory {
  BusinessLogic BLU;
  public Animal createAnimal(int seed){
    BLU = new BusinessLogic();
    int choice = BLU.rollDice(seed);
    Animal animal = choose(choice);
    return animal;
  }
  public Animal choose(int num){
    Animal animal;
    if (num==1){
      animal = new Dolphin("burt", 80, 12, "BLUE");
    }
    else if (num==2){
      animal = new Tiger("ernie", 80, 12, "Red");
    }
    else {
      animal = new Panda("twirp", 80, 12, "BLUE");
    }
    return animal;
  }
}