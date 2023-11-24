class Test {
    public class Example {
    @Override public void eUnset(int featureID){
    switch (featureID) {
    case ExpressionsPackage.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__LEFT_OPERAND:
        setLeftOperand((Expression)null);
      return;
    case ExpressionsPackage.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__OPERATOR:
    setOperator(OPERATOR_EDEFAULT);
    return;
    case ExpressionsPackage.NUMERICAL_MULTIPLY_DIVIDE_EXPRESSION__RIGHT_OPERAND:
    setRightOperand((Expression)null);
    return;
    }
    super.eUnset(featureID);
    }
        public void setDefinition(String definition) {
    		if (this.term_definition == null) {
    			this.term_definition = new TermDefinition();
    		}
    		this.term_definition.setTerm_id(term_id);
    		this.term_definition.setTerm_definition(definition);
    	}
        protected void drawBorder (Graphics g) {
    		// wipe the background (spacing colour)
    		g.setColor (this.spacingColour);
    		g.fillRect (0, 0, getWidth(), getHeight());
    
    		g.setColor (Color.black);
    		int size = getWidth();
    		g.drawRect (0, 0, size - 1, size - 1);
    	}
    }
}