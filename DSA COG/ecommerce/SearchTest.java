// File: SearchTest.java
import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        // Create product array
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Shirt", "Clothing")
        };

        // Sort products by ID for binary search
        Arrays.sort(products, (p1, p2) -> Integer.compare(p1.getProductId(), p2.getProductId()));

        // Test Linear Search
        Product foundProductLinear = LinearSearch.linearSearch(products, 2);
        System.out.println("Linear Search: " + (foundProductLinear != null ? foundProductLinear : "Product not found"));

        // Test Binary Search
        Product foundProductBinary = BinarySearch.binarySearch(products, 2);
        System.out.println("Binary Search: " + (foundProductBinary != null ? foundProductBinary : "Product not found"));
    }
}
