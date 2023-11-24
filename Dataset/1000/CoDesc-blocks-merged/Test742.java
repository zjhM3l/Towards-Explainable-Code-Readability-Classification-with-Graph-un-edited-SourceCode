class Test {
    public class Example {
    public String toURLEncodedQueryString() throws FSMsgException {
      StringBuffer urlEncodedAuthnReq=new StringBuffer(300);
      if ((authnContextClassRefList != null) && (!authnContextClassRefList.isEmpty())) {
        if ((authnContextStatementRefList != null) && (!authnContextStatementRefList.isEmpty())) {
          throw new FSMsgException("ExclusiveEntries",null);
        }
        StringBuffer strEncodedString=new StringBuffer(100);
        Iterator j=authnContextClassRefList.iterator();
        strEncodedString.append((String)j.next());
        while (j.hasNext()) {
          strEncodedString.append(" ").append((String)j.next());
        }
        urlEncodedAuthnReq.append("AuthnContextClassRef=").append(URLEncDec.encode(strEncodedString.toString())).append(IFSConstants.AMPERSAND);
      }
      if ((authnContextStatementRefList != null) && (!authnContextStatementRefList.isEmpty())) {
        StringBuffer strEncodedString=new StringBuffer(100);
        Iterator j=authnContextStatementRefList.iterator();
        strEncodedString.append((String)j.next());
        while (j.hasNext()) {
          strEncodedString.append(" ").append((String)j.next());
        }
        urlEncodedAuthnReq.append("AuthnContextClassRef=").append(URLEncDec.encode(strEncodedString.toString())).append(IFSConstants.AMPERSAND);
      }
      if (minorVersion == IFSConstants.FF_12_PROTOCOL_MINOR_VERSION) {
        if (authnContextComparison != null) {
          urlEncodedAuthnReq.append("AuthnContextComparison=").append(URLEncDec.encode(authnContextComparison)).append(IFSConstants.AMPERSAND);
        }
      }
      return urlEncodedAuthnReq.toString();
    }
        public int getPosition() {
            if (_parent == null) {
                return -1;
            }
            return _parent.getNodeIndex(this);
        }
        public EClass getIfcDocumentSelect() {
    
    		if (ifcDocumentSelectEClass == null) {
    
    			ifcDocumentSelectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(Ifc2x3tc1Package.eNS_URI)
    
    					.getEClassifiers().get(952);
    
    		}
    
    		return ifcDocumentSelectEClass;
    
    	}
    }
}