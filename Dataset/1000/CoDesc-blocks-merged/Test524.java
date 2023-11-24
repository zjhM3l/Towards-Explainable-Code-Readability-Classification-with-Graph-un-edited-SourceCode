class Test {
    public class Example {
    public static void addAccessControlMethod ( AccessControlList self , String methodName ) {
      if ( self . getAllowedMethods ( ) instanceof Set ) {
        ( ( Set ) self . getAllowedMethods ( ) ) . add ( methodName ) ;
      }
      else {
        self . setAllowedMethods ( new HashSet ( ) ) ;
      }
    }
        public void removeChild(final PlayerCharacter pc, final Object child) {
    		
    		final int i = indexOfChild(child);
    		Equipment anEquip = (Equipment) child;
    		final Float qtyRemoved = anEquip.numberCarried();
    		setChildType("Total", getChildType("Total") - qtyRemoved);
    
    		final String aString = anEquip.isIndexedUnderType();
    		setChildType(aString, getChildType(aString) - qtyRemoved);
    		anEquip.setParent(null);
    		removeContainedEquipment(i);
    		updateContainerContentsString(pc);
    
    		Equipment equipment = this;
    
    		while (equipment.getParent() != null) {
    			equipment = equipment.getParent();
    			equipment.updateContainerContentsString(pc);
    		}
    	}
        private TypeSpec getBinderWrapper() {
            TypeSpec.Builder staticBinderWrapperClassBuilder = TypeSpec
                    .classBuilder("BinderWrapper")
                    .addModifiers(Modifier.PRIVATE)
                    .addModifiers(Modifier.STATIC)
                    .addField(ClassName.get("android.os", "IBinder"), "binder", Modifier.PRIVATE)
                    .addMethod(MethodSpec.constructorBuilder()
                            .addParameter(ClassName.get("android.os", "IBinder"), "binder")
                            .addStatement("this.binder = binder")
                            .build())
                    .addMethod(MethodSpec.methodBuilder("asBinder")
                            .addModifiers(Modifier.PUBLIC)
                            .addAnnotation(Override.class)
                            .returns(ClassName.get("android.os", "IBinder"))
                            .addStatement("return binder")
                            .build())
                    .addSuperinterface(ClassName.get("android.os", "IInterface"));
    
            return staticBinderWrapperClassBuilder.build();
        }
    }
}