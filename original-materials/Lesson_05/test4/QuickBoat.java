package test4;

public class QuickBoat extends Boat {
  private int model;

  public QuickBoat() {
    model = 0;
    System.out.println("quick boat created");
  }

  public void setModel(int code) {
    model = code;
    System.out.println("Model no: " + model);
  }
  
}

