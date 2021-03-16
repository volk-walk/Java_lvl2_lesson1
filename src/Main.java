public class Main {
    public static void main(String[] args) {

        Membr [] membr = {
                new Cat(6,5),
                new Human(2,3),
                new Robot(1,1)
        };
        Obstacles [] obs = {
                new Wall(3),
                new Roud(3)
        };

        for (Obstacles t: obs ) {
            for (Membr e : membr ) {
                if(t.heightWall > e.heightJump | t.longRoud > e.longRun){
                    System.out.println("Не смог и выбыл");
                    break;
                }

                else {
                   t.runOrJump(e);
                    
                }
            }

        }



    }
}
