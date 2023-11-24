class Test {
    public class Example {
    protected void fireHooksChanged() {
    		// Guaranteed to return a non-null array
    		Object[] listeners = _listeners.getListenerList();
    		// Process the listeners last to first, notifying
    		// those that are interested in this event
    		for (int i = listeners.length - 2; i >= 0; i -= 2) {
    			if (listeners[i] == IScriptListener.class) {
    				((IScriptListener) listeners[i + 1]).hooksChanged();
    			}
    		}
    	}
        public static Map < String , Double > getScore ( Tag self , List < Term > terms ) {
      assert terms . isEmpty ( ) || terms . size ( ) == 0 ;
      double [ ] scoreLil = new double [ terms . size ( ) ] ;
      for ( int i = 0 ;
      i < terms . size ( ) ;
      i ++ ) {
        scoreLil [ i ] = getScore ( terms . get ( i ) ) ;
      }
      double s_pos = Math . abs ( scoreLil [ scoreLil . length - 1 ] ) ;
      double s_neg = - Math . abs ( scoreLil [ scoreLil . length - 1 ] ) ;
      double s_pol = ( s_pos - s_neg ) * 1.0 / ( ( s_pos + s_neg ) + Constants . EPSILON ) ;
      double s_sub = ( s_pos + s_neg ) * 1.0 / ( scoreLil . length + Constants . EPSILON ) ;
      return new HashMap < String , Double > ( ) {
        {
          put ( Constants . TAG_POS , s_pos ) ;
          put ( Constants . TAG_NEG , s_neg ) ;
          put ( Constants . TAG_POL , s_pol ) ;
          put ( Constants . TAG_SUB , s_sub ) ;
        }
      };
    }
        public void testSealedObject1() throws Exception {
            String secret = "secret string";
            try {
                new SealedObject(secret, null);
                fail("NullPointerException should be thrown in the case "
                        + "of null cipher.");
            } catch (NullPointerException e) {
            }
        }
    }
}