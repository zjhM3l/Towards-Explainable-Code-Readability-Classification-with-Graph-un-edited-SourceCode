class Test {
    public class Example {
    public String getArg(int pintNumber) {
            String getArg = "";
            
        	if (getArgs() != null) {
        		Tuple objTuple = ((Tuple)getArgs().get(pintNumber));
        		if (objTuple != null) {
        			getArg = objTuple.getValue();
        		}
        	}
        	
            return getArg;
        }
        public static double lookupExtrapolation ( double x , double [ ] xs , double [ ] ys ) {
      int length = xs . length ;
      if ( x < xs [ 0 ] ) {
        double dx = xs [ 1 ] - xs [ 0 ] ;
        double dy = ys [ 1 ] - ys [ 0 ] ;
        double k = dy / dx ;
        return ys [ 0 ] + ( x - xs [ 0 ] ) * k ;
      }
      if ( x > xs [ length - 1 ] ) {
        double dx = xs [ length - 1 ] - xs [ length - 2 ] ;
        double dy = ys [ length - 1 ] - ys [ length - 2 ] ;
        double k = dy / dx ;
        return ys [ length - 1 ] + ( x - xs [ length - 1 ] ) * k ;
      }
      return FastMath . interp ( x , xs , ys ) ;
    }
        public ElementSet Parameter() {
    
    		return org.openarchitectureware.core.meta.util.MMUtil
    				.filterByView(parameterSet);
    	}
    }
}