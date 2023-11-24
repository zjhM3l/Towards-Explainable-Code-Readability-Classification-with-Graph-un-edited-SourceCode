class Test {
    public class Example {
    public static void txt ( Cell self , String txt , int h , int atX , int toX , int changeStyle , int changeSize ) {
      h = h > self . getHeight ( ) ? h : self . getHeight ( ) ;
      self . changeProps ( changeStyle , changeSize ) ;
      int align = 'L' ;
      int w = 0 ;
      if ( atX == 0 ) {
        if ( toX != 0 ) {
          align = 'R' ;
          self . oPdf . setX ( 0 ) ;
          w = toX ;
        }
      }
      else {
        self . oPdf . setX ( atX ) ;
      }
      if ( w == 0 ) {
        w = self . oPdf . getStringWidth ( txt ) ;
      }
      self . oPdf . cell ( w , h , txt , align ) ;
    }
        public String toString() {
            return new ToStringBuilder(getClass())
                .append("request", getRequest())
                .toString()
                ;
        }
        public void postProcessAfterTrustlevelChange(GameData data) {
        // initialize fog-of-war cache ((pavkovic): Do it always?)
        // (Fiete): no dependencies to TrustLevels anymore...moved to postProcess
    
        // intialize the fog-of-war cache for all regions that are covered by lighthouses
        // removed...Fiete
    
        // intialize the fog-of-war cache for all regions where units or ships traveled through
        // removed...Fiete
    
      }
    }
}