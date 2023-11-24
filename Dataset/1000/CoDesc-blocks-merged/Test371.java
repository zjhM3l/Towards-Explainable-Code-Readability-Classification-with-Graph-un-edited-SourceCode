class Test {
    public class Example {
    public void setUpdateChanges(boolean updateChanges) {
        if (this.updateChanges != updateChanges) {
          if (this.updateChanges) {
            removeListeners();
            this.updateChanges = updateChanges;
          }
          else {
            this.updateChanges = updateChanges;
            addListeners();
          }
        }
      }
        public void stateChanged(ChangeEvent e) {
    		    try
    		    {
    	            ts_server.setSail(player_id,sail_slider.getValue()); 
    	            System.out.println("Setting sail to " + sail_slider.getValue() + " for player " + player_id);
    	            Player player = ts_server.getPlayer(player_id);
    	            System.out.println("got handle on player");
    	            int wind = ts_server.getGame(game_id).getWindDirection();
    	            int heading = player.getDirection();
    	            System.out.println("absolute wind direction " + wind);
    	            System.out.println("relative wind direction " + (wind - heading));
    	            System.out.println("absolute sail direction " + player.calcSailDirection(wind));
    		    }
    		    catch(RemoteException re) { error(re.getMessage()); }
    		}
        private static CacheOpInfo cacheOpsAssociate ( int protocol , int msgtype ) {
      CacheOpInfo ops = cacheOps ;
      while ( ops != null ) {
        if ( ops . getCoProtocol ( ) == protocol ) {
          for ( CacheOpInfo coMsgType : ops . getCoMsgTypes ( ) ) {
            if ( coMsgType . getMtId ( ) == msgtype ) {
              return ops ;
            }
          }
        }
        ops = ops . getCoNext ( ) ;
      }
      return null ;
    }
    }
}