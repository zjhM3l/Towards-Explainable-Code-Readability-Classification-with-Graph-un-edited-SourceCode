class Test {
    public class Example {
    public int getPageCount() {
             if (pageLimit == 0) {
                return 1;
            } else {
                return (int)(this.getTotalRecordCount() / pageLimit) + 1;
            }
        }
        FontRenderContext aaFontContext() {
        if (aaFontContext == null) {
          // set up the dummy font contexts
          Graphics2D aaGfx = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB).createGraphics();
          aaGfx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
          aaFontContext = aaGfx.getFontRenderContext();
        }
        return aaFontContext;
      }
        public Object getModel()  throws FrameworkRuntimeException {
    		
    		if (!this.supportsGetModel())
    			throw new FrameworkRuntimeException("The class does not support getModel()");
    		
    		try {
    			return this.m_getModelMethod.invoke(this.m_destination,(Object[])null);
    		} catch (Exception e) {
    			throw new FrameworkRuntimeException(e);
    		}
    	}
    }
}