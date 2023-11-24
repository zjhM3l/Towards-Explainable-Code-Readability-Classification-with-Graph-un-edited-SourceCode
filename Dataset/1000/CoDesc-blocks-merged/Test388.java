class Test {
    public class Example {
    private void recenterBuffer(int index) {
            if (logger.isLoggable(Level.FINE)) {
                logger.fine("Recentering around " + index + " in " +
                    this.backingFilename);
            }
            this.wrapOrigin = index - (this.wraparoundBuffer.length / 2);
            if(this.wrapOrigin < this.prefixBuffer.length) {
                this.wrapOrigin = this.prefixBuffer.length;
            }
            this.wrapOffset = 0;
            loadBuffer();
        }
        public Integer get(int index){
            if (index<0 || index>=size()){
                throw new IndexOutOfBoundsException("Index: "+index);
            }
            return new Integer(index+from);
        }
        public static void resetHeaders ( JTable self ) {
      int rows = self . getRowCount ( ) ;
      int cols = self . getColumnCount ( ) ;
      for ( int r = 0 ;
      r < rows ;
      r ++ ) {
        self . setVerticalHeaderItem ( r , new QTableWidgetItem ( String . valueOf ( r ) ) ) ;
      }
      for ( int c = 0 ;
      c < cols ;
      c ++ ) {
        self . setHorizontalHeaderItem ( c , new QTableWidgetItem ( String . valueOf ( c ) ) ) ;
        self . setColumnWidth ( c , 40 ) ;
      }
    }
    }
}