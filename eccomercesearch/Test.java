package eccomercesearch;

public class Test {
    public static void main(String[] args) {
        Product[] products = {
                new Product(1001, "HP Laptop", "Electronics"),
                new Product(1002, "TShirt", "Apparel"),
                new Product(1003, "Book", "Education"),
                new Product(1004, "Mobile Phone", "Electronics")
        };

        String searchItem = "Book";

        System.out.println("Linear Search:");
        Product resultLinear = LinearSearch.search(products, searchItem);
        System.out.println(resultLinear != null ? "Found: " + resultLinear : "Product not found.");

        System.out.println("\nBinary Search:");
        Product resultBinary = BinarySearch.search(products, searchItem);
        System.out.println(resultBinary != null ? "Found: " + resultBinary : "Product not found.");
    }
}