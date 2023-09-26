// Game.java
class Game extends Permainan {
    public Game(String namaPermainan) {
        super(namaPermainan);
    }

    @Override
    public void selesai() {
        System.out.println("Permainan " + namaPermainan + " telah selesai.");
    }

    public void mulai(int level) {
        System.out.println("Permainan " + namaPermainan + " dimulai pada level " + level + ".");
    }
}
