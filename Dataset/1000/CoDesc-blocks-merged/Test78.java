class Test {
    public class Example {
    public Object getChild(Object parent, int index) {
    		_OpenCOETable p = (_OpenCOETable) parent;
    		//return p.getCombined(index);
    		return p.getTables(index);
    	}
        public Set<Category> updateCategories(boolean overrideOffline){
      if (categoriesChanged > System.currentTimeMillis() - Utils.UPDATE_TIME) {
        return null;
      }
     else   if (Utils.isConnected(cm) || overrideOffline) {
        Set<Category> categories=Controller.getInstance().getConnector().getCategories();
        if (!categories.isEmpty()) {
          DBHelper.getInstance().deleteCategories(false);
          DBHelper.getInstance().insertCategories(categories);
          categoriesChanged=System.currentTimeMillis();
          notifyListeners();
        }
        return categories;
      }
      return null;
    }
        public void saveResourceBundle(File outputFile, UJO ujo, String header, Object context) throws IOException {
            final OutputStream out = getOutputStream(outputFile);
            try {
                saveResourceBundle(out, ujo, header, context);
            } finally {
                out.close();
            }
        }
    }
}