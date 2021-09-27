package pointAndMoveablepoint;

public class Main {
    public static void main(String[] args) {
        Point local1=new Point(10,11);
        System.out.println(local1);
        MovablePoint local2=new MovablePoint(1,2,3,4);
        System.out.println(local2);
        System.out.println(local2.move());
        System.out.println(local2);
        MovablePoint local3=new MovablePoint();
        System.out.println(local3);
    }
}
