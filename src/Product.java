public class Product {
    protected long id;
    protected String name;
    protected int price;
    protected String supplier;

    public Product (long id, String name, int price, String supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.supplier = supplier;

    }

    public Product (long id, int price, String supplier) {
        this.id = id;
        this.price = price;
        this.supplier = supplier;

    }

    public void printInfo () {
        System.out.println("Id: " + id + ", Name: " + name + ", Price: " + price + ", Supplier: " + supplier);
    }
}
