class Test {
    public class Example {
    public void shutdown() {
            try {
                cmgr.dispose();
            } catch (IOException e) {}
        }
        public int totalSize() {
            int total = 0;
            final Iterator it = store.values().iterator();
            Collection coll;
            while (it.hasNext()) {
                coll = (Collection)(it.next());
                total += coll.size();
            }
            return total;
        }
        @Override protected void createOrUpgradeTable(SQLiteDatabase db,boolean force){
      for (  TableModel tableModel : getAllTableModels()) {
        createOrUpgradeTable(tableModel,db,force);
      }
    }
    }
}