class Test {
    public class Example {
    public static void setHasherNames ( HasherNamesFragment self , String hasherNamesString ) {
      String [ ] hasherNames = HashersManager . getInstance ( ) . getHasherNamesFromString ( hasherNamesString ) ;
      String debugHasherNames = Joiner . on ( ", " ) . join ( hasherNames ) ;
      logger . debug ( "Got hasher names: {
    0:s}" , debugHasherNames ) ;
        self . setHashers ( HashersManager . getInstance ( ) . getHashers ( hasherNames ) ) ;
        self . setHasherNamesString ( hasherNamesString ) ;
      }
        public static void parse ( Flag self , Object [ ] arguments ) {
      if ( arguments == null ) {
        return ;
      }
      if ( self . present ) {
        List < String > values = self . value ;
        if ( values == null ) {
          values = new ArrayList < String > ( ) ;
        }
        for ( int i = 0 ;
        i < arguments . length ;
        i ++ ) {
          Flag . Parse ( self , arguments [ i ] ) ;
          values . add ( self . value ) ;
        }
        self . value = values ;
      }
    }
        public double getSize(VisualItem item) {
            Object o = lookup(item);
            if ( o != null ) {
                if ( o instanceof SizeAction ) {
                    return ((SizeAction)o).getSize(item);
                } else if ( o instanceof Number ) {
                    return ((Number)o).doubleValue();
                } else {
                    Logger.getLogger(this.getClass().getName())
                        .warning("Unrecognized Object from predicate chain.");
                }
            }
            return m_defaultSize;   
        }
    }
}