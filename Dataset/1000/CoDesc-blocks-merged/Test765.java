class Test {
    public class Example {
    public static long getFileSize ( RandomAccessFile fileObject ) throws IOException {
      long position = fileObject . length ( ) ;
      fileObject . seek ( 0 ) ;
      long fileSize = fileObject . length ( ) ;
      fileObject . seek ( position ) ;
      return fileSize ;
    }
        public I_JoServletModel getModel() {
            if (model.isPrivileged()) {
                return model;
            }
            return null;
        }
        public Collection<PluginsAlertCondition> list(long policyId, String name)
        {
            List<PluginsAlertCondition> ret = new ArrayList<PluginsAlertCondition>();
            Collection<PluginsAlertCondition> conditions = list(policyId);
            for(PluginsAlertCondition condition : conditions)
            {
                if(condition.getName().equals(name))
                    ret.add(condition);
            }
            return ret;
        }
    }
}