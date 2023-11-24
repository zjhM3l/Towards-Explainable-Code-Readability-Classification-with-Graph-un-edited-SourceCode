class Test {
    public class Example {
    public void unlockUI (ProcessInfo pi){
    		//System.out.println("UnLockUI*************************************************************************");
    		setBusy(false);
    		if(m_needReport)
    		   f_checkout.reportAfterProcess();
    	}
        public static void beforeCall(URL url,Request request){
      String uri=url.getUri();
      onBeforeCall(getServiceStat(uri));
      onBeforeCall(getMethodStat(uri,request.getMethodName(),request.getParamtersDesc()));
    }
        public void setImage(String s) {
    		try {
    			if (i != null) {
    				i.flush();
    			}
    			i = readImageFile(s);
    			if (i == null) {
    				return;
    			}
    			iheight = height = i.getHeight(this);
    			iwidth = width = i.getWidth(this);
    			repaint();
    		} catch (IOException IOE) {
    			i = null;
    		}
    	}
    }
}