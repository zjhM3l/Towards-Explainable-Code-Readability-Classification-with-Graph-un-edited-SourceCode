class Test {
    public class Example {
    public static double getTopicWordRelevance ( double [ ] topicWordDistrib , double [ ] docTopicDistrib , int [ ] docLengths , double lambda_ ) {
      double p_t = getMarginalTopicDistrib ( docTopicDistrib , docLengths ) ;
      double p_w = getMarginalWordDistrib ( topicWordDistrib , p_t ) ;
      double logtw = Math . log ( topicWordDistrib . length ) ;
      double loglift = Math . log ( topicWordDistrib . length / p_w ) ;
      return lambda_ * logtw + ( 1 - lambda_ ) * loglift ;
    }
        private void TrustSliderChanged() {
    		if (lastPathComponent.getUserObject() == null
    				|| !(lastPathComponent.getUserObject() instanceof User))
    			return;
    		((User) lastPathComponent.getUserObject())
    				.setTrustLevel(myTrustPopupSubMenuSlider.getValue());
    	}
        public void setSendMessageResponse(SendMessageResponse param){
                                
                                    clearAllSettingTrackers();
                                
                                           if (param != null){
                                              //update the setting tracker
                                              localSendMessageResponseTracker = true;
                                           } else {
                                              localSendMessageResponseTracker = false;
                                                  
                                           }
                                       
                                                this.localSendMessageResponse=param;
                                        
    
                                   }
    }
}