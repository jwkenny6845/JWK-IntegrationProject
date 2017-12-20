/**
 * JONATHAN KENNY COP 2006 - FALL 2017 PROF. VANSELOW
 */

public class PolymorphismDemo {

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
    myTesla.seteMpg(100);

    Vehicle[] myGarage = new Vehicle[3];
    myGarage[0] = myHonda;
    myGarage[1] = myMini;
    myGarage[2] = myTesla;

    for (Vehicle i : myGarage) {
      System.out.println(i.getMake());
    }

  }

  class Vehicle {
    private int vin;
    private String color;
    protected String make;
    private String model;

    public int getVin() {
      return vin;
    }

    public void setVin(int vin) {
      this.vin = vin;
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

  public class ElectricCar extends Vehicle {

    int eMpg;
    
    public int geteMpg() {
      return eMpg;
    }

    public String getMake() {
      return "The make of my electric car is " + make;
    }

  }

}