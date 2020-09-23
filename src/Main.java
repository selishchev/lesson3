public class Main {
    public static void main (String[] args) {
        Product pr = new Product(3231, "apple", 10, "Russia");
        Product pr2 = new Product(3231, "orange", 5, "Egypt");
        Product pr3 = new Product(3223, "juice", 15, "Germany");
        Product pr4 = new Product(3546, "pineapple", 20, "China");
        Product pr5 = new Product(3546, 25, "China");
        ProductCatalog ctl = new ProductCatalog();
        ctl.createProduct(pr);
        ctl.createProduct(pr);
        ctl.createProduct(pr4);
        ctl.getAllProducts();
        ctl.updateProduct(pr2);
        ctl.updateProduct(pr3);
        ctl.updateProduct(pr5);
        ctl.getAllProducts();
        ctl.deleteProduct(3231);
        ctl.deleteProduct(3424);
        ctl.getAllProducts();
    }
}
