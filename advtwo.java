import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class advtwo {


        public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("C:\\Users\\noete\\Desktop\\Advent-of-code-2020\\input2.txt"));
            int verti = 0;
            int horiz = 0;
            String[] b = new String[2];
            String nextLine;
            int i = 0;
            while (i++ < 1000) {
                nextLine = in.nextLine();
                b = nextLine.split(" ");
                if(b[0].equals("forward")){
                    verti += Integer.parseInt(b[1]);
                }
                else if(b[0].equals("up")){
                    horiz -= Integer.parseInt(b[1]);
                }
                else if(b[0].equals("down")){
                    horiz += Integer.parseInt(b[1]);
                }
            }
            System.out.println(horiz + " " + verti);
            System.out.println(horiz * verti);
        }
}
