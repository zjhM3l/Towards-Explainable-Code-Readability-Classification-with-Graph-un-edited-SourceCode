class Test {
    public class Example {
    private void setCache(LinkedHashMap<MetadataID, Metadata> metadata) {
        cache = new LinkedHashMap<MetadataID, Metadata>();
        classCache = new HashMap<Class, HashMap<MetadataID, Metadata>>();
        for(Metadata m:metadata.values()){
          cacheMetadata(m);
        }
      }
        public static RemoveFilesDialogFragment newInstance(OCFile file){
      ArrayList<OCFile> list=new ArrayList<>();
      list.add(file);
      return newInstance(list);
    }
        protected String sqlUpdate() {
    
    		String sql = "UPDATE T_CATALOG_OPTION_DTL SET REF_DESC=?, STATUS=?, REF_1=?, REF_2=?, REF_3=?"
    			+ ", DC_IND=?, DC_DATE=?, CREATE_USER=?, CREATE_DATE=?, UPDATE_USER=?"
    			+ ", UPDATE_DATE=SYSDATE "
    			+ "WHERE COMPANY_CODE=? AND REF_MASTER_CODE=? AND REF_CODE=? "
    			+ "AND (UPDATE_DATE IS NULL OR UPDATE_DATE = ?) ";
    
    		//super.logSqlQuery(sql);
    		return sql;
    	}
    }
}