class Test {
    public class Example {
    private void alert(final String message) {
                
                UiApplication.getUiApplication().invokeLater(new Runnable() {
                    
                    public void run() {
                    
                        Dialog.ask(Dialog.D_OK, message);
                        
                        //Calling invalidate() on your screen forces the paint
                        //method to be called.
                        //appScreen.invalidate();
                    }
                });
            }
        public boolean doVerify(boolean atend) {
    	if (! verify) return false;
    	return ('1' == VERIFYFLAGS.charAt((testinsert?4:0)+
    					  (!isProject?2:0)+
    					  (atend?1:0)));
        }
        public void reset() {
    		this.currentTick = 0;
    		
    		this.setPaused(false);
    	}
    }
}