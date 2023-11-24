class Test {
    public class Example {
    @Override protected FaceletHandler doCompile(URL src, String alias) throws IOException, FaceletException, ELException, FacesException {
    		if (src == null) return null;
    		if (alias.endsWith(".xhtml")) return this.handleNonGraceletCompileRequest(src, alias);
    		return this.getGraceletHandler(new GraceletURLSource(src), alias);
      }
        public Block(NetworkParameters params,long version,Sha256Hash prevBlockHash,Sha256Hash merkleRoot,long time,long difficultyTarget,long nonce,List<Transaction> transactions){
      super(params);
      this.version=version;
      this.prevBlockHash=prevBlockHash;
      this.merkleRoot=merkleRoot;
      this.time=time;
      this.difficultyTarget=difficultyTarget;
      this.nonce=nonce;
      this.transactions=new LinkedList<Transaction>();
      this.transactions.addAll(transactions);
    }
        public void setBREAK1_END(Date bREAK1_END) {
            sumBreak1Dirty = true;
    
            put(BREAK1_END, bREAK1_END);
        }
    }
}