public class BidimensionalCoordinate {
    private double x;
    private double y;
    public  BidimensionalCoordinate (int x, int y){
        this.x =  x + 0d;
        this.y =  y + 0d;
    }
    public  BidimensionalCoordinate (double x, double y){
        this.x =  x;
        this.y =  y;
    }
    public double getX(){
        return x;
    }

    public double getY() {
        return y;
    }

    public BidimensionalCoordinate addCoordinate (BidimensionalCoordinate point){
        return new BidimensionalCoordinate(point.getX() + x,point.getY() + y);
    }
}
