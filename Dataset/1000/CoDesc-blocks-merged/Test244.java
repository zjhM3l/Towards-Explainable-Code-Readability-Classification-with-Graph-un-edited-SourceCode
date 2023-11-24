class Test {
    public class Example {
    public String getLocalCode(String interfaceName, int hl7Table, String interfaceCode) throws HL7Exception {
            String localCode = null;
            try {
                HashMap<String, HashMap<String, String>> interfaceMap = interfaceToLocal.get(interfaceName);
                localCode = getCode(interfaceMap, hl7Table, interfaceCode);
            }
            catch (NullPointerException npe) {
                if (this.throwIfNoMatch)
                    throw new HL7Exception(
                        "No local mapping for the interface code "
                            + interfaceCode
                            + " for HL7 table "
                            + hl7Table
                            + " for the interface '"
                            + interfaceName
                            + "'",
                        HL7Exception.TABLE_VALUE_NOT_FOUND);
            }
            return localCode;
        }
        public boolean verifyEmail(String email) {
    		String patten = "^[\\w-]+(\\.[\\w-]+)*@[\\w-]+(\\.[\\w-]+)+$";
    		;
    		if (email.length() != 0)
    			if (!email.matches(patten)) {
    				return false;
    			}
    		return true;
    	}
        public void writeConfig() {
        try {
          cm.setRoamAlertDetails(switchAlert, false);
          cm.setPollIntervalDetails(delay, false);
          cm.setLogDetails(false, true, "Log.txt", false);
          cm.setNotificationDetails(emailnotify, emailserver, fromaddress, toaddress, false);
    
          cm.save();
        } catch (Exception ex) {
          Logger.log("Error in writing config files: " + ex.getMessage());
        }
      }
    }
}