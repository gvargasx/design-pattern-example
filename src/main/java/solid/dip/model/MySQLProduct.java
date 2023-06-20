package solid.dip.model;

public class MySQLProduct implements IDbProduct {

    @Override
    public String getProductById(String productID) {
        return "Mysql: " + productID;
    }
}
