import com.sun.javafx.image.impl.IntArgb;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class advseven {

    //partone

        public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("input7.txt"));
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

        public static void partone(Scanner in){
        String[] pos = in.nextLine().split(",");
        int tot = 0;
        int fuel = 0;
            for(String a : pos){
                tot += Integer.parseInt(a);
            }
           int median = tot/ pos.length;
            for(String a : pos){
                fuel += Math.abs(Integer.parseInt(a) - median);
            }
            System.out.println(fuel);

        }
        public static void parttwo(Scanner in){

       }
}


/*

    int one = 0;
    int zero = 0;
    Scanner size = in;
    int leng = 0;
    String[] toFile;
        while(size.hasNextLine())
                leng++;
                String[] arr = new String[leng];

                for (int i = 0; i < arr.length; i++) {
        arr[i] = in.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
        if (arr[i].charAt(1) == '1')
        one++;
        else
        zero++;
        }
        if (one > zero) {
        toFile = new String[one];
        for (int i = 0; i < arr.length; i++) {
        if (arr[i].charAt(1) == '1')
        toFile[i] = arr[i];

        }
        }
        else{
        toFile = new String[zero];
        for (int i = 0; i < arr.length; i++) {
        if (arr[i].charAt(0) == '0')
        toFile[i] = arr[0];
        }
        }
        System.out.println(sb.toString());
        writeFile1(toFile);


 */