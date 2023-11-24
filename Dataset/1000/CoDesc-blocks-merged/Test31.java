class Test {
    public class Example {
    public Observable<Page<BuildArgumentInner>> listBuildArgumentsNextAsync(final String nextPageLink) {
            return listBuildArgumentsNextWithServiceResponseAsync(nextPageLink)
                .map(new Func1<ServiceResponse<Page<BuildArgumentInner>>, Page<BuildArgumentInner>>() {
                    @Override
                    public Page<BuildArgumentInner> call(ServiceResponse<Page<BuildArgumentInner>> response) {
                        return response.body();
                    }
                });
        }
        public Ustr concat(Ustr us) {
            Ustr ret = new Ustr(strlen() + us.strlen() + 1);
            ret.strcpy(this);
            ret.strcat(us);
            return ret;
        }
        public boolean isFault(QName expected) {
            if(faultCode==null) {
                return expected==null;
            }
            return faultCode.equals(expected);
        }
    }
}