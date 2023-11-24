class Test {
    public class Example {
    public static String removeEnd(final String s, final String remove) {
            if (isEmpty(s) || isEmpty(remove)) {
                return s;
            }
            if (s.endsWith(remove)) {
                return s.substring(0, s.length() - remove.length());
            }
            return s;
        }
        protected PortletPreferences getPortletPreferencesFromPortletAPI() {
    		FacesContext facesContext = FacesContext.getCurrentInstance();
    		PortletRequest portletRequest = (PortletRequest)facesContext.getExternalContext().getRequest();
    		return portletRequest.getPreferences();
    	}
        public void sendToObservers(FreeCallEvent ev) {
    	// send to observers
    	FreeCallEvent[] evs = {ev};
    	this.getListenerMgr().sendEvents(evs);
    }
    }
}