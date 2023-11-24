class Test {
    public class Example {
    public void writeDot(String fileName) throws IOException {
        	FileWriter writer = new FileWriter(fileName);
        	
        	writer.write(dot);
        	
        }
        public com.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig getKMapEstimationConfig() {
        if (typeCase_ == 5) {
          return (com.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig) type_;
        }
        return com.google.privacy.dlp.v2.PrivacyMetric.KMapEstimationConfig.getDefaultInstance();
      }
        private void onChangedImpl(final int preferableCenterPosition) {
            for (ListOnChangedListener listener: mOnChangedListeners) {
                listener.onChangedStart(this);
            }
    
            Log.d(Log.SUBSYSTEM.LAYOUT, TAG, "onChangedImpl(%s): items [%d] views [%d] mLayouts.size() = %d " +
                            "preferableCenterPosition = %d",
                    getName(), getDataCount(), getViewCount(), mContent.mLayouts.size(), preferableCenterPosition);
    
            // TODO: selectively recycle data based on the changes in the data set
            mPreferableCenterPosition = preferableCenterPosition;
            recycleChildren();
        }
    }
}