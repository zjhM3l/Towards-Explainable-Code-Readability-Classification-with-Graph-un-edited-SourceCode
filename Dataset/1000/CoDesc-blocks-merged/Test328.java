class Test {
    public class Example {
    protected JarFile asJarFile() throws IOException {
    		if (this.jarFile == null) {
    			File file = asFile();
    			if (UpdateCore.DEBUG && UpdateCore.DEBUG_SHOW_INSTALL)
    				UpdateCore.debug("asJarFile :" + file); //$NON-NLS-1$
    			if (file != null && !file.exists()) {
    				UpdateCore.warn("JarFile does not exits:" + file); //$NON-NLS-1$
    				throw new FileNotFoundException(file.getAbsolutePath());
    			}
    			this.jarFile = new JarFile(file);
    		}
    		return jarFile;
    	}
        public boolean hasSeriousMedicalProblems() {
        	boolean result = false;
    		Iterator<HealthProblem> meds = getProblems().iterator();
    		while (meds.hasNext()) {
    			if (meds.next().getIllness().getSeriousness() >= 50) result = true;
    		}
    		return result;
        }
        public Tune getTune(int index) {
            if (m_tunes == null || index >= m_tunes.size()) {
                log.warn("getTune: unable to get index " + index );
                return new FtuneRec();
            }
            log.debug("getTune for index=" + index);
            return(Tune)m_tunes.get(index);
        }
    }
}