class Test {
    public class Example {
    public Mark getXMark() {
        		Mark mark = null;
        		try {
        			mark = createMark(sldEditor.getFilterFactory().createLiteralExpression("X"), 
    					getDefaultStroke(), getDefaultFill(), 
    					sldEditor.getFilterFactory().createLiteralExpression(new Double(6.0)), 
    					sldEditor.getFilterFactory().createLiteralExpression(new Double(0.0)));
        		}
        		catch (Exception e) {
        			System.out.println("Error creating literal expression within StyleFactoryImpl");
        		}
           	return mark;
        }
        public void delete() {
    
    		for(int i = 1; i < m_nextNo; i++) {
    
    			new File(m_fileName + "_" + i).delete();
    
    		}
    
    		m_nextNo = 1;
    
    	}
        private void writeNextElement(StringBuilder sb, String nextElement) {
    		if (quotechar !=  NO_QUOTE_CHARACTER) {
    			sb.append(quotechar);
    		}
    		for (int j = 0; j < nextElement.length(); j++) {
    			char nextChar = nextElement.charAt(j);
    			if (escapechar != NO_ESCAPE_CHARACTER && nextChar == quotechar) {
    				sb.append(escapechar).append(nextChar);
    			}
    			else if (escapechar != NO_ESCAPE_CHARACTER && nextChar == escapechar) {
    				sb.append(escapechar).append(nextChar);
    			}
    			else {
    				sb.append(nextChar);
    			}
    		}
    		if (quotechar != NO_QUOTE_CHARACTER) {
    			sb.append(quotechar);
    		}
    	}
    }
}