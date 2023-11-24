class Test {
    public class Example {
    ArchivedAttribute(final ArchiveContents parent,final Attribute attribute){
      WorkspaceComponent comp=attribute.getParentComponent();
      this.parentComponentRef=parent.componentUris.get(comp);
      this.baseObjectKey=comp.getKeyFromObject(attribute.getBaseObject());
      this.methodBaseName=attribute.getMethodName();
      this.argumentDataTypes=attribute.getArgumentDataTypes();
      this.argumentValues=attribute.getArgumentValues();
      this.dataType=attribute.getDataType();
      this.description=attribute.getDescription();
    }
        public double getTotalPrice() throws SQLException {
            Object[] items = getItems();
            double price = 0;
    
            for (int i=0; i<items.length; i++)
                price += ((Item)items[i]).getPrice() * ((Item)items[i]).getCount();
    
            return Math.ceil(price * 100) / 100d;
        }
        static boolean isMatchingProperty(String propertyName,ConfigurationMetadataProperty property,List<ConfigurationMetadataProperty> whiteListedProps){
      if (property.getId().equals(propertyName)) {
        return true;
      }
     else {
        for (    ConfigurationMetadataProperty white : whiteListedProps) {
          if (property.getId().equals(white.getId())) {
            return property.getName().equals(propertyName);
          }
        }
        return false;
      }
    }
    }
}