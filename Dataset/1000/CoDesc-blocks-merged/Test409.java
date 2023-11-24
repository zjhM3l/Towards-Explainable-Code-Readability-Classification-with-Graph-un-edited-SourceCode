class Test {
    public class Example {
    public InputStream getEntry(SoundEvent key) throws IOException {
    		if (!mapping.containsKey(key)) {
    			throw new IllegalArgumentException("No sound defined for " + key);
    		}
    
    		List<SoundMapping> entrylist = mapping.get(key);
    		SoundMapping entry = entrylist.get(randomNumberGenerator.nextInt(entrylist.size()));
    		try {
    			return new BufferedInputStream(
    					rep.getStream(entry.getDirectory(), entry.getFile(), ResourceType.SOUND));
    		} catch (FileNotFoundException e) {
    			throw new IOException(e);
    		}
    	}
        public ServiceCall<BatchStatus> createBatch(CreateBatchOptions createBatchOptions) {
        Validator.notNull(createBatchOptions, "createBatchOptions cannot be null");
        String[] pathSegments = { "v1/batches" };
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.constructHttpUrl(getEndPoint(), pathSegments));
        builder.query("version", versionDate);
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("compare-comply", "v1", "createBatch");
        for (Entry<String, String> header : sdkHeaders.entrySet()) {
          builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        builder.query("function", createBatchOptions.function());
        if (createBatchOptions.model() != null) {
          builder.query("model", createBatchOptions.model());
        }
        MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
        multipartBuilder.setType(MultipartBody.FORM);
        RequestBody inputCredentialsFileBody = RequestUtils.inputStreamBody(createBatchOptions.inputCredentialsFile(),
            "application/json");
        multipartBuilder.addFormDataPart("input_credentials_file", "filename", inputCredentialsFileBody);
        multipartBuilder.addFormDataPart("input_bucket_location", createBatchOptions.inputBucketLocation());
        multipartBuilder.addFormDataPart("input_bucket_name", createBatchOptions.inputBucketName());
        RequestBody outputCredentialsFileBody = RequestUtils.inputStreamBody(createBatchOptions.outputCredentialsFile(),
            "application/json");
        multipartBuilder.addFormDataPart("output_credentials_file", "filename", outputCredentialsFileBody);
        multipartBuilder.addFormDataPart("output_bucket_location", createBatchOptions.outputBucketLocation());
        multipartBuilder.addFormDataPart("output_bucket_name", createBatchOptions.outputBucketName());
        builder.body(multipartBuilder.build());
        return createServiceCall(builder.build(), ResponseConverterUtils.getObject(BatchStatus.class));
      }
        public Customers withCustomer(Customer... values) {
            for (Customer value: values) {
                getCustomer().add(value);
            }
            return this;
        }
    }
}