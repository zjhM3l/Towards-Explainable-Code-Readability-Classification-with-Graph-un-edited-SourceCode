class Test {
    public class Example {
    public WavBuffer(java.io.File file) throws java.io.IOException {
      if (file == null) {
        throw new java.io.IOException("Null file during ctor");
      }
      java.io.InputStream s=new java.io.BufferedInputStream(new java.io.FileInputStream(file));
      try {
        buffer=new byte[(int)file.length()];
        s.read(buffer);
        initFmt();
        initData();
      }
     catch (  java.io.IOException e1) {
        log.error("error reading file",e1);
        throw e1;
      }
     finally {
        try {
          s.close();
        }
     catch (    java.io.IOException e2) {
          log.error("Exception closing file",e2);
        }
      }
    }
        static void linkExceptions ( ExceptionList self , String customException , String dashiException ) {
      if ( customException == null ) {
        throw new IllegalArgumentException ( "customException must be set" ) ;
      }
      if ( dashiException == null ) {
        throw new IllegalArgumentException ( "dashiException must be set" ) ;
      }
      self . linkedExceptions . put ( customException , dashiException ) ;
    }
        public void waitForSuites() {
    		try {
    			while (true) {
    				//TODO set timeout
    				XmlSuite s = m_slaveAdpter.getSuite(Long.MAX_VALUE);
    				if( s== null)
    					continue;
    				log("Processing " + s.getName());
    				List<XmlSuite> suites = Lists.newArrayList();
    				suites.add(s);
    				m_testng.setXmlSuites(suites);
    				List<ISuite> suiteRunners = m_testng.runSuitesLocally();
    				ISuite sr = suiteRunners.get(0);
    				log("Done processing " + s.getName());
    				m_slaveAdpter.returnResult(sr);
    			}
    		}
    		catch(Exception ex) {
    			ex.printStackTrace(System.out);
    		}
    	}
    }
}