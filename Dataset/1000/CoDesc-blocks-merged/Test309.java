class Test {
    public class Example {
    public String load(String fileName) {
            AppContext.getInstance().setConfigFile(new File( fileName ));
            AppContext.getInstance().installConfiguration();
     		StringBuffer outStrings = new StringBuffer();
            /*
            try {
                AppContext.getInstance().getConfig().load(); // FixME: and the fileName case ?
                AppContext.getInstance().getConfig().update();
            } catch( IOException io_err ) {
                outStrings.append( CommandUtil.makeUIError(io_err.getMessage(),CommandUtil.HIGH,this ));
            }
            */
            return (String)outStrings.toString();
        }
        public void setScripts(java.util.Collection<Script> scripts) {
            if (scripts == null) {
                this.scripts = null;
                return;
            }
    
            this.scripts = new java.util.ArrayList<Script>(scripts);
        }
        @Override public void write(URI f,URIChooser chooser) throws IOException {
      Drawing drawing=view.getDrawing();
      OutputFormat outputFormat=drawing.getOutputFormats().get(0);
      outputFormat.write(f,drawing);
    }
    }
}