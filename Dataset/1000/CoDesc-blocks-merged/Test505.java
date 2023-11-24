class Test {
    public class Example {
    public static void styleChgLabel ( ChgLabel self , String type , String symb , String edc , String fac , String smbsz , String edw , String lab ) {
      for ( int i = 0 ;
      i < self . style . length ;
      i ++ ) {
        if ( self . style [ i ] . get ( self . stylemap . get ( "Label" ) ) . equals ( type ) ) {
          if ( symb != null ) self . style [ i ] . put ( self . stylemap . get ( "Symbol" ) , symb ) ;
          if ( edc != null ) self . style [ i ] . put ( self . stylemap . get ( "Edge color" ) , edc ) ;
          if ( fac != null ) self . style [ i ] . put ( self . stylemap . get ( "Face color" ) , fac ) ;
          if ( smbsz != null ) self . style [ i ] . put ( self . stylemap . get ( "Symbol size" ) , smbsz ) ;
          if ( edw != null ) self . style [ i ] . put ( self . stylemap . get ( "Edge width" ) , edw ) ;
          if ( lab != null ) self . style [ i ] . put ( self . stylemap . get ( "Label" ) , lab ) ;
        }
      }
    }
        public void pressSustainPedal(int level) {
            if (_sustained) {
                releaseSustainPedal();
            }
            _sustained = true;
        }
        public void formatTo(Formatter formatter, int flags, int width,
    			int precision)
    	{
    		formatTo(this.toString(), formatter, flags, width, precision);
    	}
    }
}