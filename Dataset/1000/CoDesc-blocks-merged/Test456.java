class Test {
    public class Example {
    private void initialize() {
    		this.setSize(412, 213);
    		this.setContentPane(getJContentPane());
    		this.setTitle("Buscar Familia");
    		cpbf = new ControladorPantallaBuscarFamilia(this,ae);
    	}
        private void notifyListeners(ServiceProxy serviceListener, Information information) {
            synchronized(filterListeners) {
              	for(IFilterListener listener : filterListeners) listener.informationChanged(serviceListener,information);
            }
        }
        public static String getLongestUrlPattern(String firstUrlPattern, String secondUrlPattern) {
            if (secondUrlPattern == null || (firstUrlPattern != null &&
                firstUrlPattern.length() >= secondUrlPattern.length())) {
                return firstUrlPattern;
            } else {
                return secondUrlPattern;
            }
        }
    }
}