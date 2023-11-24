class Test {
    public class Example {
    public static ApiResult accountSearch ( ApiResult self , String q , int limit , boolean following ) {
      Map < String , Object > params = self . generateParams ( Globals . prefs ) ;
      if ( params . get ( "following" ) == null ) {
        del ( params ) ;
      }
      return self . apiRequest ( "GET" , "/api/v1/accounts/search" , params ) ;
    }
        public WoophooMarker getSelectedMarker() {
            if (selectedElement == null || selectedElement instanceof WoophooMarker) {
                return (WoophooMarker) selectedElement;
            }
            return new WoophooMarker(selectedElement.getPoints()[0].getLat(),
                    selectedElement.getPoints()[0].getLon(),
                    selectedElement.getLabel().getLabel(),
                    null);
        }
        public void mergeSortFromTo(int from, int to) {
    	int mySize = size();
    	checkRangeFromTo(from, to, mySize);
    	
    	long[] myElements = elements();
    	cern.colt.Sorting.mergeSort(myElements, from, to+1);
    	elements(myElements);
    	setSizeRaw(mySize);
    }
    }
}