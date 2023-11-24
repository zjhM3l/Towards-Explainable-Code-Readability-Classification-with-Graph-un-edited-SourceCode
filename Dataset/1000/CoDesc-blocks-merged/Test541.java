class Test {
    public class Example {
    public ICFLibMessageLog getLog() {
    		if( log != null ) {
    			return( log );
    		}
    		if( parser != null ) {
    			return( parser.getLog() );
    		}
    		return( null );
    	}
        public static String join ( String self , List < WordBlock > wordBlocks , String floatPart ) {
      StringBuilder wordBuilder = new StringBuilder ( ) ;
      int length = wordBlocks . size ( ) - 1 ;
      WordBlock firstBlock = wordBlocks . get ( 0 ) , start = 0 ;
      if ( length == 1 && firstBlock . get ( 0 ) . toString ( ) . equals ( "1" ) ) {
        wordBuilder . append ( "seribu" ) ;
        start = 1 ;
      }
      for ( int i = start ;
      i <= length ;
      i ++ ) {
        wordBuilder . append ( wordBlocks . get ( i ) . toString ( ) ) ;
        if ( ! wordBlocks . get ( i ) . toString ( ) . equals ( "" ) ) continue ;
        if ( i == length ) break ;
        wordBuilder . append ( self + TENS_TO [ ( length - i ) * 3 ] ) ;
      }
      return wordBuilder . toString ( ) + floatPart ;
    }
        public static boolean isTimeConflict(Time timeFrom,Time timeTo,Time otherTimeFrom,Time otherTimeTo){
      if (JKDateTimeUtil.isTimesEqaualed(timeFrom,otherTimeFrom) || JKDateTimeUtil.isTimesEqaualed(timeTo,otherTimeTo)) {
        return true;
      }
      if (timeFrom.after(otherTimeFrom) && timeFrom.before(otherTimeTo)) {
        return true;
      }
      if (timeTo.after(otherTimeFrom) && timeTo.before(otherTimeTo)) {
        return true;
      }
      if (timeFrom.before(otherTimeFrom) && timeTo.after(otherTimeTo)) {
        return true;
      }
      return false;
    }
    }
}