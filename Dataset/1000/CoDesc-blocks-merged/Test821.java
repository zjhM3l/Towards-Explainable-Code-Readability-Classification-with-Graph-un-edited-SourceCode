class Test {
    public class Example {
    protected PdfArray copyArray(PdfArray in) throws IOException, BadPdfFormatException {
            PdfArray out = new PdfArray();
            
            for (Iterator i = in.listIterator(); i.hasNext();) {
                PdfObject value = (PdfObject)i.next();
                out.add(copyObject(value));
            }
            return out;
        }
        private void createSizeThemeTextField() {
    		GridData gridData7 = new GridData();
    		gridData7.widthHint = 50;
    		sizeThemeTextField = new ThemeTextField(textAboveComposite, SWT.NONE);
    		sizeThemeTextField.setEmbeddedInBindableGroup(false);
    		sizeThemeTextField.setBindingSubPath("fontSize");
    		sizeThemeTextField.setIntValued(true);
    		sizeThemeTextField.setLayoutData(gridData7);
    	}
        private void _init() throws Exception {
    	this.calendarFechaIni.setSelectedDate(this.getSessionReenviosInconsistenciaBean().getActualDate());
    	this.calendarFechaFin.setSelectedDate(this.getSessionReenviosInconsistenciaBean().getActualDate());
    	ConstantesGenerales.getInstance();	
        }
    }
}