class Test {
    public class Example {
    public void actionPerformed(ActionEvent event) {
    		String command = event.getActionCommand();
    		if (command.equals("BackgroundPaint")) {
    			attemptBackgroundPaintSelection();
    		} else
    			if (command.equals("OutlineStroke")) {
    				attemptOutlineStrokeSelection();
    			} else
    				if (command.equals("OutlinePaint")) {
    					attemptOutlinePaintSelection();
    				} else
    					if (command.equals("Insets")) {
    						editInsets();
    					}
    
    	}
        public Object getValue(int index) {
    		rangeCheck(index);
    		KeyColumn keyColumn = getInternalKeyList().get(index);
    		return keyColumn.getValue();
    	}
        public CarModels getLengthCarModels(Integer length) {
    		PropertyRule<CarModel> rule = PropertyRule
    				.defineEqual("length", length);
    		return getCarModels(rule);
    	}
    }
}