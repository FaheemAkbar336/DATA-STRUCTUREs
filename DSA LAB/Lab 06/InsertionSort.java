import java.util.Arrays;

class InsertionSort{
    void insertionSort(int array[]){

    int size =array.length;

    for(int i=1;i<array.length;i++){
        int temp=array[i];
        int j=i-1;

        while (j>=0 && temp<array[j]) {
            array[j+1]=array[j];
            j--;
            
        }
        array[j+1]=temp;
    }
}
    public static void main(String args[]){
        
        int [] data={9,5,4,1,3};

        InsertionSort sort=new InsertionSort();
        sort.insertionSort(data);

        System.out.println("Sorting array in assecending array :");
          System.out.println(Arrays.toString(data));
  }
    }