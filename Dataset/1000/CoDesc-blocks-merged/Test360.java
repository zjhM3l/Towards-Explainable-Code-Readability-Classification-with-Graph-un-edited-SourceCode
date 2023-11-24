class Test {
    public class Example {
    public void expireReplay(String instanceId) throws StorageCenterAPIException {
      Parameters params=new Parameters();
      RestResult rr=restClient.post(String.format("StorageCenter/ScReplay/%s/Expire",instanceId),params.toJson());
      if (!checkResults(rr)) {
        String msg=String.format("Error expiring replay %s: %s",instanceId,rr.getErrorMsg());
        LOG.warn(msg);
        throw new StorageCenterAPIException(msg);
      }
    }
        public Import getSelectedImport() {
    		int index = list.getSelectedIndex();
    		if (index == -1) {
    			return null;
    		} else {
    			return imports.get(index);
    		}
    	}
        public static List<MailboxNodeContent> parseMailboxContents(List<String> jsons) throws JSONException {
            ArrayList<MailboxNodeContent> objects = new ArrayList<MailboxNodeContent>(jsons.size());
            for (String json : jsons) {
                MailboxNodeContent content = null;
                JSONObject jsObj = new JSONObject(json);
                long HSId = jsObj.getLong("HSId");
                Integer partitionId = null;
                if (jsObj.has("partitionId")) {
                    partitionId = jsObj.getInt("partitionId");
                }
                content = new MailboxNodeContent(HSId, partitionId);
                objects.add(content);
            }
            return objects;
        }
    }
}