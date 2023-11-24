class Test {
    public class Example {
    public void propagate() throws ContradictionException {
        //System.out.println("propagate" + this);
        if (logger.isLoggable(Level.FINER)) logger.finer("Propagate...");
        this.removeUselessEdges();
      }
        public void blueTextChanged(String text) throws DOMException {
                switch (getColorType()) {
                case SVG_COLORTYPE_RGBCOLOR:
                    text = "rgb(" +
                        getValue().getRed().getCssText() + ", " +
                        getValue().getGreen().getCssText() + ", " +
                        text + ")";
                    break;
    
                case SVG_COLORTYPE_RGBCOLOR_ICCCOLOR:
                    text = "rgb(" +
                        getValue().item(0).getRed().getCssText() + ", " +
                        getValue().item(0).getGreen().getCssText() + ", " +
                        text + ") " +
                        getValue().item(1).getCssText();
    
                default:
                    throw new DOMException
                        (DOMException.NO_MODIFICATION_ALLOWED_ERR, "");
                }
                textChanged(text);
            }
        protected void setPaSubStateBackup(int newSubStateBackup) {
    	paFlags = (paFlags & ~FLAGS_SUB_STATE_MASK) 
    	    | (newSubStateBackup << FLAGS_SUB_STATE_SHIFT);
    	persistentAttributeModified = true;
        }
    }
}