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
        BidimensionalCoordinate result = new BidimensionalCoordinate(0,0);
        Iterator iter = coordinateList.iterator();
        while (iter.hasNext()) {
            result.addCoordinate((BidimensionalCoordinate) iter);
            iter.next();
        }
        double [] center = {result.getX()/items, result.getY()/items};
        return center;
    }
}