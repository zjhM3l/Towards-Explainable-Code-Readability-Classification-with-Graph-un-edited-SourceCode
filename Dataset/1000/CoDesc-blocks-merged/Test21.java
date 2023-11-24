class Test {
    public class Example {
    @Description(summary="Run the Emma code coverage.") public void coverage(){
      downloadTest();
      downloadUsingMaven("ext/emma-2.0.5312.jar","emma","emma","2.0.5312","30a40933caf67d88d9e75957950ccf353b181ab7");
      String cp="temp" + File.pathSeparator + "bin"+ File.pathSeparator+ "ext/emma-2.0.5312.jar"+ File.pathSeparator+ "ext/postgresql-9.4.1209.jre6.jar"+ File.pathSeparator+ "ext/servlet-api-3.1.0.jar"+ File.pathSeparator+ "ext/lucene-core-3.6.2.jar"+ File.pathSeparator+ "ext/h2mig_pagestore_addon.jar"+ File.pathSeparator+ "ext/org.osgi.core-4.2.0.jar"+ File.pathSeparator+ "ext/org.osgi.enterprise-4.2.0.jar"+ File.pathSeparator+ "ext/jts-core-1.14.0.jar"+ File.pathSeparator+ "ext/slf4j-api-1.6.0.jar"+ File.pathSeparator+ "ext/slf4j-nop-1.6.0.jar"+ File.pathSeparator+ javaToolsJar;
      execJava(args("-Xmx128m","-XX:-UseSplitVerifier","-cp",cp,"emma","run","-cp","temp","-sp","src/main","-r","html,txt","-ix","-org.h2.test.*,-org.h2.dev.*," + "-org.h2.jaqu.*,-org.h2.mode.*,-org.h2.server.pg.*","org.h2.test.TestAll"));
    }
        public String getFormattedStatus() {
            final StringBuilder sb = new StringBuilder();
            final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
            sb.append(format.format(new Date(timestamp)));
            sb.append(SPACE);
            sb.append(getThreadName());
            sb.append(SPACE);
            sb.append(level.toString());
            sb.append(SPACE);
            sb.append(msg.getFormattedMessage());
            final Object[] params = msg.getParameters();
            Throwable t;
            if (throwable == null && params != null && params[params.length - 1] instanceof Throwable) {
                t = (Throwable) params[params.length - 1];
            } else {
                t = throwable;
            }
            if (t != null) {
                sb.append(SPACE);
                final ByteArrayOutputStream baos = new ByteArrayOutputStream();
                t.printStackTrace(new PrintStream(baos));
                sb.append(baos.toString());
            }
            return sb.toString();
        }
        public Node typeCheck(TypeChecker tc) throws SemanticException {
            TypeSystem ts = tc.typeSystem();
    
            if (! compareType.type().isReference()) {
    	    throw new SemanticException(
    		"Type operand of \"instanceof\" must be a reference type.",
    		compareType.position());
    	}
    
    	if (! ts.isCastValid(expr.type(), compareType.type())) {
    	    throw new SemanticException(
    		"Expression operand incompatible with type in \"instanceof\".",
    		expr.position());
    	}
    
    	return type(ts.Boolean());
        }
    }
}