public abstract class DataAccessFactory {
    public abstract DatabaseDataAccess createDatabaseDataAccess();
    public abstract FileDataAccess createFileDataAccess();
    public abstract WebServiceDataAccess createWebServiceDataAccess();
}
