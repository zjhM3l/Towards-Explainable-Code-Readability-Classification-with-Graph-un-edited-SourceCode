class Test {
    public class Example {
    public static < T > List < List < T >> batsorted ( List < T > referer , List < ? extends List < ? extends T >> ... lists ) {
      if ( ( "reverse" . equals ( reverse ) ) || ( "reverse" . equals ( reverse ) ) ) reverse = true ;
      else reverse = false ;
      int length = referer . size ( ) ;
      List < Integer > indexes = Arrays . asList ( new Integer [ ] {
        0 , 1 }
        ) ;
        List < List < T >> rslt = sortedReferTo ( indexes , referer , reverse ) ;
        referer = rslt . get ( 0 ) ;
        indexes = rslt . subList ( 1 , indexes . size ( ) ) ;
        rslt = new ArrayList < List < T >> ( ) ;
        lists = new ArrayList < List < ? extends T >> ( Arrays . asList ( lists ) ) ;
        for ( int i = 0 ;
        i != lists . length ;
        i ++ ) {
          List < ? extends T > l = lists [ i ] ;
          List < T > nl = new ArrayList < T > ( ) ;
          for ( int j = 0 ;
          j != length ;
          j ++ ) {
            int loc = indexes . get ( j ) ;
            nl . add ( l . get ( loc ) ) ;
          }
          rslt . add ( nl ) ;
        }
        return ( Collections . unmodifiableList ( rslt ) ) ;
      }
        protected void prepareData(int version,RequestParameters params,boolean withId,Representation rep,boolean withRep) throws WebApplicationException {
      if (withId) {
        params.validateId();
      }
      params.validateETag();
      params.validateParameters();
      params.setVersion(version);
      params.update();
      if (withRep) {
        if (rep == null) {
          throw WebException.badRequest().message(CommonParams.ERROR_MISSING_CONTENT).build();
        }
        rep.validateContent();
        rep.setVersion(new Integer(version));
        rep.update();
      }
    }
        protected void fireBoxSelectionListenerBoxSelected(BoxSelectionEvent event) {
            if (listenerList == null) {
                return;
            }
            Object[] listeners = listenerList.getListenerList();
            for (int i = listeners.length - 2; i >= 0; i -= 2) {
                if (listeners[i] == org.das2.event.BoxSelectionListener.class) {
                    ((org.das2.event.BoxSelectionListener) listeners[i + 1]).BoxSelected(event);
                }
            }
        }
    }
}