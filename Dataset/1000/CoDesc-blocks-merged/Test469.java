class Test {
    public class Example {
    public URL toURL() throws MalformedURLException {
            if (!absolute) {
                throw new IllegalArgumentException(Msg.getString("K0312") + ": " //$NON-NLS-1$//$NON-NLS-2$
                        + toString());
            }
            return new URL(toString());
        }
        private Set<Scope> getScopeList(ObjectId collectorId) {
            Set<Scope> projects = new HashSet<>();
            if(featureSettings.isCollectorItemOnlyUpdate()){
                for(FeatureBoard featureBoard: enabledFeatureBoards(collectorId)){
                    Scope scope = projectRepository.findByCollectorIdAndPId(collectorId, featureBoard.getProjectId());
                    if(scope != null){
                        projects.add(scope);
                    }
                }
            }else {
                projects = new HashSet<>(projectRepository.findByCollectorId(collectorId));
            }
            return projects;
        }
        private void saveAsGML(FeatureCollection fc) throws Exception {
            FileOutputStream fos = new FileOutputStream( OUTPUT );
            GMLFeatureAdapter.export(fc, fos);
            fos.close();        
        }
    }
}