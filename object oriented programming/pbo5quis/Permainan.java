// Permainan.java
class Permainan {
    private String namaPermainan;

    public Permainan(String namaPermainan) {
        this.namaPermainan = namaPermainan;
    }

    public void mulai() {
        System.out.println("Permainan " + namaPermainan + " dimulai.");
    }

    public void selesai() {
        System.out.println("Permainan " + namaPermainan + " selesai.");
    }
}
