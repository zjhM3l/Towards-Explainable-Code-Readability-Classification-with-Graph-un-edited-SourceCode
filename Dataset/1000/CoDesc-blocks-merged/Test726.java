class Test {
    public class Example {
    private void initComponents(AttachmentController c) {
    		menuItem = new JMenuItem("Attach File..", MailImageLoader
    				.getSmallIcon("mail-attachment.png"));
    		menuItem.setActionCommand("ADD");
    		menuItem.addActionListener(c.getActionListener());
    		add(menuItem);
    		addSeparator();
    		menuItem = new JMenuItem("Remove Selected Attachments", ImageLoader
    				.getSmallIcon(IconKeys.EDIT_DELETE));
    		menuItem.setActionCommand("REMOVE");
    		menuItem.addActionListener(c.getActionListener());
    		add(menuItem);
    	}
        public static < T > List < List < T >> mapBatchParallel ( List < T > inputList , int batchSize , ItemMapper < T > itemMapper , BatchMapper < T > batchMapper , boolean flatten , int parallelism , @ Nullable String ... batchStorageDir ) {
      if ( itemMapper == null && batchMapper == null ) {
        throw new IllegalArgumentException ( "You should specify either batchMapper or itemMapper." ) ;
      }
      if ( batchMapper == null ) {
        batchMapper = defaultBatchMapper ;
      }
      List < List < T >> batches = splitIntoBatches ( inputList , batchSize , batchStorageDir ) ;
      List < List < T >> allBatchResults = Parallel . getInstance ( parallelism , batchMapper ) . map ( new Parallel . MapBatch < T , List < T >> ( ) {
        @ Override public List < T > map ( List < T > batch ) {
          return batchMapper . map ( batch . get ( "data" ) , itemMapper ) ;
        }
      }
      ) ;
      if ( flatten ) {
        List < List < T >> finalResult = new ArrayList < List < T >> ( ) ;
        for ( List < T > batchResult : allBatchResults ) {
          finalResult . addAll ( batchResult ) ;
        }
      }
      else {
        finalResult = allBatchResults ;
      }
      return finalResult ;
    }
        public void setBankSpecifics(BankAccountInfo bankSpecifics) {
        this.creditCardSpecifics = null;
        this.investSpecifics = null;
        this.bankSpecifics = bankSpecifics;
      }
    }
}