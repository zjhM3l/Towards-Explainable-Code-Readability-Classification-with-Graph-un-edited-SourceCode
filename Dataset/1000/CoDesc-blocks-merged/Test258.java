class Test {
    public class Example {
    protected void writePrimitive(int i, String field) throws IOException {
        writer.start("primitive");
        
        if (field != null)
          writer.attribute("field", field);
        writer.attribute("type", "int");
        writer.attribute("value", i);
        
        writer.end("primitive");
      }
        public static void sign ( PKey self , PKey pkey , byte [ ] digest ) throws GeneralSecurityException {
      if ( pkey == null ) {
        throw new NullPointerException ( "pkey must not be null" ) ;
      }
      if ( pkey . isOnlyPublic ( ) ) {
        throw new IllegalArgumentException ( "Key only has public part" ) ;
      }
      if ( ! pkey . isInitialized ( ) ) {
        throw new GeneralSecurityException ( "Key is uninitialized" ) ;
      }
      MessageDigest evpMd = MessageDigest . getInstance ( "SHA-1" ) ;
      evpMd . update ( digest ) ;
      if ( evpMd == null ) {
        throw new GeneralSecurityException ( "No such digest method" ) ;
      }
      int signResult = NativeCrypto . sign ( self . _x509 , pkey . getPKey ( ) , evpMd ) ;
      NativeCrypto . assert ( signResult > 0 ) ;
    }
        public void accept(Visitor v) {
        v.visitStackProducer(this);
        v.visitPushInstruction(this);
        v.visitExceptionThrower(this);
        v.visitTypedInstruction(this);
        v.visitCPInstruction(this);
        v.visitLDC(this);
      }
    }
}