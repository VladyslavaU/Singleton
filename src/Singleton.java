public class Singleton {
    private static Singleton singleton;
    private String name;

    private Singleton() {

    }

    public void setName(String name) {
        if (this.name == null) {
            this.name = name;
        }
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;

    }


    @Override
    public String toString() {
        return this.name;
    }


}
