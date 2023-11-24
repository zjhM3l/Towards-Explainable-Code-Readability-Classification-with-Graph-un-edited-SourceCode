class Test {
    public class Example {
    private void createDirectories() {
            /* Fetch the WFS base-level directory from the property */
            String baseDir = null;
            if ((baseDir = getBaseWFSDirectory()) == null) {
                logger.severe("[WFS] Invalid WFS Base Directory! Will not load WFS");
                logger.severe("[WFS] Make sure " + WFS_ROOT_PROPERTY + " property is set");
                return;
            }
            
            makeDirectory(baseDir);
            this.wfsFile = makeDirectory(baseDir + File.separator + WFSRoot.WORLDS_DIR);
            this.snapshotFile = makeDirectory(baseDir + File.separator + WFSSnapshot.SNAPSHOTS_DIR);
            this.recordingFile = makeDirectory(baseDir + File.separator + WFSRecording.RECORDINGS_DIR);
        }
        public void addMessages(Collection colExcepts, boolean ignoreFields) {
    
            if (colExcepts != null && colExcepts.size() > 0) {
                for (Iterator it = colExcepts.iterator(); it.hasNext();) {
                    try {
                        UtilBusinessException excepts = (UtilBusinessException) it.next();
                        this.addException(excepts, ignoreFields);
                    }
                    catch (ClassCastException e) {
                        continue; // next element
                    }
                }
            }
        }
        @Override
        public CreateUsagePlanKeyResult createUsagePlanKey(CreateUsagePlanKeyRequest request) {
            request = beforeClientExecution(request);
            return executeCreateUsagePlanKey(request);
        }
    }
}