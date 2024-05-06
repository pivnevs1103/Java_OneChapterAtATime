
// Small challenge that takes a kilobyte, converts it to megabytes.
// It all gets printed out as well as the remainder of kilobytes
public class Challenge_MegaBytesConverter {
    public static void main(String[] args) {

        //Calling our method with different test values
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-1);
        printMegaBytesAndKiloBytes(1234);
        printMegaBytesAndKiloBytes(6532);
        printMegaBytesAndKiloBytes(-1000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        // Checks to make sure that no negative value can pass through
        if(kiloBytes >= 0){

            //Declaring our variables
            int megaBytes = 0;
            int originalKiloBytes = kiloBytes;

            // Using the while loop to convert kilobytes to megabytes and store
            // the remainder
            while(kiloBytes >= 1024){
                megaBytes = kiloBytes / 1024;
                kiloBytes %= 1024;
            }

            // Prints out the result of everything
            System.out.println(originalKiloBytes + " KB = "
                    + megaBytes + " MB and " + kiloBytes + " KB");
        }
        else
            // This prints out if the value being passed into the function is less then 0
            System.out.println("Invalid Value");
    }

}
