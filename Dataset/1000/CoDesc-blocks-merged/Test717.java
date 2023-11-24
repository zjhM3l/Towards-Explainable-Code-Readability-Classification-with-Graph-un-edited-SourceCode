class Test {
    public class Example {
    public final void setMaxPriority(int pri) {
            int ngroupsSnapshot;
            ThreadGroup[] groupsSnapshot;
            synchronized (this) {
                checkAccess();
                // Android-changed: Clamp to MIN_PRIORITY, MAX_PRIORITY.
                // if (pri < Thread.MIN_PRIORITY || pri > Thread.MAX_PRIORITY) {
                //     return;
                // }
                if (pri < Thread.MIN_PRIORITY) {
                    pri = Thread.MIN_PRIORITY;
                }
                if (pri > Thread.MAX_PRIORITY) {
                    pri = Thread.MAX_PRIORITY;
                }
    
                maxPriority = (parent != null) ? Math.min(pri, parent.maxPriority) : pri;
                ngroupsSnapshot = ngroups;
                if (groups != null) {
                    groupsSnapshot = Arrays.copyOf(groups, ngroupsSnapshot);
                } else {
                    groupsSnapshot = null;
                }
            }
            for (int i = 0 ; i < ngroupsSnapshot ; i++) {
                groupsSnapshot[i].setMaxPriority(pri);
            }
        }
        public boolean processAccountProfile(DiameterMessage diameterAnswerMessage, Properties asynInterfaceParameters){
    	boolean status = true;
    	String value = "";
    	AttributeValuePair attributeValuePair;
    	attributeValuePair = diameterAnswerMessage.getAttributeValuePair(Integer.toString(APOLLO_ACCOUNT_PROFILE));
    	if (attributeValuePair != null){
    	  value = attributeValuePair.getValueAsString();
    	  asynInterfaceParameters.put(RT_AP_USSD_PARAM, value);
    	} else status = false;
    	msgLog(" : ===>> (USSD) ACOUNT PROFILE, VALUE = " + asynInterfaceParameters.getProperty(RT_AP_USSD_PARAM));
    	return status;
      }
        public boolean equals( Object o ) {
    
        boolean retVal = false;
        if ( o instanceof OarsetView ) {
          retVal = this.getId() == ((OarsetView)o).getId();
        }
    
        return retVal;
      } // equals(Object)
    }
}