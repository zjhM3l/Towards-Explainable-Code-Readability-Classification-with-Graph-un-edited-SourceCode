class Test {
    public class Example {
    public boolean stopLoadingExcept( URL exemptionURL ) {
    		if ( imageUrl == null ) 
    			return false; // has never been used yet
    
    		if ( pictureStatusCode != LOADING ) {
    			Tools.log( "SourcePicture.stopLoadingExcept: called but pointless since image is not LOADING: " + imageUrl.toString());
    			return false;
    		}
    			
    		if ( ! exemptionURL.toString().equals( imageUrl.toString() ) ) {
    			Tools.log ("SourcePicture.stopLoadingExcept: called with Url " + exemptionURL.toString() + " --> stopping loading of " + imageUrl.toString() );
    			stopLoading();
    			return true;
    		} else
    			return false;
    	}
        public static void cli ( Context ctx , List < String > packages , boolean all , boolean list , boolean force , Platform platform ) {
      if ( packages != null ) {
        for ( String packageName : packages ) {
          Installer . getInstance ( packageName , platform , force ) . install ( ) ;
        }
      }
      else if ( all ) {
        packages = Resources . get ( platform ) . getPackages ( ) ;
        for ( String packageName : packages ) {
          Installer . getInstance ( packageName , platform , force ) . install ( ) ;
        }
      }
      else if ( list ) {
        Resources . get ( platform ) . listPackages ( installed , notinstalled ) ;
      }
      else {
        Toast . makeText ( ctx , ctx . getString ( R . string . help ) , Toast . LENGTH_SHORT ) . show ( ) ;
      }
    }
        public boolean resetAndStart() {
                try {
                    VMDebug.startInstructionCounting();
                    VMDebug.resetInstructionCount();
                } catch (UnsupportedOperationException uoe) {
                    return false;
                }
                return true;
            }
    }
}