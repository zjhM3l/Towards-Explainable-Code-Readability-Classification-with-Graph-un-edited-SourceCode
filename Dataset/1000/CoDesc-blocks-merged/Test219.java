class Test {
    public class Example {
    private void removeExceedingResults(int maximumResultCount) {
            int resultCount = results.size();
            if (resultCount > maximumResultCount) {
                // Removing old results
                final int nbResultsToRemove = resultCount - maximumResultCount;
                for (int i = 0; i < nbResultsToRemove; i++) {
                    results.remove(0);
                }
            }
        }
        private void getDataFromIntent(Intent intent) {
    		Bundle extras = intent.getExtras();
    		//checks if current editing is for a provider or a subservice
    		if(extras != null) {
    			long webcamId = checkNotNull(Long.parseLong(extras.getString(ActivityHelper.INTENTKEY_WEBCAMID)), "WebcamId");
    			mWebcam = checkNotNull(mItemsDao.getWebcamById(webcamId), "Webcam to load");
    			mLogFacility.v("Loading webcam " + mWebcam.getImageUrl());
    		} else {
    			checkNotNull(null, "Webcam to load");
    		}
    	}
        public void setSelection(int index, boolean selected) {
    		if (index >= 0 && index < fButtonsSelected.length) {
    			if (fButtonsSelected[index] != selected) {
    				fButtonsSelected[index]= selected;
    				if (fButtons != null) {
    					Button button= fButtons[index];
    					if (isOkToUse(button) && button.isEnabled()) {
    						button.setSelection(selected);
    					}
    				}
    			}
    		}
    	}
    }
}