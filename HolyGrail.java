public class HolyGrail {
  private static Animal owner;
  private static HolyGrail HG;
  private HolyGrail(){}

  public static HolyGrail getHolyGrail() {
    if (HG == null){
      HG = new HolyGrail();
    }
    return HG;
  }
  public static void setOwner(Animal an) { 
    owner = an;
    Animal.changeWhoHas(an.getName());  
  }
  public static Animal getOwner() {return owner;}
}