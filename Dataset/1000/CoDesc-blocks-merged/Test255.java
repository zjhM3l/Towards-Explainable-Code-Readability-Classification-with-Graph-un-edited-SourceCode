class Test {
    public class Example {
    public static boolean checkArgs ( Args args ) throws ProgramException {
      for ( String suffix : new String [ ] {
        ".tped" , ".tfam" }
        ) {
          String fileName = args . getTFile ( ) + suffix ;
          if ( ! new File ( fileName ) . isFile ( ) ) {
            String msg = "" + fileName + ": no such file" ;
            throw new ProgramException ( msg ) ;
          }
        }
        return true ;
      }
        public String getMediaUsageWithUnit() {
            NumberFormat nf = new DecimalFormat();
            nf.setGroupingUsed( true );
            if ( mediaUsage >= GBYTE ){
                return nf.format(mediaUsage/MBYTE)+" GB";//##,### GByte
            } else if ( mediaUsage > MBYTE ) {
                return nf.format(mediaUsage/1000L)+" MB";
            } else {
                return nf.format(mediaUsage)+" KB";
            }
        }
        private void expandCapacity(int minimumCapacity) {
    	int newCapacity = (value.length + 1) * 2;
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
            } else if (minimumCapacity > newCapacity) {
    	    newCapacity = minimumCapacity;
    	}
    
    	char newValue[] = new char[newCapacity];
    	System.arraycopy(value, 0, newValue, 0, count);
    	value = newValue;
    	shared = false;
        }
    }
}