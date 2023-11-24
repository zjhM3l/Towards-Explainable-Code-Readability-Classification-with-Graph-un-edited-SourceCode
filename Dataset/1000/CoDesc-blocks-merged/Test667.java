class Test {
    public class Example {
    public static JSONObject markAndAddEffort ( EffortSchedule self , double modulus , JSONObject jsonInfo ) {
      final double META_AMZ_FACT = 92. / 152. ;
      final double AMZ_C4_PRICE = 0.1 ;
      int length = ( int ) Math . ceil ( Math . log ( modulus , 2 ) ) ;
      int lengthCeiling = ( int ) Math . ceil ( length / 32 ) * 32 ;
      if ( lengthCeiling < self . lengthToTimeYears . length ) {
        int effortTime = self . lengthToTimeYears [ lengthCeiling ] ;
        if ( effortTime > 0 ) {
          effortTime *= META_AMZ_FACT ;
          double effortPrice = effortTime * 365.25 * 24 * 0.5 * AMZ_C4_PRICE ;
          if ( effortPrice > 0 ) {
            jsonInfo . put ( "marked" , true ) ;
            jsonInfo . put ( "timeYears" , effortTime ) ;
            jsonInfo . put ( "priceAwsC4" , effortPrice ) ;
          }
        }
      }
      return jsonInfo ;
    }
        public Integer getBatsmansScore(int i) {
        Integer score;
        if (currentBatsmansNumber == i) {
          score = new Integer(currentBatsmansScore);
        } else {
          score = (Integer) batsmanScore[currentInnings].get(i);
        }
        return score;
      }
        public boolean intersects( Point2D pt ) {
    	  double rectSize = 20.0;
    		for ( int i = 0; i < drawPoints.length-1; i++ ) {
    			Rectangle2D rect = new Rectangle2D.Double( pt.getX()-rectSize/2, pt.getY()-rectSize/2, rectSize,rectSize);
    			Line2D l = new Line2D.Double( drawPoints[i], drawPoints[i+1] );
    			if ( l.intersects( rect ) ) 
    				return true;
    		}
    		return false;
    	}
    }
}