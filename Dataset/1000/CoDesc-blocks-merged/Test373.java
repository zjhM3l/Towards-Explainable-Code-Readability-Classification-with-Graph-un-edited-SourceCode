class Test {
    public class Example {
    public void testPropertyLoading() throws Exception {
      pm.loadProperties();
      TungstenProperties tp=pm.getProperties();
      assertTrue("Property file must contain some properties",tp.size() > 0);
    }
        public Field setField( String sourceField ) throws InvalidFieldException {
            try {
                Node tempParent = VRML97.NodeFactory( getNodeName() );
                tempParent.setParent( getScene() );
                TokenData newTokenData = new TokenData( sourceField, tempParent, null );
                return( setField( newTokenData ));
            } catch ( InvalidFieldException e ) {
                throw e;
            } catch ( Exception e ) {
                e.printStackTrace();
                return( null );
            }
        }
        public static BuildResult createWorkerBuild ( WorkerBuild self , @ Nonnull Map < String , String > additionalProperties ) throws OsbsValidationException {
      Set < String > missing = new HashSet < > ( ) ;
      for ( String required : ( String [ ] ) additionalProperties . keySet ( ) ) {
        if ( ! additionalProperties . containsKey ( required ) ) {
          missing . add ( required ) ;
        }
      }
      if ( missing . size ( ) > 0 ) {
        throw new IllegalArgumentException ( "Worker build missing required parameters: " + missing ) ;
      }
      if ( additionalProperties . keySet ( ) . contains ( "platforms" ) ) {
        throw new IllegalArgumentException ( "Worker build called with unwanted platforms param" ) ;
      }
      String arrangementVersion = additionalProperties . get ( "arrangementVersion" ) ;
      additionalProperties . put ( "innerTemplate" , WORKER_INNER_TEMPLATE . replace ( "arrangementVersion" , arrangementVersion ) ) ;
      additionalProperties . put ( "outerTemplate" , WORKER_OUTER_TEMPLATE . replace ( "customConf" , WORKER_CUSTOMIZE_CONF ) ) ;
      additionalProperties . put ( "buildType" , BUILD_TYPE_WORKER ) ;
      try {
        return doCreateProdBuild ( additionalProperties ) ;
      }
      catch ( IOException ex ) {
        if ( new File ( additionalProperties . get ( "innerTemplate" ) ) . exists ( ) ) {
          throw new OsbsValidationException ( "worker invalid arrangementVersion " + arrangementVersion , ex ) ;
        }
        throw new OsbsValidationException ( "worker build called with unwanted platforms param" ) ;
      }
    }
    }
}