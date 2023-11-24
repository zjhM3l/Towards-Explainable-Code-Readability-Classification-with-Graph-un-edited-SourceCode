class Test {
    public class Example {
    public XCriteriaSet writeCoalitions(ICoalitions source) {
    	checkNotNull(source);
    	final XCriteriaSet xCriteriaSet = write(source.getWeights());
    	if (source.getMajorityThreshold() != null) {
    	    final XValue xValue = xCriteriaSet.addNewValue();
    	    xValue.setReal(source.getMajorityThreshold().floatValue());
    	}
    	return xCriteriaSet;
        }
        public static int startTo ( Snap7 self , String ip , int tcpport ) {
      if ( tcpport != 102 ) {
        logger . info ( "setting server TCP port to " + tcpport ) ;
        self . setParam ( Snap7 . snap7types . LocalPort , tcpport ) ;
      }
      assert Pattern . matches ( ipv4 , ip ) : ip + " is invalid ipv4" ;
      logger . info ( "starting server to " + ip + ":102" ) ;
      return self . library . Srv_Start ( self . pointer , ip ) ;
    }
        protected void addCommonImages(Element parent) {
            String pid = getPortalMediator().getPortal().getId();
            File dir = new File(EventInfoAdminMediator.getImageBaseDir(pid));
    
            if (dir.exists()) {
                String[] list = dir.list();
                Element e;
    
                for (int i = 0; i < list.length; i++) {
                    e = createAndAddChildElement(parent, "CommonImage");
                    e.setAttribute("name",
                        EventInfoAdminMediator.getImageDocRoot(pid) + list[i]);
                    e.setAttribute("displayName",
                        (list[i].length() > 25) ? (list[i].substring(0, 25) +
                        "...") : list[i]);
                }
            }
        }
    }
}