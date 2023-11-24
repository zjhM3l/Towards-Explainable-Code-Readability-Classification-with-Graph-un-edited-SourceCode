class Test {
    public class Example {
    public SandProject findProjectParent(String projname) {
            if((projname==null)||(projname.equals(""))) {
                return null; }                  //bad input, no parent
            if(getBuildRoot()==null) {
                return null; }                  //no root so no parent
            if(getBuildRoot().getName().equals(projname)) {
                return null; }                  //no parent for root project
            SandProject parent=getBuildRoot();
            return findProjectParent(parent,projname);
        }
        public IfcTrimmingPreference createIfcTrimmingPreferenceFromString(EDataType eDataType, String initialValue) {
    
    		IfcTrimmingPreference result = IfcTrimmingPreference.get(initialValue);
    
    		if (result == null)
    
    			throw new IllegalArgumentException(
    
    					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    
    		return result;
    
    	}
        public static void calcFrequencies ( Map < Map < Genomes , Map < String , String >> genomes , File bpTable , double minCof , double minPer ) {
      String nucs [ ] = {
        "A" , "T" , "G" , "C" , "N" };
        if ( bpTable != false ) {
          bpTable = new PrintWriter PrintWriter ( bpTable ) ;
          String header [ ] = {
            "#genome" , "contig" , "contig" , "sample" , "position" , "reference" , "ref. frequency" , "consensus" , "con. frequency" , "A" , "T" , "G" , "C" , "N" , "# insertions" , "# deletions" };
            System . out . println ( '\t' + header + "\t" + bpTable ) ;
          }
          for ( Map < Genomes , Map < String >>> genomes : genomes . entrySet ( ) ) {
            for ( Map < String genome , Map < String >> contigs : genomes . entrySet ( ) ) {
              for ( Map < String , Map < String >> contigs : contiomes . values ( ) ) {
                for ( Map < String , Map < String >> contigs : contiomes . values ( ) ) {
                  for ( Map < String , Map < String >> header = new HashMap < String > ( ) ;
                  header [ 0 ] = "#genome" ;
                  header [ 0 ] = "#genome" ;
                  header [ 0 ] = "#contig" ;
                  header [ 0 ] = "#contigs" ;
                  header [ 0 ] = "#contigs" ;
                  header [ 0 ] = "#contigs" ;
                  header [ 0 ] = "#contigs" ;
                  header [ 0 ] = "#contigs" ;
                  header [ 0 ] = "#contigs" ;
                  header . print ( '\t' + header + "\t', " + bpTable ) ;
                }
              }
              for ( Map < String , Map < String >> contigs : genomes . values ( ) ) {
                for ( Map < String , Map < String >> samples : contigs . values ( ) ) {
                  for ( Map < String , Map < String >> stats : samples . values ( ) ) {
                    for ( int pos , nucs ) {
    }
}