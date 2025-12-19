import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) throws Exception {
        
        // 4. Write a code that receives the name and the age of 2 people prints the difference between their ages."
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the first person's name:");
        var name1 = scanner.next() ;

        System.out.println("Write the first person's age:");
        var age1 = scanner.nextInt() ;

        System.out.println("Write the second person's name:");
        var name2 = scanner.next() ;

        System.out.println("Write the second person's age:");
        var age2 = scanner.nextInt() ;

        int difference = age1 - age2;

        if(difference < 0){
            difference *= -1;
        }

        System.out.printf("The difference between the %s's age and the %s's age is %s.", name1, name2, difference);
    }
}
