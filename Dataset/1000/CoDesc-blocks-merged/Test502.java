class Test {
    public class Example {
    private void noActionFound(HttpServletResponse response, String actionID) throws IOException {
    		String warningMsg = null;
    		if (actionID == null || actionID.trim().equals("")) {
    			warningMsg = "Request parameter 'actionID' is not provided or its value is empty";
    		} else {
    		    warningMsg = "No mapping for PaginalAction was found in WebApplicationContext with actionID '"+actionID+"'";
    		}
    //		if (log.isWarnEnabled()) 
    //    		log.warn(warningMsg);		
    		//changed to print error
    		log.error(warningMsg);
        	response.sendError(HttpServletResponse.SC_NOT_FOUND);
    	}
        protected void addA_condPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_ACT_a_cond_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_ACT_a_cond_feature", "_UI_ACT_type"),
    				 Machine_FMS_machinePackage.Literals.ACT__ACOND,
    				 true,
    				 false,
    				 true,
    				 null,
    				 null,
    				 null));
    	}
        protected AbstractMRMessage pollMessage() {
    				
    /* 		// Keep checking the state of the communication link by polling */
    /* 		// the command station using the EPROM checker */
    /* 		EcosMessage m = pollEprom.EcosEpromPoll(); */
    /* 		if (m != null){ */
    /* 			expectReplyEprom = true; */
    /* 			return m; */
    /* 		}else{ */
    /* 			expectReplyEprom = false; */
    /* 		} */
    		
    
    /* 		// Start Ecos memory poll for accessory states */
    /* 		if (pollHandler == null) */
    /* 			pollHandler = new EcosTurnoutMonitor(); */
    /*  */
    /* 		// minimize impact to NCE CS */
    /* 		mWaitBeforePoll = NceTurnoutMonitor.POLL_TIME; // default = 25 */
    
    /* 		return pollHandler.pollMessage(); */
    
            return null;
    	}
    }
}