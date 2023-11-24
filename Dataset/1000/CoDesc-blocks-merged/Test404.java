class Test {
    public class Example {
    private void isHandlerValid() {
            for (int i = 0; i < m_exporters.size(); i++) {
                ServiceExporter exp = (ServiceExporter) m_exporters.get(i);
                if (exp.getState() != DependencyModel.RESOLVED) {
                    setValidity(false);
                    return;
                }
            }
    
            setValidity(true);
        }
        private void setPortletTitle() {
    		final RenderResponse resp = PortletUtils.getRenderResponse();
    		resp.setTitle(Bundle.getLabel("label.portlet.title"));
    		PortletUtils.getContext().getExternalContext().setResponse(resp);
    	}
        public int compareTo(Object o) {
    		if (this == o)
    			return 0;
    		if (!(o instanceof SupplierProduct))
    			throw new ClassCastException("A SupplierProduct object expected.");
    		else {
    			SupplierProduct supPro = (SupplierProduct) o;
    			return code.compareTo(supPro.getCode());
    		}
    	}
    }
}