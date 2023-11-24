class Test {
    public class Example {
    public static RegressionModel fromYaml ( String yamlStr , String strOrBuffer ) {
      YamlConfiguration cfg = Yaml . load ( yamlStr , strOrBuffer ) ;
      RegressionModel model = new RegressionModel ( cfg . getFitFilters ( ) , cfg . getPredictFilters ( ) , cfg . getModelExpression ( ) , YTRANSFORM_MAPPING . get ( cfg . getYTransform ( ) ) , cfg . getName ( ) ) ;
      if ( StringUtils . isNotBlank ( cfg . getFitParameters ( ) ) && cfg . getFitParameters ( ) . length > 0 ) {
        Map < String , String > fitParameters = new HashMap < > ( cfg . getFitParameters ( ) ) ;
        fitParameters . put ( "rsquared" , cfg . getFitRsquared ( ) ) ;
        fitParameters . put ( "rsquared_adj" , cfg . getFitRsquared_adj ( ) ) ;
        model . setModelFit ( new FakeRegressionResults ( model . getStrModelExpression ( ) , fitParameters , cfg . getFitRsquared ( ) , cfg . getFitRsquared_adj ( ) ) ) ;
        model . setFitParameters ( fitParameters ) ;
      }
      logger . debug ( "loaded regression model {
    }
     from YAML" , model . getName ( ) ) ;
      return model ;
    }
        public void flush() throws IOException {
            IOException e = null;
    
            super.flush();
            for (int i = 0; i < teeOut.length; i++) {
                try {
                    teeOut[i].flush();
                }
                catch (IOException ioe) {
                    log.error("Unexpected I/O exception: " + ioe.getMessage(), ioe);
                    e = ioe;
                }
            }
            if (e != null)
                throw e;
        }
        public StoreConfig cloneConfig() {
            try {
                return (StoreConfig) clone();
            } catch (CloneNotSupportedException cannotHappen) {
                return null;
            }
        }
    }
}