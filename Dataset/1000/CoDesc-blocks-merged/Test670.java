class Test {
    public class Example {
    public void highlightNextNode() {
            if (m_currentNode!=-1) {
                m_currentNode=(m_currentNode+1) % m_highlightedNodes.size();
                Node node=(Node)m_orderedHighlightedNodes.get(m_currentNode);
                centerNodeInView(node);
            }
        }
        private void init() {
            int l = width*height*(bitpix/8);
            if(image==null || image.length!=l) {
                image=new byte[l];
            }
        }
        public void setOutlineStroke(Stroke stroke) {
            if (stroke == null) {
                throw new IllegalArgumentException("Null 'stroke' argument.");
            }
            this.outlineStroke = stroke;
        }
    }
}