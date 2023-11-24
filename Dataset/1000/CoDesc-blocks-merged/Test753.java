class Test {
    public class Example {
    public String exportToJson(boolean pretty) {
            Map<String, Object> result = new HashMap<String, Object>();
            Map<String, List<Map<String, Object>>> services = new HashMap<String, List<Map<String, Object>>>();
    
            for (EndpointHealth h : endpoints) {
                String type = serviceTypeFromEnum(h.type());
                if (!services.containsKey(type)) {
                    services.put(type, new ArrayList<Map<String, Object>>());
                }
                List<Map<String, Object>> eps = services.get(type);
                eps.add(h.toMap());
            }
    
            result.put("version", version);
            result.put("services", services);
            result.put("sdk", sdk);
            result.put("id", id);
    
            try {
                if (pretty) {
                    return DefaultObjectMapper.prettyWriter().writeValueAsString(result);
                } else {
                    return DefaultObjectMapper.writeValueAsString(result);
                }
            } catch (JsonProcessingException e) {
                throw new IllegalStateException("Could not encode as JSON string.", e);
            }
        }
        public IGraph getUndirectedGraph() {
    		return new EuclideanGraph(this
    			.getDecoratedIGraph()
    			.getUndirectedGraph());
    	}
        public File optimizeView(File f) {
    	File rv = null;
    	try {
    	    rv = File.createTempFile("ovop",null);
    	    rv.delete();
    
    	    File cachedir = null;
    	    cachedir = File.createTempFile("ocache",null);
    	    cachedir.delete();
    
    	    String[] args = new String[6];
    	    args[0] = "-cache";
    	    args[1] = cachedir.getPath();
    	    args[2] = "-inpdb";
    	    args[3] = f.getPath();
    	    args[4] = "-outpdb";
    	    args[5] = rv.getPath();
    	    Ovop prog = new Ovop();
    	    prog.run(args);
    	}
    	catch (Exception e) {
    	    rv = null;
    	    e.printStackTrace();
    	}
    	return rv;
        }
    }
}