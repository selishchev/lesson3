import java.util.ArrayList;

public class ProductCatalog {
    protected ArrayList<Product> catalog = new ArrayList<>();

    public ArrayList<Product> getAllProducts() {
        for (Product pr : catalog) {
            pr.printInfo();
        }
        System.out.println();
        return catalog;
    }

    public void createProduct(Product product) {
        try {
            for (Product pr : catalog) {
                if (pr.name.equals(product.name)) {
                    throw new ProductAlreadyExists();
                }
            }
            catalog.add(product);
        } catch (ProductAlreadyExists e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    public void updateProduct(Product product) {
        int count = 0;
        try {
            for (Product pr : catalog) {
                if (pr.id == product.id) {
                    count++;
                    catalog.remove(pr);
                    catalog.add(product);
                    break;
                }
            }
            if (count == 0) {
                throw new ProductNotFound();
            }
        }
        catch (ProductNotFound e) {
            System.out.println("Exception: " + e.toString());
        }
        try {
            if (product.name == null) {
                throw new ProductNotValid();
            }
        }
        catch (ProductNotValid e) {
            System.out.println("Exception: " + e.toString());
        }
    }

    public void deleteProduct(long id) {
        int count = 0;
        try {
            for (Product pr : catalog) {
                if (id == pr.id) {
                    count++;
                    catalog.remove(pr);
                    break;
                }
            }
            if (count == 0) {
                throw new ProductNotFound();
            }
        }
        catch (ProductNotFound e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}

class ProductAlreadyExists extends Exception {
    public String toString()
    {
        return "Error. Product already exists.";
    }
}

class ProductNotFound extends RuntimeException {
    public String toString()
    {
        return "Error. Product not found.";
    }
}

class ProductNotValid extends Exception {
    public String toString()
    {
        return "Error. Product not valid.";
    }
}