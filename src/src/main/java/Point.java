public class Point extends Shape{
    private BidimensionalCoordinate pos;
    public Point (int x, int y){
        pos = new BidimensionalCoordinate(x,y);
        tipo = type.POINT;
    }
    public void draw(){

    }

    public double [] getCenter() {
        double [] center = {pos.getX(), pos.getY()};
        return center;
    }
}
