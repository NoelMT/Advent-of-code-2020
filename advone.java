import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class advone {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("C:\\Users\\noete\\Desktop\\Advent-of-code-2020\\input1.txt"));
        int[] a = new int[2000];
        int i = 0;
        while (in.hasNextInt())
            a[i++] = in.nextInt();
        int svar = 0;
        for(i = 1; i < 2000; i++){
            if(a[i] > a[i-1])
                svar++;
        }
        System.out.println(svar);
    }
}
