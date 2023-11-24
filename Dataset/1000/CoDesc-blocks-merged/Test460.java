class Test {
    public class Example {
    public Number getX(int series, int item) {
            XIntervalSeries s = (XIntervalSeries) this.data.get(series);
            XIntervalDataItem di = (XIntervalDataItem) s.getDataItem(item);
            return di.getX();
        }
        public void updateAttemptsHistory(String address){
      for (  ExchangeHistoryItem item : history) {
        if (item.address.equals(address)) {
          item.attempts++;
        }
      }
    }
        private ProductMedia buildProductMedia(Map<String, Object> map) {
    		ProductMedia prd_media = new ProductMedia();
    
    		for (Map.Entry<String, Object> att : map.entrySet())
    			prd_media.set(att.getKey(), att.getValue());
    
    		if (map.get("types") != null) {
    			prd_media.setTypes(new HashSet<ProductMedia.Type>());
    			List<String> types = (List<String>) map.get("types");
    			for (String type : types)
    				prd_media.getTypes().add(
    						ProductMedia.Type.getValueOfString(type));
    		}
    
    		return prd_media;
    	}
    }
}