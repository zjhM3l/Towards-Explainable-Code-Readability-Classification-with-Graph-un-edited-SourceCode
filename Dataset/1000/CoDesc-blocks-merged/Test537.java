class Test {
    public class Example {
    private JPanel getJPanelTerca12() {
    		if (jPanelTerca12 == null) {
    			jPanelTerca12 = new JPanel();
    			jPanelTerca12.setLayout(new GridBagLayout());
    			jPanelTerca12.setBounds(new Rectangle(0, 252, 100, 20));
    			jPanelTerca12.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
    			jPanelTerca12.setBackground(SystemColor.activeCaptionText);
    		}
    		return jPanelTerca12;
    	}
        protected void addAlienSlidePropertyDescriptor(Object object) {
    		itemPropertyDescriptors.add
    			(createItemPropertyDescriptor
    				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
    				 getResourceLocator(),
    				 getString("_UI_AlienSlideLink_AlienSlide_feature"),
    				 getString("_UI_PropertyDescriptor_description", "_UI_AlienSlideLink_AlienSlide_feature", "_UI_AlienSlideLink_type"),
    				 ExhibitionPackage.Literals.ALIEN_SLIDE_LINK__ALIEN_SLIDE,
    				 true,
    				 false,
    				 true,
    				 null,
    				 null,
    				 null));
    	}
        public Map<String, String> getUriVariablesForResumeFileParse(ResumeFileParseParams params, MultipartFile resume) {
    
    		if (params == null) {
    			params = ParamFactory.resumeFileParseParams();
    		}
    
    		Map<String, String> uriVariables = params.getParameterMap();
    
    		String bhRestToken = bullhornApiRest.getBhRestToken();
    		uriVariables.put(BH_REST_TOKEN, bhRestToken);
    		uriVariables.put(FORMAT, restFileManager.getFileParam(resume));
    		return uriVariables;
    	}
    }
}