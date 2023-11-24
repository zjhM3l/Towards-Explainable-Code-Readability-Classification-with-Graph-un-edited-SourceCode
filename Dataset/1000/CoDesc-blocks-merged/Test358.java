class Test {
    public class Example {
    public void processScrollEvent(ActionEvent event){
      int currentRow=1;
      FacesContext context=FacesContext.getCurrentInstance();
      UIComponent component=event.getComponent();
      Integer curRow=(Integer)component.getAttributes().get("currentRow");
      if (curRow != null) {
        currentRow=curRow.intValue();
      }
      scroll(currentRow);
    }
        static void initAccessibilityConfigGroupParameters(MatsimConfigType matsim4urbansimConfigPart1,Config config){
      AccessibilityConfigGroup acm=ConfigUtils.addOrGetModule(config,AccessibilityConfigGroup.GROUP_NAME,AccessibilityConfigGroup.class);
      acm.setCellSizeCellBasedAccessibility(matsim4urbansimConfigPart1.getCellSize().intValue());
      if (matsim4urbansimConfigPart1.isAccessibilityComputationAreaFromShapeFile()) {
        acm.setAreaOfAccessibilityComputation(AccessibilityConfigGroup.AreaOfAccesssibilityComputation.fromShapeFile.toString());
        if (matsim4urbansimConfigPart1.getStudyAreaBoundaryShapeFile() != null && (new File(matsim4urbansimConfigPart1.getStudyAreaBoundaryShapeFile().getInputFile())).exists())     acm.setShapeFileCellBasedAccessibility(matsim4urbansimConfigPart1.getStudyAreaBoundaryShapeFile().getInputFile());
     else     throw new RuntimeException("Study area boundary shape file not found! Given shape file location:" + matsim4urbansimConfigPart1.getStudyAreaBoundaryShapeFile());
      }
      if (matsim4urbansimConfigPart1.isAccessibilityComputationAreaFromBoundingBox()) {
        acm.setAreaOfAccessibilityComputation(AccessibilityConfigGroup.AreaOfAccesssibilityComputation.fromBoundingBox.toString());
        acm.setBoundingBoxBottom(matsim4urbansimConfigPart1.getBoundingBoxBottom());
        acm.setBoundingBoxTop(matsim4urbansimConfigPart1.getBoundingBoxTop());
        acm.setBoundingBoxLeft(matsim4urbansimConfigPart1.getBoundingBoxLeft());
        acm.setBoundingBoxRight(matsim4urbansimConfigPart1.getBoundingBoxRight());
      }
      if (matsim4urbansimConfigPart1.isAccessibilityComputationAreaFromNetwork()) {
        acm.setAreaOfAccessibilityComputation(AccessibilityConfigGroup.AreaOfAccesssibilityComputation.fromNetwork.toString());
      }
    }
        public String getProteinSequence(String aAccession) {
            String lResult = null;
            if (this.get(aAccession) == null) {
                UniProtEntry lEntry = getEntryFromRetrievalService(aAccession);
                if (lEntry == null) {
                    logger.info("No Entry found for accession '" + aAccession + "'.");
                } else {
                    String lSequence = lEntry.getSequence().getValue();
                    this.put(aAccession, lSequence);
                }
            }
            lResult = (String) this.get(aAccession);
            return lResult;
        }
    }
}