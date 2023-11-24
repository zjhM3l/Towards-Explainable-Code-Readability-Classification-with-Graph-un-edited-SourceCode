class Test {
    public class Example {
    public void destroy() throws UimacppException {
        try {
          destroyJNI();
        } catch (Exception exc) {
          throwJTafException(exc);
        }
      }
        public void editValue(Object newValue) {
    		setName((String) newValue);
    		sortContent();
    		fireChangeEvent(this, newValue);
    	}
        public void actionPerformed(ActionEvent event) {
            this.plot.setStartAngle(this.angle);
            this.angle = this.angle + 1;
            if (this.angle == 360) {
                this.angle = 0;
            }
        }
    }
}