class Test {
    public class Example {
    public void setConfigPropertyValue(String property, Object value) {
    		Object oldValue = getConfigPropertyValue(property);
    		prefs.put(property, value.toString());
    
    		if (property.equals(LANGUAGE_PROPERTY)) {
    			changeSupport.firePropertyChange("propertyConfiguration", oldValue, value);
    		}
    	}
        public int getPathType() {
            if (isAbsolute()) {
                throw new IllegalStateException
                    ("Cannot call this method on an absolute url '"
                     + getExternalForm() + "'");
            }
    
            if (getAuthority() != null) {
                // URL is relative with a net_path (authority)
                // therefore it is fully qualified
                return FULLY_QUALIFIED_PATH;
            } else {
                // must be dealing with a relative URL
                String path = getPath();
    
                if (path != null && path.startsWith("/")) {
                    return HOST_RELATIVE_PATH;
                }
                // relative URL is neither fully qualified or host relative
                // so it must be document relative.
                return DOCUMENT_RELATIVE_PATH;
            }
        }
        protected AbstractMatrix3D vColumnFlip() {
            if (columns > 0) {
                columnZero += (columns - 1) * columnStride;
                columnStride = -columnStride;
                this.isNoView = false;
            }
            return this;
        }
    }
}