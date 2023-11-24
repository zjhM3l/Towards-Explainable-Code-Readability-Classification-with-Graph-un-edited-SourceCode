class Test {
    public class Example {
    public void save( Document config, Element element  ) throws ConfigurationException{
    		Element font = element.addElement(ELEMENT_FONT);
    		font.addAttribute(ATTRIBUTE_USAGE, getUsage());
    		font.addAttribute(ATTRIBUTE_BOLD, getBold());
    		font.addAttribute(ATTRIBUTE_ITALIC, getItalic());
    		font.addAttribute(ATTRIBUTE_SIZE, getSize());
    		font.setText(getFontname());
    	}
        public static void addVar ( Object self , Object sig , String name , VCD_SIG_TYPE sigType , int width , Callable < Value > valueFormatter ) {
      Value vInf = ( Value ) self ;
      writer . _idScope . registerVariable ( sig , name , self , width , sigType , valueFormatter ) ;
      children . put ( vInf . name , vInf ) ;
      writer . _oFile . println ( "$var " + sigType + " " + vInf . width + " " + vInf . vcdId + " " + vInf . name + " $end" ) ;
    }
        public String getProductTypeServiceValue() {
    
            DocMetaData docMetaData = getDocumentation(TYPE_KEY);
            if (docMetaData == null) {
                return "";
            }
    
            return docMetaData.getResource();
        }
    }
}