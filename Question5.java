import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();

        int[] array = new int[amount];
        for (int i = 0; i < amount; i++) {
            array[i] = in.nextInt();
        }
        int maxCount = 0;
        int mode = 0;

        for (int i = 0; i < amount; i++) {
            int count = 0;
            for (int j = 0; j < amount; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = array[i];
            }
        }
        System.out.println(mode);
  }
}
