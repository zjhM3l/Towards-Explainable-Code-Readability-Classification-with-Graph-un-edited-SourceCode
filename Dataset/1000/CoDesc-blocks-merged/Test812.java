class Test {
    public class Example {
    public static boolean check ( String text ) {
      String err = "misc.illogic" ;
      String msg = MessageFormat . format ( "'{
    }
    ' is illogical." , text ) ;
      String [ ] illogics = {
        "preplan" , "more than .{
    1,10}
     all" , "appraisal valuations?" , "(?:i|you|he|she|it|y'all|all y'all|you all|they) could care less" , "least worst" , "much-needed gaps?" , "much-needed voids?" , "no longer requires oxygen" , "without scarcely" , };
          return existenceCheck ( text , illogics , err , msg , 1 ) ;
        }
        private void updateBadManifestCache(String line) {
            String[] parts = FeatureDefinitionUtils.splitPattern.split(line);
            if (parts.length == 3) {
                File f = new File(parts[0]);
                long lastModified = FeatureDefinitionUtils.getLongValue(parts[1], -1);
                long length = FeatureDefinitionUtils.getLongValue(parts[2], -1);
    
                // If the file still exists, add it to our list. We'll check if anything
                // changed in readFeatureManifests
                if (f.isFile())
                    knownBadFeatures.put(f, new BadFeature(lastModified, length));
            }
        }
        @Programmatic
        public List<DocumentTemplate> findByTypeAndAtPath(final DocumentType documentType, final String atPath) {
            return repositoryService.allMatches(
                    new QueryDefault<>(DocumentTemplate.class,
                            "findByTypeAndAtPath",
                            "type", documentType,
                            "atPath", atPath));
        }
    }
}