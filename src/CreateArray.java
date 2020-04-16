
import java.util.Arrays;
import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args)
    {
        int numbers[] = new int[5];

        numbers[0]= 1;
        numbers[1]= 21;
        numbers[2]= 63;
        numbers[3]= 4;
        numbers[4]= 51;

        String day[] = new String[7];
        day[0] = ("Sunday");
        day[1] = ("Monday");
        day[2] = ("Tuesday");
        day[3] = ("Wednesday");
        day[4] = ("Thursday");
        day[5] = ("Friday");
        day[6] = ("Saturday");
        char character[] =new char[5];
        character[0]= 'a';
        character[1]= 'e';
        character[2]= 'i';
        character[3]= 'o';
        character[4]= 'u';

        boolean abc[] =new boolean[2];
        abc[0]= true;
        abc[1]= false;
        System.out.println( "Numbers: " +Arrays.toString(numbers));
        System.out.println("Strings: " +Arrays.toString(day));
        System.out.println("Charcters: " +Arrays.toString(character));
        System.out.println("Booleans: " +Arrays.toString(abc));

    }
}
