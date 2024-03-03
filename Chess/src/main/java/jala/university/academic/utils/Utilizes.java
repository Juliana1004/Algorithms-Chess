package jala.university.academic.utils;

/**
 * Clase que implementa los métodos de dormir y cálculo del tiempo.
 */
public class Utilizes {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException error) {
            System.out.println("error");
        }
    }
    public static long calculateElapsedTime(int startTime, long speed) {
        return startTime * speed;
    }
}
