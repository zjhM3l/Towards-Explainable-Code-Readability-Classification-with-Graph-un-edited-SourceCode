class Test {
    public class Example {
    public synchronized void remove(int id) {
            if (tc.isEntryEnabled())
                SibTr.entry(tc, "remove", "" + id);
            if (tc.isEntryEnabled())
                SibTr.exit(tc, "remove", "" + id);
            map.remove(id);
        }
        public List<TargetRelationship> getTargetRelationships() {
            final List<TargetRelationship> relationships = new ArrayList<TargetRelationship>(levelRelationships);
            relationships.addAll(topicTargetRelationships);
            return relationships;
        }
        public int getCapHeight(String family, int style, int size) {
            // currently just gets Ascent value but maybe should use
            // getMaxAcent() at some stage
            return getAscender(family, style, size);
        }
    }
}