public class Hero extends Character{
    
    @Override
    public void move() {
        System.out.println("Hero is move");
    }
    public void move(String direction) {
        System.out.println("Hero is moving " + direction);
    }
}
