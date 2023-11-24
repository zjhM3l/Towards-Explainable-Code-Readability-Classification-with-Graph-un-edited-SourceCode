class Test {
    public class Example {
    public String getMostPopular() {
        Set<String> urlList = database.keySet();
        String bestUrl = "";
        int bestCount = 0;
        
        for (String element : urlList) {
          if (this.getCount(element) > bestCount) {
            bestUrl = element;
            bestCount = this.getCount(element);
          }
        }
        
        return bestUrl;
      }
        public String dumpPartsLists() {
    		StringBuffer sb = new StringBuffer();
    		Iterator<Map.Entry<String, MapPlace>> it = myMapPlaces.entrySet()
    				.iterator();
    		while (it.hasNext()) {
    			Map.Entry<String, MapPlace> pairs = (Map.Entry<String, MapPlace>) it
    					.next();
    			sb.append(pairs.getValue().formatPartRelations());
    		}
    		return sb.toString();
    	}
        protected void updateFromColumnModelChange(TableColumnModel oldModel) {
            if (oldModel != null) {
                oldModel.removeColumnModelListener(columnModelListener);
            }
            populatePopup();
            if (canControl()) {
                table.getColumnModel().addColumnModelListener(getColumnModelListener());
            }
        }
    }
}