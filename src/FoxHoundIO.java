import java.awt.datatransfer.DataFlavor;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * A utility class for the fox hound program.
 * 
 * It contains helper functions for all file input / output
 * related operations such as saving and loading a game.
 */
public class FoxHoundIO {


    public static char loadGame(String[] players, Path input) {
        String loadFile = input.toString();

        try {
            File file = new File((loadFile));
            FileWriter writer = new FileWriter(file);
            writer.write(Character.toString(players);
            for (String playerPosition : players) {
                writer.write(playerPosition + "");
            }
            writer.close();
            return 0;
        }
    }






    public static boolean saveGame(String[] players, char turn, Path path) {

        String fileName = path.toString();

        try {
            File file = new File((fileName));
            FileWriter writer = new FileWriter(file);
            // write next player turn to first line
            writer.write(Character.toString(turn) + " ");
            for (String playerPosition : players) {
                writer.write(playerPosition + " ");
            }
            writer.close();
            return true;
        } catch (IOException e) {
            System.err.println(e);
            return false;
        }

    }
}
