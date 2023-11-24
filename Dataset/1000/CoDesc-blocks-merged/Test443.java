class Test {
    public class Example {
    public void forceStopPackage(String packageName) {
            try {
                ActivityManagerNative.getDefault().forceStopPackage(packageName);
            } catch (RemoteException e) {
            }
        }
        public static boolean getInternalField(Record metadataRecord) throws HiveStageCheckedException{
        if (metadataRecord.has(SEP + INTERNAL_FIELD)) {
          return metadataRecord.get(SEP + INTERNAL_FIELD).getValueAsBoolean();
        }
        throw new HiveStageCheckedException(Errors.HIVE_17, INTERNAL_FIELD, metadataRecord);
      }
        public void addColumn(TableColumn aColumn) {
            String key = aColumn.getHeaderValue().toString();
            String value = UIUtils.getUserProperty(key);
            UIUtils.setUserProperty(key, "" + aColumn.getWidth());
            if (value != null) {
                try {
                    int width = Integer.parseInt(value);
                    aColumn.setWidth(width);
                    aColumn.setPreferredWidth(width);
                } catch (NumberFormatException e) {
                    Util.warn("Invalid numeric format: " + value);
                }
            }
            super.addColumn(aColumn);
        }
    }
}