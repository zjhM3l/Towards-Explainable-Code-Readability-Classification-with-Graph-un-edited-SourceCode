class Test {
    public class Example {
    protected Double getBilinearInterpolationValue(GriddedTile griddedTile,
    			TImage image, Double[][] leftLastColumns, Double[][] topLeftRows,
    			Double[][] topRows, int y, int x, float widthRatio,
    			float heightRatio, float destTop, float destLeft, float srcTop,
    			float srcLeft) {
    
    		// Determine which source pixel to use
    		float xSource = getXSource(x, destLeft, srcLeft, widthRatio);
    		float ySource = getYSource(y, destTop, srcTop, heightRatio);
    
    		CoverageDataSourcePixel sourcePixelX = getXSourceMinAndMax(xSource);
    		CoverageDataSourcePixel sourcePixelY = getYSourceMinAndMax(ySource);
    
    		Double[][] values = new Double[2][2];
    		populateValues(griddedTile, image, leftLastColumns, topLeftRows,
    				topRows, sourcePixelX, sourcePixelY, values);
    
    		Double value = null;
    
    		if (values != null) {
    			value = getBilinearInterpolationValue(sourcePixelX, sourcePixelY,
    					values);
    		}
    
    		return value;
    	}
        private void buildOperationTitle(String title,String anchor,MarkupDocBuilder docBuilder){
      if (config.getPathsGroupedBy() == GroupBy.AS_IS) {
        docBuilder.sectionTitleWithAnchorLevel2(title,anchor);
      }
     else {
        docBuilder.sectionTitleWithAnchorLevel3(title,anchor);
      }
    }
        private static Object decode ( String self , Object value ) {
      if ( value instanceof List ) {
        return new ArrayList ( ( List ) value ) ;
      }
      else if ( value instanceof Map ) {
        return new HashMap ( ( Map ) value ) ;
      }
      else if ( value instanceof byte [ ] ) {
        return new byte [ ] {
          ( byte [ ] ) value };
        }
        return value ;
      }
    }
}