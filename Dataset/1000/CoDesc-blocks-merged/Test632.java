class Test {
    public class Example {
    private void executeSession() {
    		ProjectLayout layout = getVerifyProject().getLayout();
    		File srcDir = layout.getSrcDir();
    		File shellScript = layout.getShellScript();
    
    		if (!srcDir.exists()) {
    			throw new RuntimeException(
    					"unable to find src directory for the compilation part of tar verification at"
    							+ srcDir.getAbsolutePath());
    		}
    		ScriptSession session = new ScriptSession(shellScript);
    		ThrowingListener listener = new ThrowingListener(shellScript);
    		session.addCommand("retrieve", listener, null);
    		session.addCommand("compile", listener, null);
    		session.addCommand("archive", listener, null);
    		session.addCommand("test", listener, null);
    		session.execute();
    	}
        private int getBaseInteger(String key) {
        	Integer i=(Integer)getUnmodifiedValue(key);
        	if (i==null) return 0;
            return i.intValue();
        }
        public static final MenuMediator instance(){
      if (INSTANCE == null) {
        INSTANCE=new MenuMediator();
      }
      return INSTANCE;
    }
    }
}