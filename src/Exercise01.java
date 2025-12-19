import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) throws Exception {
        
        // 1. Write a code that receives someone's name and year of birth and prints the following message on the screen: "Hello, [Name], you are X years old."
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write down your name:");
        var name = scanner.next();

        System.out.println("Write down your year of birth:");
        var yearBirth =  scanner.nextInt();

        int currentYear = OffsetDateTime.now().getYear();
        int age = currentYear - yearBirth;

        System.out.printf("Hello, %s, you are %s years old.", name, age);
    }
}
