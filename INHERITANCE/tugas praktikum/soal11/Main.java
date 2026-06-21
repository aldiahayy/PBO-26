package praktikum5;
public class Main {
    public static void main(String[] args) {
        Tank tank = new Tank("Tigreal", "Tank");
        Fighter fighter = new Fighter("Alucard", "Fighter");
        Mage mage = new Mage("Eudora", "Mage");
        Jungle jungle = new Jungle("Saber", "Jungle");
        Marksman marksman = new Marksman("Miya", "Marksman");

        // Menampilkan attack masing-masing
        tank.attack();
        fighter.attack();
        mage.attack();
        jungle.attack();
        marksman.attack();
    }
}
