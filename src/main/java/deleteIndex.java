import java.util.Arrays;
import java.util.Scanner;

public class deleteIndex {
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,5,6,7,8,9,10};

        int n = 2,index=0;

        for (int i=0; i<myArray.length;i++)  {
            if (myArray[i]==n) {
                index=i;
            }
        }
        System.out.println(index);

        for (int i=index;i<myArray.length-1;i++) {
            myArray[i]=myArray[i+1];
        }
        myArray[myArray.length-1]=0;
        System.out.println(Arrays.toString(myArray));
    }
}
