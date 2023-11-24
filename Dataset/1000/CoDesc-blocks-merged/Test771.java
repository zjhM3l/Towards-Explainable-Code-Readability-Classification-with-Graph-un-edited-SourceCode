class Test {
    public class Example {
    public static Trajectory getTrajectoryByID(List<? extends Trajectory> t, int id){
    		Trajectory track = null;
    		for(int i = 0; i < t.size() ; i++){
    			if(t.get(i).getID()==id){
    				track = t.get(i);
    				break;
    			}
    		}
    		return track;
    	}
        private static List < String > findHumanReadableLabels ( List < String > synsets , Map < String , String > synsetToHuman ) {
      List < String > humans = new ArrayList < > ( ) ;
      for ( String s : synsets ) {
        assert s . contains ( " " ) : ( "Failed to find: " + s ) ;
        humans . add ( synsetToHuman . get ( s ) ) ;
      }
      return humans ;
    }
        private JBoard getJBoard() {
            if (jBoard == null) {
                jBoard = new JBoard();
                jBoard.setDataModel(m_Config.getModel());
            }
            return jBoard;
        }
    }
}