class Test {
    public class Example {
    protected void writeCentralDirectoryEnd() throws IOException {
      writeOut(EOCD_SIG.getBytes());
      writeOut(ZERO);
      writeOut(ZERO);
      byte[] num=(new ZipShort(entries.size())).getBytes();
      writeOut(num);
      writeOut(num);
      writeOut(cdLength.getBytes());
      writeOut(cdOffset.getBytes());
      byte[] data=getBytes(comment);
      writeOut((new ZipShort(data.length)).getBytes());
      writeOut(data);
    }
        public <T>T notNull(T reference,Object errorMessage){
      if (reference == null) {
        throw new NullPointerException(String.valueOf(errorMessage));
      }
      return reference;
    }
        public void setDigits ( final int digits ) {
          if ( frozen ) {
             return;
          }
    
          final int old = getDigits (  );
          this.digits = digits;
          pcs.firePropertyChange ( "digits", old, getDigits (  ) );
       }
    }
}