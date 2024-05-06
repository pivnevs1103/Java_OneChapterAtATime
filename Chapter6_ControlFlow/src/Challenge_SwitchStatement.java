import java.sql.SQLOutput;

/* In this challenge, I will be using the NATO alphabet to replace a character
or letter, with NATO's standardized word for that letter using an enhanced return
switch. The words I will be translating  are "CAR" and my name "SERGEY",
NOTE: Will try to mix up and include capital and lower case letters
 */
public class Challenge_SwitchStatement {
    public static void main(String[] args) {

        // Calling the method to translate the word "CAR" into NATO alphabet
        System.out.println(natoTranslator('C') + natoTranslator('a')
                + natoTranslator('R'));


        // Calling the method to translate my name "Sergey" into NATO alphabet
        System.out.println(natoTranslator('S') + natoTranslator('E') +
                natoTranslator('r') + natoTranslator('G') +
                natoTranslator('e') + natoTranslator('Y'));

        // This is just used to make sure that my default statement works
        System.out.println(natoTranslator('5'));


    }

    // Our method that just takes in one parameter and uses the switch statement
    // to return
    public static String natoTranslator(char letter1) {

        // My return switch statement
        return switch (letter1) {
            case 'A', 'a' -> "A = Able ";
            case 'B', 'b' -> "B = Baker ";
            case 'C', 'c' -> "C = Charlie ";
            case 'D', 'd' -> "D = Dog ";
            case 'E', 'e' -> "E = Easy ";
            case 'F', 'f' -> "F = Fox ";
            case 'G', 'g' -> "G = George ";
            case 'H', 'h' -> "H = How ";
            case 'I', 'i' -> "I = Item ";
            case 'J', 'j' -> "J = Jig ";
            case 'K', 'k' -> "K = King ";
            case 'L', 'l' -> "L = Love ";
            case 'M', 'm' -> "M = Mike ";
            case 'N', 'n' -> "N = Nan ";
            case 'O', '0' -> "O = Oboe ";
            case 'P', 'p' -> "P = Peter ";
            case 'Q', 'q' -> "Q = Queen ";
            case 'R', 'r' -> "R = Roger ";
            case 'S', 's' -> "S = Sugar ";
            case 'T', 't' -> "T = Tare ";
            case 'U', 'u' -> "U = Uncle ";
            case 'V', 'v' -> "V = Victor ";
            case 'W', 'w' -> "W = William ";
            case 'X', 'x' -> "X = X-ray ";
            case 'Y', 'y' -> "Y = Yoke ";
            case 'Z', 'z' -> "Z = Zebra ";
            // Because I used the brackets for the default statement
            // I have to use the "yield" instead of "return"
            default -> {
                yield letter1 + " is incorrect, please try again";
            }
        };
    }
}