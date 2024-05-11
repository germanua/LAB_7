import java.io.IOException;

public class WebServiceDataAccess implements DataAccess {
    @Override
    public void connect() throws IOException {
        System.out.println("Connected to the WebService.");
    }

    @Override
    public void disconnect() throws IOException {
        System.out.println("Disconnected from the WebService.");
    }
}
