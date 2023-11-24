class Test {
    public class Example {
    public static boolean validateContents ( Map < String , String > file_contents ) {
      for ( Map . Entry < String , String > entry : file_contents . entrySet ( ) ) {
        if ( File . separatorChar != entry . getKey ( ) . charAt ( 0 ) ) continue ;
        if ( entry . getValue ( ) == null ) return false ;
        try {
          JSONObject jsonObject = new JSONObject ( entry . getValue ( ) ) ;
          if ( jsonObject . isNull ( ) ) return false ;
        }
        catch ( JSONException e ) {
          return false ;
        }
      }
      return true ;
    }
        public static void start(Config config) {
        // Start the agents
        long t0 = System.currentTimeMillis();
        int index = 0;
        int subIndex = 0;
        for (Config.AgentTypeData agentType : config.getAgents()) {
          index = subIndex;
          String[] args = (agentType.getArgs() == null || agentType.getArgs().isEmpty()) ? new String[0]
              : agentType.getArgs().toArray(new String[agentType.getArgs().size()]);
          for (subIndex = index; subIndex < index + agentType.getCount(); subIndex++) {
            // Get the agent
            Agent agent = (Agent) GlobalState.agents.get(subIndex);
            // Start the agent
            agent.start(writer, args);
          }
        }
        long t1 = System.currentTimeMillis();
        logger.info("Started " + GlobalState.agents.size() + agentsIn + Log.formattedDuration(t0, t1));
    
        // Start the intention selection threads
        Program.startIntentionSelectionThreads();
    
      }
        public void assignImage(Image image) {
            files.add(image);
            // file list not sorted anymore
            sorted = false;
    
            setChanged();
            notifyObservers(EventUpdate.ASSIGNED);
        }
    }
}