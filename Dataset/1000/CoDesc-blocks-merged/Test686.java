class Test {
    public class Example {
    public void setReturnCodes(ErrorCode[] param){
                                  
                                       validateReturnCodes(param);
    
                                   
                                              if (param != null){
                                                 //update the setting tracker
                                                 localReturnCodesTracker = true;
                                              } else {
                                                 localReturnCodesTracker = false;
                                                     
                                              }
                                          
                                          this.localReturnCodes=param;
                                  }
        public Vector sortBySize(Vector v){
    	Object[] fileListArray = v.toArray();           
    	Arrays.sort(fileListArray, new SizeComparator());
    	Vector sortedVector = new Vector(v.capacity());
    	for(int x=0; x<fileListArray.length; x++){
    	    sortedVector.add((FileAttributes)fileListArray[x]);
    	}
    	return sortedVector;
        }
        protected String quoteForSQL (String str) {
            StringBuffer result = new StringBuffer();
            for (int i=0; i < str.length(); i++) {
                if (str.charAt(i)=='\'') {
                    result.append("''");
                } else {
                    result.append(str.charAt(i));
                }
            }
            return result.toString();
        }
    }
}