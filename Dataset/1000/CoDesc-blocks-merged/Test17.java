class Test {
    public class Example {
    private void setupListeners() {
            LinkListener linkListener = new VolLinkListener(this);
            addMouseListener(linkListener);
            addMouseMotionListener(linkListener);
        }
        public ApiResponse<V1Namespace> createNamespaceWithHttpInfo(V1Namespace body, Boolean includeUninitialized, String pretty, String dryRun) throws ApiException {
            com.squareup.okhttp.Call call = createNamespaceValidateBeforeCall(body, includeUninitialized, pretty, dryRun, null, null);
            Type localVarReturnType = new TypeToken<V1Namespace>(){}.getType();
            return apiClient.execute(call, localVarReturnType);
        }
        public boolean modifiedTable(int contextRefId) throws Exception {
    		refreshTable(contextRefId);
    		enableApplyOk();
    		return true;
    	}
    }
}