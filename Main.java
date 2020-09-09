import java.util.*;

class Main {
  public static void main(String[] args) {
    Animal[] animalList = new Animal[4];
    Animal panda = new Panda("panda", 100, 7, "RED");
    animalList[0] = panda;
    animalList[1] = new Tiger("Tiger", 100, 7, "RED");
    animalList[2] = new Tiger("Better Tiger", 100, 7, "BLUE");
    animalList[3] = new Dolphin("Dolphy", 100, 7, "BLUE");
    Human human = new Human("mr. sir");
    for (Animal x : animalList){
      System.out.println("ANIMAL NAME: " + x.getName());
      x.fight(); // strategy pattern;
      x.eat();
      x.attemptFly(); //strategy pattern;
      System.out.println();
    }
    //observer pattern;
    UpdateObserver UO = new UpdateObserver(animalList);
    UO.getUpdates();
    //factory pattern;
    AnimalFactory af = new AnimalFactory();
    Animal newAnimal = af.createAnimal(3);
    newAnimal.fight();
    newAnimal.eat();
    //singleton pattern;
    HolyGrail.getHolyGrail(); //creating for first time;
    HolyGrail.setOwner(newAnimal);
    //verify singleton
    System.out.println();
    System.out.println("Animal HG owner: "+ Animal.getWhoHas());
    System.out.println();
    System.out.println("Verify: "+HolyGrail.getOwner().getName() + " IS THE OWNER of the HOLYGRAIL");
  }
}
