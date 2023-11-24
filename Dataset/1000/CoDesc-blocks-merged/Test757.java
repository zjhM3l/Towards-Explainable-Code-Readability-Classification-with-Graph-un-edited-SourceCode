class Test {
    public class Example {
    private void logParameters(HttpServletRequest req) {
    		Enumeration<String> names = req.getParameterNames();
    		while (names.hasMoreElements()) {
    			String name = names.nextElement();
    			logMsg(name+": " + req.getParameter(name));
    		}		
    	}
        public AsynchOutputStream(OutputStream stream,int pipeSize){
      assert pipeSize >= 1024;
      mQueue=new ConcurrentByteQueue(pipeSize);
      if (stream == null) {
        throw new IllegalArgumentException("Stream cannot be null");
      }
      mAsynchOutput=new AsynchOutput(stream,mQueue);
      mThread=new Thread(mAsynchOutput,"AsynchOutputStream");
      mThread.setDaemon(true);
      mThread.start();
    }
        public List getKeyWords() {
            if( CACHED_KEYWORDS != null )
                return CACHED_KEYWORDS;
    
            List retList = new ArrayList();
            Iterator iter = fieldToValue.values().iterator();
            while(iter.hasNext()){
                boolean number = true;//reset
                String val = (String)iter.next();
                try{
                    new Double(val); // will trigger NFE.
                }catch(NumberFormatException e){
                    number = false;
                }
                if(!number && (val != null) && (!val.equals("")))
                    retList.add(val);
            }
            CACHED_KEYWORDS = retList;
            return retList;
        }
    }
}