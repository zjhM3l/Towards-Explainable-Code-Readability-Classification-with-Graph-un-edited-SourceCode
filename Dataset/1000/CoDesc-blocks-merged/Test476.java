class Test {
    public class Example {
    public PPORGProcFlgs createPPORGProcFlgsFromString(EDataType eDataType, String initialValue) {
    		PPORGProcFlgs result = PPORGProcFlgs.get(initialValue);
    		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    		return result;
    	}
        public EmrClusterDefinitionEntity createEmrClusterDefinitionEntity(NamespaceEntity namespaceEntity,String definitionName,String configurationXml){
      EmrClusterDefinitionEntity emrClusterDefinitionEntity=new EmrClusterDefinitionEntity();
      emrClusterDefinitionEntity.setNamespace(namespaceEntity);
      emrClusterDefinitionEntity.setName(definitionName);
      emrClusterDefinitionEntity.setConfiguration(configurationXml);
      return emrClusterDefinitionDao.saveAndRefresh(emrClusterDefinitionEntity);
    }
        public void testCheckLTIDStringMID() {
    		try {
    			assertFalse(ltAction.checkLTHospital("ABCD"));
    			fail();
    		} catch (iTrustException e) {
    		}
    	}
    }
}