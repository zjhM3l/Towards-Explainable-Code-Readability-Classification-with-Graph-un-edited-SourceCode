class Test {
    public class Example {
    public NodeSet eval(final XPContext ctx) throws EvalException {
        final NodeSet tmp = ctx.local;
        for(int s = 0; s < size; s++) {
          ctx.local = steps[s].eval(ctx);
          if(ctx.stopped()) throw new EvalException("");
        }
        final NodeSet res = ctx.local;
        ctx.local = tmp;
        return res;
      }
        static public Image getImage(String name)
    	{ 
    		Image image = null;
    		URL imageLoader = new ImageManager().getClass().getResource(name);
    		if(imageLoader != null)
    			image = Toolkit.getDefaultToolkit().getImage(imageLoader); 
    		return image;
    	}
        public String toFIPAString () {
            return ("agent-identifier  " +
                    " :name " + getName() +"@" + getHost() + 
                    " :addresses (sequence " + allAddresses() + ")");
        }
    }
}