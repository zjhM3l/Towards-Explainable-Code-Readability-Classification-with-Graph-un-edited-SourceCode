class Test {
    public class Example {
    public void addPartialRetractionIn(PartialRetractionInType param){
                                       if (localPartialRetractionIn == null){
                                       localPartialRetractionIn = new PartialRetractionInType[]{};
                                       }
    
                                
                                     //update the setting tracker
                                    localPartialRetractionInTracker = true;
                                
    
                                   java.util.List list =
                                org.apache.axis2.databinding.utils.ConverterUtil.toList(localPartialRetractionIn);
                                   list.add(param);
                                   this.localPartialRetractionIn =
                                 (PartialRetractionInType[])list.toArray(
                                new PartialRetractionInType[list.size()]);
    
                                 }
        public int getNumbOfPoints() {
    		synchronized (lockUpObj) {
    			return xyPointV.size();
    		}
    	}
        private void initialize() {
    		this.setSize(309, 281);
    		this.setLayout(new BorderLayout());
    		this.add(getNorthPanel(), BorderLayout.NORTH);
    		this.add(getCenterComponent(), BorderLayout.CENTER);
    	}
    }
}