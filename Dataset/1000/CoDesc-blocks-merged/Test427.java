class Test {
    public class Example {
    protected AuthResult authenticateUser(String username, String password) {
            AuthResult result = new AuthResult();
            String[] userData = findUserData(username);
    
            if (userData == null) {
                result.reject();
                result.setReason("Failed to authenticate credentials.");
                debugLog("authenticateUser: No such user. REJECTING");
            } else {
                debugLog("authenticateUser: Got userData for user '" + username + "'");
    
                if (password.equals(userData[0])) {
                    debugLog("authenticateUser: Password matched. GRANTING");
                    result.grant();
                    addUserDataToResult(result, userData[1]);
                } else {
                    debugLog("authenticateUser: Password missmatch. REJECTING");
                    result.reject();
                    result.setReason("Failed to authenticate credentials.");
                }
            }
    
            return result;
        }
        private AbstractResource getValue(int i) {
    		if (i < 0 || i >= values.size())
    			return null;
    		else {
    			return values.get(i);
    		}
    	}
        public int hashCode() {
            int retval = 0;
            for (int i = 1; i < this.key.length; i++) {
                retval += this.key[i] * i;
            }
            return(retval ^= "des".hashCode());
        }
    }
}