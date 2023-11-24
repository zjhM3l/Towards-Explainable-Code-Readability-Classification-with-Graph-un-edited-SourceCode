class Test {
    public class Example {
    public String getWidgetAdapterId() {
    		if (null != adapterId)
    			return adapterId;
    		Container parent= getParent();
    		if (null != parent)
    			return parent.getWidgetAdapterId();
    		return null;
    	}
        private void swapFiles() {
    	int oldPart = part;
    	part++;
    	Log.d(TAG, "Swapping media files. old=" + buildFileName(oldPart)
    		+ ", new=" + buildFileName(part));
    	prepareRecorder(MEDIA_DURATION, buildFileName(part));
    	recorder.start();
    	uploadFile(oldPart);
        }
        public void testGetDefaultProperties() {
    		
    		BugkillaProperties testProps0 = BugkillaProperties.getInstance(DEFAULT_PROPERTIES);
    		assertTrue(
    			"/metatdata/bugkilla.properties was not loaded  by getInstance(DEFAULT_PROPERITES)!",
    			testProps0 instanceof BugkillaProperties);
    
    		BugkillaProperties testProps1 = BugkillaProperties.getInstance(null);
    		assertTrue(
    			"/metatdata/bugkilla.properties was not loaded correctly by getInstance(null)!",
    			testProps1 instanceof BugkillaProperties);
    	}
    }
}