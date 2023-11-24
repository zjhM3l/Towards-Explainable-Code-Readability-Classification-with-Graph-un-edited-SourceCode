class Test {
    public class Example {
    public void testIsAutoIncrement_InvalidColumn3() {
    		try
    		{
    			ResultSetMetaData resMetaData = new DefaultResultSetMetaData(metaDataEntry);
    			
    			resMetaData.isAutoIncrement(10);
    			fail("SQLException is expected.");
    		}
    		catch(SQLException e)
    		{
    			//ensure the SQLException is thrown by isAutoIncrement method.
    			assertEquals("The sqlstate mismatches", "22003", e.getSQLState());
    		}
    	}
        public void render(EMFRenderer renderer) {
            renderer.setUseCreatePen(true);
            renderer.setPenPaint(color);
            renderer.setPenStroke(
                createStroke(renderer,  penStyle, null, width));
        }
        public Object getArgument() throws InstantiationException {
    		if (value == null) return null;
    		try {
    			return Image.getInstance(value);
    		} catch (Exception e) {
    			throw new InstantiationException(e.getMessage());
    		}
    	}
    }
}