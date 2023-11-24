class Test {
    public class Example {
    public TuioObject (long si, int sym, float xp, float yp, float a) {
    		super(si,xp,yp);
    		symbol_id = sym;
    		angle = angle;
    		rotation_speed = 0.0f;
    		rotation_accel = 0.0f;
    	}
        public int getEndIndexForTupletGroup(int beginIndex) {
            NotationElement element;
            NotationNote note;
            Fraction durationSoFar = new Fraction(0, 1);
            for (int i = beginIndex; i < this.size(); i++) {
                element = this.get(i);
                if (element instanceof NotationNote) {                
                    note = (NotationNote) element;
                    durationSoFar = durationSoFar.plus(note.getDuration());
                    
                    if (durationSoFar.denomIsPowerOf2()) return i;                
                }
            }
            
            return -1;
        }
        public void setSelectionBackground (Color color) {
    	checkWidget ();
    	if (color != null) {
    		if (color.isDisposed()) SWT.error(SWT.ERROR_INVALID_ARGUMENT);
    	}
    	selectionBackground = color;
    	super.redraw();
    }
    }
}