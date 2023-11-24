class Test {
    public class Example {
    public String getTipoAsString() {
    		if (this.getTipo()==-1) {
    			return null;
    		}
    		return DadosBasicosDeManutencaoDeObraArtisticaTipoValues.values[this.getTipo()];
    	}
        public static URI createRestURI(
                final String matrixId, final int row, final int col,
                final WMTSLayerParam layerParam) throws URISyntaxException {
            String path = layerParam.baseURL;
            if (layerParam.dimensions != null) {
                for (int i = 0; i < layerParam.dimensions.length; i++) {
                    String dimension = layerParam.dimensions[i];
                    String value = layerParam.dimensionParams.optString(dimension);
                    if (value == null) {
                        value = layerParam.dimensionParams.getString(dimension.toUpperCase());
                    }
                    path = path.replace("{" + dimension + "}", value);
                }
            }
            path = path.replace("{TileMatrixSet}", layerParam.matrixSet);
            path = path.replace("{TileMatrix}", matrixId);
            path = path.replace("{TileRow}", String.valueOf(row));
            path = path.replace("{TileCol}", String.valueOf(col));
            path = path.replace("{style}", layerParam.style);
            path = path.replace("{Layer}", layerParam.layer);
    
            return new URI(path);
        }
        public static List < Site > findObservatories ( Site self , String match ) throws Exception {
      String url = Constants . URL_PREFIX + "/gwf.json" ;
      HttpURLConnection connection = ( HttpURLConnection ) self . getHttpURLConnection ( ) ;
      List < Site > sitelist = Collections . synchronizedList ( new HashSet < Site > ( decode ( connection . getInputStream ( ) ) ) ) ;
      if ( match != null ) {
        Pattern regPattern = Pattern . compile ( match ) ;
        sitelist = new ArrayList < Site > ( sitelist ) ;
        for ( Site site : sitelist ) {
          if ( regPattern . matcher ( site . getName ( ) ) . matches ( ) ) {
            sitelist . add ( site ) ;
          }
        }
      }
      return sitelist ;
    }
    }
}