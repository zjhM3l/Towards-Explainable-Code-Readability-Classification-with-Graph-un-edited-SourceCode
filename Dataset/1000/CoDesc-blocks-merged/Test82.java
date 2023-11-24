class Test {
    public class Example {
    public String getDominantEmotion() {
    		// =-- Initialize variables
    		String dominantemotion = "";
    		double max = 0;
    		double valueholder;
    
    		// =-- Iterate emotions
    		Set<Entry<String, Double>> emotionalvalues = this.emotions.entrySet();
    		for (Entry<String, Double> currentvalue : emotionalvalues) {
    			valueholder = currentvalue.getValue().doubleValue();
    			if (valueholder > max) {
    				// =-- Update dominant emotion
    				max = valueholder;
    				dominantemotion = currentvalue.getKey();
    			}
    		}
    		return dominantemotion;
    	}
        public static VerificationCheckInstance create ( VerificationCheckInstance self , String code , Values to ) {
      Values data = Values . of ( new Values ( "Code" , code ) , new Values ( "To" , to ) , null ) ;
      String payload = self . _version . create ( "POST" , self . _uri , data , null ) ;
      return new VerificationCheckInstance ( self . _version , payload , ServiceSid . of ( self . _solution . getServiceSid ( ) ) , null ) ;
    }
        public static java.sql.Timestamp toTimestamp(String date,String time){
      java.util.Date newDate=toDate(date,time);
      if (newDate != null) {
        return new java.sql.Timestamp(newDate.getTime());
      }
     else {
        return null;
      }
    }
    }
}