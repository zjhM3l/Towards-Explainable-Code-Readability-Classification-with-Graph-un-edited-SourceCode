class Test {
    public class Example {
    public void removePlugin(ComponentListener component) {
    		ArrayList<DEdge<ComponentListener, ListenableComponent>> c = getAssociations(component);
    		
    		try {
    			//Notify listeners
    			component.shutdown();
    			
    			//Remove associations
    			for (DEdge<ComponentListener, ListenableComponent> e : c)
    			{
    				delAssociation(e.getHead(), e.getTail());
    			}
    			
    			components.delNode(component);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
        public static double resistance ( Situation self ) {
      self . totalResistanceCoeff = frictionalResistanceCoeff ( self . length , self . speed ) + residualResistanceCoeff ( self . slendernessCoefficient , self . prismaticCoefficient , froudeNumber ( self . speed , self . length ) ) ;
      double RT = 1 / 2 * self . totalResistanceCoeff * 1025 * self . surfaceArea * self . speed * self . length ;
      return RT ;
    }
        static private int readBytes(int c[], int len, InputStream is)
                    throws IOException {
    
            byte buf[] = new byte[len];
            if (is.read(buf, 0, len) < len) {
                return -1;
            }
    
            // fill the passed in int array
            for (int i = 0; i < len; i++) {
                 c[i] = buf[i] & 0xff;
            }
            return 0;
        }
    }
}