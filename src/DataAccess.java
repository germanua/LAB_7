import java.io.IOException;

public interface DataAccess {
    void connect() throws IOException;
    void disconnect() throws IOException;
}
