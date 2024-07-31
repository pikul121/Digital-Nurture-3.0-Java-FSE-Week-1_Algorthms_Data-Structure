public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 200.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.40),
            new Order(4, "David", 100.20)
        };

        // Sorting using Bubble Sort
        BubbleSort.sortOrders(orders);
        System.out.println("Bubble Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reinitialize orders array for Quick Sort
        orders = new Order[]{
            new Order(1, "Alice", 200.50),
            new Order(2, "Bob", 150.75),
            new Order(3, "Charlie", 300.40),
            new Order(4, "David", 100.20)
        };

        // Sorting using Quick Sort
        QuickSort.sortOrders(orders, 0, orders.length - 1);
        System.out.println("Quick Sort Result:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
