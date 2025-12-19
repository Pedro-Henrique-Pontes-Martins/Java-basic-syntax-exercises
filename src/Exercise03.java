import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) throws Exception {
        
        // 3. Write a code that receives the base and the height of a rectangle, calculates its area and shows it on the screen."
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the rectangle's base:");
        var base = scanner.nextFloat() ;

        System.out.println("Write the rectangle's height:");
        var height = scanner.nextFloat() ;

        float rectangleSide = base * height;

        System.out.printf("The rectangle's area is %s", rectangleSide);
    }
}
