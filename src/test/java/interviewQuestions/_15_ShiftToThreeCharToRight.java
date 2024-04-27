package interviewQuestions;
/*
 * You have been asked to build a simple encryption program. This program should be able to send coded messages without someone been able to read them. 
 * The process is very simple. It is divided into two parts.
First, each uppercase or lowercase letter must be shifted three positions to the right, according to the ASCII table: letter 'a' should become letter 'd', letter 'y' must become the character '|' and so on. 
Second, each line must be reversed. After being reversed, all characters from the half on (truncated) must be moved one position to the left in ASCII. In this case, 'b' becomes 'a' and 'a' becomes '`'.

For example, if the resulting word of the first part is "tesla", the letters "sla" should be moved one position to the left. However, if the resulting word of the first part is "t#$A", the letters "$A" are to be displaced.

Input
The input contains a number of cases of test. The first line of each case of test contains an integer N (1 ≤ N ≤ 1 * 10�?�), indicating the number of lines the problem should encrypt. 
The following N lines contain M characters each M (1 ≤ M ≤ 1 * 10³).
Output
For each input, you must present the encrypted message.

Input Sample	Output Sample
4
Texto #3
abcABC1
vxpdylY .ph
vv.xwfxo.fd

3# rvzgV
1FECedc
ks. \n{frzx
gi.r{hyz-xx
 */
import java.util.Scanner;
public class _15_ShiftToThreeCharToRight {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

    // Read the number of cases of test
    int cases = scanner.nextInt();
    scanner.nextLine(); // Read the newline character after the integer

    // Process each case of test
    for (int i = 0; i < cases; i++) {
        // Read the number of lines for the current case
        int lines = scanner.nextInt();
        scanner.nextLine(); // Read the newline character after the integer

        // Process each line
        for (int j = 0; j < lines; j++) {
            String line = scanner.nextLine();

            // Step 1: Shift each letter three positions to the right
            StringBuilder encryptedLine = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (Character.isLetter(c)) {
                    c = (char) (c + 3);
                }
                encryptedLine.append(c);
            }

            // Step 2: Reverse the line
            encryptedLine.reverse();

            // Step 3: Move characters from the half on (truncated) one position to the left in ASCII
            int halfLength = encryptedLine.length() / 2;
            for (int k = halfLength; k < encryptedLine.length(); k++) {
                char c = encryptedLine.charAt(k);
                encryptedLine.setCharAt(k, (char) (c - 1));
            }

            // Print the encrypted line
            System.out.println(encryptedLine.toString());
        }
    }

    scanner.close();
	
}
}
//not working