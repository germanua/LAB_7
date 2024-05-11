import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DataAccessFactory factory = new ConcreteDataAccessFactory();
        DataAccessBuilder builder = new DataAccessBuilder(factory);


        try {
            // Build and use a DatabaseDataAccess
            DataAccess databaseAccess = builder.buildDatabaseDataAccess();
            databaseAccess.connect();
            databaseAccess.disconnect();

            // Build and use a FileDataAccess
            DataAccess fileAccess = builder.buildFileDataAccess();
            fileAccess.connect();
            fileAccess.disconnect();

            // Build and use a WebServiceDataAccess
            DataAccess webServiceAccess = builder.buildWebServiceDataAccess();
            webServiceAccess.connect();
            webServiceAccess.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
