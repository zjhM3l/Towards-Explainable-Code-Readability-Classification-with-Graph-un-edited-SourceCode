class Test {
    public class Example {
    public String getChirality(Identifier id) throws RemoteException {
            String val;
    
            if( contains(Molecule.CHIRALITY) ){
                val = (String)get(Molecule.CHIRALITY);
                return val;
            }
            try {
                Molecule ref;
    
                ref = (Molecule)getEntity();
                val = ref.getChirality(id);
            }
            catch( RemoteException e ) {
                Molecule ref;
                reconnect();
                ref = (Molecule)getEntity();
                val = ref.getChirality(id);
            }
            put(Molecule.CHIRALITY, val);
            return val;
        }
        public int hashCode() {
    	long bits = 1L;
    	bits = 31L * bits + VecMathUtil.doubleToLongBits(x);
    	bits = 31L * bits + VecMathUtil.doubleToLongBits(y);
    	bits = 31L * bits + VecMathUtil.doubleToLongBits(z);
    	return (int) (bits ^ (bits >> 32));
        }
        public void setValue(String value) {
    		if (value == null)
    			value = "";
    		if (!Objects.equals(_value, value)) {
    			_value = value;
    			if (isIdRequired())
    				smartUpdate("value", _value);
    			else
    				invalidate();
    		}
    	}
    }
}