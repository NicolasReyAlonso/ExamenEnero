public class Line extends Shape{
    private BidimensionalCoordinate Start;
    private BidimensionalCoordinate End;

    public Line (int x, int y, int x2, int y2){
        Start = new BidimensionalCoordinate(x,y);
        End = new BidimensionalCoordinate(x2,y2);
        tipo = type.LINE;
    }
    public void draw(){

    }

    public double [] getCenter() {
        BidimensionalCoordinate fin = Start.addCoordinate(End);
        double [] center = {fin.getX()/2, fin.getY()/2};
        return center;
    }
}
