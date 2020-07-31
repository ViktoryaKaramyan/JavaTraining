import java.util.Scanner;

public class Lesson1 {

    // How to get exactly 4L of liquid using 3L and 5L containers

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter container_1 volume: ");
        int container1 = scanner.nextInt();

        System.out.println("Enter container_2 volume: ");
        int container2 = scanner.nextInt();


        int container1filled = 0;
        int container2filled = 0;
        int result = 0;

        //Step 1: fill liquid to container 5L
        container1filled = container1;
        System.out.println("5L container is: " + container1filled + "L");

        //Step 2: liquid is pour from 5L to 3L container. In the 5L container remains 2L liquid
        container1filled = container1filled - container2;
        container2filled = container2;
        System.out.println("3L container is: " + container2filled + "L");


        //Step 3: empty 3L container
        container2filled = 0;
        System.out.println("3L container is: " + container2filled + "L");


        //Step 4: 2L a liquid which remains after step 2 pours in the 3L container. 5L container is empty.
        container2filled = container1filled;
        System.out.println("3L container liquid is : " + container2filled + "L");


        //Step 5: fill liquid to container 5L
        container1filled = container1;
        System.out.println("5L container is: " + container1filled + "L");

        //Step 6: 1L liquid is pour to 3L container. In the 5L container remains 4L liquid
        result = (container1filled - (container2 - container2filled)) ;
        System.out.println("Result: " + result + "L");

    }

}
