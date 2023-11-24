class Test {
    public class Example {
    private boolean isTurnPlayable(int color) {
    		for (int i = 0; i < diskColor[0].length; i++) {
    			for (int j = 0; j < diskColor[0].length; j++) {
    				if (diskColor[i][j].getColor() == DiskColor.NONE) {
    					if(!(getAffectedDisks(i, j, color, false)).isEmpty()){
    						return true;
    					}
    				}
    			}
    		}
    		return false;
    	}
        public static GPType fromType ( GPDatatype datatype ) {
      if ( datatype instanceof GPMultiValue ) {
        return GPType . getTypeByName ( "GPMultiValue:" + datatype . toString ( ) ) ;
      }
      else {
        return GPType . getTypeByName ( "GPMultiValue:" + String . valueOf ( datatype ) ) ;
      }
    }
        public String toString(){
    		return super.toString() +  
    			"\tCFP ID: 		" + cfpID + "\n" +
    			"\tRound: 		" + round + "\n" +			
    			"\tType: 		  REJECT CFP\n";
    	}
    }
}