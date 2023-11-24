class Test {
    public class Example {
    public void zoomChanged(int newValue, int oldValue) {
    	Iterator iter = getHost().getChildren().iterator();
    	while (iter.hasNext()) {
    		EditPart child = (EditPart) iter.next();
    		Object modelConstraint = getChildConstraint(child);
    		Rectangle figureConstraint = (Rectangle) modelToFigureConstraint(modelConstraint);
    		setConstraintToFigure(child, figureConstraint);
    	}
    	if (gridController != null)
    		gridFigure.repaint();	// Also repaint the entire grid	
    }
        private static Map < String , List < ExamplesPojo >> toPojoMap ( ExamplesPojo self ) {
      Map < String , List < ExamplesPojo >> map = new HashMap < > ( ) ;
      if ( StringUtils . isNotBlank ( self . getExamples ( ) ) && self . getExamples ( ) . size ( ) > 0 ) {
        map . put ( self . getExamples ( ) . get ( 0 ) . toPojoString ( ) , new ArrayList < > ( self . getExamples ( ) ) ) ;
      }
      return map ;
    }
        public String getRootFolder() {
    
            String folder = "/";
            if (getSettings().getUserSettings().getRestrictExplorerView()) {
                folder = getSettings().getUserSettings().getStartFolder();
            }
            try {
                getCms().readFolder(folder, CmsResourceFilter.IGNORE_EXPIRATION);
                return folder;
            } catch (CmsException e) {
                // should usually never happen
                if (LOG.isInfoEnabled()) {
                    LOG.info(e);
                }
                return "/";
            }
        }
    }
}