class Test {
    public class Example {
    public void add(PostalAddress postal) {
            if (postal != null) {
                postalAddress.add(postal);
                update();
            }
        }
        @OperationsPerInvocation(SIZE)
    	@Benchmark
    	public int arrayList_get() {
    		int sum = 0;
    		for (int i = 0; i < SIZE; ++i) {
    			sum += arrayList.get(i);
    		}
    		return sum;
    	}
        private void doHighlight(String colorMode) throws WidgetException {
    		if (!(getGUIDriver() instanceof HighlightProvider)) {
    			return;
    		}
    		HighlightProvider highDriver = (HighlightProvider) getGUIDriver();
    
    		if (highDriver.isHighlight()) {
    			setBackgroundColor(highDriver.getHighlightColor(colorMode));
    		}
    	}
    }
}