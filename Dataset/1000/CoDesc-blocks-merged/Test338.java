class Test {
    public class Example {
    public String parseTemplatePath(MuleMessage p_message, String p_pathString) {
            if (p_message == null) {
                throw new IllegalArgumentException("The message can't be null");
            }
            // if no expression has been provided, there is nothing to do...
            if (p_pathString == null) {
                return null;
            }
            // return the interpreted expression
            return filenameParser.getFilename((MuleMessage) p_message, p_pathString);
        }
        private boolean isPieceOfFurnitureVisibleAtSelectedLevel(HomePieceOfFurniture piece) {
        Level selectedLevel = this.home.getSelectedLevel();
        return piece.isVisible() 
            && (piece.getLevel() == selectedLevel
                || piece.isAtLevel(selectedLevel));
      }
        public void update(int size) {
    
                // Set the column headers
                columnNames =
                    new String[] { "Konstant", TABLE_COLUMN_NAME_ELEMENT };
    
                //elementColumn[0] = name;
                elementColumn = new String[size];
                valueColumn = new String[size];
                //valueColumn[0] = "Ingen mappning";
    
            }
    }
}