import java.io.*;
import java.util.*;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter = null;

    public void count(String dataFile) throws FileNotFoundException {
        FileInputStream fileByteStream = null; // File input stream
        Scanner inputFileStream = null;        // Scanner object

        // Try to open file
        System.out.println("Opening file dataFile");
        fileByteStream = new FileInputStream(dataFile);
        inputFileStream = new Scanner(fileByteStream);


        wordCounter = new HashMap<String, Integer>();

        while(inputFileStream.hasNext()){
            var word = inputFileStream.next();

            if (!wordCounter.containsKey(word)) {
                wordCounter.put(word, 0);
            }

            Integer x = wordCounter.get(word);
            x+=1;
            wordCounter.replace(word, x);
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
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet())
            outFS.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());

        outFS.flush();

        // Done with file, so try to close it
        fileByteStream.close(); // close() may throw IOException if fails

    }

}
