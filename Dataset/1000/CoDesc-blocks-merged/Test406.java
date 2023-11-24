class Test {
    public class Example {
    protected base_resource[] get_nitro_bulk_response(nitro_service service, String response) throws Exception
    
    	{
    
    		mps_image_responses result = (mps_image_responses) service.get_payload_formatter().string_to_resource(mps_image_responses.class, response);
    
    		if(result.errorcode != 0)
    
    		{
    
    			if (result.errorcode == SESSION_NOT_EXISTS)
    
    				service.clear_session();
    
    			throw new nitro_exception(result.message, result.errorcode, (base_response [])result.mps_image_response_array);
    
    		}
    
    		mps_image[] result_mps_image = new mps_image[result.mps_image_response_array.length];
    
    		
    
    		for(int i = 0; i < result.mps_image_response_array.length; i++)
    
    		{
    
    			result_mps_image[i] = result.mps_image_response_array[i].mps_image[0];
    
    		}
    
    		
    
    		return result_mps_image;
    
    	}
        public void redirect(String location) {
            if (LOG.isDebugEnabled()) {
                LOG.debug("Redirecting ({} {} to {}", "Found", HttpServletResponse.SC_FOUND, location);
            }
            try {
                response.sendRedirect(location);
            } catch (IOException ioException) {
                LOG.warn("Redirect failure", ioException);
            }
        }
        public String closeToTipText() {
        return 
            "The number values are checked for whether they are too close to "
          + "and get replaced by a default.";
      }
    }
}