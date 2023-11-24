class Test {
    public class Example {
    public Object copy_data(Object destination, Object source) {
            ProcessIOSample typedDst = (ProcessIOSample) destination;
            ProcessIOSample typedSrc = (ProcessIOSample) source;
    
            return typedDst.copy_from(typedSrc);
        
        }
        private void createTraceHTML() {
    		String traceOutputFilename = traceXMLFilename.replaceFirst(".xml",
    				".html");
    		XMLHelper.applyXSL(new File(traceXMLFilename), new File(
    				traceXSLFilename), traceOutputFilename);
    	}
        public Command getItemCommand28() {
            if (itemCommand28 == null) {//GEN-END:|441-getter|0|441-preInit
                // write pre-init user code here
                itemCommand28 = new Command("Contactar", Command.ITEM, 0);//GEN-LINE:|441-getter|1|441-postInit
                // write post-init user code here
            }//GEN-BEGIN:|441-getter|2|
            return itemCommand28;
        }
    }
}