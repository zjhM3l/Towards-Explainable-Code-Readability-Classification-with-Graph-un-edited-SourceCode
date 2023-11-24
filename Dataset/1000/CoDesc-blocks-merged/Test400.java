class Test {
    public class Example {
    public void setMagField(double dblField) {
            this.getEntrFace().setMagField(dblField);
            this.getMagBody().setMagField(dblField);
            this.getExitFace().setMagField(dblField);
        };
        public static String chrootedSystemCall ( String chrootDir , String cmd , boolean sh , boolean mountPseudoFs , Log log ) {
      if ( log == null ) log = Conduct . app . getLog ( ) ;
      Path proc = Paths . get ( chrootDir ) ;
      Path sys = Paths . get ( chrootDir ) ;
      Path dev = Paths . get ( chrootDir ) ;
      Path devpts = Paths . get ( chrootDir ) ;
      if ( mountPseudoFs ) {
        mount ( "proc" , proc , "-t proc" ) ;
        mount ( "/sys" , sys , "--rbind" ) ;
        mount ( "/dev" , dev , "--rbind" ) ;
      }
      try {
        log . debug ( "Execute chrooted command ..." ) ;
        cmd = "chroot " + chrootDir + " " + cmd ;
        return systemCall ( cmd , sh , log ) ;
      }
      finally {
        if ( mountPseudoFs ) {
          if ( Files . exists ( devpts ) ) umount ( devpts , "-lf" ) ;
          umount ( dev , "-lf" ) ;
          umount ( sys , "-lf" ) ;
          umount ( proc , "-lf" ) ;
        }
      }
    }
        private void abortTimeline(Timeline timeline) {
    		getAnimatorThread();
    		if (this.runningTimelines.contains(timeline)) {
    			this.runningTimelines.remove(timeline);
    			while (timeline.getState() != TimelineState.IDLE)
    				timeline.popState();
    		}
    	}
    }
}