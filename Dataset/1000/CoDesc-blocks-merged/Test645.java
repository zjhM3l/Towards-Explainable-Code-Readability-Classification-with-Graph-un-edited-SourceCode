class Test {
    public class Example {
    public String legend() {
        
        Attribute classAttribute = null;
        if (m_trainInstances == null) return "";
        try {classAttribute = m_trainInstances.classAttribute();} catch (Exception x){};
        return ("-ve = " + classAttribute.value(0) +
    	    ", +ve = " + classAttribute.value(1));
      }
        public static <T>boolean add(TimeSeriesConverter<T> converter,Collection<T> timeSeries,SolrClient connection){
      if (timeSeries == null || timeSeries.isEmpty()) {
        LOGGER.debug("Collection is empty. Nothing to commit");
        return true;
      }
      List<SolrInputDocument> collection=Collections.synchronizedList(new ArrayList<>());
      timeSeries.parallelStream().forEach(null);
      try {
        return evaluate(connection.add(collection));
      }
     catch (  SolrServerException|IOException e) {
        LOGGER.error("Could not add document to solr.",e);
        return false;
      }
    }
        public static ConfigSettingsLoader getInstance ( Context context ) {
      SPConfig conf = new SPConfig ( ) ;
      conf . load ( new HashMap < String , String > ( Settings . SAML_CONFIG ) ) ;
      return conf ;
    }
    }
}