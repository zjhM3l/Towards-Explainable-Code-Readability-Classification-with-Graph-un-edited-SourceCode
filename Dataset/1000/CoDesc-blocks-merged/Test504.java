class Test {
    public class Example {
    public void actionPerformed(ActionEvent ev) {
    	    // check params
    	    if( ev == null )
    		return;
    	    
    	    String command = ev.getActionCommand();
    	    
    	    if( GUICommandStrings.OK_COMMAND.equals(command) ){
    		// the user wants to clone the agent
    		this.getMainWindow().cloneAglet(this.proxy);
    		this.setVisible(false);
    		this.dispose();
    	    }
    	    else
    		super.actionPerformed(ev);
    	}
        public void remind() {
            if (SystemTrayIconJDK6Impl.isVisible(icon) == false)
                return;
    
            String messageKey;
            if (pdash.getTimeLoggingModel().isPaused()) {
                messageKey = "Pause_Reminder_FMT";
            } else {
                messageKey = "Active_Reminder_FMT";
            }
            String windowTitle = pdash.getTitle();
            String msgBody = Reminder.resource.format(messageKey, windowTitle,
                    pdash.getActiveTaskModel().getPath());
            String msgTitle = Reminder.resource.format("Title_FMT", windowTitle);
            Reminder.this.icon.displayMessage(msgTitle, msgBody,
                    TrayIcon.MessageType.NONE);
        }
        public void setPOCName(String pocname) {
            POC_NAME = pocname;
            for (int i=0; i<observers.size(); i++) {
                SensorObserver observer = (SensorObserver)observers.get(i);
                if (observer != null) {
                    observer.sensorUpdated(getHostName(), this);
                } else {
                    observers.remove(i);
                }
            }
        }
    }
}