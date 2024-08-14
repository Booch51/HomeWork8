import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Задача 1");

        int[] numbers = new int[]{1, 2, 3};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        double[] weight = {1.57, 7.654, 9.986};
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        int[] meaning = new int[5];
        meaning[0] = 27;
        meaning[3] = 25;
        System.out.println(meaning[0]);
        System.out.println(meaning[1]);
        System.out.println(meaning[2]);
        System.out.println(meaning[3]);
        System.out.println(meaning[4]);

        System.out.println("Задача 2");

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(meaning));

        System.out.println("Задача 3");

        for (int i = numbers.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.print(numbers[i]);
            }
        }
        System.out.println();

        for (int i = weight.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(weight[i] + ", ");
            } else {
                System.out.print(weight[i]);
            }
        }
        System.out.println();

        for (int i =meaning.length-1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(meaning[i] + ", ");
            } else {
                System.out.print(meaning[i]);
            }
        }
        System.out.println();

        System.out.println("Задача 4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i] = numbers[i] +1;
            }
            System.out.println(numbers[i]);
        }




    }
}