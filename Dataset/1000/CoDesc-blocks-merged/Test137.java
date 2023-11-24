class Test {
    public class Example {
    @Override
        public XMLStreamReader2 createXMLStreamReader(File f)
            throws XMLStreamException
        {
            /* true for auto-close, since caller has no access to the underlying
             * input stream created from the File
             */
            return createSR(f, false, true);
        }
        public Color getBackground () {
    	checkWidget ();
    //	int pixel = (background == -1) ? parent.getBackgroundPixel() : background;
    //	return Color.win32_new (display, pixel);
    	return new Color (display, handle.style.backgroundColor);
    }
        public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
            
    if ("CompetencyProfilePortSoap".equals(portName)) {
                setCompetencyProfilePortSoapEndpointAddress(address);
            }
            else 
    { // Unknown Port Name
                throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
            }
        }
    }
}