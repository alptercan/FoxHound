import java.nio.file.Path;
import java.util.Scanner;
import java.util.Objects;

/**
 * A utility class for the fox hound program.
 * 
 * It contains helper functions for all user interface related
 * functionality such as printing menus and displaying the game board.
 */
public class FoxHoundUI {

    /** Number of main menu entries. */
    private static final int MENU_ENTRIES = 2;
    /** Main menu display string. */
    private static final String MAIN_MENU =
        "\n1. Move\n2. Exit\n\nEnter 1 - 2:";

    /** Menu entry to select a move action. */
    public static final int MENU_MOVE = 1;
    /** Menu entry to terminate the program. */
    public static final int MENU_EXIT = 2;

    public static void displayBoard(String[] players, int dimension) {
        String[] boardUi = new String[dimension];
        String[] alphabet = {"A","B","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","Z"};
        String firstAndLastRow = new String();
        String coordinate = new  String();
        String spaces = "  ";
        for (int i = 0; i < dimension; i++) {
            firstAndLastRow = firstAndLastRow + alphabet[i];
        }

        for (int i = 0; i < dimension; i++) {

            if (dimension < 10){
                rows = (i+1) + " ";
            }
            else{
                spaces ="   ";
                if ((i+1) < 10) {
                    rows = "0"+ (i+1) + " ";
                }
                else {
                    rows = (i+1) + " ";
                }
            }
            for (int j = 0; j < dimension; j++) {
                coordinate = alphabet[j] + (i+1);
                int test = 0;
                for (String element : players){
                    if (element.equals(coordinate)){
                        if (element.equals(players[players.length-1])){
                            test = 2;
                            break;
                        }
                        else {
                            test = 1;
                        }
                    }

                }
                if (test == 0){
                    rows = rows + ".";
                }
                else if (test == 1){
                    rows = rows + "H";
                }
                else {
                    rows = rows + "F";
                }
            }
            if (dimension<10){
                rows = rows + " "+ (i+1) ;
            }
            else{
                if ((i+1)<10) {
                    rows = rows + " 0"+ (i+1);
                }
                else{
                    rows = rows + " " + (i+1);
                }
            }
            boardUi[i] = rows;
        }
        System.out.println(spaces + firstAndLastRow);
        System.out.println(" ");
        for(int i = 0 ; i < boardUi.length ; i++){
            System.out.println(boardUi[i]);
        }
        System.out.println(" ");
        System.out.println(spaces + firstAndLastRow);
    }



    /**
     * Print the main menu and query the user for an entry selection.
     * 
     * @param figureToMove the figure type that has the next move
     * @param stdin a Scanner object to read user input from
     * @return a number representing the menu entry selected by the user
     * @throws IllegalArgumentException if the given figure type is invalid
     * @throws NullPointerException if the given Scanner is null
     */
    public static int mainMenuQuery(char figureToMove, Scanner stdin) {
        Objects.requireNonNull(stdin, "Given Scanner must not be null");
        if (figureToMove != FoxHoundUtils.FOX_FIELD 
         && figureToMove != FoxHoundUtils.HOUND_FIELD) {
            throw new IllegalArgumentException("Given figure field invalid: " + figureToMove);
        }

        String nextFigure = 
            figureToMove == FoxHoundUtils.FOX_FIELD ? "Fox" : "Hounds";

        int input = -1;
        while (input == -1) {
            System.out.println(nextFigure + " to move");
            System.out.println(MAIN_MENU);

            boolean validInput = false;
            if (stdin.hasNextInt()) {
                input = stdin.nextInt();
                validInput = input > 0 && input <= MENU_ENTRIES;
            }

            if (!validInput) {
                System.out.println("Please enter valid number.");
                input = -1; // reset input variable
            }

            stdin.nextLine(); // throw away the rest of the line
        }

        return input;
    }

    public static String[] positionQuery(int dim, Scanner test_in) {

        return new String[0];
    }

    public static Path fileQuery(Scanner test_in) {

        return null;
    }
}







