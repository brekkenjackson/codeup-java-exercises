package java_two;

public class Person {

    //fields
    private String name;


//constructors
    public Person(String name) {
        this.name = name;
    }

//accessor
    public String getName(){
//TODO: return the person's name
        return name;
    }





    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.printf("Hello from %s !", name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}