package solid.dip.payment;

import solid.dip.factory.DbProductFactory;
import solid.dip.model.Db;
import solid.dip.model.IDbProduct;

public class Payment {

    public static void pay(String productID) {
        IDbProduct dbProduct = DbProductFactory.create(Db.MYSQL);
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }

}
