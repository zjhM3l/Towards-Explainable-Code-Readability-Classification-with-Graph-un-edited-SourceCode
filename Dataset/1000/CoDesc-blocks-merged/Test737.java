class Test {
    public class Example {
    public boolean render(InternalContextAdapter context,Writer writer,Node node) throws IOException, MethodInvocationException {
      try {
        if (nodeTree != null) {
          VMContext vmc=new VMContext(context,rsvc);
          for (int i=0; i < argumentNamesArray.length; i++) {
            vmc.addVMProxyArg(args[i]);
          }
          nodeTree.render(vmc,writer);
        }
     else {
          rsvc.error("VM error : " + macroName + ". Null AST");
        }
      }
     catch (  Exception e) {
        if (e instanceof MethodInvocationException) {
          throw (MethodInvocationException)e;
        }
        rsvc.error("VelocimacroProxy.render() : exception VM = #" + macroName + "() : "+ StringUtils.stackTrace(e));
      }
      return true;
    }
        public void setCircle(float cx, float cy, float px, float py) {
        float dx = px - cx;
        float dy = py - cy;
        radius = (float) Math.sqrt(dx * dx + dy * dy);
        c1.setLocation(cx, cy);
        c2.setLocation(px, py);
        p1.setLocation(cx - radius, cy - radius);
        p2.setLocation(cx + radius, cy + radius);
        calculateBounds();
      }
        protected void resetFont(GC gc) {
            if (m_TMPfont!=null) {
                m_TMPfont.dispose();
                m_TMPfont = null;
            }
                
            gc.setFont(m_GCfont);
        }
    }
}