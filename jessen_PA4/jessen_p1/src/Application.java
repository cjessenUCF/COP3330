import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        try {
            DuplicateRemover duplicateRemover = new DuplicateRemover();
            duplicateRemover.remove("problem1.txt");
            duplicateRemover.write("unique_words.txt");
        } catch (IOException ex){
            System.out.println(System.getProperty("user.dir"));
            System.out.println(ex.getMessage());
        }
    }
}
