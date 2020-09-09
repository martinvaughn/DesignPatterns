public class BusinessLogic {
  public int rollDice(int seed){
    if (seed % 2 == 0){
      return 1;
    }
    else if (seed % 3 == 0){
      return 2;
    }
    else {return 3;}
  }
}