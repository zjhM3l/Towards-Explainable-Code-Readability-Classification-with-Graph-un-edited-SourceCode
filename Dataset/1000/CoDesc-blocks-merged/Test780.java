class Test {
    public class Example {
    private String convertRelativeResourcesPath(String path) {
    		if (path == null) {
    			return null;
    		}
    		if (path.charAt(0) != '/') {
    			path = "/" + path;
    		}
    		return "/site"
    				+ Strings.replaceAll(path, "resources", "res").toString()
    						.toLowerCase();
    	}
        @Override public boolean equals(Object o){
      if (this == o) {
        return true;
      }
      if (o == null) {
        return false;
      }
      if (!(o instanceof Column)) {
        return false;
      }
      Column column=(Column)o;
      return Objects.equals(name,column.name);
    }
        private void assertGetSeparationSpaceWorks(int[] value) {
            for (int i = 0; i < value.length; i++) {
                assertEquals(value[i], testDimension.getSeparationSpace(i));
            }
        }
    }
}