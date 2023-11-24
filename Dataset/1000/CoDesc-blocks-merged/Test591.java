class Test {
    public class Example {
    protected void finalize(){
    		try{
    //			CyberoamLogger.connectionPoolLog.debug("finalize CLOSING THE CONNECTION RSW: " + createTime);
    			this.closeAll();			
    		}catch(Exception e){
    		}
    	}
        public void saveData() {
    	CvsData.setRootString( EXPERT_MODE,
    //			(new Boolean(getcbExpertMode().isSelected())).toString());
    			getcbExpertMode().isSelected() ? "True" : "False");
    
    	CvsData.setRootString( USING_SSH, 
    			String.valueOf(getSshAutenticate().isSelected()));
    
    	CvsData.setRootString( SSH_IDENTITY, getidentityFileName().getText());
    
    	CvsData.setRootString( BROKEN_NT_CVS, 
    			String.valueOf(getcbUsingBrokenNtServer().isSelected()));
    	
    	try {
    		CvsData.commit();
    	} catch (Exception e) {
    		handleException(e);
    	}
    	DialogClosed();
    }
        public Object getFormVar(String key) {
    		if (data.containsKey(key)) {
    			return data.get(key);
    		} else {
    			return null;
    		}
    	}
    }
}