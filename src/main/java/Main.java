import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = 0, E = 0, I = 0, O = 0, U = 0;

        System.out.print("Type a single word > ");
        String word = input.next();

        for (int i = 0; i < word.length(); i++) {
            String s = word.substring(i, i + 1);

            if (s.equalsIgnoreCase("A")) { A++; }
            else if (s.equalsIgnoreCase("E")) { E++; }
            else if (s.equalsIgnoreCase("I")) { I++; }
            else if (s.equalsIgnoreCase("O")) { O++; }
            else if (s.equalsIgnoreCase("U")) { U++; }
        }

        int total = A + E + I + O + U;
        System.out.println("\n'" + word + "' has...\n" + A + " A's\n" + E + " E's\n" + I + " I's\n" + O + " O's\n" + U + " U's\nTotal vowels: " + total + "\n");

        input.close();
        // Only close (System.in) scanner at the complete end of the program.
    }
}