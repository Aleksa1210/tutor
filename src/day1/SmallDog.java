package day1;

public class SmallDog extends Dog {

        public SmallDog(){

            super();
        }
        public SmallDog(String name, String breed, int age){
            super(name, breed, age);
        }
        public void bark(){
            System.out.println("Bark Bark!");
        }

        public static void main(String args[]){
            Dog dog1 = new SmallDog();
          //  dog1.bark();
        }
        // Polymorphism
    /* Compile time and run time
    Compiling means the Java code is being translated to machine code (1001010101)
    Running/executing means the machine code is being run

    bark() during compile time, the computer checks if bark() is a method inside the object class, Dog.
    It is not so it throws an error.
    If bark() is a method inside the object class, Dog, then there will be no error.
    During run time, the computer will check if there are multiple bark() methods and perform overriding. So bark()
    from the reference object, SmallDog, will run instead of bark() from object class.
     */


}
