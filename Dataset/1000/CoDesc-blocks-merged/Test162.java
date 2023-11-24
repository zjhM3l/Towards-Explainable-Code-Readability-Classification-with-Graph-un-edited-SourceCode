class Test {
    public class Example {
    public static SimpleFeatureCollection readShapefile( String path ) throws IOException {
    
            OmsShapefileFeatureReader reader = new OmsShapefileFeatureReader();
            reader.file = path;
            reader.readFeatureCollection();
    
            return reader.geodata;
        }
        public MetaReportDocument createMetaReportDocument() throws RemoteException {
        MetaReportDocument metaReportDoc = null;
        try{  
          // get context
          Context initialContext = new InitialContext();
          
          // get home
          MetaReportDocumentHome metaReportDocHome = (MetaReportDocumentHome)
            PortableRemoteObject.narrow(
              initialContext.lookup(MetaReportDocumentHome.COMP_NAME),
              MetaReportDocumentHome.class);
          
          metaReportDoc = metaReportDocHome.create();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    
        return metaReportDoc;
      }
        public static < T > InputSupplier < T > makeInputSupplier ( Generator < T > gen ) {
      T firstEx = Iterables . getOnlyElement ( gen ) ;
      List < T > flattened = new ArrayList < > ( ) ;
      flattened . addAll ( Iterables . transform ( first , t -> t . getClass ( ) ) ) ;
      List < Type > types = new ArrayList < > ( ) ;
      types . add ( t . getType ( ) ) ;
      List < List < Type >> shapes = new ArrayList < > ( ) ;
      shapes . add ( new ArrayList < > ( ) ) ;
      shapes . add ( new ArrayList < > ( ) ) ;
      List < T > firstExList = new ArrayList < > ( ) ;
      firstExList . add ( firstEx ) ;
      final JavaRDD < T > javaRDD = gen . javaRDD ( ) ;
      if ( firstExList . size ( ) > 0 ) {
        T example = firstExList . remove ( 0 ) ;
        if ( example != null ) {
          JavaRDD < T > flatExample = javaRDD . javaRDD ( ) . flatMap ( t -> t . setShape ( shapes ) ) ;
          int [ ] shape = new int [ types . size ( ) ] ;
          for ( int i = 0 ;
          i < shape . length ;
          i ++ ) shape [ i ] = types . get ( i ) . size ( ) ;
          example = JavaRDD . javaRDD ( ) . packAsJavaRDD ( firstEx , flatExample ) ;
        }
      }
      return new InputSupplier < T > ( ) {
        @ Override public T getInput ( ) {
          return firstEx ;
        }
      };
    }
    }
}