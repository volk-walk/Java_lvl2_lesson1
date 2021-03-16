public class Roud extends Obstacles {
    int longRoud;
    Roud(int longRoud) {
        this.longRoud = longRoud;
    }
    public void runOrJump(Membr membr){
        membr.run();
        System.out.println(" - Пробежал дорогу");
    }


}
