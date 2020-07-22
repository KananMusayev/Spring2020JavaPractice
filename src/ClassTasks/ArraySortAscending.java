package ClassTasks;

public class ArraySortAscending {


    public static void main(String[] args) {
        /*
        Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
            int[] arr = {10, 9, 8, 7};

             arr = Sort(arr);         ==>{ 7, 8, 9, 10};
         */

        int[] arr = {10, 9, 8, 7,8,6,4,2,5,4,3};

        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        //for (int i=0;i<)



    }
}
