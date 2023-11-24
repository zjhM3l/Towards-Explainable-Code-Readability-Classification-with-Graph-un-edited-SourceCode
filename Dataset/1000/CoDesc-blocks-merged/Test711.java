class Test {
    public class Example {
    public void removeGUID(byte[] guid) {
            if(_guids.size() == 0) {
                return;
            } else {
                synchronized(this) {
                    if(_guids.size() > 0) {
                        Set guids = new TreeSet(new GUID.GUIDByteComparator());
                        guids.addAll(_guids);
                        guids.remove(guid);
                        _guids = guids;
                    }
                }
            }
        }
        public boolean contains(Object object) {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
                if (current.value.equals(object))
                    return true;
            }
            return false;
        }
        public void doMission() {
            Unit unit = getUnit();
            while(isValid() && unit.getMovesLeft() > 0){
            	// Unit is between Europe and America, nothing to do
            	if (unit.isAtSea()){
                        unit.setMovesLeft(0);
                        return;
            	}
                switch(state){
                    case HUNTING:
                        hunt4Target();
                        break;
                    case TRANSPORTING:
                        gotoNearestPort();
                        break;
                }
            }
        }
    }
}