class Test {
    public class Example {
    public void start() {
            if (resetOnStart) {
                reset();
            }
    
            animating = true;
    
            if (animateTimer == null) {
                if (owner != null) {
                    owner.drawingSequenceFrameChanged(this);
                }
    
                animateTimer = new Timer(this, "nextFrame", frameRate);
                animateTimer.start();
            }
        }
        protected List<VPlexRecommendation> createVPlexRecommendations(String vplexStorageSystemId,VirtualArray varray,VirtualPool vpool,List<Recommendation> recommendations){
      List<VPlexRecommendation> vplexRecommendations=new ArrayList<VPlexRecommendation>();
      for (  Recommendation recommendation : recommendations) {
        VPlexRecommendation vplexRecommendation=new VPlexRecommendation();
        vplexRecommendation.setSourceStorageSystem(recommendation.getSourceStorageSystem());
        vplexRecommendation.setSourceStoragePool(recommendation.getSourceStoragePool());
        vplexRecommendation.setResourceCount(recommendation.getResourceCount());
        vplexRecommendation.setVPlexStorageSystem(URI.create(vplexStorageSystemId));
        vplexRecommendation.setVirtualArray(varray.getId());
        vplexRecommendation.setVirtualPool(vpool);
        vplexRecommendations.add(vplexRecommendation);
      }
      return vplexRecommendations;
    }
        protected void addDTablesPropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add(createItemPropertyDescriptor(
    				((ComposeableAdapterFactory) adapterFactory)
    						.getRootAdapterFactory(), getResourceLocator(),
    				getString("_UI_DPackage_dTables_feature"), getString(
    						"_UI_PropertyDescriptor_description",
    						"_UI_DPackage_dTables_feature", "_UI_DPackage_type"),
    				XmdldbPackage.Literals.DPACKAGE__DTABLES, true, false, false,
    				null, getString("_UI_DBModelPropertyCategory"), null));
    	}
    }
}