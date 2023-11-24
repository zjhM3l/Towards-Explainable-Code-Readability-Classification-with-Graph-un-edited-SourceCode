class Test {
    public class Example {
    public String message(String key, Object... params) {
            String message = message(key);
    
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
                message = message.replace("{" + i + "}", eval(param));
            }
    
            return message;
        }
        public static void writeAnalysisHTMLToFile(String outputPath, DataAnalysis dataAnalysis, JavaSparkContext sc) {
            try {
                String analysisAsHtml = HtmlAnalysis.createHtmlAnalysisString(dataAnalysis);
                writeStringToFile(outputPath, analysisAsHtml, sc);
            } catch (Exception e) {
                throw new RuntimeException("Error generating or writing HTML analysis file (normalized data)", e);
            }
        }
        protected synchronized ProjHolder push(ProjHolder proj){
      if (backStack == null) {
        backStack=new Stack<ProjHolder>();
      }
      if (backStack.size() >= stackSize) {
        backStack.removeElementAt(0);
      }
      return backStack.push(proj);
    }
    }
}