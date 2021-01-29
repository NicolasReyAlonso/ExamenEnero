import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polygon extends Shape{
    private List<BidimensionalCoordinate> coordinateList = new ArrayList<BidimensionalCoordinate>();

    public Polygon (List<BidimensionalCoordinate> coordinateList){
        insertPoints(coordinateList);
        tipo = type.POLYGON;
    }
    private void insertPoints(List<BidimensionalCoordinate> coordinateList){
        Iterator iter = coordinateList.iterator();
        while (iter.hasNext()) {
            this.coordinateList.add((BidimensionalCoordinate) iter);
            iter.next();
        }
    }
    public void draw(){

    }

    public double [] getCenter() {
        int items = coordinateList.size();
        BidimensionalCoordinate result = addCoordinates();
        double [] center = {result.getX()/items, result.getY()/items};
        return center;
    }
    private BidimensionalCoordinate addCoordinates(){
        BidimensionalCoordinate result = new BidimensionalCoordinate(0,0);
        Iterator iter = coordinateList.iterator();
        while (iter.hasNext()) {
            result.addCoordinate((BidimensionalCoordinate) iter);
            iter.next();
        }return result;
    }

    public boolean inside(Point punto){
        double[]LimiteX = getMinMaxX();
        double[]LimiteY = getMinMaxY();
        double[]limitePunto = punto.getCenter();
        if (limitePunto[0] > LimiteX[0] && limitePunto[0] < LimiteX[1] &&limitePunto[1] > LimiteY[0] && limitePunto[1] < LimiteY[1]){
            return true;
        }return false;
    }

    private double[] getMinMaxY() {
        double [] minmax = new double[2];
        Iterator iter = coordinateList.iterator();
        BidimensionalCoordinate tmp = (BidimensionalCoordinate) iter;
        minmax[0] = tmp.getY();
        iter.next();
        tmp = (BidimensionalCoordinate) iter;
        if (tmp.getY() < minmax[0]){
            minmax[1] = minmax[0];
            minmax[0] = tmp.getY();
        }
        iter.next();
        while (iter.hasNext()) {
            tmp = (BidimensionalCoordinate) iter;
            if (minmax[0] > tmp.getY()){ minmax[0] = tmp.getY();}
            if (minmax[1] < tmp.getY()){ minmax[0] = tmp.getY();}
            iter.next();
        }
        return minmax;
    }

    private double[] getMinMaxX() {
        double [] minmax = new double[2];
        Iterator iter = coordinateList.iterator();
        BidimensionalCoordinate tmp = (BidimensionalCoordinate) iter;
        minmax[0] = tmp.getX();
        iter.next();
        tmp = (BidimensionalCoordinate) iter;
        if (tmp.getX() < minmax[0]){
            minmax[1] = minmax[0];
            minmax[0] = tmp.getX();
        }
        iter.next();
        while (iter.hasNext()) {
            tmp = (BidimensionalCoordinate) iter;
            if (minmax[0] > tmp.getX()){ minmax[0] = tmp.getX();}
            if (minmax[1] < tmp.getX()){ minmax[0] = tmp.getX();}
            iter.next();
        }
        return minmax;
    }
}