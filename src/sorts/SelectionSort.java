package sorts;
class SelectionSort{
    public static void doSelectionSort(int[] a){
        for ( int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={5,3,2,4,1,7,8,9};
        doSelectionSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}