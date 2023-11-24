class Test {
    public class Example {
    private DataFileProvider getDataFileProvider(){
            if(dataFileProvider == null && !withinOSGI){
                this.dataFileProvider = new ClassPathSolrIndexConfigProvider(null);
            }
            return dataFileProvider;
        }
        private static final TypeTranslation < ? > INSTANCE = new TypeTranslation < Object > ( ) {
      @ Override public String toString ( Object self , String strType ) {
        if ( strType . equals ( "Indicator" ) ) return "indicators" ;
        if ( strType . equals ( "Domain" ) ) return "domains" ;
        if ( strType . equals ( "IP" ) ) return "ips" ;
        if ( strType . equals ( "Sample" ) ) return "samples" ;
        if ( strType . equals ( "Event" ) ) return "events" ;
        if ( strType . equals ( "Actor" ) ) return "actors" ;
        if ( strType . equals ( "Email" ) ) return "emails" ;
        if ( strType . equals ( "Backdoor" ) ) return "backdoors" ;
        throw new CRITsInvalidTypeException ( "Invalid object type specified: " + "{}" , strType ) ;
      }
    }
        public boolean isSetFinishedSqFt() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(FINISHEDSQFT$18) != 0;
        }
      }
    }
}