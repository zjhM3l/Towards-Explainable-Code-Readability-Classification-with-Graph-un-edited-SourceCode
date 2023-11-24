class Test {
    public class Example {
    public static boolean isLuceneIndex(String indexName) {
    
            I_CmsSearchIndex i = OpenCms.getSearchManager().getIndex(indexName);
            return (i instanceof CmsSearchIndex) && (!(i instanceof CmsSolrIndex));
        }
        public double getWidth() {
        Element pageSheetElement = VisioDOMUtils.getFirstChildWithName(this.page, "PageSheet");
        Element pagePropsElement = VisioDOMUtils.getFirstChildWithName(pageSheetElement, "PageProps");
        Element pageWidthElement = VisioDOMUtils.getFirstChildWithName(pagePropsElement, "PageWidth");
        try {
          return Double.parseDouble(pageWidthElement.getTextContent());
        } catch (NumberFormatException e) {
          throw new IllegalStateException("Height of page can not be parsed");
        } catch (IndexOutOfBoundsException e) {
          throw new IllegalStateException("Page has no height attached to it");
        }
      }
        public StringBuilder getWebUrlBuf() {
    		StringBuilder sb = new StringBuilder();
    		sb.append("http://").append(getDomain());
    		if (getPort() != null && !getPort().equals(80)) {
    			sb.append(":").append(getPort());
    		}
    		if (getContextPath() != null) {
    			sb.append(getContextPath());
    		}
    		return sb;
    	}
    }
}