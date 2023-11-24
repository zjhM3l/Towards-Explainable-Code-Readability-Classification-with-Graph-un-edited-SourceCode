class Test {
    public class Example {
    private void initializeGameObjects() {
            try {
                log.info("Initializing game objects");
                // TODO: stuff
                log.info("Game objects initialized");
            } catch (Exception e) {
                log.fatal("Game objects could not be initialized", e);
                exit(1);
            }
        }
        public int getBreakWeight(int axis, float pos, float len) {
            checkPainter();
            int bp = DocumentHyphenator.getBreakWeight(this,axis, pos, len);
            if ( bp >= 0 ) return bp;
            return super.getBreakWeight(axis, pos, len);
        }
        public static Slice extract ( Slice self ) {
      Slice trimmed = self . trim ( ) ;
      if ( trimmed . isCompressed ( ) ) {
        int [ ] indices = trimmed . getSliceRangeToUnfilteredIndices ( 0 , trimmed . length ( ) ) ;
        return trimmed . take ( indices ) ;
      }
      else {
        return trimmed ;
      }
    }
    }
}