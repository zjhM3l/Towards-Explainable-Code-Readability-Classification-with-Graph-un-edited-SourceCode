class Test {
    public class Example {
    private boolean sameVersion(ServiceItem item0,ServiceItem item1) {
                boolean fullyEqual = false;
                try {
                    MarshalledInstance mi0 = new MarshalledInstance(item0.service);
                    MarshalledInstance mi1 = new MarshalledInstance(item1.service);
                    fullyEqual = mi0.fullyEquals(mi1);
                } catch(IOException e) {
                    logger.log(Level.INFO, "failure marshalling old and new "
                               +"services for equality check", e);
                }
                return fullyEqual;
    	}//end LookupCacheImpl.sameVersion
        @Override public boolean isBusy(){
      if (m_executorPool == null || (m_executorPool.getQueue().size() == 0 && m_executorPool.getActiveCount() == 0) && m_state == IDLE) {
        return false;
      }
      return true;
    }
        public Vector getAllPeptideHits(int aQueryNumber) {
            Vector v = null;
            int iNumberOfPeptideHits = getNumberOfPeptideHits(aQueryNumber);
    
            for (int i = 0; i < iNumberOfPeptideHits; i++) {
                PeptideHit lPeptideHit = getPeptideHitOfOneQuery(aQueryNumber, (i + 1));
                if (lPeptideHit != null) {
                    if (i == 0) {
                        v = new Vector();
                    }
                    v.add(lPeptideHit);
                }
            }
            return v;
        }
    }
}