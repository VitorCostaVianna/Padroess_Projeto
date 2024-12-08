/**
 * The Singleton class ensures that only one instance of the class is created.
 * It provides a global point of access to the instance.
 * 
 * <p>This implementation is not thread-safe. If multiple threads access the 
 * getInstance method simultaneously, multiple instances may be created.</p>
 * 
 * <p>Usage:</p>
 * <pre>
 * {@code
 * Singleton singleton = Singleton.getInstance();
 * singleton.doSomething();
 * }
 * </pre>
 */
package design.pattern.Singleton;

public class Singleton {
    
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void doSomething(){
        System.out.println("Doing something...");
    }
}
