class Test {
    public class Example {
    public boolean isDatasetEmpty(){
        	if (this.dataset.getSeriesCount()==0){
            	return true;
        	} else {
        		return false;
        	}
        }
        public static Map < String , String > getSpec ( ) {
      Map < String , String > spec = new HashMap < > ( ) ;
      spec . put ( "description" , ColumnPoolerRegion . class . getName ( ) ) ;
      spec . put ( "singleNodeOnly" , true ) ;
      spec . put ( "inputs" , new HashMap < > ( ) ) ;
      spec . put ( "feedforwardInput" , new HashMap < > ( "The primary feed-forward input to the layer, this is a" + " binary array containing 0's and 1's" , DataType . Real32 , 0 , true , true , regionLevel , true , isDefaultInput , requireSplitterMap ) ) ;
      spec . put ( "feedforwardGrowthCandidates" , new HashMap < > ( "An array of 0's and 1's representing feedforward input " + "that can be learned on new proximal synapses. If this " + "used." ) ) ;
      spec . put ( "singleNodeOnly" , true ) ;
      spec . put ( "inputs" , new HashMap < > ( "feedforwardInput" , new HashMap < > ( "The primary feed-forward input to the layer, this is a" + " binary array containing 0's and 1's" , DataType . Real32 , 0 , 0 , true , regionLevel , true , isDefaultInput , requireSplitterMap ) ) ;
      spec . put ( "feedforwardGrowthCandidates" , new HashMap < > ( "An array of 0's and 1's representing feedforward input " + "that can be learned on new proximal synapses. If this " + "used." ) ) ;
      spec . put ( "singleNodeOnly" , true ) ;
      spec . put ( "inputs" , new HashMap < > ( "inputs" , new HashMap < > ( "The primary feed-forward input to the layer, this is a" + " binary array containing 0's and 1's" , DataType . Real32 , 0 , 0 , true
        public static void run(){
      v=new MethodCallsOnAlloc();
      if (PTABridge.v().getPackage() == PointsToAnalysisPackage.SPARK) {
        v.runInternalSpark();
      }
     else {
        logger.error("Only SPARK supported!");
        droidsafe.main.Main.exit(1);
      }
    }
    }
}