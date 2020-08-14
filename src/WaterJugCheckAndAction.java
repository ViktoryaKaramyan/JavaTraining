import java.util.Scanner;

public class WaterJugCheckAndAction {


    public void isActions() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input jug 1 volume: ");
        int jug1 = scanner.nextInt();

        System.out.println("Input jug 2 volume: ");
        int jug2 = scanner.nextInt();


        int result = jug1 + jug2;

        int[] jug1Filled = new int[result];
        int[] jug2Filled = new int[result];

        int i = 0;


        jug1Filled[i] = jug1;
        jug2Filled[i] = 0;
        i++;

        jug1Filled[i] = 0;
        jug2Filled[i] = jug1;
        i++;

        if (jug1 > jug2) {
            System.out.println("Jug 1 is large container, Jug 2 is small container");
        } else {
            int temp;//temporary value, when jug2 > jug1
            temp = jug2;
            jug2 = jug1;
            jug1 = temp;
        }

        String input = "";

        if (jug1 <= 0 || jug2 <= 0) {
            System.out.println("Input must be greater than zero");


            try {
                jug1 = Integer.parseInt(input);
                jug2 = Integer.parseInt(input);
                System.out.println("Invalid input");

            } catch (NumberFormatException e) {
                System.out.println("Input is not an int value");
            }
        }

        while (i < result) {
            if (jug1Filled[i - 1] > 0) {
                // if jug1Filled has any amount of water i.e. it is not empty
                jug1Filled[i] = jug1Filled[i - 1];
                jug2Filled[i] = 0;
            } else {
                // jug1 is fully empty
                jug1Filled[i] = jug1;
                jug2Filled[i] = jug2Filled[i - 1];
            }
            i++;


            if (jug2Filled[i - 1] > 0) {
                // if jug2 has any amount of water i.e. it is not empty
                if (jug1Filled[i - 1] + jug2Filled[i - 1] < jug2) {
                    // final result obtained
                    jug2Filled[i] = jug1Filled[i - 1] + jug2Filled[i - 1];
                    jug1Filled[i] = 0;
                } else {
                    int temp = jug2Filled[i - 1];
                    temp = jug2 - temp;
                    jug2Filled[i] = temp + jug2Filled[i - 1];

                    jug1Filled[i] = jug1Filled[i - 1] - temp;
                }
            } else {
                // jug2 is fully empty
                jug2Filled[i] = jug1Filled[i - 1];
                jug1Filled[i] = 0;
            }
            i++;
        }

        // display final result
        for (i = 0; i < result; i++) {
            System.out.print("\nJug 1: " + jug1Filled[i] + "\tJug2: " + jug2Filled[i]);
        }

        System.out.println();
    }


  }

