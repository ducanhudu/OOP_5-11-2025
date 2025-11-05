class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "Sách: " + title + " - Tác giả: " + author;
    }
}

class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String toString() {
        return "Điện thoại: " + brand + " " + model;
    }
}

class Food {
    private String name;
    private String expiryDate;

    public Food(String name, String expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Thực phẩm: " + name + " (HSD: " + expiryDate + ")";
    }
}

class Block<T> {
    private T item;
    public void addItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }
    public void showInfo() {
        if (item != null) {
            System.out.println(item.toString());
        } else {
            System.out.println("Khối chứa trống!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Block<Book> bookBlock = new Block<>();
        Block<Phone> phoneBlock = new Block<>();
        Block<Food> foodBlock = new Block<>();
        bookBlock.addItem(new Book("Doraemon", "Fujiko F. Fujio"));
        phoneBlock.addItem(new Phone("Apple", "iPhone 15 Pro"));
        foodBlock.addItem(new Food("Mì tôm", "20/12/2025"));
        System.out.println("=== Thông tin hàng hóa trong các khối ===");
        bookBlock.showInfo();
        phoneBlock.showInfo();
        foodBlock.showInfo();
        System.out.println("\nLấy hàng từ khối chứa sách:");
        Book b = bookBlock.getItem();
        System.out.println("-> " + b);
    }
}
