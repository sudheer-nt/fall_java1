package exceptions.akshath;

public class Arrayexception {
    public static void  main (String[]args){
        int arr[]=new int [4];
        //here I am trying to access the 4th element which is out of boundary of the array
        int i= arr[5];
   //if this array satisfies the boundary index  then print the below line or show exception
   System.out.println("Work Done");


    }
}
