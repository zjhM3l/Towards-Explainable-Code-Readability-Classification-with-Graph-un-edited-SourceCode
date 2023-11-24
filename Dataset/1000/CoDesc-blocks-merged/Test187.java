class Test {
    public class Example {
    private void initialize() {
    		messageKey = "gpe_polygon_without_three_coordinates_error";
    		formatString = "The polygon has not three coordinates at least (it has" +
    				" %(size)). Its coordinates are %(coordinates)";				
    		code = serialVersionUID;
    	}
        public boolean equals(Object object) {
            if (object == null)
                return false;
    
            Attr aMibObject;
    
            try {
                aMibObject = (Attr) object;
            } catch (ClassCastException cce) {
                return false;
            }
    
            if (m_name.equals(aMibObject.getName())) {
                return true;
            }
            return false;
    
        }
        public void removeAllImages() {
            for (Iterator it = getImageNames(); it.hasNext();) {
                setImage((String) it.next(), null);
            }
        }
    }
}