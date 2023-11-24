class Test {
    public class Example {
    public LogHistory filterByAddress(String str, boolean flagAccept) {
            return (LogHistory) (HistoryLib.filterByField(this, 
                                    LogHistoryEventWrapper.KEY_ADDRESS, 
                                    str, 
                                    flagAccept,
                                    new LogHistory())
            );
        } // of method
        public static CharSequence getAt(CharSequence text, Range range) {
            RangeInfo info = subListBorders(text.length(), range);
            CharSequence sequence = text.subSequence(info.from, info.to);
            return info.reverse ? reverse(sequence) : sequence;
        }
        public static Wmd getwd ( Wmd self , String path ) {
      path = self . formatPath ( path ) ;
      for ( Iterator iwd = self . _wmd . entrySet ( ) . iterator ( ) ;
      iwd . hasNext ( ) ;
      ) {
        Entry entry = ( Entry ) iwd . next ( ) ;
        if ( entry . getValue ( ) . getPath ( ) . equals ( path ) ) {
          return ( Wmd ) entry . getKey ( ) ;
        }
      }
      return null ;
    }
    }
}