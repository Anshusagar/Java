public class MainClass {
     public static void main(String[] args){
         Person p1=new Person();
         p1.age=20;
         p1.name="Anshu";
        p1.walk();
        p1.walk(99);
        
         Person p2=new Person(22,"anything");
         System.out.println(Person.count);
        Manager m1=new Manager();
        m1.age=40;
        m1.name="Anshu Sagar";
        m1.walk();


     }
}
class Person{
    int age;
    String name;
    static int count;
    public Person(){
       
        count++;
        System.out.println("Creating a new person Object");
    }
    public Person(int age,String name){
            this();
            this.name=name;
            this.age=age;
    }
    void walk(){
        System.out.println("Person is walking");
    }
    void walk(int num){
        System.out.println(name + " "+  "is walking" + " "+ num);
    }
}
class Manager extends Person{
        int salary;

        public void Salary(int salary){
              this.salary=salary;  
        }
        public void walk(){
            System.out.println("Manger is walking");
        }
}