class Test {
    public class Example {
    public static void retrieveVals ( NTPInfo self ) {
      NTPinfo ntpinfo = new NTPinfo ( ) ;
      Map < String , NTPstats > ntpstats = ntpinfo . getHostOffsets ( self . mRemoteHosts ) ;
      if ( ntpstats != null ) {
        for ( String host : self . mRemoteHosts ) {
          String hostkey = StringUtils . substringAfter ( host , "." ) ;
          NTPstats hoststats = ntpstats . get ( host ) ;
          if ( hoststats != null ) {
            if ( self . hasGraph ( "ntp_host_stratums" ) ) {
              self . setGraphVal ( "ntp_host_stratums" , hostkey , hoststats . getStratum ( ) ) ;
            }
            if ( self . hasGraph ( "ntp_host_offsets" ) ) {
              self . setGraphVal ( "ntp_host_offsets" , hostkey , hoststats . getOffset ( ) ) ;
            }
            if ( self . hasGraph ( "ntp_host_delays" ) ) {
              self . setGraphVal ( "ntp_host_delays" , hostkey , hoststats . getDelay ( ) ) ;
            }
          }
        }
      }
    }
        private void deregisterWithProcessCompound() {
            //
            try {
                if (SFProcess.getProcessCompound() != null) {
                    SFProcess.getProcessCompound().sfDeRegister(this);
                }
            } catch (Exception ex) {
                // @TODO: Log. Ignore.
                //Logger.logQuietly(ex);
                if (sfLog().isIgnoreEnabled()) {
                    sfLog().ignore(ex);
                }
            }
        }
        public void run() {
            int row = sqlTable.getSelectedRow();
            if (row >= 0) {
                SqlTabPanel panel = (SqlTabPanel) sqlTable.getValueAt(row, 1);
                panel.run(resultPanel, tab.getTitleAt(row));
            }
        }
    }
}