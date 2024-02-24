package jala.university.academic;

public class QuickSort extends Algorithm {

    public QuickSort(String[] list) {
        super(list);
    }

    private void quickSort(String[] array, int start, int end, int speed) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex - 1, speed);
            quickSort(array, partitionIndex + 1, end, speed);
            sleep(speed);
        }
    }

    private int partition(String[] array, int start, int end) {
        String pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (compareValues(array[j], pivot) <= 0) {
                i++;
                swapElements(array, i, j);
            }
        }
        swapElements(array, i + 1, end);
        return i + 1;
    }

    private int compareValues(String a, String b) {
        if (isNumericValue(a) && isNumericValue(b)) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        } else {
            return a.compareTo(b);
        }
    }

    private void swapElements(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean isNumericValue(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String[] sort(String[] values, int speed) {
        long startTime = System.currentTimeMillis();
        quickSort(values, 0, getSortingList().length - 1, speed);
        setTime(System.currentTimeMillis() - startTime);
        return getSortingList();
    }

}