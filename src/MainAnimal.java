public class MainAnimal {
    public static void main(String[] args){
        Animal Dog=new Animal();
        System.out.println("Dog name: "+Dog.name);
        System.out.println("Dog age: "+Dog.age);
        //Change of data
        Dog.name="Pup";
        System.out.println("Dog's new name: "+Dog.name);
        Dog.age=5;
        System.out.println("Dog's new age: "+Dog.age);
        //Calling the class method
        Dog.Print();
    }
}
