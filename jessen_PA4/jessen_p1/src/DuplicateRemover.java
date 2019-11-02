import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    private Set<String> uniqueWords = null;

    public void remove(String dataFile) throws FileNotFoundException {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inputFileStream = null;        // Scanner object

        // Try to open file
        System.out.println("Opening file dataFile");
        fileByteStream = new FileInputStream(dataFile);
        inputFileStream = new Scanner(fileByteStream);


        uniqueWords = new HashSet<String>();

        while(inputFileStream.hasNext()){
            var word = inputFileStream.next();

            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
            }
        }
    }

    public void write(String outputFile) throws IOException {
        FileOutputStream fileByteStream = null; // File output stream
        PrintWriter outFS = null;               // Output stream

        // Try to open file
        fileByteStream = new FileOutputStream(outputFile);
        outFS = new PrintWriter(fileByteStream);

        // File is open and valid if we got this far (otherwise exception thrown)
        // Can now write to file
        for(String word : uniqueWords){
            outFS.println(word);
        }
        outFS.flush();

        // Done with file, so try to close it
        fileByteStream.close(); // close() may throw IOException if fails

    }
}
