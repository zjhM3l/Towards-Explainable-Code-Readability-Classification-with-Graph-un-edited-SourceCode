class Test {
    public class Example {
    public int findPosition(List<LaunchFile> files, long fileId){
            int position = -1;
            for (int i = 0; i < files.size(); i++) {
                if (files.get(i).getId() == fileId) {
                    position = i;
                    break;
                }
            }
            if (position == -1)
                throw new ARISException("Invalid File for the Launch Object");
            return position;
        }
        private void updateSummaryPanel(){
            this.films_in_database_jlabel.setText("Total Films in Database: " + this.core_controller.film_controller.getFilms().size());
            this.total_screens_in_database_jlabel.setText("Total Screen Count: " + this.core_controller.screen_controller.getScreens().size());
            this.total_screenings_in_database_jlabel.setText("Total Screening Count: " + this.core_controller.screen_controller.getScreeningCount());
        }
        private String extractRelativeLink (String url) {
    		URL _referrerUrl;
    		try
    		{
    			_referrerUrl = new URL(url);
    			url = _referrerUrl.getPath();
    
    		}
    		catch (MalformedURLException e)
    		{
    			if (LOG.isDebugEnabled()) {
    				LOG.debug(e);
    			}
    		}
    		String _contextPath = getRequest().getContextPath();
    		// strip context path if given
    		if (url.startsWith(_contextPath)) url = url.substring(_contextPath.length() );
    		String _cmsServletURLPattern = "/opencms";
    		if (url.startsWith(_cmsServletURLPattern)) url = url.substring(_cmsServletURLPattern.length() );
    		
    		return url;
    	}
    }
}