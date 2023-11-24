class Test {
    public class Example {
    private static List < Object > updateStep ( Step self , Sequence sequence ) {
      Object observ = sequence . getSequence ( ) ;
      Object action = sequence . getAction ( ) ;
      Object oldPolicyParams = sequence . getOldPolicyParams ( ) ;
      Object reward = sequence . getReward ( ) ;
      Object advantage = sequence . getadvantage ( ) ;
      Object length = sequence . getLength ( ) ;
      Object oldPolicy = self . getPolicyType ( new Object [ ] {
        oldPolicyParams }
        ) ;
        Object valueLoss = self . getValueLoss ( observ , reward , length ) ;
        Object valueSummary = self . getNetwork ( observ , length ) ;
        Object network = self . getNetwork ( observ , length ) ;
        Object policyLoss = self . getPolicyLoss ( oldPolicy , network . getPolicy ( ) , action , advantage , length ) ;
        Object networkLoss = network . get ( "loss" , 0.0 ) ;
        Object loss = policyLoss + valueLoss + new Double ( networkLoss ) ;
        Object [ ] gradients = ( Object [ ] ) self . getOptimizer ( ) . computeGradients ( loss ) ;
        Object [ ] variables = ( Object [ ] ) self . getOptimizer ( ) . computeVariables ( gradients ) ;
        Object optimize = self . getOptimizer ( ) . applyGradients ( gradients , variables ) ;
        Object summary = new Object [ ] {
          valueSummary , policySummary , new Double ( networkLoss ) , new Double ( avgNetworkLoss ( networkLoss ) ) , new Double ( gradientNorm ( gradients ) ) , Utility . gradientSummaries ( gradients , variables ) };
          try ( Statement stmt = Statement . parse ( optimize ) ) {
            return new ArrayList < Object > ( Arrays . asList ( valueLoss , policyLoss , summary ) ) ;
          }
          catch ( Exception e ) {
            throw new RuntimeException ( e ) ;
          }
        }
        public InputStream getStream() {
            if (stream != null) {
                return stream;
            }
            try {
                return new ByteArrayInputStream(content.getBytes("utf-8"));
            } catch (final UnsupportedEncodingException e) {
                throw new ApiException("UTF-8 encoding not supported", e);
            }
        }
        public static void makeImages ( Graph2D self ) {
      makeLayout ( ) ;
      setAgraph ( ) ;
      plotGraph ( ) ;
      plotGraph ( "reversed" , filename ) ;
      n . concatenate ( self . np . sectorializedAgents__ ) ;
      for ( int i = 0 , n = self . np . sectorializedAgents__ . length ;
      i < n ;
      i ++ ) {
        plotGraph ( "plain" , self . np . sectorializedAgents__ [ i ] , "sector{
    :02}
    .png" . format ( i ) ) ;
          plotGraph ( "reversed" , self . np . sectorializedAgents__ [ i ] , "sector{
    :02}
    R.png" . format ( i ) ) ;
            plotGraph ( "plain" , n . setdiff1d ( agents , self . np ) , "sector{
    :02}
    N.png" . format ( i ) ) ;
              plotGraph ( "reversed" , n . setdiff1d ( agents , self . np ) , "sector{
    :02}
    RN.png" . format ( i ) ) ;
              }
              plotGraph ( "plain" , new String [ 0 ] , "BLANK.png" ) ;
            }
    }
}