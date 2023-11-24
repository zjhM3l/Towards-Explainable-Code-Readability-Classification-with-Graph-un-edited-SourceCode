class Test {
    public class Example {
    public void displayAll() {
            System.out.print("DataMgr:");
    
            if (_objs != null) {
                System.out.print("objs:" + _objs.length);
            }
    
            if (_cols != null) {
                System.out.print("cols;" + _cols.length);
            }
        }//End of display()
        public JComboBox setCodedTypeJComboBox(JComboBox list, AbstractCodedType.ComparisonLevel compLevel, boolean sorted) {
            list.setModel(getCodedTypeListModel(compLevel, sorted));
            list.setEditable(false);
            list.setRenderer(getListCellRendererComponent(compLevel));
            return list;
        }
        public static LicenseProvider createInstance(ZipFile zipFile, String laPrefix) {
            JarFile jar = null;
            try {
                jar = getJarFile(zipFile);
            } catch (IOException e) {
            }
            if (jar == null) {
                return null;
            }
            return ContentLicenseProvider.createInstance(new Content.JarContent(jar), laPrefix);
        }
    }
}