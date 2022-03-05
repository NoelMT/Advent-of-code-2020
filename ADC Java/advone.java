import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
//partone
public class advone {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("input1.txt"));
        System.out.println("1 or 2?");
        Scanner ch = new Scanner(System.in);
        switch (ch.nextInt()) {
            case 1:
                partone(in);
                break;
            case 2:
            parttwo(in);
            break;
        }

}

public static void partone(Scanner in) {
    int[] a = new int[2000];
    int i = 0;
    while (in.hasNextInt())
        a[i++] = in.nextInt();
    int svar = 0;
    for (i = 1; i < 2000; i++) {
        if (a[i] > a[i - 1])
            svar++;
    }
    System.out.println(svar);
    }
    public static void parttwo(Scanner in){
        int[] a = new int[2000];
        int i = 0;
        int[] b = new int[1998];
        while (in.hasNextInt())
            a[i++] = in.nextInt();
        int svar = 0;

        for (int temp = 0; temp < b.length; temp++)
            b[temp] = a[temp] + a[temp+1] + a[temp+2];

        for (i = 1; i < b.length; i++) {
            if (b[i] > b[i - 1])
                svar++;
        }
        System.out.println(svar);
    }
}
