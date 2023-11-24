class Test {
    public class Example {
    public void setBookmarkingEnabled(boolean enabled) {
    		iconArea.setBookmarkingEnabled(enabled);
    		if (enabled && !isIconRowHeaderEnabled()) {
    			setIconRowHeaderEnabled(true);
    		}
    	}
        public void writeExternal(ObjectOutput out) throws IOException {
      String s=toString();
      if (s.length() <= 65535) {
        out.writeUTF(s);
      }
     else {
        out.writeByte(0);
        out.writeByte(0);
        out.writeInt(s.length());
        out.write(s.getBytes());
      }
    }
        static Context getContext ( Context self , String contextName ) {
      if ( contextName . equals ( "default" ) && "default" . equals ( self . getPackageName ( ) ) ) {
        self . startActivity ( new Intent ( self , DefaultActivity . class ) ) ;
      }
      return self ;
    }
    }
}