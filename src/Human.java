public class Human extends Membr {
    int heightJump;
    int longRun;
    Human(int heightJump, int longRun) {
        this.heightJump = heightJump;
        this.longRun = longRun;
    }
    @Override
    public void run() {
        System.out.print("Человек пробежал");
    }

    @Override
    public void jump() {
        System.out.print("Человек прыгнул");
    }


}
