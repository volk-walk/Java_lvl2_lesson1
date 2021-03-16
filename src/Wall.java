public class Wall extends Obstacles {
    int heightWall;
    Wall(int heightWall) {
        this.heightWall = heightWall;
    }
    public void runOrJump(Membr membr){
        membr.jump();
        System.out.println(" - Перепрыгнул стену");
    }


}
