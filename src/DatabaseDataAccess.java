import java.io.IOException;

public class DatabaseDataAccess implements DataAccess {
    @Override
    public void connect() throws IOException {
        System.out.println("Connected to the database.");
    }

    @Override
    public void disconnect() throws IOException {
        System.out.println("Disconnected from the database.");
    }
}
