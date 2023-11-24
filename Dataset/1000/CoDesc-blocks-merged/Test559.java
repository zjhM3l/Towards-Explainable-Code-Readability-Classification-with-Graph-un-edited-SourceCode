class Test {
    public class Example {
    private void buildPKPDfile(IProgressMonitor monitor) {
          monitor.beginTask("Building PKPD project", 4);
    
          if (!deleteAuditMarkers(getProject()))
             return; 
          
          if (checkCancel(monitor))
             return;
          
          //Get and parse pkpd.xml from file
    //      CM 02008-07-25: Commented out because it wasn't used
    //      Map pluginKeys = scanPlugin(getProject().getFile("pkpd.xml"));
          monitor.worked(1);
          
          if (checkCancel(monitor))
             return;
          
          // TODO: Build PKPD derived resources here
          
          monitor.done();
       }
        public static void manipulate ( IPopoInstance self , IStoredInstance storedInstance , IComponentInstance componentInstance ) {
      self . setIPopoInstance ( storedInstance ) ;
      Set < Boolean > flagsToGenerate = new HashSet < Boolean > ( ) ;
      if ( storedInstance . getContext ( ) . getProperties ( ) != null ) {
        flagsToGenerate . add ( true ) ;
      }
      if ( storedInstance . getContext ( ) . hasHiddenProperties ( ) ) {
        flagsToGenerate . add ( false ) ;
      }
      for ( Boolean publicFlag : flagsToGenerate ) {
        Method getter = self . getFieldPropertyGenerator ( publicFlag ) ;
        Method setter = self . getMethodsNames ( publicFlag ) ;
        String getterName = self . getMethodNames ( publicFlag ) [ 0 ] ;
        String setterName = self . getMethodNames ( publicFlag ) [ 1 ] ;
        BeanUtils . setProperty ( componentInstance , getterName , getter . getName ( ) ) ;
        BeanUtils . setProperty ( componentInstance , setterName , setter . getName ( ) ) ;
      }
    }
        public void testNonLatinProcessName() {
        // temporarily exclude oracle due to qa database 
        String database = System.getProperty("database");
        if (database != null && database.startsWith("oracle"))
          return;
    
        // "Lev Trotskij"
        deployJpdlXmlString("<process name='\u041B\u0435\u0412 \u0422\u0440\u043E\u0446\u043A\u0438\u0439'>" +
          "  <start/>" +
          "</process>");
    
        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
          .processDefinitionKey("\u041B\u0435\u0412_\u0422\u0440\u043E\u0446\u043A\u0438\u0439")
          .uniqueResult();
    
        assertEquals("\u041B\u0435\u0412 \u0422\u0440\u043E\u0446\u043A\u0438\u0439", processDefinition.getName());
      }
    }
}