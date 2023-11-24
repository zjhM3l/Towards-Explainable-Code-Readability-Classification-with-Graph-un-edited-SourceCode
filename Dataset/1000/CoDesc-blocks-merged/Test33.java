class Test {
    public class Example {
    public void clearHeaders() {
            if (this.headerFields == null){
                this.headerFields = new CollectionProperty();
            }else{
                this.headerFields.clear();
            }
        }
        private String getStyle(String imagePath){
    		return "background:transparent;" +
            "qproperty-icon:url(" + imagePath + ");" +
            "min-height:47px;" +
            "min-width:160px;" +
            "max-height:47px;" +
            "max-width:160px;" +
            "qproperty-iconSize: 43px 36px;";
    		
    	}
        public boolean equals(Object obj) {
    		if (this == obj)
    			return true;
    		if ((obj == null) || (obj.getClass() != this.getClass()))
    			return false;
    		
    		KnotVector that = (KnotVector)obj;
    		if (this._degree != that._degree)
    			return false;
    		if (this._knots.equals(that._knots))
    			return false;
    		
    		return super.equals(obj);
    	}
    }
}