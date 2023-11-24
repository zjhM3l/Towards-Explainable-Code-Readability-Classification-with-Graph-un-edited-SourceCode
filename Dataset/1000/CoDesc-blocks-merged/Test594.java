class Test {
    public class Example {
    public JSONObject getJSONObject(int index) throws JSONException {
        Object object = get(index);
        if (object instanceof JSONObject) {
          return (JSONObject) object;
        }
        throw new JSONException(NLS.bind("JSONArray[{0}] is not a JSONObject.", index)); //$NON-NLS-1$
      }
        public static boolean fetchObjectFromDBByPK ( JdbcTemplate jdbcTemplate , Object obj , String table , List < String > fieldList , Object pkValue ) throws SQLException {
      if ( pkValue == null ) {
        blankObject ( obj , fieldList ) ;
        return false ;
      }
      List < Object > row = jdbcTemplate . queryForList ( getSqlSelectAllNonPKFieldsByPK ( table , fieldList , jdbcTemplate . getDelims ( ) ) , pkValue ) ;
      if ( row == null ) {
        blankObject ( obj , fieldList ) ;
        return false ;
      }
      Collections . addAll ( fieldList , row ) ;
      assignFromList ( jdbcTemplate , fieldList . subList ( 1 , fieldList . size ( ) ) , row ) ;
      return true ;
    }
        public void close() throws SQLException {
    		Log.record("JDBCConnection.close: closing " + this, Log.kLogLevelDebug);
    //		Log.record(Utils.generateStackTrace(4), Log.kLogLevelDebug);
    		mStatement.close();
    		mConnection.close();
    	}
    }
}