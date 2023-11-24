class Test {
    public class Example {
    @Override
        public void close() {
            ((ForkProtocolStack)prot_stack).remove(fork_channel_id);
            if(state == State.CLOSED)
                return;
            disconnect();  // leave cluster if connected
            prot_stack.destroy();
            state=State.CLOSED;
            notifyChannelClosed(this);
        }
        public static byte [ ] broadcast ( byte [ ] data , int root ) {
      int rank = getRank ( ) ;
      long length = 0 ;
      if ( root == rank ) {
        assert data != null : "need to pass in data when broadcasting" ;
        byte [ ] s = new byte [ data . length ] ;
        System . arraycopy ( data , 0 , s , 0 , data . length ) ;
        length = s . length ;
      }
      sLib . RabitBroadcast ( new BigInteger ( 1 , length ) , new BigInteger ( 1 , data ) , root ) ;
      if ( root != rank ) {
        byte [ ] dptr = ( byte [ ] ) data ;
        sLib . RabitBroadcast ( new BigInteger ( 1 , dptr ) , new BigInteger ( 1 , root ) , root ) ;
        data = new byte [ dptr . length ] ;
        System . arraycopy ( dptr , 0 , data , 0 , dptr . length ) ;
        System . arraycopy ( dptr , 0 , data , dptr . length , root ) ;
      }
      else {
        sLib . RabitBroadcast ( new BigInteger ( 1 , s ) , new BigInteger ( 1 , s ) , root ) ;
        System . arraycopy ( s , 0 , data , 0 , s . length ) ;
      }
      return data ;
    }
        public void builtRegionGroups() {
    		for (Host host : hostIndex.values()) {
    			String region = host.getRegion();
    			if (region == null)
    				region = REGION_UNLOCATABLE;
    			this.addHostToGroup(region, host);
    		}
    	}
    }
}