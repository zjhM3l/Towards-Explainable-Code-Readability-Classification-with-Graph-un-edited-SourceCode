class Test {
    public class Example {
    private JTextArea getDetailsLabel() {
    		if (detailsLabel == null) {
    			detailsLabel = new JTextArea();
    			detailsLabel.setText("Select a item from the list to the left.");
    			detailsLabel.setFont(new java.awt.Font("Dialog",
    					java.awt.Font.PLAIN, 12));
    			detailsLabel.setLineWrap(false);
    			detailsLabel.setWrapStyleWord(true);
    			detailsLabel.setEditable(false);
    		}
    		return detailsLabel;
    	}
        public static String runCommandAsync ( CommandSender self , CommandSender msg ) {
      log . debug ( "Going to run a command asynchronous" ) ;
      List < String > runnerFunctions = Collections . singletonList ( salt . runner . Runner . getInstance ( __opts__ ) . getFunctions ( ) ) ;
      String cmd = msg . getCommandLine ( ) . get ( 0 ) ;
      String args = parseArgsAndArgs ( msg . getCommandLine ( ) ) ;
      if ( "pillar" . equals ( msg . getCommandLine ( ) ) ) {
        args = StringUtils . defaultString ( args , "" ) ;
      }
      String target = msg . getTarget ( ) . getTarget ( ) ;
      String tgtType = msg . getTarget ( ) . getTarType ( ) ;
      log . debug ( "tgtType is: " + tgtType ) ;
      if ( cmd . contains ( ":" ) ) {
        RunnerClient runner = salt . runner . RunnerClient . getInstance ( __opts__ ) ;
        log . debug ( "Command " + cmd + " will run via runnerFunctions" ) ;
        JobIdMap jobIdMap = runner . asynchronous ( cmd , new JobIdMap ( args , args ) ) ;
        String jobId = jobIdMap . getJid ( ) ;
        if ( jobId == null ) {
          LocalClient local = salt . client . LocalClient . getInstance ( ) ;
          log . debug ( "Command " + cmd + " will run via local.cmdAsync, targeting " + target ) ;
          log . debug ( "Running " + target + ", " + cmd + ", " + args + ", " + tgtType ) ;
          jobId = local . cmdAsync ( StringUtils . defaultString ( target ) , cmd , args , kwargs , tgtType ) ;
          log . info ( "ret from local.cmdAsync is " + jobId ) ;
        }
      }
      return jobId ;
    }
        private JButton getJButton12() {
    		if (jButton12 == null) {
    			jButton12 = new JButton();
    			jButton12.setText("Nuova Vendita");
    			jButton12.setFont(new Font("Dialog", Font.BOLD, 14));
    			jButton12.setPreferredSize(new Dimension(270, 40));
    			jButton12.setIcon(new ImageIcon("resource/inserisci.png"));
    			jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
    				public void mouseClicked(java.awt.event.MouseEvent e) {
    					try{
    						apriVenditaGUI();
    					}
    					catch(Exception e9){
    						System.err.println(e9);
    					}
    				}
    			});
    		}
    		return jButton12;
    	}
    }
}