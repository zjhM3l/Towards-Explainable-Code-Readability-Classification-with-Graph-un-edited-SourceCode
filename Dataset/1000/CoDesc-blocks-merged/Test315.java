class Test {
    public class Example {
    public Map<String, CmsValidationResult> validate(
            CmsObject cms,
            Map<String, CmsValidationQuery> queries,
            Map<String, String> values,
            String config) throws Exception {
    
            Map<String, CmsValidationResult> result = new HashMap<String, CmsValidationResult>();
            for (Map.Entry<String, CmsValidationQuery> queryEntry : queries.entrySet()) {
                String fieldName = queryEntry.getKey();
                CmsValidationQuery query = queryEntry.getValue();
                I_CmsValidationService fieldValidator = CmsCoreService.instantiate(
                    I_CmsValidationService.class,
                    query.getValidatorId());
                CmsValidationResult fieldResult = fieldValidator.validate(cms, query.getValue(), query.getConfig());
                result.put(fieldName, fieldResult);
            }
            return result;
        }
        public void setScope(int i){
            if(i > -1 && scope < 4){
                scope = i;
                log.debug("Scope = " + scope);
            }
            else{
                throw new IllegalArgumentException(i + " is not a valid scope");
            }
        }
        @Override public boolean eIsSet(int featureID){
    switch (featureID) {
    case N4mfPackage.REQUIRED_RUNTIME_LIBRARIES__REQUIRED_RUNTIME_LIBRARIES:
        return requiredRuntimeLibraries != null && !requiredRuntimeLibraries.isEmpty();
    }
    return super.eIsSet(featureID);
    }
    }
}