public class movableRectangle implements Movable{
    private MovablePoint topleft;
    private MovablePoint bottomRight;
    public movableRectangle(int x1, int x2, int y1, int y2, int xspeed, int yspeed){
        topleft = new MovablePoint(x1, y1, xspeed, yspeed);
        bottomRight = new MovablePoint(x2, y2, xspeed, yspeed);
    }

    @Override
    public void moveleft() {
        topleft.moveleft();
        bottomRight.moveleft();
    }

    @Override
    public void moveright() {
        topleft.moveright();
        bottomRight.moveright();
    }

    @Override
    public void movedown() {
        topleft.movedown();
        bottomRight.movedown();
    }

    @Override
    public void moveup() {
        topleft.moveup();
        bottomRight.moveup();
    }
}
