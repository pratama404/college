public class Main {
    public static void main(String[] args) {
        DestructorExample obj = new DestructorExample();
        Product p1 = new Product("Mouse");
        Product p2 = new Product("Keyboard");
        
        obj = null;
        p1 = null;
        p2 = null;
        
        System.gc();
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            // Tindakan terakhir sebelum objek dihapus
            System.out.println("Metode finalize() dipanggil");
        } finally {
            super.finalize();
        }
    }
}

class Product {
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
}
