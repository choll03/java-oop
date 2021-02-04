package programmer.zaman.now.data;

public class Product {

    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean equals(Object o) {
        if (o == this) return true;

        if(!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (price != product.price) return  false;

        return name != null ? name.equals(product.name) : name == null;
    }
}
