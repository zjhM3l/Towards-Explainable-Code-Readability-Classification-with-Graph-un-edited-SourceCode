class Test {
    public class Example {
    public Object getId(ObjectClass mc, Object o) {
            Property idProperty = mc.getIdProperty() ;
            if(idProperty == null) return null ;
            return getValue(idProperty,o);
        }
        public static int run ( Main self , String ... args ) {
      Parameters params = self . parser . parse ( args ) ;
      int code = show ( params . uuid , params . term ) ;
      return code ;
    }
        public void zoomPoint(R2 p,double factor){
            /** effective zoom point is between current center and mouse position...
            * close to center => 100% at the given point, close to edge => 10% at the given point. */
            double cx=.1*p.x+.9*getActualCenter().x;
            double cy=.1*p.y+.9*getActualCenter().y;
            setDesiredBounds(new R2(cx-factor*getDrawWidth()/2.0,cy-factor*getDrawHeight()/2.0),new R2(cx+factor*getDrawWidth()/2.0,cy+factor*getDrawHeight()/2.0));
        }
    }
}