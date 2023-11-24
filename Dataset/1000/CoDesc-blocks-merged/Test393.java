class Test {
    public class Example {
    public void editMenuRemove(List<JComponent> menuComponents) {
            for (JComponent cmp : menuComponents) {
                editMenu.remove(cmp);
            }
            if (editMenu.getMenuComponents().length == 0)
                editMenu.setEnabled(false);
        }
        public static void adjustWidths ( ColStats self , double maxWidth , ColStats colstats ) {
      List < ColStats > adjColstats = new ArrayList < ColStats > ( ) ;
      for ( ColStats x : colstats ) {
        if ( ! x . isPreformatted ( ) ) adjColstats . add ( x ) ;
        else maxWidth -= x . offt ;
      }
      Function < ColStats , ColStats > nextScore = x -> ( x . counts . get ( x . offt ) + x . chopMass + x . chopCount ) / x . totalMass ;
      Function < ColStats , Integer > curWidth = x -> sum ( x . offt ) ;
      Function < ColStats , Integer > minWidth = x -> self . widthNormalize ( self . colspec . get ( x . column ) . minwidth ) ;
      while ( curWidth . apply ( maxWidth ) > maxWidth ) {
        List < ColStats > nextaffects = new ArrayList < ColStats > ( ) ;
        nextaffects . add ( ( nextScore . apply ( x ) ) ) ;
        nextaffects . add ( x ) ;
        if ( ! nextaffects . isEmpty ( ) ) {
          Collections . sort ( nextaffects ) ;
          ColStats chop = adjColstats . get ( nextaffects . get ( 0 ) . second ) ;
          chop . chopCount += chop . counts . get ( chop . offt ) ;
          chop . chopMass += chop . chopCount ;
          chop . offt -- ;
        }
      }
    }
        private static IInfoPanel searchChildren(ElementBase parent, ElementBase exclude, boolean activeOnly) {
            IInfoPanel infoPanel = null;
            
            if (parent != null) {
                for (ElementBase child : parent.getChildren()) {
                    if ((child != exclude) && ((infoPanel = getInfoPanel(child, activeOnly)) != null)) {
                        break;
                    }
                }
                
                if (infoPanel == null) {
                    for (ElementBase child : parent.getChildren()) {
                        if ((child != exclude) && ((infoPanel = searchChildren(child, null, activeOnly)) != null)) {
                            break;
                        }
                    }
                }
            }
            
            return infoPanel;
        }
    }
}