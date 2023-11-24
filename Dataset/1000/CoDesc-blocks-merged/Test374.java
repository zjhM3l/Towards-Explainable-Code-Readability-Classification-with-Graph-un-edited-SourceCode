class Test {
    public class Example {
    @Override
        public Packet getNextPacket() throws IOException {
            final Object content = parseSipContent();
            if (content instanceof SDP) {
                return new SDPPacketImpl(this, (SDP)content);
            }
            return null;
        }
        public static <T>LazyQueueX<T> fromIterable(Collector<T,?,Queue<T>> collector,Iterable<T> it){
      if (it instanceof LazyQueueX)   return (LazyQueueX<T>)it;
      if (it instanceof Queue)   return new LazyQueueX<T>((Queue<T>)it,collector);
      return new LazyQueueX<T>(Flux.fromIterable(it),collector);
    }
        public static String deaccent ( String text ) {
      Normalizer norm = Normalizer . getInstance ( "NFD" ) ;
      String result = "" ;
      for ( int i = 0 ;
      i < norm . getCombiningClass ( ) . length ( ) ;
      i ++ ) {
        char ch = norm . getCombiningClass ( ) . charAt ( i ) ;
        if ( Character . isDefined ( ch ) ) {
          result += ch ;
        }
      }
      return Normalizer . normalize ( result , Normalizer . Form . NFC ) ;
    }
    }
}