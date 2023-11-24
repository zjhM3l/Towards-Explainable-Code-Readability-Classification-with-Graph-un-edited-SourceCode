class Test {
    public class Example {
    private static BufferedImage mapFromBinaries ( ImageMap self , EOPatch eopatch , int dstShape , byte [ ] requestData ) {
      if ( self . featureName . contains ( "raster" ) ) {
        BufferedImage raster = eopatch . getBufferedImage ( self . featureType ) . getRaster ( ) . getDataBuffer ( ) . createCompatibleWritableRaster ( dstShape , self . rasterType ) . getSampleModel ( ) . getDataBuffer ( ) . setRegion ( 0 , 0 , dstShape , dstShape , dstShape ) ;
        if ( raster == null ) {
          raster = new BufferedImage ( dstShape , dstShape , self . rasterType ) . getRaster ( ) . getDataBuffer ( ) . setRegion ( 0 , 0 , dstShape , dstShape ) ;
        }
        BufferedImage newRaster = reproject ( eopatch , toBinaryMask ( requestData ) ) ;
        raster . setRGB ( newRaster != null ? newRaster . getRGB ( ) : 0 , 0 , dstShape , dstShape ) ;
        return raster ;
      }
      return null ;
    }
        public String getValueAsString() {
            NodeList nodeslist = this.value.getChildNodes();
            StringBuffer buffer = new StringBuffer();
            for (int i = 0; i<nodeslist.getLength(); i++) {
                if ((nodeslist.item(i).getNodeType()==Node.TEXT_NODE) ||
                    (nodeslist.item(i).getNodeType()==Node.CDATA_SECTION_NODE))
                {
    
                    buffer.append(nodeslist.item(i).getNodeValue());
                }
            }
    
            return buffer.toString();
        }
        public InsertBuilder generateQuestionMarks() {
    	for(int i = 0; i < insertColumns.size(); i++) {
    		values.add("?");
    	}
    	return this;
    }
    }
}