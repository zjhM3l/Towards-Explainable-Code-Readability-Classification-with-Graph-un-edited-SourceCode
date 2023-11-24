class Test {
    public class Example {
    public static ResourceIndex risearch ( ResourceIndex self ) {
      if ( self . risearch == null ) {
        self . risearch = new ResourceIndex ( self . api . baseUrl , self . api . username , self . api . password ) ;
      }
      return self . risearch ;
    }
        public void setLocalEngineID(byte[] engineID) {
        if ((engineID == null) ||
            (engineID.length < MINLEN_ENGINE_ID) ||
            (engineID.length > MAXLEN_ENGINE_ID)) {
          throw new IllegalArgumentException("Illegal (local) engine ID");
        }
        this.localEngineID = engineID;
      }
        public String list(Collection coll, String methodToUse) {
    		Object[] array = new Object[coll.size()];
    		coll.toArray(array);
    		return list(array, methodToUse);
    	}
    }
}