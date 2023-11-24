class Test {
    public class Example {
    public String resolve(WiserFile f) {
    		// FIX
    		if (isAbsolute(f))
    			return f.getPath();
    		else
    			return "/" + f.getPath();
    	}
        public static Response head ( HttpURLConnection self , URL url , Object ... headers ) throws IOException {
      Response res = self . getResponseCode ( ) == HttpURLConnection . HTTP_OK ? self . getResponseBody ( ) : self . getResponseHeaders ( ) ;
      res . setEntity ( prepareEntity ( headers ) ) ;
      if ( res . getResponseCode ( ) == HttpURLConnection . HTTP_OK ) {
        return res ;
      }
      return null ;
    }
        public String getText(Object object) {
    		Integer labelValue = ((ForExpAst)object).getStart();
    		String label = labelValue == null ? null : labelValue.toString();
    		return label == null || label.length() == 0 ?
    			getString("_UI_ForExpAst_type") :
    			getString("_UI_ForExpAst_type") + " " + label;
    	}
    }
}