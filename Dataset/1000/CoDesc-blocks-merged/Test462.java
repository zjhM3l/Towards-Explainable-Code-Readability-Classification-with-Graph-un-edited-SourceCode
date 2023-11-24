class Test {
    public class Example {
    public void setAudio(PlaceIsAudioValue param){
                                
                                           if (param != null){
                                              //update the setting tracker
                                              localAudioTracker = true;
                                           } else {
                                              localAudioTracker = false;
                                                  
                                           }
                                       
                                                this.localAudio=param;
                                        
    
                                   }
        private int treeToString(StringBuffer text, int nn) {
    	    
        nn++;
        text.append("\n\nNode number: " + nn + "\n\n");
        if (m_FilteredClassifier != null) {
          text.append(m_FilteredClassifier);
        } else {
          text.append("null");
        }
        if (m_FirstSuccessor != null) {
          nn = m_FirstSuccessor.treeToString(text, nn);
          nn = m_SecondSuccessor.treeToString(text, nn);
        }
        return nn;
      }
        public void setHeaderIcon(String imgSrc) {
            Map map = new HashMap();
            map.put("src", imgSrc);
            setHeaderIconProperties(map);
        }
    }
}