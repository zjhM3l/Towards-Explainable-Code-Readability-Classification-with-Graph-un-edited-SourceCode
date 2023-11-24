class Test {
    public class Example {
    private void refreshPlayingTrack(){
      if (sequence == null) {
        return;
      }
      final Track[] tracks=sequence.getTracks();
      if (tracks.length > 0) {
        try {
          playingTrack=TrackUtils.mergeSequenceToTrack(SequencerImpl.this,recordEnable);
        }
     catch (    final InvalidMidiDataException ignored) {
        }
      }
    }
        @Override
        public Object getItem(int position) throws ArrayIndexOutOfBoundsException {
            Position adapterPosition = translatePosition(position);
            if (adapterPosition.mPosition == POSITION_FILLER
                    || adapterPosition.mPosition == POSITION_HEADER) {
                // Fake entry in view.
                return null;
            }
    
            return mDelegate.getItem(adapterPosition.mPosition);
        }
        private Document parseInputSource(InputSource s) throws JspException {
            try {
                DocumentBuilder db = XmlUtil.newDocumentBuilder();
                db.setEntityResolver(entityResolver);
                return db.parse(s);
            } catch (SAXException e) {
                throw new JspException(e);
            } catch (IOException e) {
                throw new JspException(e);
            }
        }
    }
}