import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        String fileName = "Wizard.txt";
        String content = "Thankyou For Watching||";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            writer.newLine(); 
            writer.write("Bye Bye");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File writing completed.");
    }
}

