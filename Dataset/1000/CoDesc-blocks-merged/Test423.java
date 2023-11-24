class Test {
    public class Example {
    private void moveTableItems(int ndxToMove, int destNdx) {
    		TableItem item = table.getItem(ndxToMove);
    		if (item != null) {
    			Algorithm algorithm = (Algorithm) tableItemToAlgorithmMap
    					.get(item);
    			tableItemToAlgorithmMap.remove(item);
    
    			SchedulerTableItem schedulerTableItem = (SchedulerTableItem) algorithmToGuiItemMap
    					.get(algorithm);
    			schedulerTableItem.moveTableEntry(table, destNdx);
    			table.setSelection(destNdx);
    
    			TableItem tableItem = schedulerTableItem.getTableItem();
    			tableItemToAlgorithmMap.put(tableItem, algorithm);
    
    			refresh();
    		}    	
        }
        protected RestResponse requestJson(final String path, final String method, final String param)
                throws IOException, AppPlatformException {
            final HttpUriRequest request = setupRequestJson(path, method, param);
            return performRequest(request);
        }
        @Override public void onBackPressed(){
      if (!mainFlow.goBack()) {
        super.onBackPressed();
      }
    }
    }
}