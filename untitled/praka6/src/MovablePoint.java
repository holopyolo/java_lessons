public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveleft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void movedown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveright() {
        this.x += this.xSpeed;
    }

    @Override
    public void moveup() {
        this.y += this.ySpeed;
    }

    @Override
    public String toString() {
        return "point";
    }
}
