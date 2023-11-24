class Test {
    public class Example {
    public void setCentre(Point p) {
            try {
                Position newCentre = toPosition(p);
                if (newCentre != null) {
                    centre = newCentre;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        private void breakSubSorterLoop() {
    		GridViewerColumnComparator loopPoint = findSubsorter(this);
    		if (loopPoint!=null) {
    			loopPoint.clearSubSorter();
    		}
    	}
        public SavePlotAction(final GuiComponent component){
      super("Save");
      if (component == null) {
        throw new IllegalArgumentException("Desktop component must not be null");
      }
      this.component=component;
    }
    }
}