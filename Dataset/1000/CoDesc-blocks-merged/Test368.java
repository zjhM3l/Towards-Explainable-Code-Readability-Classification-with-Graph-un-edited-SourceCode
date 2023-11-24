class Test {
    public class Example {
    private CodeIssueData makeZeroCodeIssueData(String tool) {
        CodeIssueData issueData = new CodeIssueData();
        issueData.setTool(tool);
        issueData.setNumIssues(0);
        return issueData;
      }
        public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OpenBitSet)) return false;
        OpenBitSet a;
        OpenBitSet b = (OpenBitSet)o;
        // make a the larger set.
        if (b.wlen > this.wlen) {
          a = b; b=this;
        } else {
          a=this;
        }
    
        // check for any set bits out of the range of b
        for (int i=a.wlen-1; i>=b.wlen; i--) {
          if (a.bits[i]!=0) return false;
        }
    
        for (int i=b.wlen-1; i>=0; i--) {
          if (a.bits[i] != b.bits[i]) return false;
        }
    
        return true;
      }
        public void addAci(DN dn,SortedSet<Aci> acis){
      lock.writeLock().lock();
      try {
        aciList.put(dn,new LinkedList<>(acis));
      }
      finally {
        lock.writeLock().unlock();
      }
    }
    }
}