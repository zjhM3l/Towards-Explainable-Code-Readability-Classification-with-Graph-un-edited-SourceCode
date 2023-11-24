class Test {
    public class Example {
    public void matches(int expectedMatches, double seconds) {
            double end = System.currentTimeMillis() + (seconds * 1000);
            try {
                if (expectedMatches > 0) {
                    elementPresent(seconds);
                }
                while (element.get().matchCount() != expectedMatches && System.currentTimeMillis() < end) ;
                double timeTook = Math.min((seconds * 1000) - (end - System.currentTimeMillis()), seconds * 1000) / 1000;
                checkMatches(expectedMatches, seconds, timeTook);
            } catch (TimeoutException e) {
                checkMatches(expectedMatches, seconds, seconds);
            }
        }
        private JsonPathVariableExtractor getJsonPathVariableExtractor() {
            if (jsonPathExtractor == null) {
                jsonPathExtractor = new JsonPathVariableExtractor();
    
                getAction().getVariableExtractors().add(jsonPathExtractor);
            }
    
            return jsonPathExtractor;
        }
        static void fixColumns(List<ParsedColInfo> src, Map<Integer, Pair<String, Integer>> m) {
           // change to display column index-keyed map
           src.forEach(ci -> {
              if (m.containsKey(ci.m_index)) {
                 Pair<String, Integer> viewInfo = m.get(ci.m_index);
                  ci.updateColName(viewInfo.getFirst(), ci.m_alias);
              }
           });
        }
    }
}