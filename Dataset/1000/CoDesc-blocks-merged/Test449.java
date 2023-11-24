class Test {
    public class Example {
    private void parseDocument() {
    		// get the root elememt
    		Element docEle = dom.getDocumentElement();
    
    		NodeList nl = docEle.getElementsByTagName("Action");
    		if (nl != null && nl.getLength() > 0)
    		{
    			for (int i = 0; i < nl.getLength(); i++)
    			{
    				Element el = (Element) nl.item(i);
    
    				getAction(el);
    
    				//				// add it to list
    				//				actionList.add(a);
    			}
    		}
    	}
        private void doSearch()
    
        {
    
            setSearchPanelVisible(true);
    
            String selectedText = textComponent.getSelectedText();
    
            if (selectedText != null)
    
            {
    
                searchPanel.setQuery(selectedText);
    
            }
    
            searchPanel.requestFocusForTextField();
    
        }
        public void replaceChildrenByValues(GeoElement geo) {
    		if (expression != null) {
    			expression.replaceChildrenByValues(geo);
    		}
    	}
    }
}