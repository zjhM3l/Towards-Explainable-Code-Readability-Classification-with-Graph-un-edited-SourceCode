class Test {
    public class Example {
    private void enableQuadModeOnConnection(SPARQLConnection con) throws Exception {
      Field quadModeField=SPARQLConnection.class.getDeclaredField("quadMode");
      quadModeField.setAccessible(true);
      Field modifiersField=Field.class.getDeclaredField("modifiers");
      modifiersField.setAccessible(true);
      modifiersField.setInt(quadModeField,quadModeField.getModifiers() & ~Modifier.FINAL);
      quadModeField.set(con,true);
    }
        @Override public boolean equals(final Object o){
      if (this == o) {
        return true;
      }
     else   if (o instanceof ByteSequence) {
        final ByteSequence other=(ByteSequence)o;
        return other.equals(buffer,0,length);
      }
     else {
        return false;
      }
    }
        public String toString() {
        return new String(paramName + " "+paramUnit+" "+rows+" "+
        columns+" "+
        levelValue+" "+levelUnit+" "+
        referenceTime.toGMTString()+ " "+ (int) validHour
        + " or "+validTime.toGMTString() );
      }
    }
}