package org.test.lesson12.p5;

public class Singleton {

//    example with public static final instance

     /*public static final Singleton INSTANCE = new Singleton();
    private Singleton() {}*/


    //example with public static fabric method

   /* private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance(){
        return INSTANCE;
    }*/


    //lazy initialization

    private static Singleton INSTANCE = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
