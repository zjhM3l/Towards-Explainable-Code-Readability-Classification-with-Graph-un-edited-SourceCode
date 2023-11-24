class Test {
    public class Example {
    public Vector4i sub(Vector4i v){
      x-=v.x;
      y-=v.y;
      z-=v.z;
      w-=v.w;
      return this;
    }
        public void addSubCondition(Condition condition) {
            if (!getOp().hasOperands()) {
                throw new UnsupportedOperationException(String.format(
                    "%s conditions cannot have subconditions", condition.getOp()));
            }
            condition.testFixed(true);
            testFixed(false);
            if (this.typeGraph != null) {
                condition.setTypeGraph(this.typeGraph);
            }
            getSubConditions().add(condition);
            if (getRule() != null) {
                for (Rule subRule : condition.getTopRules()) {
                    getRule().addSubRule(subRule);
                }
            }
        }
        public static boolean isSelinuxFlagInEnabled(){
      String selinux=null;
      try {
        Class<?> c=Class.forName("android.os.SystemProperties");
        Method get=c.getMethod("get",String.class);
        selinux=(String)get.invoke(c,"ro.build.selinux");
      }
     catch (  Exception ignored) {
      }
      return "1".equals(selinux) ? true : false;
    }
    }
}