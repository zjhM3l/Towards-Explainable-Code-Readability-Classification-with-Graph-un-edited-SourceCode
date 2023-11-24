class Test {
    public class Example {
    private void clearImageArea() {
    		tabGui.setSelectedColorButton(null);
    		blushLeftCheek = null;
    		blushRightCheek = null;
    	}
        @NonNull
      public static <K, V> ImmutableMap<K, V> concat(
          @NonNull ImmutableMap<K, V> map1, @NonNull Map<K, V> map2) {
        ImmutableMap.Builder<K, V> builder = ImmutableMap.builder();
        for (Map.Entry<K, V> entry : map1.entrySet()) {
          if (!map2.containsKey(entry.getKey())) {
            builder.put(entry);
          }
        }
        builder.putAll(map2);
        return builder.build();
      }
        public int getIndexOfFormattingRun(int index) {
            if(st.sizeOfRArray() == 0) return 0;
    
            int pos = 0;
            for(int i = 0; i < st.sizeOfRArray(); i++){
                CTRElt r = st.getRArray(i);
                if(i == index) return pos;
    
                pos += r.getT().length();
            }
            return -1;
        }
    }
}