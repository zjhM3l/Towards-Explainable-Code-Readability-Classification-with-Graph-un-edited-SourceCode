class Test {
    public class Example {
    public void linkResponsibleDepartment(Page responsibleTableRowPg) throws RQLException {
    		String templateName = getParameter("responsibleRowTemplateName");
    		if (!responsibleTableRowPg.isBasedOnTemplate(templateName)) {
    			throw new WrongTypeException("You try to link page with wrong template " + responsibleTableRowPg.getTemplateName()
    					+ ". You can link only pages of content class " + templateName + ".");
    		}
    
    		// remove and connect
    		List responsibleList = getResponsibleList();
    		responsibleList.disconnectAllChilds();
    		responsibleList.connectToExistingPage(responsibleTableRowPg, false);
    
    		// force re-read
    		deleteResponsibleRowCache();
    	}
        public Var appendChild(int index, Node child){
    		if(this == child){
    			throw new Error("Cannot append a node to itself.");
    		}
    		child.setParent(this);
    		children.add(index, child);
    		return this;
    	}
        public int errorCode ( Object[][] data, int member, int idx, Object what ) {
    		String val = StringUtil.notEmpty( what );
    		if ( MMB_ACTION == member )
    			return null != val && 0 > getInt( MMB_ACTION, 0, what ) ? ERR_CHECK_PATTERN : OK;
    		return formErrorCode( data, member, idx, val ); 
    	}
    }
}