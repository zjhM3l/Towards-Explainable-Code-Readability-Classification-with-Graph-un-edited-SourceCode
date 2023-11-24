class Test {
    public class Example {
    private void handleSubmitButton() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
    
        if (authenticate(username, password)) {
          new ChooseSpreadsheetFrame(service);
          dispose();
        }
      }
        public void test_selectInitial_method2() {
    	try {
    	    establishTest( SAMPLE_CLASS, false );
    	    parsingController.selectInitial( "multijava" );
    	    parsingController.selectInitial( "multijava" );
    	    fail( "Expected ParsingController.ConfigurationException" );
    	} catch( ParsingController.KeyException e ) {
    	    fail( "Expected ParsingController.ConfigurationException" );
    	} catch( ParsingController.ConfigurationException e ) {
    	    assertTrue( true );
    	}
        }
        public void deleteAll() {
    		
    		hbCrudDAO.getHibernateTemplate().deleteAll(hbCrudDAO.getAll());
    		
    	}
    }
}