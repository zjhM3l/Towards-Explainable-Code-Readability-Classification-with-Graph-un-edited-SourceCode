class Test {
    public class Example {
    private void fireDone() {
            if (getState() != State.DONE) {
                throw new IllegalStateException("Illegal attempt made to fire a " +
                        "done event when not in the DONE state");
            }
            
            int count = listeners.getListenerCount(DoneListener.class);
            if (count == 0) return;
            
            final DoneEvent evt = new DoneEvent(this);
            final DoneListener[] all = listeners.getListeners(DoneListener.class);
            Runnable r = new Runnable() {
                public void run() {
                    for (int i=0; i<all.length; i++) {
                        all[i].done(evt);
                    }
                }
            };
            if (SwingUtilities.isEventDispatchThread()) {
                r.run();
            } else {
                SwingUtilities.invokeLater(r);
            }
        }
        public void removeGap(String tli){
            if (!isGap(tli)){return;}
            //System.out.println("Removing gap : " + tli);
            String nextTLI = getCommonTimeline().getNextID(tli);
            for (int pos=0; pos<getNumberOfTiers(); pos++){
                Tier tier = getTierAt(pos);
                Event event = tier.getFirstEventBeforeStartPoint(getCommonTimeline(), tli);
                if (event==null) {continue;}
                if (event.getEnd().equals(tli)) {
                    event.setEnd(nextTLI);
                }
            }
            getCommonTimeline().removeTimelineItemWithID(tli);
        }
        public static void BSWAP ( CPU cpu , CPU dest ) {
      List < String > parts = new ArrayList < String > ( ) ;
      byte arg0 = dest . read ( ) ;
      for ( int i = 0 ;
      i < dest . getSize ( ) ;
      i += 8 ) parts . add ( Operators . EXTRACT ( arg0 , i , 8 ) ) ;
      dest . write ( Operators . CONCAT ( 8 * parts . size ( ) , parts . get ( 0 ) ) ) ;
    }
    }
}