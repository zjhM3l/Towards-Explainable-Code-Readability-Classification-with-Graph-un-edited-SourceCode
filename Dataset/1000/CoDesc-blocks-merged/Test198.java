class Test {
    public class Example {
    public void start(BundleContext context) throws Exception {
    		super.start(context);
    		plugin = this;
    		System.out.println("Semantic Assistants Plug-in Started Successfully.");
    		metadata = getStateLocation().toString();
    	}
        public boolean containsPairWithAllFourIntersections(){
      for (int s=1; s <= size(); s++) {
        Split S=getSplit(s);
        for (int t=s + 1; t <= size(); t++) {
          Split T=getSplit(t);
          if (S.getA().intersects(T.getA()) && S.getA().intersects(T.getB()) && S.getB().intersects(T.getA())&& S.getB().intersects(T.getB()))       return true;
        }
      }
      return false;
    }
        private void addPlanControllerListener(final PlanController planController) {
        planController.addPropertyChangeListener(PlanController.Property.MODE, 
            new PropertyChangeListener() {
              public void propertyChange(PropertyChangeEvent ev) {
                selectToggleModel.setSelected(planController.getMode() 
                    == PlanController.Mode.SELECTION);
                createWallsToggleModel.setSelected(planController.getMode() 
                    == PlanController.Mode.WALL_CREATION);
                createDimensionLinesToggleModel.setSelected(planController.getMode() 
                    == PlanController.Mode.DIMENSION_LINE_CREATION);
              }
            });
      }
    }
}