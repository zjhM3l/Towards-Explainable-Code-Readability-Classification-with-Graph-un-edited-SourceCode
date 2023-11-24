class Test {
    public class Example {
    public static long getLastTradedDt ( Asset self , Date date ) {
      try {
        return self . frames . get ( "close" ) . loc . get ( 0 , asset . sid ) . lastValidIndex ( ) ;
      }
      catch ( IndexOutOfBoundsException e ) {
        return NaT ;
      }
    }
        public void setPatternMetadatas(PatternMetadata[] param){
                                  
                                       validatePatternMetadatas(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localPatternMetadatasTracker = true;
                                              } else {
                                                 localPatternMetadatasTracker = true;
                                                     
                                              }
                                          
                                          this.localPatternMetadatas=param;
                                  }
        public static final void confd_state_read_only_mode ( final Element self , final Callback callback ) {
      final Element config = new Element ( "config" ) ;
      final Element confd_state = new Element ( "confd-state" , "http://tail-f.com/yang/confd-monitoring" ) ;
      final Element read_only_mode = new Element ( "read-only-mode" ) ;
      final Callback callback = new Callback ( ) {
        @ Override public void call ( final Element config ) {
          callback . call ( config ) ;
        }
      };
    }
    }
}