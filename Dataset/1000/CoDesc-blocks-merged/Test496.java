class Test {
    public class Example {
    public static CommitInfo commit ( String name , @ NotNull String commitMessage ) {
      CommitInfo ret = new CommitInfo ( ) ;
      ret . name = name ;
      ret . changes = new HashMap < > ( ) ;
      ret . result = true ;
      ret . comment = "" ;
      ret . changes = __Gson__ . toJson ( ret ) ;
      return ret ;
    }
        private static VariantStats strelkVariantStats ( Variant variant , SampleInfo sampleInfo ) {
      if ( variant . isDeletion ( ) || variant . isInsertion ( ) ) {
        int refDepth = Integer . parseInt ( sampleInfo . getTAR ( ) . get ( 0 ) ) ;
        int altDepth = Integer . parseInt ( sampleInfo . getTIR ( ) . get ( 0 ) ) ;
        int depth = refDepth + altDepth ;
        if ( depth > 0 ) {
          int refDepth = Integer . parseInt ( sampleInfo . getRef ( variant . getRef ( ) + "U" ) . get ( 0 ) ) ;
          int altDepth = Integer . parseInt ( sampleInfo . getAlt ( variant . getAlt ( ) + "U" ) . get ( 0 ) ) ;
          depth = altDepth + refDepth ;
        }
        if ( depth > 0 ) {
          double vaf = ( double ) altDepth / depth ;
          if ( vaf < 0 ) {
            vaf = 0 ;
          }
          return new VariantStats ( depth , altDepth , variantAlleleFrequency ( vaf ) ) ;
        }
      }
      return null ;
    }
        protected void disableCollaboration(String reason) {
    		recentStatusMode = this.getStatus();
    		sendPresence(Presence.Type.unavailable, reason, 10, Presence.Mode.dnd);
    		//trigger an event on the im controller, to update the status icon
    		ClientManager.getInstance().sendPresenceEvent(Presence.Type.available, username);
    		collaborationDisabled = true;
    	}
    }
}