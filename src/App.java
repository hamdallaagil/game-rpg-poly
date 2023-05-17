public class App {
    public static void main(String[] args) {
        Hero h = new Hero();
        Enemy e = new Enemy();

        System.out.println("Nama : Hamdalla Agil Putra Nasol");
        System.out.println("NIM : 225150607111037");

        System.out.println("Soal point a");
        System.out.println("--------------");
        h.move();
        h.move("forward");
        System.out.println("--------------");
        e.move();
        e.move(3);
        System.out.println("--------------");

        System.out.println("Soal point b");
        System.out.println("--------------");
        Character ch;
        ch = new Hero();
        ch.move();
        ch = new Enemy();
        ch.move();
        ch = new Fighter();
        ch.move();
        ch = new Witch();
        ch.move();
        System.out.println("--------------");
        
        System.out.println("Soal point c");
        System.out.println("--------------");
        Character w = new Witch();
        ((Fighter)w).move();
        System.out.println("--------------");


    }
}
