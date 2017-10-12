
public class Person {
        
    // USE OF VARIABLES:
    //   [4 FIELDS in the Person class]
    public String name;
    public int age;
    public int height;
    public int weight;
    
    
    // GETS:
    //   [4 GET METHODS in the Person class]
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
      }
    
    
    // SETS:
    //   [4 SET METHODS in the Person class]
    public void setName(String newName) {
        name = newName;
    }
        
    public void setAge(int newAge) {
        age = newAge;
    }
        
    public void setHeight(int newHeight) {
        height = newHeight;
    }
        
    public void setWeight(int newWeight) {
        weight = newWeight;
    }
    
    
    
    // METHOD CALL AND HEADER:
    //   [1 CONSTRUCTOR in the Person class]
    public Person(String startName, int startAge, int startHeight, 
            int startWeight) {
        
        name = startName;
        age = startAge;
        height = startHeight;
        weight = startWeight;
        
        // ARGUMENT AND PARAMETER:
        Person person1 = new Person(startName, startAge, startHeight, 
                startWeight);
        
        person1.setAge(30);
        System.out.println(person1.getAge());

        person1.setHeight(70);
        System.out.println(person1.getHeight());

        person1.setWeight(70);
        System.out.println(person1.getWeight());
        
    }
}
    
    
    