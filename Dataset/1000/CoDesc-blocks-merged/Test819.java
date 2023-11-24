class Test {
    public class Example {
    public V getVertex(int i) {
    		if (i >= vertices.size())
    			return null;
    		else
    			return vertices.get(i);
    	}
        public Tile getAdjacentTile(Direction direction) {
             int x = getX() + ((getY() & 1) != 0 ?
                                   direction.getOddDX() : direction.getEvenDX());
             int y = getY() + ((getY() & 1) != 0 ?
                                   direction.getOddDY() : direction.getEvenDY());
             return getMap().getTile(x, y);
         }
        public void updateFont() {
    		title.setFont(gui.getMainFont().deriveFont(Font.BOLD));
    		sourcePane.setFont(gui.getSourceCodeFont());
    		editButton.setFont(gui.getMainFont());
    		parseButton.setFont(gui.getMainFont());
    		rereadButton.setFont(gui.getMainFont());
    	}
    }
}