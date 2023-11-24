class Test {
    public class Example {
    public void updateRule(MCRAccessRule rule) {
            Session session = MCRHIBConnection.instance().getSession();
            MCRACCESSRULE hibrule = (MCRACCESSRULE)session.get(MCRACCESSRULE.class, rule.getId());
    
            DateFormat df = new SimpleDateFormat(sqlDateformat);
            hibrule.setCreationdate(Timestamp.valueOf(df.format(rule.getCreationTime())));
            hibrule.setCreator(rule.getCreator());
            hibrule.setRule(rule.getRuleString());
            hibrule.setDescription(rule.getDescription());
        }
        public void confirmUpdate(Probe p, TagAllocator pd, DefiniteSequenceDB<Probe> probeset) {
    		for (Iterator<CandidateAnalysisModule> i = armModules.iterator(); i.hasNext(); ) {
    			ProbeAnalysisModule m = (ProbeAnalysisModule) i.next();
    			m.doConfirmUpdate(p, pd, probeset);
    		}
    
    		for (Iterator<CandidateAnalysisModule> i = candidateModulesStage1.iterator(); i.hasNext(); ) {
    			ProbeAnalysisModule m = (ProbeAnalysisModule) i.next();
    			m.doConfirmUpdate(p, pd, probeset);
    		}
    
    		for (Iterator<CandidateAnalysisModule> i = candidateModulesStage2.iterator(); i.hasNext(); ) {
    			ProbeAnalysisModule m = (ProbeAnalysisModule) i.next();
    			m.doConfirmUpdate(p, pd, probeset);
    		}
    	}
        private String convertFileNameToBaseClassName(String filename) {
            if (filename.endsWith("_.java")) {
                return substringBeforeLast(filename, "_.java") + BASE_SUFFIX_;
            } else {
                return substringBeforeLast(filename, ".java") + BASE_SUFFIX;
            }
        }
    }
}