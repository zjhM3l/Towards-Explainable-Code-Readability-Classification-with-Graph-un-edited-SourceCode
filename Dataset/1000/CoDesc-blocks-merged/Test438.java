class Test {
    public class Example {
    public void testSavePower() throws Exception {
    		power = getTestingFactory().getNewPower();
    
    		// unit test only specific method. most unit tests will
    		// default to a rollback. in this case we want to commit.
    		// setComplete();
    		PowerDAO dao = getTestingFactory().getEfreeDAORegistry().getPowerDAO();
    
    		dao.savePower(power);
    
    	}
        public void save() {
    	    //fbs.setCurrency(currencyChooser.getSelectedCurrency());
    	    if (jTable != null) jTable.revalidate();
    		rbspl.rbsDataChanged(); // advertise listener
    	}
        public  static <T> List<T> convertListOfMapsToObjects(   boolean respectIgnore, String view,
                                                                FieldsAccessor fieldsAccessor,
                                                                Class<T> componentType, List<Map> list, Set<String> ignoreProperties) {
            return new MapperComplex(fieldsAccessor, ignoreProperties,view, respectIgnore).convertListOfMapsToObjects(list, componentType);
        }
    }
}