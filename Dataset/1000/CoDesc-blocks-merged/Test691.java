class Test {
    public class Example {
    public <T extends TextView> T waitForText(Class<T> classToFilterBy, String text, int expectedMinimumNumberOfMatches, long timeout, boolean scroll, boolean onlyVisible, boolean hardStoppage) {
    		final long endTime = SystemClock.uptimeMillis() + timeout;
    
    		while (true) {
    			final boolean timedOut = SystemClock.uptimeMillis() > endTime;
    			if (timedOut){
    				return null;
    			}
    
    			sleeper.sleep();
    
    			if(!hardStoppage)
    				timeout = 0;
    
    			final T textViewToReturn = searcher.searchFor(classToFilterBy, text, expectedMinimumNumberOfMatches, timeout, scroll, onlyVisible);
    
    			if (textViewToReturn != null ){
    				return textViewToReturn;
    			}
    		}
    	}
        @Override
    	public <R> R sendRequest(HttpRequest request,
    			ContentHandler<HttpResponse, R> handler) throws RedmineException {
    		logger.debug(request.getRequestLine().toString());
    
    		request.addHeader("Accept-Encoding", "gzip");
    		final HttpClient httpclient = client;
    		try {
    			final HttpResponse httpResponse = httpclient
    					.execute((HttpUriRequest) request);
    			try {
    				return handler.processContent(httpResponse);
    			} finally {
    				EntityUtils.consume(httpResponse.getEntity());
    
    			}
    		} catch (ClientProtocolException e1) {
    			throw new RedmineFormatException(e1);
    		} catch (IOException e1) {
    			throw new RedmineTransportException("Cannot fetch data from "
    					+ getMessageURI(request) + " : "
    							+ e1.toString(), e1);
    		}
    	}
        private static SFrame edgeListToSFrame ( List < Edge > ls , String srcColumnName , String dstColumnName ) {
      SFrame sf = new SFrame ( ) ;
      if ( CollectionUtils . isNotEmpty ( ls ) ) {
        Set < String > cols = CollectionUtils . intersection ( ls , new HashSet < String > ( ) ) ;
        sf . put ( srcColumnName , new ArrayList < String > ( ls . size ( ) ) ) ;
        sf . put ( dstColumnName , new ArrayList < String > ( ls . size ( ) ) ) ;
        for ( String c : cols ) {
          sf . put ( c , new ArrayList < String > ( ls . get ( c ) . attr . keySet ( ) ) ) ;
        }
      }
      else if ( CollectionUtils . isNotEmpty ( ls ) ) {
        sf . put ( srcColumnName , new ArrayList < String > ( ls . get ( srcColumnName ) ) ) ;
        sf . put ( dstColumnName , new ArrayList < String > ( ls . get ( dstColumnName ) ) ) ;
      }
      else {
        throw new IllegalArgumentException ( "Edges type {
    }
     is Not supported." , CollectionUtils . isEmpty ( ls ) ? "" : ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + ", " + "}" ) ;
      }
      return sf ;
    }
    }
}