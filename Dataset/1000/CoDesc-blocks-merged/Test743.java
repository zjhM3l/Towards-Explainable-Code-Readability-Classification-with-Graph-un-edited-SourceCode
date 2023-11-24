class Test {
    public class Example {
    public static boolean acquire ( LockInfo self , Boolean waitflag ) {
      if ( waitflag == null || waitflag ) {
        self . lockedStatus = true ;
        return true ;
      }
      else {
        if ( ! self . lockedStatus ) {
          self . lockedStatus = true ;
          return true ;
        }
        else {
          return false ;
        }
      }
    }
        public static User requireAuth ( Request request , boolean exceptions ) throws NotAuthorizedException {
      if ( request == null || request . user == null ) {
        if ( exceptions ) {
          throw new NotAuthorizedException ( ) ;
        }
        return null ;
      }
      return request . user ;
    }
        private JMenu getRenderedLayersMenu() {
    		if (renderedLayerMenu == null) {
    			renderedLayerMenu = new JMenu();
    			renderedLayerMenu.setText("Rendered Layers");
    
    			for (int i = 0; i < getNumLayers(); i++) {
    				renderedLayerMenu.add(getRenderedLayersMenuItems(i));
    			}
    		}
    		return renderedLayerMenu;
    	}
    }
}