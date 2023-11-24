class Test {
    public class Example {
    public void sessionCreated(HttpSessionEvent se) {
    		activeSessions++;
    		AuditUtil.getInstance().writeLog(
    				AuditUtil.FILE_TYPE_SESSION,
    				new StringBuffer(ACTIVE_SESSION_INCREMENTED).append(
    						activeSessions).append(DASHES).append(
    						DataUtil.getCurrentMethod()).toString(), Level.INFO);
    		G4GOriginSession.map.put(se.getSession().getId(), null);
    		AuditUtil.getInstance().writeLog(AuditUtil.FILE_TYPE_SESSION,
    				se.getSession().getId() + WITH_NOTHING_USERDTO);
    	}
        public void open(LatLng point, InfoWindowContent content) {
        addMapAttachHandlers(content);
    
        switch (content.getType()) {
          case InfoWindowContent.TYPE_ELEMENT:
            MapImpl.impl.openInfoWindow(map, point, content.getContent(),
                content.getOptions());
            break;
          case InfoWindowContent.TYPE_TABBED:
            MapImpl.impl.openInfoWindowTabs(map, point, content.getContent(),
                content.getOptions());
            break;
          case InfoWindowContent.TYPE_MAP_BLOWUP:
            MapImpl.impl.showMapBlowup(map, point, content.getOptions());
            break;
        }
      }
        public InformationModelAdapterFactory(){
      if (modelPackage == null) {
        modelPackage=InformationModelPackage.eINSTANCE;
      }
    }
    }
}