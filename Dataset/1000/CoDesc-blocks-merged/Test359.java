class Test {
    public class Example {
    public String createXml() {
    		ResourceFormatter formatter  = Marc21Plugin.getInstance().getFormater();
    		StringBuffer sb              = new StringBuffer();
    		Iterator it                  = this.subfieldsKeysIterator();
    
    		while( it.hasNext() ) {
    			Character key  = (Character)it.next();
    			String field   = Marc21Description.CONVERT_ENTITY( this.getSubfield( key.charValue() ) );
    
    			sb.append( formatter.getText( "marcxml_subfield", new Object[]{key, field} ) );
    		}
    
    		return formatter.getText( "marcxml_datafield", new Object[]{String.valueOf( getTag() ), String.valueOf( getPtr1() ), String.valueOf( getPtr2() ), sb.toString()} );
    	}
        final public void print(String s){
      Writer out=this.out;
      if (out == null)   return;
      try {
        if (s == null)     out.write(_nullChars,0,_nullChars.length);
     else     out.write(s,0,s.length());
      }
     catch (  IOException e) {
        log.log(Level.FINE,e.toString(),e);
      }
    }
        public void drawLineToSave(String id,String x1,String width, String y1,String height,Document doc,boolean colored,String color)
    	  {    
    		    Element e = doc.createElement("rect");
    		    e.setAttribute("x", x1);
    			e.setAttribute("y", y1);
    			e.setAttribute("transform", "");
    			e.setAttribute("width", String.valueOf(width));
    			if(colored)
    			{
    			e.setAttribute("style", "fill:"+color+";stroke:none");
    			}
    			else
    			{		
    				e.setAttribute("fill","none");
    				e.setAttribute("stroke", color);
    			}
    			e.setAttribute("id", "rect");
    			e.setAttribute("height", height);
    			Node node=doc.getElementsByTagName("rect").item(0).getParentNode();          
    			node.appendChild(e);
    	  }
    }
}