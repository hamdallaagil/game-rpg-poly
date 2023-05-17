public class Enemy extends Character{
    
    @Override
    public void move() {
        System.out.println("Enemy is move");
    }
    public void move(int step) {
        System.out.println("Enemy is moving " + step + " steps");
    }

}
