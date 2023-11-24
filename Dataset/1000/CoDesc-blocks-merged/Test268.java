class Test {
    public class Example {
    public void load() {
            String s = System.getProperty("user.dir");
            s += DATABASESDATABASESXML;
            XStream xstream = new XStream();
            PaccmanDatabaseMgr pdbmgr = (PaccmanDatabaseMgr) xstream.fromXML(s);
        }
        public boolean removeElement(Object key) {
        if (m_dataMap.remove(key) !=null)
          return true;
        else
          return false;
      }
        private int getOrderedListType(char c,int defaultListType) {
            for(int j=0;j<ORDERED_LIST_TYPE_IDENTIFIERS.length;j++) {
                if (c==ORDERED_LIST_TYPE_IDENTIFIERS[j]) {
                    return j;
                }
            }
            return defaultListType;
        }
    }
}