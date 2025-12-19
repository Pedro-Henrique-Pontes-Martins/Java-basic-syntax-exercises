import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) throws Exception {
        
        // 2. Write a code that receives a square's side, calculates its area and shows it on the screen."
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the square's side:");
        var side = scanner.nextFloat() ;

        float squareSide = side * side;

        System.out.printf("The square's area is %s", squareSide);
    }
}
