class Test {
    public class Example {
    protected void handleBoundsChange(PropertyChangeEvent evt) {
    		JGComponentElementFigure componentFigure = (JGComponentElementFigure) getFigure();
    		Rectangle constraint = (Rectangle) evt.getNewValue();
    		JGContainerElementPart parent = (JGContainerElementPart) getParent();
    		parent.setLayoutConstraint(this, componentFigure, constraint);
    	}
        private static synchronized void getJettyWebappClient ( ) {
      synchronized ( JettyWebappClient . class ) {
        if ( jetty != null ) {
          return ;
        }
        java . util . Properties props = new java . util . Properties ( ) ;
        props . put ( "http.server.jetty80" , "localhost" ) ;
        JettyWebappClient . setSslContext ( new SslContext ( ) ) ;
        JettyWebappClient . setSslAdapter ( new JettyWebappAdapter ( ) ) ;
        JettyWebappClient . setSslHandler ( new JettyWebappAdapter ( ) ) ;
      }
    }
        private String iniToString( IniFile ini ) {
            
            // declare and initialise
            StringBuilder builder = new StringBuilder();
    
            //**********************************************************************
            // Loop through all the sections and append section to ini file
            //**********************************************************************
            
            int size = ini.getNumberOfSections();
            
            for( int i=0; i<size; i++ ) {
                IniSection section = ini.getSection(i);
                
                builder.append( sectionToString(section) );
                builder.append( IniUtilities.NEW_LINE );
            }
            
            // return text
            return builder.toString();
        }
    }
}