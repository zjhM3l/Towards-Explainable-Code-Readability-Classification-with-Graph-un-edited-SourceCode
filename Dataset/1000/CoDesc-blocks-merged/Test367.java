class Test {
    public class Example {
    public void run() {
    		// Don't return from open() until window closes
    		setBlockOnOpen(true);
    		try {
    			// Open the main window
    			open();
    
    		} catch (Throwable e) {
    			if (printStream != null) {
    				e.printStackTrace(printStream);
    			} else {
    				MessageBox mb = new MessageBox(getShell(), SWT.ICON_ERROR);
    				String error = "Exception: " + e.getMessage();
    				mb.setMessage(error);
    				mb.setText(error);
    				mb.open();
    			}
    
    		}
    		// reset the org out stream in system
    		System.setOut(backupSystemOutStream);
    
    		// Dispose the display
    		Display.getCurrent().dispose();
    	}
        private void fetchPLCLinks() throws LinkException {
            logger.fine("Fetching PLC links");
            // get PLC link entries first
            List<PLCLinkEntry> list = mgr.getLinks();
            // immediate barf
            if (list == null) {
                throw new LinkException("No links in PLC");
            }
            for (AbstractLinkEntry entry : list) {
                logger.finest("Cache " + mgr.getTransceiverDevice().getDeviceId() + " = " + entry);
                addToCache(mgr.getTransceiverDevice().getDeviceId(),entry);
            }
            logger.fine("Done retrieving PLC links");
        }
        public void update(ContactDTO dto) {
            if (dto == null) {
                throw new NullPointerException("Contact Data Transfer Object required");
            }
    
            contactPerson = dto.getContactPerson();
            contactOrganization = dto.getContactOrganization();
            contactPosition = dto.getContactPosition();
            addressType = dto.getAddressType();
            address = dto.getAddress();
            addressCity = dto.getAddressCity();
            addressState = dto.getAddressState();
            addressPostalCode = dto.getAddressPostalCode();
            addressCountry = dto.getAddressCountry();
            contactVoice = dto.getContactVoice();
            contactFacsimile = dto.getContactFacsimile();
            contactEmail = dto.getContactEmail();
            onlineResource = dto.getOnlineResource();
        }
    }
}