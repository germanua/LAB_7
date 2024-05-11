public class DataAccessBuilder {
    private DataAccessFactory factory;

    public DataAccessBuilder(DataAccessFactory factory) {
        this.factory = factory;
    }

    public DataAccess buildDatabaseDataAccess() {
        return factory.createDatabaseDataAccess();
    }

    public DataAccess buildFileDataAccess() {
        return factory.createFileDataAccess();
    }

    public DataAccess buildWebServiceDataAccess() {
        return factory.createWebServiceDataAccess();
    }
}
