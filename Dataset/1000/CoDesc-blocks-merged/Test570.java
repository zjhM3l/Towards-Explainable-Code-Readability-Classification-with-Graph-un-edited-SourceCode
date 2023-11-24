class Test {
    public class Example {
    public void testReplace03() throws Exception {
            assertEquals(5, bidi.getElementCount());
            try {
                bidi.replace(0, 2, null);
                fail("NPE exception expected");
            } catch (NullPointerException e) {
            }
            /*
             // When NPE isn't thrown, the following assertion must be true
             assertEquals(3, bidi.getElementCount());
             */
        }
        protected void handleTreeCollapse(TreeEvent event) {
    		if (event.item.getData() != null) {
    			fireTreeCollapsed(new TreeExpansionEvent<ModelElement,Input>(this, event.item.getData()));
    		}
    	}
        public static void seek ( MediaPlayer self , float value ) {
      pause ( ) ;
      self . clock . setTime ( Math . max ( 0.5f , value ) ) ;
      Timber . d ( "Seeking to {
    }
     seconds;
     frame {
    }" , self . clock . getTime ( ) , self . clock . getCurrentFrame ( ) ) ;
      if ( self . audioformat ) {
        self . calculateAudioFrames ( ) ;
      }
      pause ( ) ;
    }
    }
}