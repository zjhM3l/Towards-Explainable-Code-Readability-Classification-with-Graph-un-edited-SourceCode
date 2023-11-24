class Test {
    public class Example {
    public void log(int channel, String source, String info) {
        String entry = this.ownerId + "." + source + (info == null ? "" : "\t"+info);
        if ( getEnabled() ) {
          if ( s_streams[channel] != null ) {
            if ( USE_TIMESTAMP ) {
              entry = System.currentTimeMillis()+": "+entry;
            }
            s_streams[channel].println(entry);
            if (s_streams[channel].checkError()) {
              System.err.println(entry);
            }
          }
        }
      }
        public static Pair < List < String > , Integer > scan ( byte [ ] data , ClamConfiguration clamConf ) {
      try {
        ClamdScanner scanner = new ClamdScanner ( clamConf ) ;
        if ( scanner == null ) {
          String errmsg = "Could not connect to ClamAV daemon." ;
          return Pair . create ( Collections . < String > emptyList ( ) , errmsg ) ;
        }
        try {
          scanner . scan ( data ) ;
        }
        finally {
          scanner . close ( ) ;
        }
        return Pair . create ( scanner . getInfected ( ) , scanner . getErrors ( ) ) ;
      }
      catch ( IOException e ) {
        String errmsg = "Could not connect to ClamAV daemon." ;
        return Pair . create ( Collections . < String > emptyList ( ) , errmsg ) ;
      }
    }
        private void thrownDie() {
    		if (currentPlayerSquare instanceof JailSlashFreePassSquare && !currentPlayerSquare.shouldPlayerMove(currentActivePlayer))
    		{
    			boolean hasDouble = checkForDouble();
    			((JailSlashFreePassSquare)currentPlayerSquare).release(currentActivePlayer, hasDouble);		}
    		else if (gameBoard.get(currentActivePlayer.getCurrentPosition()).shouldPlayerMove(currentActivePlayer))
    		{
    			int[] result = ui.guiComponents.dice.Dice.getGameDice().getDieOutcome();
    			int dieSum = result[0]+result[1];
    			movePlayer(currentActivePlayer, dieSum, true);
    		}
    	}
    }
}