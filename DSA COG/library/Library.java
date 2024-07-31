public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Linear search to find books by title
    public Book linearSearchByTitle(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                return books[i];
            }
        }
        return null; // Book not found
    }

    // Binary search to find books by title (assuming the list is sorted)
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; // Book not found
    }

    // Traverse and print all books
    public void traverseBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    public static void main(String[] args) {
        Library library = new Library(10);

        // Adding books
        library.addBook(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(4, "The Catcher in the Rye", "J.D. Salinger"));

        // Traversing books
        System.out.println("All books:");
        library.traverseBooks();

        // Linear search for a book by title
        System.out.println("\nLinear search for book with title '1984':");
        Book book1 = library.linearSearchByTitle("1984");
        System.out.println(book1 != null ? book1 : "Book not found.");

        // Binary search for a book by title
        System.out.println("\nBinary search for book with title 'The Great Gatsby':");
        Book book2 = library.binarySearchByTitle("The Great Gatsby");
        System.out.println(book2 != null ? book2 : "Book not found.");
    }
}
