class Test {
    public class Example {
    public static void load ( Lexicon self , String path , int k ) {
      long loadTimeStart = System . currentTimeMillis ( ) ;
      try ( InputStream inp = new FileInputStream ( path ) ) {
        Lexicon _lex = IOUtils . loadLexicon ( inp ) ;
        int loadedK = _lex . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) . getLexicon ( ) )
        public Collection<ProposalResponse> sendUpgradeProposal(UpgradeProposalRequest upgradeProposalRequest, Collection<Peer> peers)
                throws InvalidArgumentException, ProposalException {
    
            checkChannelState();
            checkPeers(peers);
    
            if (null == upgradeProposalRequest) {
                throw new InvalidArgumentException("Upgradeproposal is null");
            }
    
            try {
                TransactionContext transactionContext = getTransactionContext(upgradeProposalRequest.getUserContext());
                //transactionContext.verify(false);  // Install will have no signing cause it's not really targeted to a channel.
                transactionContext.setProposalWaitTime(upgradeProposalRequest.getProposalWaitTime());
                UpgradeProposalBuilder upgradeProposalBuilder = UpgradeProposalBuilder.newBuilder();
                upgradeProposalBuilder.context(transactionContext);
                upgradeProposalBuilder.argss(upgradeProposalRequest.getArgs());
                upgradeProposalBuilder.chaincodeName(upgradeProposalRequest.getChaincodeName());
                upgradeProposalBuilder.chaincodePath(upgradeProposalRequest.getChaincodePath());
                upgradeProposalBuilder.chaincodeVersion(upgradeProposalRequest.getChaincodeVersion());
                upgradeProposalBuilder.chaincodEndorsementPolicy(upgradeProposalRequest.getChaincodeEndorsementPolicy());
                upgradeProposalBuilder.chaincodeCollectionConfiguration(upgradeProposalRequest.getChaincodeCollectionConfiguration());
    
                SignedProposal signedProposal = getSignedProposal(transactionContext, upgradeProposalBuilder.build());
    
                return sendProposalToPeers(peers, signedProposal, transactionContext);
            } catch (Exception e) {
                throw new ProposalException(e);
            }
        }
        private void adjustStopPLIs(int startAt, int delta) {
        System.out.println("adjusting plis for "+sub_.getMasterID());
        int s = 0;
        for(Stop stop : stops_) {
          if(stop.getOutPLI() >= startAt) {
            int newInPLI = stop.getInPLI()+delta;
            int newOutPLI = stop.getOutPLI()+delta;
            System.out.println(" - stop "+s+": ("+stop.getInPLI()+","+stop.getOutPLI()+") to ("+newInPLI+","+newOutPLI+")");
            stop.setPLIs(newInPLI, newOutPLI);
          }
        }
        Stop lastStop = stops_.get(stops_.size()-1);
        lastStop.setPLIs(lastStop.getInPLI()+delta, -1);
      }
    }
}