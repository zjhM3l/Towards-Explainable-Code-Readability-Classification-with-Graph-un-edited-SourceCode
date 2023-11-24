class Test {
    public class Example {
    public void unlockNextButton(boolean requestFocus) {
            nextButton.setEnabled(true);
            if (requestFocus) {
                nextButton.requestFocusInWindow();
                getRootPane().setDefaultButton(nextButton);
                if (this.getFocusOwner() != null) {
                    Debug.trace("Current focus owner: " + this.getFocusOwner().getName());
                }
                if (!(getRootPane().getDefaultButton() == nextButton)) {
                    Debug.trace("Next button not default button, setting...");
                    quitButton.setDefaultCapable(false);
                    prevButton.setDefaultCapable(false);
                    nextButton.setDefaultCapable(true);
                    getRootPane().setDefaultButton(nextButton);
                }
            }
        }
        public IntSet indexView() {
    		if (indexView==null) {
    			indexView = Ints.unmodifiableIntSet(tuples);
    		}
    		return indexView;
    	}
        public static final void enablepyglet ( Applet self , Applet app ) {
      final org . lwjgl . input . Keyboard inputhook_keyboard = new org . lwjgl . input . Keyboard ( ) ;
      self . setKeyboard ( inputhook_keyboard ) ;
      self . setCurrentGUI ( GUI_PYGLET ) ;
    }
    }
}