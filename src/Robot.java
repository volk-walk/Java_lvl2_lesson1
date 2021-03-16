public class Robot extends Membr {
    int heightJump;
    int longRun;
    Robot(int heightJump, int longRun) {
        this.heightJump = heightJump;
        this.longRun = longRun;
    }
    @Override
    public void run() {
        System.out.print("Робобот пробежал");
    }

    @Override
    public void jump() {
        System.out.print("Робобот прыгнул");
    }


}
