import java.util.Arrays;

/**
 * A utility class for the fox hound program.
 * 
 * It contains helper functions to check the state of the game
 * board and validate board coordinates and figure positions.
 */
public class FoxHoundUtils {

    // ATTENTION: Changing the following given constants can 
    // negatively affect the outcome of the auto grading!

    /**
     * Default dimension of the game board in case none is specified.
     */
    public static final int DEFAULT_DIM = 8;
    /**
     * Minimum possible dimension of the game board.
     */
    public static final int MIN_DIM = 4;
    /**
     * Maximum possible dimension of the game board.
     */
    public static final int MAX_DIM = 26;

    /**
     * Symbol to represent a hound figure.
     */
    public static final char HOUND_FIELD = 'H';
    /**
     * Symbol to represent the fox figure.
     */
    public static final char FOX_FIELD = 'F';




    public static String makeCoordinate(int lat, int vert) {
        return Character.toString(64 + lat) + Integer.toString(vert);
    }

    /**
     * *
     *
     * @param dimension
     * @return
     */

    public static String[] initialisePositions(int dimension) {
        /*
         *
         *
         */
        if (dimension > 26 || dimension < 4) {
            throw new IllegalArgumentException("Dimension can not be more than 26 or less than 4");
        }
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] players = new String[dimension / 2 + 1];
        for (int j = 1; j < dimension + 1; j++) {
            if (j % 2 == 0) {
                players[(j / 2) - 1] = alphabet[j - 1] + "1";
            }
        }
        int fPosition = 0;
        if (dimension % 2 == 0) {
            fPosition = (dimension / 2) + 1;
        } else {
            fPosition = (dimension / 2) + 2;
        }
        for (int j = 1; j < dimension + 1; j++) {
            if (j == fPosition) {
                players[dimension / 2] = alphabet[j - 1] + dimension;
            }
        }
        return players;
    }
    

    public static boolean isFoxWin(String foxPos) {
        return false;
    }

    public static boolean isHoundWin(String[] players, int dimension) {
        return false;
    }

    public static boolean isValidMove(int dim, String[] players, char figure, String origin, String dest) {


        return false;
    }
}


