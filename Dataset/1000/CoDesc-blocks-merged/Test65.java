class Test {
    public class Example {
    public static TaxonType duplicate ( TaxonType self ) {
      TaxonType instance = new TaxonType ( ) ;
      instance . setName ( self . getName ( ) ) ;
      instance . setDescription ( self . getDescription ( ) ) ;
      instance . setUnit ( self . getUnit ( ) ) ;
      instance . setQuantity ( self . getQuantity ( ) ) ;
      instance . setDate ( self . getDate ( ) ) ;
      instance . setUnitPrice ( self . getUnitPrice ( ) ) ;
      instance . setgin ( self . getgin ( ) ) ;
      instance . setGtin ( self . getGtin ( ) ) ;
      instance . setSScc ( self . getSScc ( ) ) ;
      for ( TaxonType tax : self . getTaxons ( ) ) {
        instance . getTaxons ( ) . add ( tax . duplicate ( ) ) ;
      }
      for ( DiscountType discount : self . getDiscounts ( ) ) {
        instance . getDiscounts ( ) . add ( discount . duplicate ( ) ) ;
      }
      return instance ;
    }
        private Element createAnonymousIndividualElement(String owlClass) {
    		Element elem = doc.createElement(owlClass);
    
    		return elem;
    	}
        public void test10_CopyCustomer() throws Exception {
    		Table table = new Customer();
    		int nCount = table.getPageCount();
    		byte[] nPageData;
    		for (int i = 0; i < nCount; i++) {
    			nPageData = table.readFile(i);
    			Utils.write(new File(Utils.FILEPATH_OUTPUT+Utils.FILENAME_OUTPUT), table.getLengthTotal(), i, nPageData);
    		}
    	}
    }
}