class Singleton{
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton instance = null;
    // Declaring a variable of type String
    public String s;
    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton(){
        s = "Hello I am a Singleton";
    }
    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        // Instantiating Singleton class with variable x
        Singleton s1 = Singleton.getInstance();
        // Instantiating Singleton class with variable y
        Singleton s2 = Singleton.getInstance();
        // Instantiating Singleton class with variable z
        Singleton s3 = Singleton.getInstance();
        // Printing the hash code for above variable as

        System.out.println("Hashcode of Singleton is: " + s1.hashCode());
        System.out.println("Hashcode of Singleton is: " + s2.hashCode());
        System.out.println("Hashcode of Singleton is: " + s3.hashCode());
        if(s1 == s2 && s2 == s3){
            System.out.println("Three objects point to the same memory location on the heap i.e, to the same object");
        } else {
            System.out.println("s1 is not the same object");
        }
    }
}
