class Test {
    public class Example {
    public String getStatus(final Connection conn, final String code) {
    		String key = KEY_STS + code;
    		if (PROP_MESSAGES.containsKey(key)) {
    			return PROP_MESSAGES.get(key);
    		}
    
    		String sts = getMsgSts(key, code, conn);
    		if (sts != null && !sts.trim().isEmpty()) {
    			return sts;
    		}
    		return getNoStatus();
    	}
        public String toString() {
            String s =
            "valueName='"
            + valueName
            + "', "
            + "value='"
            + value
            + "', "
            + "snmpOid='"
            + snmpOid
            + "', "
            + "snmpTrapMin='"
            + snmpTrapMin
            + "', "
            + "snmpTrapMax='"
            + snmpTrapMax
            + "'";
            return s;
        }
        public Object clone() {
          UnknownRecord rec = new UnknownRecord();
          rec.sid = sid;
          rec.thedata = thedata;
          return rec;
        }
    }
}