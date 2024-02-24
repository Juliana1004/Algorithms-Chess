package jala.university.academic;

public abstract class Algorithm {
    private final String[] sortingList;
    private long time;

    protected Algorithm(String[] sortingList) {
        this.sortingList = sortingList;
    }

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (Exception error) {
            System.out.println("error");
        }
    }

    public String[] getSortingList() {
        return sortingList;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
