class Test {
    public class Example {
    @Override
    	protected void setOtherResourceBundles(HttpServletRequest request)
    	{
    		Locale locale = request.getLocale();
    
            if (errorBundleName != null)
            {
                ResourceBundle errorBundle = getLocalizationBundleFactory().getErrorMessageBundle(locale);
                Config.set(request, errorBundleName, new LocalizationContext(errorBundle, locale));
                LOGGER.debug("Loaded Stripes error message bundle ", errorBundle, " as ", errorBundleName);
            }
    
            if (fieldBundleName != null)
            {
                ResourceBundle fieldBundle = getLocalizationBundleFactory().getFormFieldBundle(locale);
                Config.set(request, fieldBundleName, new LocalizationContext(fieldBundle, locale));
                LOGGER.debug("Loaded Stripes field name bundle ", fieldBundle, " as ", fieldBundleName);
            }
    	}
        protected void showModels(Iterable<EpoxyModel<?>> models,boolean show){
      for (  EpoxyModel<?> model : models) {
        showModel(model,show);
      }
    }
        @Override
        public NonExceptionPostdominatorsAnalysis analyze(IAnalysisCache analysisCache, MethodDescriptor descriptor)
                throws CheckedAnalysisException {
            CFG cfg = getCFG(analysisCache, descriptor);
            ReverseDepthFirstSearch rdfs = getReverseDepthFirstSearch(analysisCache, descriptor);
            NonExceptionPostdominatorsAnalysis analysis = new NonExceptionPostdominatorsAnalysis(cfg, rdfs, getDepthFirstSearch(
                    analysisCache, descriptor));
            Dataflow<java.util.BitSet, PostDominatorsAnalysis> dataflow = new Dataflow<>(cfg,
                    analysis);
            dataflow.execute();
            return analysis;
        }
    }
}