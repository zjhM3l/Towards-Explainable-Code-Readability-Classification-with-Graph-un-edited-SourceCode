class Test {
    public class Example {
    public void showColumn(int colIndex) {
            getColumnModel().setHidden(colIndex, false);
            if (Ext.isIE()) {
                Timer t = new Timer() {
                    public void run() {
                        getView().refresh();
                        getView().updateHeaderSortState();
                    }
                };
                t.schedule(10);
            }
        }
        private boolean transformDataTask(){
    		boolean result=true;
    		String sCurrentFile=pParser.store.sTargetDir+pParser.store.sOutFileName+pParser.store.sOutFileExtension;
    		log.setModuleStep("transformDataTask");
    		ImportFileIntoDbTable importFile = new ImportFileIntoDbTable(pParser, DB_IMPORT_TABLE, log);
    		result = importFile.process(sCurrentFile);
    		importResult = importFile.getResult();
    		return result;
    	}
        public void execute(OperationContext context) throws Exception {
        
        // initialize
        LOGGER.finer("Executing csw:GetRecords request...");
        IProviderFactory factory = context.getProviderFactory();
        
        // evaluate the query
        IQueryEvaluator evaluator = factory.makeQueryEvaluator(context);
        if (evaluator == null) {
          String msg = "IProviderFactory.makeQueryEvaluator: instantiation failed.";
          LOGGER.log(Level.SEVERE,msg);
          throw new OwsException(msg);
        } else {
          evaluator.evaluateQuery(context);
        }
        
        // generate the response
        IResponseGenerator generator = factory.makeResponseGenerator(context);
        if (generator == null) {
          String msg = "IProviderFactory.makeResponseGenerator: instantiation failed.";
          LOGGER.log(Level.SEVERE,msg);
          throw new OwsException(msg);
        } else {
          generator.generateResponse(context);
        } 
          
      }
    }
}