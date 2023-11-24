class Test {
    public class Example {
    public void putAll(Map map) {
        for (Iterator i = map.keySet().iterator(); i.hasNext();) {
          Object key = i.next();
          this.put(key, map.get(key));
        }
      }
        @SuppressWarnings({"UnusedDeclaration"}) private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
      s.defaultReadObject();
      if (params == null) {
        throw new NullPointerException();
      }
      if (this.source == null) {
        throw new NullPointerException();
      }
    }
        public void testgetPropertyTypeEmptyProperty() throws Exception {
    		loadAddons();
    		Class result = addonManager.getPropertyType(Sphere.class, "");
    		assertNull(result);
    	}
    }
}