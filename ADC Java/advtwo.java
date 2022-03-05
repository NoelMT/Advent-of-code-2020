import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class advtwo {


        public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("input2.txt"));

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
        System.out.println(horiz);
                System.out.println(horiz * verti);

    }

    public static void parttwo(Scanner in){
        int verti = 0;
        int aim = 0;
        int depth = 0;
        String[] b = new String[2];
        String nextLine;
        int test = 0;
        int i = 0;
        while (i++ < 1000) {
            nextLine = in.nextLine();
            b = nextLine.split(" ");
            if(b[0].equals("forward")){
                verti += Integer.parseInt(b[1]);
                depth = (aim * Integer.parseInt(b[1])) + depth ;
            }
            else if(b[0].equals("up")){
                aim -= Integer.parseInt(b[1]);
            }
            else if(b[0].equals("down")){
                aim += Integer.parseInt(b[1]);
            }
        }
        System.out.println(verti * depth);
    }
}
