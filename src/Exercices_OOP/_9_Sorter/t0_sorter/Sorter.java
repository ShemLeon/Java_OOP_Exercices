package Exercices_OOP._9_Sorter.t0_sorter;

public class Sorter {
    // Сортировка массива int (selection sort)
    public static void sort(int[] arr){
        int minIndex;
        for(int placeIndex = 0; placeIndex < arr.length-1; placeIndex++){
            minIndex = findMinIndex(arr, placeIndex);
            swap(arr, minIndex, placeIndex);
        }
    }

    // Сортировка массива double (selection sort)
    public static void sort(double[] arr) {
        int minIndex;
        for (int placeIndex = 0; placeIndex < arr.length - 1; placeIndex++) {
            minIndex = findMinIndex(arr, placeIndex);
            swap(arr, minIndex, placeIndex);
        }
    }

    // вспомогательный метод замены
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // вспомогательный метод замены
    private static void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // вспомогательный метод поиска индекса минимального числа
    private static int findMinIndex(int[] arr, int placeIndex){
        int minimum = arr[placeIndex];
        int minIndex = placeIndex;
        for (int i = placeIndex+1; i < arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    // вспомогательный метод поиска индекса минимального числа
    private static int findMinIndex(double[] arr, int placeIndex){
        double minimum = arr[placeIndex];
        int minIndex = placeIndex;
        for (int i = placeIndex+1; i < arr.length; i++){
            if (arr[i] < minimum){
                minimum = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printArr(int[]arr){
        for (int element : arr){
            System.out.print(element);
        }
    }


}



