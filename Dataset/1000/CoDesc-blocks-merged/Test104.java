class Test {
    public class Example {
    public void createRepository(File dataDir, String configData) {
        sesameManager = new SesameManager();
        sesameManager.createUnmanagedRepository(dataDir, configData);
        repositoryConnection = sesameManager.getRepositoryConnection();
        try {
          repositoryConnection.setAutoCommit(true);
        } catch (RepositoryException ex) {
          sesameManager.disconnect();
          throw new GateOntologyException("Could not set autocommit");
        }
        init();
      }
        public boolean waitForReportReady() throws InterruptedException, ApiException_Exception {
        ReportJobStatus status = reportService.getReportJobStatus(reportJobId);
        while (status == ReportJobStatus.IN_PROGRESS) {
          Thread.sleep(SLEEP_TIMER);
          status = reportService.getReportJobStatus(reportJobId);
        }
    
        return status == ReportJobStatus.COMPLETED;
      }
        public Company (java.lang.Integer _id) {
    		super(_id);
    		
    		Company com=(Company)new CompanyDAO().load(Company.class, _id);
    		
    		if(com!=null){
    			
    			try {
    				BeanUtils.copyProperties(this, com);
    			} catch (IllegalAccessException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			} catch (InvocationTargetException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    	}
    }
}