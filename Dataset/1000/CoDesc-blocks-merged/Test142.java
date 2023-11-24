class Test {
    public class Example {
    public void apply() {
            // ask for the current state record
            RenderContext<?> context = DisplaySystem.getDisplaySystem()
                    .getCurrentContext();
            ClipStateRecord record = (ClipStateRecord) context
                    .getStateRecord(StateType.Clip);
            context.currentStates[StateType.Clip.ordinal()] = this;
    
            if (isEnabled()) {
                for (int i = 0; i < MAX_CLIP_PLANES; i++) {
                    enableClipPlane(i, enabledClipPlanes[i], record);
                }
            } else {
                for (int i = 0; i < MAX_CLIP_PLANES; i++) {
                    enableClipPlane(i, false, record);
                }
            }
    
            if (!record.isValid())
                record.validate();
        }
        public Boolean registerUser(String host, String user) {
        log("PV register, user: " + user + '\n');
        Boolean result = Boolean.TRUE;
        try {
          SensorBaseClient.registerUser(host, user);
        }
        catch (SensorBaseClientException e) {
          result = Boolean.FALSE;
          log("PV register: " + e.getMessage());
        }
        return result;
      }
        public static void runStep ( Map < String , Object > context ) throws Exception {
      logger . debug ( "started" ) ;
      context . assertChildKeyHasValue ( "fileWriteYaml" , "path" , getClass ( ) ) ;
      String outputPath = context . getFormattedString ( context . get ( "fileWriteYaml" ) . get ( "path" ) ) ;
      boolean isPayloadSpecified = "payload" . equals ( context . get ( "fileWriteYaml" ) . get ( "type" ) ) ;
      YAMLParser yamlParser = pypyr . yaml . getYAMLParserRoundtripForContext ( ) ;
      logger . debug ( MessageFormat . format ( "opening destination file for writing: {
    0}" , outputPath ) ) ;
        Files . createDirectories ( Paths . get ( outputPath ) ) ;
        try ( Writer outfile = Files . newBufferedWriter ( Paths . get ( outputPath ) ) ) {
          if ( isPayloadSpecified ) {
            Map < String , Object > payload = context . get ( "fileWriteYaml" ) . get ( "payload" ) ;
            Iterable < ? > formattedIterable = context . getFormattedIterable ( payload ) ;
            if ( formattedIterable != null ) {
              yamlParser . dump ( formattedIterable , outfile ) ;
            }
          }
          else {
            Iterable < ? > formattedIterable = context . getFormattedIterable ( context ) ;
            yamlParser . dump ( formattedIterable , outfile ) ;
          }
          logger . info ( MessageFormat . format ( "formatted context content and wrote to {
    0}" , outputPath ) ) ;
            logger . debug ( "done" ) ;
          }
    }
}