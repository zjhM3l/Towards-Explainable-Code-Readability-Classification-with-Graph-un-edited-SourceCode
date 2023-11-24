class Test {
    public class Example {
    public boolean hasMoreElements() {
    	if ((next = next()) != null)
    	    return true;
    	return false;
        }
        public String toString (char format) {
    	String s = "";
    
    	switch (format) {
    	case 'm': 
    	    s = tag + '=' + value;
    	    break;
    	}
    	return s;
        }
        public void setStreet(String Parameter) throws Exception {
    		// begin-user-code
    		// TODO Auto-generated method stub
    		
    		//Parameter can be null
    		if(Parameter == null) {
    			this.street = null;
    			return;
    		}
    		
    		//Use regex to compare pattern to parameter
    		String pattern = ("[0-9]+\\s\\w[a-zA-Z\\s]+");
    		Boolean match = Parameter.matches(pattern);
    		if(!match) {
    			throw new Exception("PatternExceptionError: A street must be at least a number followed by a white space and at least two characters");
    		}
    		
    		//set street
    		this.street = Parameter;
    		
    		// end-user-code
    	}
    }
}