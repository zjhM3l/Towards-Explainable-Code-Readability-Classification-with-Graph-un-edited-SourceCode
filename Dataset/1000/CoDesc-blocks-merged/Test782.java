class Test {
    public class Example {
    private void loadValues() {
            IPreferenceStore store = getPreferenceStore();
    
            autoUpdate.setSelection(
                store.getBoolean(PreferenceConstants.PREF_AUTOUPDATE));
            intervalField.setText(
                String.valueOf(
                    store.getInt(PreferenceConstants.PREF_UPDATE_INTERVAL)));
            updateStatus();
        }
        public Query set(Object key, Object value) {
          if (value == null) {
             nulls.put(key.toString(), "NULL");
             vars.put(key.toString(), "NULL");
          } else {
             vars.put(key.toString(), StringEscapeUtils.escapeSql(value.toString()));
          }
          return this;
       }
        @Override
        public String getRandomValue() {
            StringBuilder buf = new StringBuilder();
            while (buf.length() < expectedSizeOfRandomValues) {
                int index = getIndexIntoWordArray();
                buf.append(words[index]);
                buf.append(" ");
            }
    
            return buf.toString().substring(0, expectedSizeOfRandomValues);
        }
    }
}