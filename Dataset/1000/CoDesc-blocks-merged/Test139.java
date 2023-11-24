class Test {
    public class Example {
    private static Object[] getExample(
                Property property,
                Map<String, Model> definitions,
                DocumentResolver definitionDocumentResolver,
                MarkupDocBuilder markupDocBuilder,
                Map<String, Integer> refStack) {
            if (property.getExample() != null) {
                return new Object[]{property.getExample()};
            } else if (property instanceof ArrayProperty) {
                return new Object[]{generateExampleForArrayProperty((ArrayProperty) property, definitions, definitionDocumentResolver, markupDocBuilder, refStack)};
            } else if (property instanceof RefProperty) {
                return new Object[]{generateExampleForRefModel(true, ((RefProperty) property).getSimpleRef(), definitions, definitionDocumentResolver, markupDocBuilder, refStack)};
            } else {
                return new Object[]{PropertyAdapter.generateExample(property, markupDocBuilder)};
            }
        }
        final public void setVelocity( final Velocity velocity ) {
    
            // Validate the velocity
            if( velocity == null ) {
                throw new IllegalArgumentException( "Velocity cannot be null." );
            } else if( !velocity.isValid() ) {
                throw new IllegalArgumentException( "Velocity is internally invalid." );
            }
    
            this.velocity = velocity;
        }
        public void release() {
          super.release();
          group = null;
          type = null;
          firstOptionBlank = null;
    	  isRequired = null;
        }
    }
}