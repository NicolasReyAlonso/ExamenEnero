public abstract class Shape implements WellKnownText {
protected type tipo;
protected float center;
    public static Shape generate(String arg){
        switch(select(arg)){
            case POINT:
                return new Point(0,0);
        }
        return null;
    }
    private static type select(String arg){
        if (arg.toLowerCase().equals("point")){
            return type.POINT;
        }else if (arg.toLowerCase().equals("polygon")){
            return type.POLYGON;
        }else if (arg.toLowerCase().equals("line")) {
            return type.LINE;
        }
        return null;
    }
    public enum type{POINT, POLYGON, LINE}

}
