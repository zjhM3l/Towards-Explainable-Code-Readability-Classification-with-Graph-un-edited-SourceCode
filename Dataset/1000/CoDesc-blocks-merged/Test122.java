class Test {
    public class Example {
    public Tile getTile(int i) {
            try {
                return (Tile) tiles.get(i);
            } catch (ArrayIndexOutOfBoundsException a) {}
            return null;
        }
        private int getArcWeight(Arc arc) {
            if (arc == null)
                return 0;
            if (! (arc instanceof NormalArc))
                return 0;
            NormalArc normArc = (NormalArc)arc;
            return normArc.getWeight();
        }
        public void addWatchedResource(String name) {
    
            synchronized (watchedResources) {
                String results[] = new String[watchedResources.length + 1];
                for (int i = 0; i < watchedResources.length; i++)
                    results[i] = watchedResources[i];
                results[watchedResources.length] = name;
                watchedResources = results;
            }
            fireContainerEvent("addWatchedResource", name);
    
        }
    }
}