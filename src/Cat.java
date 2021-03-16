public class Cat extends Membr  {
    int heightJump;
    int longRun;
    Cat(int heightJump, int longRun) {
        this.heightJump = heightJump;
        this.longRun = longRun;
    }
    @Override
    public void run() {
        System.out.print("Кот пробежал");
    }

    @Override
    public void jump() {
        System.out.print("Кот прыгнул");
    }


}
