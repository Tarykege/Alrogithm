package Sorts;

public class BubbleSort {
    public static void doBubbleSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            boolean isSorted= false;
            for (int j = 0; j < a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    isSorted=true;
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
            //when loop j not swap,the array has sorted completely  
            if(!isSorted) break;
        }
    }
    public static void main(String[] args) {
        int[] a= {1,2,3,4,8,7,6};
        doBubbleSort(a);
    }
}