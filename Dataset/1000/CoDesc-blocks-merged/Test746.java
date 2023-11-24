class Test {
    public class Example {
    public void log(Throwable t) {
            notNull(t);
            if (t instanceof CoreException) {
                log(((CoreException) t).getStatus());
            } else {
                log(newErrorStatus(MESSAGES.get("error.generic"), t));
            }
        }
        public CommandSetRoot unmarshalRoot(Reader reader) throws Exception {
            try {
                return (CommandSetRoot) unmar.unmarshal(reader);
            } catch (Exception e) {
                log.error("The unmarshaller failed: " + e.getMessage(), e);
                throw new Exception(e.getMessage());
            }
        }
        public String EncodeFile(String path, String encoding) {
    		int fd = 0;
    		int magic_quotes = 0;
    		String file_buffer = null;
    		if (!booleanval(fd = FileSystemOrSocket.fopen( path, "rb"))) {
    			this.SetError(this.Lang("file_open") + path);
    			return "";
    		}
    		magic_quotes = Options.get_magic_quotes_runtime();
    		Options.set_magic_quotes_runtime( 0);
    		file_buffer = FileSystemOrSocket.fread( fd, FileSystemOrSocket.filesize( path));
    		file_buffer = this.EncodeString(file_buffer, encoding);
    		FileSystemOrSocket.fclose( fd);
    		Options.set_magic_quotes_runtime( magic_quotes);
    		return file_buffer;
    	}
    }
}