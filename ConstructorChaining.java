package Javabean;

public class ConstructorChaining {
	private String name;
    private int age;

    public ConstructorChaining(String name) {
        this.name=name; // a constructor with a name parameter
    }

    public ConstructorChaining(String name, int age) {
        this(name); //a constructor with both name and age parameters.(instance variable)
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        ConstructorChaining ConstructorChaining2 = new ConstructorChaining("poulami"); // Calls the constructor with name parameter
        ConstructorChaining2.displayInfo();
        System.out.println();

        ConstructorChaining ConstructorChaining3 = new ConstructorChaining("adrija", 25); // Calls the constructor with name and age parameters
        ConstructorChaining3.displayInfo();
    }
}
