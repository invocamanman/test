package edu.upc.dsa;

/**
 * Hello world!
 */
public class App {

    private static void f() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        int x = 1;
        b();
        f();
        x=x+1;
        System.out.println("Bye bye "+x);
    }

	public static void b() {
            System.out.println("B");
        }

}
