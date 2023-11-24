class Test {
    public class Example {
    public static String getClassName(String path) {
            for (Pattern pattern : patterns) {
                Matcher m = pattern.matcher(path);
                if (m.find()) {
                    return m.group(1).replaceAll("[/\\\\]", ".");
                }
            }
            return null;
        }
        public void removeMapComparisons(Collection comparisons) {
                ArrayList removed = new ArrayList(comparisons.size());
                for (Iterator itr = comparisons.iterator(); itr.hasNext();) {
                    MapComparisonModel mcm = (MapComparisonModel)itr.next();
                    if (allComparisons.remove(mcm)) {
                        removed.add(mcm);
                        deactivateComparison(mcm);
                    } //if
                } //for
    
                //notify listeners
                if (removed.size() == 0) {
                    return;
                } //if
    
                for (Iterator itr = listeners.iterator(); itr.hasNext();) {
                    ((ActiveMapComparisonModelListener)itr.next()).mapComparisonsRemoved(removed);
                } //for
            } //removeMapComparisons
        public void disable(Application application){
      if (application != null && application instanceof FoamApp) {
        FoamMain foamMain=((FoamApp)application).getFoamMain();
        if (foamMain != null) {
          foamMain.stop();
        }
      }
    }
    }
}