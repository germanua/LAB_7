import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAccess implements DataAccess {
    private File file;

    public FileDataAccess() {
        String filePath = "data.txt";
        this.file = new File(getClass().getClassLoader().getResource(filePath).getFile());
    }

    @Override
    public void connect() throws IOException {
        if (!file.exists()) {
            throw new IOException("File not found: " + file.getName());
        }

        if (file.length() == 0) {
            System.out.println("File is empty.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }


    @Override
    public void disconnect() throws IOException {
        // File connection does not require explicit disconnection
    }
}
