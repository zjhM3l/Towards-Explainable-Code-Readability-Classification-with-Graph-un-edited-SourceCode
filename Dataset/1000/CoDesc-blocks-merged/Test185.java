class Test {
    public class Example {
    public void showSelected() {
    		if (this.getFigure().getBorder() == null) {
    			showSelected = true;
    			BoundsRefreshment.refreshBounds(this, this.getSize().width + 2,
    					this.getSize().height + 4);
    			RoundedRectangleBorder border = new RoundedRectangleBorder(10, 10);
    			border.setWidth(2);
    			border.setColor(ColorConstants.orange);
    			this.getFigure().setBorder(border);
    			this.getFigure().repaint();
    		}
    	}
        public static String prettyRelativePath ( String path , String start ) {
      String relpath = path . substring ( start . length ( ) ) ;
      if ( relpath . startsWith ( ".." ) ) {
        return path ;
      }
      return relpath ;
    }
        private static boolean createServiceNwk ( DCNkServiceContext self , int tenantId , String tenantDomain , String direc ) {
      Map < String , Object > netMap = retrieveDcnmNetInfo ( tenantId , direc ) ;
      net = Utils . map2Obj ( netMap ) ;
      Map < String , Object > subnetMap = retrieveDcnmSubnetInfo ( tenantId , direc ) ;
      subnet = Utils . map2Obj ( subnetMap ) ;
      try {
        self . getDcnmBean ( ) . createServiceNetwork ( tenantDomain , net , subnet ) ;
      }
      catch ( DexException e ) {
        LOG . error ( "Failed to create network in DCNM " + direc , e ) ;
        return false ;
      }
      return true ;
    }
    }
}