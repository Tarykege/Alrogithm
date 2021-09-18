package Sorts;

public class InsertionSort {
    public static void doInsertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {
            int ai=a[i];
            int j=i-1;
            while(j>=0 && a[j]>ai){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=ai;
        }
    }
    public static void main(String[] args) {
        int[] a={7,5,8,4};
        doInsertionSort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
