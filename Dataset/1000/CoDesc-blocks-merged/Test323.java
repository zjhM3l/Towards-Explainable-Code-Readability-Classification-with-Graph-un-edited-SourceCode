class Test {
    public class Example {
    public final void deleteReferenceImage(ReferenceImageName name) {
    
        DeleteReferenceImageRequest request =
            DeleteReferenceImageRequest.newBuilder()
                .setName(name == null ? null : name.toString())
                .build();
        deleteReferenceImage(request);
      }
        public void moveToBack() {
            if (isIcon()) {
                if (getDesktopIcon().getParent() instanceof JLayeredPane) {
                    ((JLayeredPane)getDesktopIcon().getParent()).
                        moveToBack(getDesktopIcon());
                }
            }
            else if (getParent() instanceof JLayeredPane) {
                ((JLayeredPane)getParent()).moveToBack(this);
            }
        }
        public void testIsMatch_1() {
            try {
                httpidentunit = new HttpIdentUnit(HttpIdentUnit.HEADER_UNIT);
                httpidentunit.isMatch(request);
            } catch(IllegalStateException excep) {
                //OK
            } catch(Exception excep) {
                fail("isMatch test failed - unhandled exception.");
            }
        }
    }
}