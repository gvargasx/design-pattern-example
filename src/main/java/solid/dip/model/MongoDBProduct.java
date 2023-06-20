package solid.dip.model;

public class MongoDBProduct implements IDbProduct {

    @Override
    public String getProductById(String productID) {
        return "MongoDB: " + productID;
    }
}
