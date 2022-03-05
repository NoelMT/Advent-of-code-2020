import java.io.*;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class advthree {
    public static void main(String Args[]) throws FileNotFoundException {

        Scanner in = new Scanner(new File("input3.txt"));

        //partone(in);
            parttwo(in);
    }

    public static int partone(Scanner in) {
        StringBuilder sb = new StringBuilder();
        int one = 0;
        int zero = 0;
        String[] arr = new String[1000];

        for (int i = 0; i < 1000; i++) {
            arr[i] = in.nextLine();
        }
        for (int j = 0; j < 12; j++) {
            one = 0;
            zero = 0;
            for (int i = 0; i < 1000; i++) {
                if (arr[i].charAt(j) == '1')
                    one++;
                else
                    zero++;
            }
            System.out.println("ONE:" + one + "     Zero: " + zero);

        }
        return 0;
    }

    public static void parttwo(Scanner in) {
        int one = 0;
        int zero = 0;
        int pos = 0;

        int leng = 0;

        String[] arr = new String[leng];
        String[] sec;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(1) == '1')
                one++;
            else
                zero++;
        }
        if (one > zero){
            sec = new String[one];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].charAt(1) == '1');
                    sec


            }
        }

    }
}