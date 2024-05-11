public class ConcreteDataAccessFactory extends DataAccessFactory {
    @Override
    public DatabaseDataAccess createDatabaseDataAccess() {
        return new DatabaseDataAccess();
    }

    @Override
    public FileDataAccess createFileDataAccess() {
        return new FileDataAccess();
    }

    @Override
    public WebServiceDataAccess createWebServiceDataAccess() {
        return new WebServiceDataAccess();
    }
}
