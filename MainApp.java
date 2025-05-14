// Jaden Wilson-Shipp

public class MainApp {

    // Step 1: First interface with one abstract method
    interface BaseInterface {
        void methodOne();
    }

    // Step 2: Second interface extends the first and adds another abstract method
    interface ExtendedInterface extends BaseInterface {
        void methodTwo();
    }

    // Step 3: Abstract class implements the second interface
    abstract static class MyAbstractClass implements ExtendedInterface {
        // Implements methodOne from BaseInterface
        @Override
        public void methodOne() {
            System.out.println("Executing method methodOne");
        }

        // Implements methodTwo from ExtendedInterface
        @Override
        public void methodTwo() {
            System.out.println("Executing method methodTwo");
        }

        // Abstract method that must be defined in a subclass
        public abstract void methodThree();
    }

    // Step 4: Concrete class that extends the abstract class
    static class ConcreteClass extends MyAbstractClass {
        @Override
        public void methodThree() {
            System.out.println("Executing method methodThree");
        }

        // Additional method not required but adds complexity
        public void methodFour() {
            System.out.println("Executing extra method methodFour");
        }
    }

    // Step 5: Main method to test everything
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();
        obj.methodOne();    // From BaseInterface
        obj.methodTwo();    // From ExtendedInterface
        obj.methodThree();  // From MyAbstractClass
        obj.methodFour();   // Extra method defined in ConcreteClass
    }
}