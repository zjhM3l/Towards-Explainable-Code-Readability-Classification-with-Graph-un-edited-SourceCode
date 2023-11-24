class Test {
    public class Example {
    public void unwind(final String tagName) throws SAXException, XmlReaderException {
            this.currentHandlers.pop();
            if (this.currentHandlers.isEmpty() && !this.outerScopes.isEmpty()) {
                this.currentHandlers = (Stack) this.outerScopes.pop();
            }
            if (!this.currentHandlers.isEmpty()) {
                getCurrentHandler().endElement(tagName);
            }
        }
        private void copy(InputStream in, File outFile) throws IOException {
    
            log.logFile(outFile);
    		OperatingSystem.getOperatingSystem().mkdirs(log, outFile.getParentFile());
    
    		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outFile));
            copy(in, out);
    		out.close();
    	}
        public void addNoteList(double[] freqArray, double[] rhythmArray){
    		int[] dynamic = new int[freqArray.length];
    		for(int i=0;i<freqArray.length;i++){
    			dynamic[i] = Note.DEFAULT_DYNAMIC;
    		}
    		this.addNoteList(freqArray, rhythmArray, dynamic);
    	}
    }
}