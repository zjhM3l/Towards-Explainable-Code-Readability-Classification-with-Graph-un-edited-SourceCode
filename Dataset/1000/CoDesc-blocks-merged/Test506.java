class Test {
    public class Example {
    public static int getColor(Context context, @AttrRes int attrId) {
            int color = 0;
            TypedArray a = context.obtainStyledAttributes(new int[]{attrId});
            try {
                color = a.getColor(0, 0);
            } catch (UnsupportedOperationException e) {
                error("color", attrId, e);
            }
            a.recycle();
            return color;
        }
        public static Scenario loadScenarioFromPlans(String plansFile){
      Config config=new Config();
      config.addCoreModules();
      config.plans().setInputFile(plansFile);
      Scenario scenario=ScenarioUtils.loadScenario(config);
      return scenario;
    }
        final public void setLeft(Leaf subtree) {
    		if(left==subtree)
    			return;
    		if(left!=null)
    			left.setParent(null);
    		left=subtree;
    		if(subtree!=null)
    			subtree.setParent(this);
    	}
    }
}