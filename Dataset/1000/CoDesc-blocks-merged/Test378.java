class Test {
    public class Example {
    public static void qteUnbindKeyApplet ( QtmacsApplet self , String applet , int keysequence ) {
      if ( applet . startsWith ( "qte." ) ) {
        QtmacsApplet appletObj = self . qteGetAppletHandle ( applet ) ;
        if ( appletObj == null ) return ;
        keysequence = QtmacsKeysequence . getKeysequence ( keysequence ) ;
        appletObj . _qteAdmin . getKeyMap ( ) . qteRemoveKey ( keysequence ) ;
        for ( Widget wid : appletObj . _qteAdmin . getWidgetList ( ) ) {
          qteUnbindKeyFromWidgetObject ( keysequence , wid ) ;
        }
      }
    }
        public static <T> CloseableIterator<T> from(final Iterator<T> iterator) {
            if(iterator instanceof CloseableIterator) {
                return (CloseableIterator<T>)iterator;
            }
    
            return new CloseableIterator<T>() {
                @Override
                public void close() {
                    // Do nothing
                }
    
                @Override
                public boolean hasNext() {
                    return iterator.hasNext();
                }
    
                @Override
                public T next() {
                    return iterator.next();
                }
    
                @Override
                public void remove() {
                    iterator.remove();
                }
            };
        }
        protected ZonePlayerAndNPCTestImpl(final String zoneName,final String... npcNames){
      super(zoneName);
      assertTrue(npcNames.length > 0);
      for (  final String npcName : npcNames) {
        this.npcNames.add(npcName);
      }
    }
    }
}