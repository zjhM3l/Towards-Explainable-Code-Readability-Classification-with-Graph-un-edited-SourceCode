class Test {
    public class Example {
    public boolean execute(INode state){
      OnePuzzle op=(OnePuzzle)state;
      op.s++;
      return true;
    }
        public static Vector3f interpolateCatmullRom(float u,float T,Vector3f p0,Vector3f p1,Vector3f p2,Vector3f p3){
      Vector3f res=new Vector3f();
      res.x=interpolateCatmullRom(u,T,p0.x,p1.x,p2.x,p3.x);
      res.y=interpolateCatmullRom(u,T,p0.y,p1.y,p2.y,p3.y);
      res.z=interpolateCatmullRom(u,T,p0.z,p1.z,p2.z,p3.z);
      return res;
    }
        public String toString() {
    		String params = "";
    		String key;
    		String value;
    		if (parameters != null) {
    			Iterator i = parameters.keySet().iterator();
    			while (i.hasNext()) {
    				key = (String) i.next();
    				value = (String) parameters.get(key);
    				params =
    					params
    						+ ((params.length() < 1) ? "?" : "&")
    						+ key
    						+ "="
    						+ value;
    			}
    		}
    		if (response != null)
    			return response.encodeURL(url + params);
    		else
    			return url;
    	}
    }
}