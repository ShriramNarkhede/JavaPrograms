class Animal {
 static int static_var=10;
      void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// class Dog extends Animal {
//     void makeSound() {
//           super.makeSound();
//         System.out.println("Dog barks");
//     }
// }



// interface Animal {
//     void makeSound();
// }

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Dog barks");
        System.out.println(static_var);
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Animal animal = new Dog(); // Reference and object of type Dog
//         animal.makeSound(); // Calls the makeSound() method of Dog (late binding)
//     }
// }
public class  examples {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Reference of type Animal, object of type Dog
        animal.makeSound(); // Calls the makeSound() method of Dog (early binding)
    }
}