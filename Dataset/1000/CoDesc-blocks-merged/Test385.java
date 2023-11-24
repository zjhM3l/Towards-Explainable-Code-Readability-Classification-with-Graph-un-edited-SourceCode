class Test {
    public class Example {
    public void dump(DataOutputStream out) throws IOException {
             if(wide()) // Need WIDE prefix ?
                 out.writeByte(jq_ClassFileConstants.jbc_WIDE);
             
             out.writeByte(opcode);
             
             if(length > 1) { // Otherwise ILOAD_n, instruction, e.g.
                 if(wide())
                     out.writeShort(n);
                 else
                     out.writeByte(n);
             }
         }
        public String selectCourse() {
    		logger.debug("Starting method selectCourse");
    		CourseInfo course = currentCourse();
    		logger.debug("Returning to method selectCourse");
    		logger.debug(course.getId());
    		setBean(Constants.COURSE_INFO, course);
    
    		return Constants.COURSE_PAGE;
    	}
        protected void goSaveToFile() {
            if (indices.length == 1) {
    
                String filename = getSaveFileName(SpectrumFileFactory.VOTABLE_SUFFIX1,
                        SpectrumFileFactory.VOTABLE_SUFFIX2, ".fits");
    
                if (filename != null && filename.length() > 0) {
                    ManagedSpectrum msp = (ManagedSpectrum) server.getSpectrumStorage().get(indices[0]);
                    Spectrum sp = msp.getSpectrum();
    
                    sp.saveAsSED(filename);
                }
            }
        }
    }
}