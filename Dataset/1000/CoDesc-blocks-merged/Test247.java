class Test {
    public class Example {
    private void checkExistingFile(){
    
    		File fileExt= new File(SETTINGS_FILE_PATH);
    		if (fileExt.exists()){
    
    			try {
    				FileInputStream intExt = new FileInputStream(fileExt);
    				DataInputStream dis=new DataInputStream(intExt);
    				savedLogin=dis.readUTF();
    				savedPassword=dis.readUTF();
    
    			} catch (FileNotFoundException e1) {
    				// TODO Auto-generated catch block
    				e1.printStackTrace();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    
    
    		}
    		else{
    			savedPassword=""; //$NON-NLS-1$
    			savedLogin=""; //$NON-NLS-1$
    		}
    
    
    	}
        protected void activateListener(TypeSummary[] typeSummaryArray, ActionEvent evt) {
            CurrentSummary cs = CurrentSummary.get();
            FieldSummary fieldSummary = (FieldSummary) cs.getCurrentSummary();
            PushUpFieldListener pufl = new PushUpFieldListener(null, null, fieldSummary, null, null);
            pufl.actionPerformed(null);
        }
        @Override
    
    	public EClass getIfcExternalSpatialStructureElement() {
    
    		if (ifcExternalSpatialStructureElementEClass == null) {
    
    			ifcExternalSpatialStructureElementEClass = (EClass) EPackage.Registry.INSTANCE
    
    					.getEPackage(Ifc4Package.eNS_URI).getEClassifiers().get(247);
    
    		}
    
    		return ifcExternalSpatialStructureElementEClass;
    
    	}
    }
}