class Test {
    public class Example {
    private void updateList() {
        @SuppressWarnings("unchecked")
        T[] matchingItems = (T[]) IterUtil.toArray(_pim.getMatchingItems(), Comparable.class);  // T erases to Comparable!
        _matchList.setListData(matchingItems);
        _matchList.setSelectedValue(_pim.getCurrentItem(), true);
        updateExtensionLabel();
        updateInfo();
        if (_force) {
          for(int i = 0; i < _buttons.length-1; ++i) {
            _buttons[i].setEnabled(_matchList.getModel().getSize() > 0);
          }
        }
      }
        public void setSize(int width, int height){
    		jtp.setPreferredSize(new Dimension(width,height));
        	if (window!=null)
        		window.pack();
        }
        public void marshall(PutImageRequest putImageRequest, ProtocolMarshaller protocolMarshaller) {
    
            if (putImageRequest == null) {
                throw new SdkClientException("Invalid argument passed to marshall(...)");
            }
    
            try {
                protocolMarshaller.marshall(putImageRequest.getRegistryId(), REGISTRYID_BINDING);
                protocolMarshaller.marshall(putImageRequest.getRepositoryName(), REPOSITORYNAME_BINDING);
                protocolMarshaller.marshall(putImageRequest.getImageManifest(), IMAGEMANIFEST_BINDING);
                protocolMarshaller.marshall(putImageRequest.getImageTag(), IMAGETAG_BINDING);
            } catch (Exception e) {
                throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
            }
        }
    }
}