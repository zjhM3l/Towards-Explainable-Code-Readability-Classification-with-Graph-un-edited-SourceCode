class Test {
    public class Example {
    public String toAString() {
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<numAttributeNameValues(); i++) {
          sb.append(((AttributeNameValue)getAttributeNameValueAt(i)).toString());
        }
        return sb.toString();
      }
        public void gameComplete() {
    	// CellElement.setClicksEnabled(false);
    	// actionRunner.setEnabled(false);
    	editMode = false;
    	setMessage("Game Complete", COMPLETE);
        }
        public ServiceFuture<List<DeletedCertificateItem>> getDeletedCertificatesNextAsync(final String nextPageLink, final ServiceFuture<List<DeletedCertificateItem>> serviceFuture, final ListOperationCallback<DeletedCertificateItem> serviceCallback) {
            return AzureServiceFuture.fromPageResponse(
                getDeletedCertificatesNextSinglePageAsync(nextPageLink),
                new Func1<String, Observable<ServiceResponse<Page<DeletedCertificateItem>>>>() {
                    @Override
                    public Observable<ServiceResponse<Page<DeletedCertificateItem>>> call(String nextPageLink) {
                        return getDeletedCertificatesNextSinglePageAsync(nextPageLink);
                    }
                },
                serviceCallback);
        }
    }
}