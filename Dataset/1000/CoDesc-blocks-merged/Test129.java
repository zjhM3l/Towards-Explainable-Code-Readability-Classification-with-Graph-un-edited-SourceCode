class Test {
    public class Example {
    public OvhRefund order_orderId_refund_GET(Long orderId) throws IOException {
    		String qPath = "/me/order/{orderId}/refund";
    		StringBuilder sb = path(qPath, orderId);
    		String resp = exec(qPath, "GET", sb.toString(), null);
    		return convertTo(resp, OvhRefund.class);
    	}
        public void setProperties(String propertyMap) {
    		propertyMap = propertyMap.trim();
    		int startIdx = 0;//index of the start of the next pair to read
    
    		for(int i=startIdx; i<=propertyMap.length(); i++) {
    			char ch = i==propertyMap.length() ? ' ' : propertyMap.charAt(i);
    			
    			if( isQuote(ch) ) {
    				//find the next quote
    				i = propertyMap.indexOf(ch, i+1);
    			}else if( ch == ' ' ) {
    				String pair = propertyMap.substring(startIdx, i);
    				i = startIdx+pair.length();
    				startIdx = i+1;
    				
    				if( pair.trim().length() != 0 )
    					setPropertyPair(pair);
    			}
    		}
    	}
        @Pure
    	public static GeodesicPosition L93_WSG84(double x, double y) {
    		final Point2d ntfLambdaPhi = NTFLambert_NTFLambdaPhi(x, y,
    				LAMBERT_93_N,
    				LAMBERT_93_C,
    				LAMBERT_93_XS,
    				LAMBERT_93_YS);
    		return NTFLambdaPhi_WSG84(ntfLambdaPhi.getX(), ntfLambdaPhi.getY());
    	}
    }
}