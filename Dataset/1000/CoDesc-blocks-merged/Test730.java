class Test {
    public class Example {
    public void markCompletelyClean(JComponent aComponent) {
    	synchronized(this) {
    		dirtyComponents.remove(aComponent);
    	}
        }
        public static boolean deleteNamespace ( Namespace self , String name , boolean ignore_errors ) {
      if ( self . hasNamespace ( name ) ) {
        System . clearProperty ( "java.naming.Context.prefix" ) ;
        return true ;
      }
      else if ( ignore_errors ) {
        return true ;
      }
      else {
        throw new IllegalStateException ( "namespace '" + name + "' does not exist" ) ;
      }
    }
        public void importRtfDocument(InputStream readerIn, RtfDocument rtfDoc) throws IOException {
    		if(readerIn == null || rtfDoc == null) return;
    		this.init(TYPE_IMPORT_FULL, rtfDoc, readerIn, this.document, null);
    		this.setCurrentDestination(RtfDestinationMgr.DESTINATION_NULL);
    		startDate = new Date();
    		startTime = System.currentTimeMillis();
    		this.groupLevel = 0;
    		try {
    			this.tokenise();
    		} catch (RuntimeException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		catch (Exception e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		endTime = System.currentTimeMillis();
    		endDate = new Date();
    	}
    }
}