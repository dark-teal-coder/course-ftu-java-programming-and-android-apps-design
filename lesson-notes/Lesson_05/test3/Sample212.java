package test3;

public class Sample212 {

  public static void main(String[] args) {
    
    Boat boat1;
    System.out.println("Declare boat1");

    boat1 = new Boat();
    boat1.setSeatColor(24, "Navy");

    Boat boat2;
    System.out.println("Declare boat2");

    boat2 = boat1;
    System.out.println("Assign boat1 to boat1");

    System.out.print("boat1's ");
    boat1.show();

    System.out.print("boat2's ");
    boat2.show();
    
  }

}
