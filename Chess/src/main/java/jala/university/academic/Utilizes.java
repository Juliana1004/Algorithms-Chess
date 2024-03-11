package jala.university.academic;

public class Utilizes {
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException error) {
            System.out.println("error");
        }
    }

    public static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    public static long calculateElapsedTime(long startTime) {
        return System.currentTimeMillis() - startTime;
    }
}
