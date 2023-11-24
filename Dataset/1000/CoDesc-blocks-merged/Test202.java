class Test {
    public class Example {
    public void deleteUser(String id) throws InvalidUserRemoveException{
    		BLMSUser user = getUser(id);
    		ValidateAttribute.validRemoveUser(user.getId());
    		ServiceLocator.singleton().getService().remove(user);
    	}
        public static void replaceInto(Connection conn,
                                       String table,
                                       String[] columns,
                                       String[] values,
                                       String uniqueColumn,
                                       boolean[] numeric) throws SQLException {
            instance.i_replaceInto(conn,
                                   table,
                                   columns,
                                   values,
                                   uniqueColumn,
                                   numeric);
        }
        public void store() {
        try {
          if (!records.isEmpty()) {
            hardStore(encrypt());
          }
        } catch (Exception ex) {
          ex.printStackTrace();
          Dazio.d.setCurrent(new ListView());
        }
      }
    }
}