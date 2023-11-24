class Test {
    public class Example {
    private Dimension getItemDimension(HListGroup hGroup){
       	
       	Dimension iconDim = hGroup.getIconSize();
       	Dimension labelDim = hGroup.getLabelSize();
       	
       	int itemWidth = elementInsets.left + elementInsets.right + iconDim.width + labelDim.width;
       	int itemHeight = elementInsets.top + elementInsets.bottom;
    
    		if(hGroup.getIconSize().height > hGroup.getLabelSize().height ){
    			
    			itemHeight += hGroup.getIconSize().height;
    			
    		}
    		else{
    			
    			itemHeight += hGroup.getLabelSize().height;
    			
    		}
    		
    		return new Dimension(itemWidth, itemHeight);
       }
        public void setScrollLines(String lines) {
        try {
          scrollLines.set(Integer.parseInt(lines));
        } catch (NumberFormatException e) {
          out.println("Error: lines must be a valid integer");
        }
      }
        public void testAllFailureFalse() {
        _support = new DispatcherSupport(DispatcherSupport.ALL_FAILURE, 2, _mainDispatcher);
        _support.success(null);
        assertNotNull(_mainResult);
        assertEquals(new Boolean(false), _mainResult);
      }
    }
}