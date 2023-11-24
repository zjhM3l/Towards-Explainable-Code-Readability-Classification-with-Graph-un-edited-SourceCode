class Test {
    public class Example {
    public static void usePlenaryProficiencyView ( Activity self ) {
      self . findViewById ( R . id . object_views ) . setProficiency ( PLENARY ) ;
      for ( ProviderSession session : getProviderSessions ( ) ) {
        try {
          session . usePlenaryProficiencyView ( ) ;
        }
        catch ( RemoteException e ) {
          e . printStackTrace ( ) ;
        }
      }
    }
        public static Point2D normalTo(Point2D P){
    		Point2D N = new Point2D.Double();
    		N.setLocation(P.getY(),-P.getX());
    		return N;
    	}
        public void testVersion_03_contextSC() throws Exception {
    		IContextRoot root = createContext("ctx");
    		root.setConfiguration(ORG_EVENTB_CORE_FWD, null);
    		saveRodinFileOf(root);
    		
    		runBuilder();
    		
    		ISCContextRoot scRoot = root.getSCContextRoot();
    		
    		assertEquals("attribute missing in SC context", ORG_EVENTB_CORE_FWD, scRoot.getConfiguration());
    	}
    }
}