class Test {
    public class Example {
    public SQLWarning getWarnings() throws SQLException {
            if (closed) {
                throw new SQLException(ACCESS_CLOSED_CONNECTION);
            }
            return conn.getWarnings();
        }
        protected void setupView() {
            super.setupView();
            
            GridData gd;
            
            // HREF
            Label label = new Label(getFieldContainer(), SWT.NULL);
            label.setText("&HREF:");
            _tfHREF = new Text(getFieldContainer(), SWT.BORDER | SWT.SINGLE);
            gd = new GridData(GridData.FILL_HORIZONTAL);
            _tfHREF.setLayoutData(gd);
            
            /*
             * These need to go at the end here
             */
            setMinSize(getChildPanel().computeSize(SWT.DEFAULT, SWT.DEFAULT));
            getChildPanel().setSize(getChildPanel().computeSize(SWT.DEFAULT, SWT.DEFAULT));
            
            setupControlListeners();
        }
        private void setArgPosition() {
    
                int xPos;
                for (xPos = m_pos; xPos < m_fmt.length(); xPos++) {
                    if (!Character.isDigit(m_fmt.charAt(xPos))) {
                        break;
                    }
                }
                if ((xPos > m_pos) && (xPos < m_fmt.length())) {
                    if (m_fmt.charAt(xPos) == '$') {
                        m_positionalSpecification = true;
                        m_argumentPosition = Integer.parseInt(m_fmt.substring(m_pos, xPos));
                        m_pos = xPos + 1;
                    }
                }
            }
    }
}