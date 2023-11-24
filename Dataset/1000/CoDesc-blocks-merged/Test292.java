class Test {
    public class Example {
    public static < T > void replaceNamespaceEvent ( T self , String name , String namespace , String body , AsyncCallback < T > cb ) {
      cb . onSuccess ( new AsyncCallback < T > ( ) {
        @ Override public void onFailure ( Throwable caught ) {
          if ( caught instanceof AsyncRequestException ) {
            ( ( AsyncRequestException ) caught ) . setReturnHttpDataOnly ( true ) ;
          }
          else {
            ( ( AsyncCallback < T > ) cb ) . onFailure ( caught ) ;
          }
        }
        @ Override public T onSuccess ( T data ) {
          return data ;
        }
      }
      ) ;
    }
        public static List < Problem > validate ( IProblem self , List < Problem > data , boolean expectHeaderRow , int ignoreLines , boolean summarize , int limit , IContext context , boolean reportUnexpectedExceptions ) throws CoreException {
      List < Problem > problems = Lists . newArrayList ( ) ;
      List < Problem > problemGenerator = ivalidate ( data , expectHeaderRow , ignoreLines , summarize , context , reportUnexpectedExceptions ) ;
      for ( int i = 0 , n = problemGenerator . size ( ) ;
      i < n ;
      i ++ ) {
        Problem p = problemGenerator . get ( i ) ;
        if ( limit == 0 || i < limit ) problems . add ( p ) ;
      }
      return problems ;
    }
        public void importCertificate(String alias, InputStream caReply) {
    		try {
    			CertificateFactory cf = CertificateFactory.getInstance("X509");
    			// collect the certificate elements into a list
    			Certificate cert = cf.generateCertificate(caReply);				
    			keystore.setCertificateEntry(alias, cert);
    		} catch (Exception ex) {
    			throw new KeystoreFault(ex);
    		}
    	}
    }
}