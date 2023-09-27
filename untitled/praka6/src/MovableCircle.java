public class MovableCircle  implements Movable {
    private int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveup() {
        center.moveup();
    }

    @Override
    public void movedown() {
        center.movedown();
    }

    @Override
    public void moveright() {
        center.moveright();
    }

    @Override
    public void moveleft() {
        center.moveleft();
    }
}
