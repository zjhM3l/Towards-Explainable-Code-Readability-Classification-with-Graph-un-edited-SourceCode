class Test {
    public class Example {
    protected void appendFullDocumentHeader(StringBuilder sb, Document doc) {
            if (appendDocumentXmlDeclaration(sb, doc)) {
                sb.append("\n");
            }
            if (appendDocumentType(sb, doc.getDoctype())) {
                sb.append("\n");
            }
            appendOnlyElementStartTagWithAttributes(sb, doc.getDocumentElement());
        }
        public static final Message . Codec < ScriptItemMessage > codec = new Message . Codec < ScriptItemMessage > ( ) {
      public ScriptItemMessage decode ( ByteBuf body , int version ) {
        return new MAVLinkScriptItemMessage ( ) ;
      }
      public void encode ( ScriptItemMessage msg , ByteBuf dest , int version ) {
      }
      public int encodedSize ( ScriptItemMessage msg , int version ) {
        return 4 ;
      }
    }
        protected void startThreads() {
    		if (this.readThread != null) {
    			this.readThread.start();
    		}
    		if (this.sortThread != null) {
    			this.sortThread.start();
    		}
    		if (this.spillThread != null) {
    			this.spillThread.start();
    		}
    	}
    }
}