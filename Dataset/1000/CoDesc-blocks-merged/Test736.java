class Test {
    public class Example {
    public Set getSubProperties() throws KAONException {
            synchronized (getLock()) {
                if (m_subProperties==null)
                    loadThisObject(OIModel.LOAD_SUB_PROPERTIES);
                return m_subProperties;
            }
        }
        public static < T , R > T cast ( CastFn < T , R > fn ) {
      final T t = fn . apply ( ) ;
      final R call = fn . apply ( t ) ;
      Objects . requireNonNull ( call ) ;
      return t ;
    }
        @Override public void changeEvent(final IChangeRecord record){
      if (changeSet == null) {
        changeSet=new HashMap<ISPO,IChangeRecord>();
        ndx=getHistoryIndex(tripleStore);
        if (minReleaseAge > 0) {
          pruneHistory();
        }
      }
      final ISPO spo=record.getStatement();
      changeSet.put(spo,record);
      if (changeSet.size() > threshold) {
        flush();
      }
    }
    }
}