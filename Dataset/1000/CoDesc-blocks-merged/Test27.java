class Test {
    public class Example {
    public URL getAppLoginUrl(String siteId, String ip, boolean js) {
            String url = getSecureUrl();
            url += "wapplogin.srf?app=" + getAppVerifier(ip);
            url += "&alg=" + getSecurityAlgorithm();
    
            if (!isVoid(siteId)) {
                url += "&id=" + siteId;
            }
    
            if (js) {
                url += "&js=1";
            }
    
            try {
                return new URL(url);
            } catch (Exception e) {
                debug("Error: getAppLoginUrl: Could not create application login URL: " 
                      + url + ", " + e);
            }
    
            return null;
        }
        protected void addResolveProxiesPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_MReference_resolveProxies_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_MReference_resolveProxies_feature", "_UI_MReference_type"),
    				 ClassDiagramPackage.Literals.MREFERENCE__RESOLVE_PROXIES,
    				 true,
    				 false,
    				 false,
    				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
    				 null,
    				 null));
    	}
        public Object visit(VoidType host, Object data) {
            //--- Unpack arguments ---
            String indent = (String) ((Map) data).get("indent");
            return "VoidType";
        }
    }
}