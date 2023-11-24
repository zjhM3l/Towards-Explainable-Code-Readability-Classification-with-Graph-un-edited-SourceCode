class Test {
    public class Example {
    public void setPersistenceClass(String persistenceClass) throws Exception {
    		this.persistenceClass = persistenceClass;
    		if (persistenceClass != null) {
    			setStore(PersistenceUtils.getPersistenceStore(this,
    					persistenceClass));
    		} else {
    			setStore(null);
    		}
    	}
        SchemaFuture installHandlers(XMLReader in, SchemaReceiverImpl sr) {
        Handler h = new Handler(sr);
        in.setContentHandler(h);
        return h;
      }
        public int count(String where) {
            if (where==null) where="";
            if (where.indexOf("MMNODE")!=-1) {
                where=convertMMNode2SQL(where);
            } else {
                where=QueryConvertor.altaVista2SQL(where,database);
            }
            String query="SELECT Count(*) FROM "+getFullTableName()+" "+where;
            return basicCount(query);
        }
    }
}