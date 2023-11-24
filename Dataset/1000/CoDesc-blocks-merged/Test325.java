class Test {
    public class Example {
    public Node getNormalizeTo() throws IOException {
    		Node embeddedPath = NodeHandler.getSingleNode(protocol, "//normalizeTo/@xpath");
    		if (embeddedPath == null){
    			throw new IOException("Tagname normalizeTo was not found in protocol.");
    		}
    		return embeddedPath;
    	}
        @Nullable
        public DBObject findAndModify(@Nullable final DBObject query, @Nullable final DBObject fields, @Nullable final DBObject sort,
                                      final boolean remove, @Nullable final DBObject update,
                                      final boolean returnNew, final boolean upsert) {
            return findAndModify(query, fields, sort, remove, update, returnNew, upsert, 0L, MILLISECONDS);
        }
        public void prettyPrint(CodeWriter w, PrettyPrinter tr) {
        printSubExpr(left(), true, w, tr);
        w.write(" ");
        w.write(op.toString());
        w.allowBreak(2, 2, " ", 1); // miser mode
        w.begin(0);
        printSubExpr(right, false, w, tr);
        w.end();
      }
    }
}