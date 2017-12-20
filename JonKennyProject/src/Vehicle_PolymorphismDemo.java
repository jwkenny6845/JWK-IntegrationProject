/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

public class Vehicle_PolymorphismDemo {

  // --POLYMORPHISM DEMO CLASS-- //
  /**
   * Class that demonstrates polymorphism.
   */
  public static void doPolyDemo() {

    // --program that demonstrates classes-- //
    Vehicle myHonda = new Vehicle();
    myHonda.setMake("Honda");
    myHonda.setColor("black");

    Vehicle myMini = new Vehicle();
    myMini.setMake("Mini");
    myMini.setColor("blue");

    ElectricCar myTesla = new ElectricCar();
    myTesla.setMake("Tesla");
    myTesla.setColor("black");
    myTesla.seteMPG(100);

    Vehicle[] myGarage = new Vehicle[3];
    myGarage[0] = myHonda;
    myGarage[1] = myMini;
    myGarage[2] = myTesla;

    for (Vehicle i : myGarage) {
      System.out.println(i.getMake());
    }

  }
}

/**
 * @author jonkenny
 *
 */
class ElectricCar extends Vehicle {
  private int eMPG;

  public int geteMPG() {
    return eMPG;
  }

  public void seteMPG(int eMPG) {
    this.eMPG = eMPG;
  }

  public String getMake() {
    return "The make of my electric car is " + make;
  }

}

class Vehicle {
  private int VIN;
  private String color;
  protected String make;
  private String model;

  public int getVIN() {
    return VIN;
  }

  public void setVIN(int vIN) {
    VIN = vIN;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

}