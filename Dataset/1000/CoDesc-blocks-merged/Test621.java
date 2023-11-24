class Test {
    public class Example {
    protected void resetContainers(final boolean resetToEmpty){
      if (resetToEmpty) {
        compData.resetComponents(ATotalCount + FfieldCount,pageCount,false);
      }
     else {
        compData.resetComponents(ATotalCount + FfieldCount,pageCount,true);
      }
      if (formFactory == null) {
        formFactory=formCreator.createFormFactory();
        formFactory.reset(this.getFormResources(),formsActionHandler,pageData,currentPdfFile);
      }
     else {
        formFactory.reset(this.getFormResources(),formsActionHandler,pageData,currentPdfFile);
      }
    }
        public static double xcorr ( double [ ] x1 , double [ ] x2 , int Nlags ) {
      int K = 2 * ( int ) Math . floor ( x1 . length / 2 ) ;
      double [ ] X1 = FFT . fft ( x1 , K ) ;
      double [ ] X2 = FFT . fft ( x2 , K ) ;
      double E1 = sum ( Math . abs ( x1 [ 0 ] ) * Math . abs ( x2 [ 0 ] ) ) ;
      double E2 = sum ( Math . abs ( x2 [ 0 ] ) * Math . abs ( x1 [ 0 ] ) ) ;
      double [ ] r12 = new double [ K ] ;
      r12 [ 0 ] = X1 [ 0 ] * Math . conj ( X2 [ 0 ] ) / Math . sqrt ( E1 * E2 ) ;
      int [ ] k = new int [ K ] ;
      k [ 0 ] = ( int ) Math . floor ( K / 2 ) ;
      r12 = FFT . fftshift ( r12 ) ;
      int idx = Arrays . binarySearch ( Arrays . copyOf ( k , K ) , 0 , Nlags ) ;
      return r12 [ idx ] ;
    }
        public static Iterator < CommandHistory > listCommandHistory ( CommandRepository self , String command , String start , String stop , int pageSize , boolean descending ) {
      Map < String , Object > params = new HashMap < > ( ) ;
      params . put ( "order" , descending ? "desc" : "asc" ) ;
      if ( pageSize != 0 ) params . put ( "limit" , pageSize ) ;
      if ( start != null ) params . put ( "start" , toIsoString ( start ) ) ;
      if ( stop != null ) params . put ( "stop" , toIsoString ( stop ) ) ;
      if ( command != null ) {
        String path = "/archive/{
    }
    /commands{
    }" . format ( self . _instance , command ) ;
        if ( command . length ( ) > 0 ) path = "/archive/{
    }
    /commands" . format ( self . _instance ) ;
        return pagination . iterator ( ) . withClient ( self . _client ) . withPath ( path ) . withParams ( params ) . withResponseClass ( RestApiConstants . ListCommandsResponse . class ) . withItemsKey ( "entry" ) . withItemMapper ( CommandHistory . class ) . build ( ) ;
      }
      return pagination . iterator ( ) . withClient ( self . _client ) . withPath ( path ) . withParams ( params ) . withResponseClass ( RestApiConstants . ListCommandsResponse . class ) . withItemsKey ( "entry" ) . withItemMapper ( CommandHistory . class ) . build ( ) ;
    }
    }
}