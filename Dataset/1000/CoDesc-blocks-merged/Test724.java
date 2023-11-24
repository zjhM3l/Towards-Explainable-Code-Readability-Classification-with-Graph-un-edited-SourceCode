class Test {
    public class Example {
    public static void i(Object... msg){
      if (LuaViewConfig.isDebug()) {
        Log.i(DEFAULT_PREFIX,getMsg(msg));
      }
    }
        private void createNuSMVfileWithProps(Set<String> props) throws Exception {
    		as.mv.ctlList.clear();
    		as.addCtlProperties(props);
    		as.createNuSMVfile();
    	}
        public void testProcessNullActionEvent() {
            try {
                ActionController controller = new ActionController();
    
                controller.processEvent(null);
                fail("can't process null action event");
            } catch (IllegalArgumentException e) {
                ok(); // pass
            }
        }
    }
}