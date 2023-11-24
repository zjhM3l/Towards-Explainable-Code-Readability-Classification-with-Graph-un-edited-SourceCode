class Test {
    public class Example {
    private void handleConnectError(Throwable ex) {
            connectThrowable = ex;
            loginFailed = true;
            try {
                client.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
    
            System.out.println(ex.getMessage());
        }
        public File writeForm(File fileout) throws FormPrintException {
            if(!m_processed)
                throw new IllegalStateException("The form not been processed yet");
            try {
                if(fileout == null) {
                    String extn = ".txt";
                    if(FormPrintFactory.ENGINE_TYPE_ITEXT.equals(m_engineType) || 
                       FormPrintFactory.ENGINE_TYPE_PDFLIB.equals(m_engineType) )
                        extn = ".pdf";
                    fileout = File.createTempFile("form_", extn);
                }
                OutputStream bos = new FileOutputStream(fileout);
                bos.write(m_output);
                bos.close();
            } catch (IOException e) {
                log.error("Error Writing out PDF", e);
                return null;
            }
            return fileout;
        }
        public static AuditDto transformToDto(Audit audit) {
            if (audit == null) {
                throw new WebApplicationException("Null entity object cannot be converted to Dto object.", Status.INTERNAL_SERVER_ERROR);
            }
    
            AuditDto auditDto = new AuditDto();
    
            try {
            	    auditDto.setId(audit.getId());
            	    auditDto.setHostName(audit.getHostName());
            	    auditDto.setMessage(audit.getMessage());
            	    auditDto.setCreatedDate(audit.getCreatedDate());
                auditDto.setEntityId(audit.getEntityId());
            } catch (Exception ex) {
                throw new WebApplicationException("DTO transformation failed.", Status.INTERNAL_SERVER_ERROR);
            }
            return auditDto;
        }
    }
}