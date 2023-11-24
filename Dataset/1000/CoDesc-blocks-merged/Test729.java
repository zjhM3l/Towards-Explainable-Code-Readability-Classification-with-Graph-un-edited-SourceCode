class Test {
    public class Example {
    public CsrfToken loadToken(HttpServletRequest request) {
    		HttpSession session = request.getSession(false);
    		if (session == null) {
    			return null;
    		}
    		return (CsrfToken) session.getAttribute(this.sessionAttributeName);
    	}
        public Movie(String id,String name,String description){
      this.id=id;
      this.name=name;
      this.description=description;
    }
        public void setFiscalYear(int fiscalYear) {
    
    		/*
    		 * XXX COM4J generates a short for fiscalYear, and crashes without
    		 * throwing an exception. Change it to 'int' and it magically works (UBC
    		 * v3.8.2, COM4J v20080107).
    		 */
    		this.ubcAdministration.fiscalYear(fiscalYear);
    
    	}
    }
}