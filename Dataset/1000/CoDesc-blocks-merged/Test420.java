class Test {
    public class Example {
    public static Expression exists(String operator, Val<Expression>[] args, EbeanExprInvoker invoker) {
            if (args.length == 1) {
                if (args[0].object() instanceof QueryExpression) {
                    return factory(invoker).exists(((QueryExpression<?>) args[0].object()).query);
                }
                throw new QuerySyntaxException(Messages.get("dsl.arguments.error3", operator));
            }
            throw new QuerySyntaxException(Messages.get("dsl.arguments.error0", operator));
        }
        public void testCreateXPathWithElement() throws Exception {
            doTest(null, root, "/catalog");
            doTest(null, root.getChild("cd"), "/catalog/cd[1]");
            doTest(null, root.getChild("cd").getChild("title"),
                   "/catalog/cd[1]/title");
            try {
                doTest(null, root.getChild("NOTFOUND"), ".");
                fail("Element parameter which is null should not be allowed.");
            } catch (Exception e) {
            }
        }
        public static < T extends Throwable > boolean throwError ( Subject subject , Class < T > errorClass ) {
      String description = "Expect {
    }
     to be thrown" ;
      try {
        subject . doThrow ( errorClass ) ;
        return ( false ) ;
      }
      catch ( Throwable e ) {
        return ( true ) ;
      }
    }
    }
}