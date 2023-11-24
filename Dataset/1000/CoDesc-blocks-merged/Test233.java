class Test {
    public class Example {
    public boolean isSourcesModified(){
      if (myInitialItems == null) {
        return false;
      }
      if (getItems().size() != myInitialItems.size()) {
        return true;
      }
      for (  Row row : getItems()) {
        if (row.isModified()) {
          return true;
        }
        if (!myInitialItems.contains(row.mySource)) {
          return true;
        }
      }
      return false;
    }
        public void setMedia(String media) throws FlickrException {
            if (media.equals("all") || media.equals("photos") || media.equals("videos")) {
                this.media = media;
            } else {
                throw new FlickrException("0", "Media type is not valid.");
            }
        }
        public void setValue(int numValue, String value) throws WizardException {
            switch (numValue) {
                case 0:
                    if (value.equals("true"))
                        radExistingContainer.setSelected(true);
                    else
                        radNewContainer.setSelected(true);
                    break;
                case 1:
                    break;
                case 2:
                    cboContainerType.setSelectedItem(value);
                    break;
                case 3:
                    txtContainerLocation.setText(value);
                    break;
                default:
                    throw new WizardException(mediBundle.getString("Volume2DbContainer_value_number_not_valid"));
            }
        }
    }
}