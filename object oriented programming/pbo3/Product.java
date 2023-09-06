public class Product {
private String name;
public Product(String name) {
this.name = name;
System.out.println("Objek " + name + " telah dibuat");
}
public void displayInfo() {
System.out.println("Nama Produk: " + name);
}
@Override
protected void finalize() throws Throwable {
try {
System.out.println("Objek " + name + " akan dihapus oleh Garbage Collector");
} finally {
super.finalize();
}
}
public static void main(String[] args) {
Product p1 = new Product("Mouse");
Product p2 = new Product("Keyboard");
p1.displayInfo();
p2.displayInfo();
p1 = null;
p2 = null;
System.gc();
}
}
