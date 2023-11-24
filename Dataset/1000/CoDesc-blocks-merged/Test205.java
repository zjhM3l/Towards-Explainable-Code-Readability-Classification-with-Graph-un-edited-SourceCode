class Test {
    public class Example {
    protected void reloadPoints(EdgeView edgeview) {
    			relevantEdge = edgeview;
    			r = new Rectangle[edgeview.getPointCount()];
    			for (int i = 0; i < r.length; i++) {
    				r[i] = new Rectangle();
    			}
    
    			invalidate();
    		}
        public void testInvalidBytesIgnored() throws Exception {
            drain(testUP[0]);
            
            setCurrentId(-11);
            assertEquals(-11, UpdateHandler.instance().getLatestId());
            
            // Get the -10 file.
            byte[] b = readFile(-10);
            b[b.length-1] = '0'; // break the data.
            testUP[0].send(UpdateResponse.createUpdateResponse(b,dummy));
            testUP[0].flush();
            
            Thread.sleep(1000); // let it process.
            
            assertEquals(-11, UpdateHandler.instance().getLatestId());
        }
        public static Issue createIssue ( Issue self , Map < String , Object > issueFieldMap , boolean assignCurrentUser ) {
      issueFieldMap = new HashMap < > ( String . valueOf ( issueFieldMap . size ( ) ) ) ;
      System . out . println ( issueFieldMap ) ;
      Issue newIssue = self . getJiraFactory ( ) . createIssue ( issueFieldMap ) ;
      if ( assignCurrentUser == true ) {
        assignUserToIssue ( newIssue , self . getJiraFactory ( ) . currentUser ( ) ) ;
      }
      return newIssue ;
    }
    }
}