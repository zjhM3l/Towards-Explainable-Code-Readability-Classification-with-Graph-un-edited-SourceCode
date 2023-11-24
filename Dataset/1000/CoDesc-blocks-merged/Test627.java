class Test {
    public class Example {
    private static String tryGetForbiddenPackageName(String classAndMethod) {
    
            for (String pkg : suppressedPackages) {
                if (classAndMethod.startsWith(pkg)) {
                    return pkg;
                }
            }
            return null;
        }
        @Override
      protected void visitMsgFallbackGroupNode(MsgFallbackGroupNode node) {
    
        boolean foundTranslation = false;
        if (msgBundle != null) {
          for (MsgNode msg : node.getChildren()) {
            ImmutableList<SoyMsgPart> translation =
                msgBundle.getMsgParts(MsgUtils.computeMsgIdForDualFormat(msg));
            if (!translation.isEmpty()) {
              renderMsgFromTranslation(msg, translation, msgBundle.getLocale());
              foundTranslation = true;
              break;
            }
          }
        }
        if (!foundTranslation) {
          renderMsgFromSource(node.getChild(0));
        }
      }
        private void updateValues() {
    		if (shouldReactToProgrammaticChangeEvents) {
    			String fname = comboFonts.getSelectedItem().toString();
    			int size = 11;
    			try {
    				size = Integer
    						.parseInt(comboSizes.getSelectedItem().toString());
    			} catch (NumberFormatException ex) {
    			}
    
    			int style = Font.PLAIN;
    
    			if (comboStyles.getSelectedItem() != null) {
    				if (comboStyles.getSelectedItem().equals("Plain")) {
    					style = Font.PLAIN;
    				} else if (comboStyles.getSelectedItem().equals("Bold")) {
    					style = Font.BOLD;
    				} else if (comboStyles.getSelectedItem().equals("Italic")) {
    					style = Font.ITALIC;
    				}
    			}
    
    			setFont(new Font(fname, style, size));
    		}
    	}
    }
}