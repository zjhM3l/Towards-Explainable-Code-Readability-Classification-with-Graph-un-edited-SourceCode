class Test {
    public class Example {
    public void dealWithException(HttpServletRequest request, String str1, String str2) {
    		ActionMessages errors = new ActionMessages();
    		errors.add(str1, new ActionMessage(str2));
    		addErrors(request, errors);		
    	}
        public static void searchRange ( SearchRange self , int value ) throws InvalidSearchRangeException {
      if ( value == 0 || ! value % 16 ) {
        self . setSearchRange ( value ) ;
      }
      else {
        throw new InvalidSearchRangeException ( "Search range must be a multiple of " + "16." ) ;
      }
      self . replaceBm ( ) ;
    }
        public static int createAddress ( String customId , PartyData data ) {
      Address Address = client . getModel ( "party.address" ) ;
      Country Country = client . getModel ( "country.country" ) ;
      Subdivision Subdivision = client . getModel ( "country.subdivision" ) ;
      Country country = Country . find ( new Country ( "code" , "=" , data . getCountry ( ) ) ) ;
      Subdivision state = Subdivision . find ( new Subdivision ( "code" , "ilike" , "%-" + data . getState ( ) ) ) ;
      Address address = Address . create ( new Address ( customId , data . getName ( ) , data . getStreetbis ( ) , data . getCity ( ) , data . getZip ( ) , country . getId ( ) , state . getId ( ) , ) ) ;
      return address . getId ( ) ;
    }
    }
}