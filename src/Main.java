public class Main {
    public static void main(String[] args) {
        System.out.println("Creating an instance of Singleton");
        Singleton singleton = Singleton.getSingleton();
        singleton.setName("Singleton");
        System.out.println("Singleton name: " + singleton);
        System.out.println("Trying to create another instance of singleton");
        Singleton newSingleton = Singleton.getSingleton();
        newSingleton.setName("No name");
        System.out.println("Name of the new singleton: " + newSingleton);


    }

}
