class Test {
    public class Example {
    public void MoveTrain(int waggons,int way){
            // Will set a train with the given waggons.
            if (waggons > 30){
    
                addNewObject("train","" + 29 + "");
                addNewObject("train","" + (waggons-1) + "");
                if (way == 0){
                    MoveObject("train",29,"down");
                    MoveObject("train",waggons-1,"down");
                    
                }else{
                    removeObject("train",waggons-1,"");
                }            
            }else{
    
                if (way == 0){
                    MoveObject("train",waggons-1,"down");
                    
                }else{
                    removeObject("train",waggons-1,"");
                }             
            }
            
        
            
    
        }
        protected void setEventItemForEditing(EventItem item, EventChooserTableEditor tableCellEditor) {
    				
    				this.tableCellEditor=tableCellEditor;
    				setEventItemForRendering(item);
    			}
        public static Graph<String, String> loadUndirectedGraphEdgeListFile(String path, int numVertices, String delim,
                        boolean allowMultipleEdges) throws IOException {
            Graph<String, String> graph = new Graph<>(numVertices, allowMultipleEdges, new StringVertexFactory());
            EdgeLineProcessor<String> lineProcessor = new DelimitedEdgeLineProcessor(delim, false);
    
            try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
                String line;
                while ((line = br.readLine()) != null) {
                    Edge<String> edge = lineProcessor.processLine(line);
                    if (edge != null) {
                        graph.addEdge(edge);
                    }
                }
            }
            return graph;
        }
    }
}