class Test {
    public class Example {
    @Override
        public ListActivatedRulesInRuleGroupResult listActivatedRulesInRuleGroup(ListActivatedRulesInRuleGroupRequest request) {
            request = beforeClientExecution(request);
            return executeListActivatedRulesInRuleGroup(request);
        }
        public String getRecaptchaHostName() {
            if (log.isTraceEnabled()) {
                log.trace("ENTER/EXIT: getRecaptchaHostName()[" + recaptchaHostName + "]");
            }
    
            return recaptchaHostName;
        }
        public HttpResponse send() {
    		if (!followRedirects) {
    			return _send();
    		}
    
    		int redirects = this.maxRedirects;
    
    		while (redirects > 0) {
    			redirects--;
    
    			final HttpResponse httpResponse = _send();
    
    			final int statusCode = httpResponse.statusCode();
    
    			if (HttpStatus.isRedirect(statusCode)) {
    				_reset();
    				set(httpResponse.location());
    				continue;
    			}
    
    			return httpResponse;
    		}
    
    		throw new HttpException("Max number of redirects exceeded: " + this.maxRedirects);
    	}
    }
}