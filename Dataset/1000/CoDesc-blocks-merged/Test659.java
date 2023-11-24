class Test {
    public class Example {
    public Drawable getShadow(){
    
             if(ashamanShadowSprite!=null)
                 return (Drawable) ashamanShadowSprite;
    
          // Shadow Creation
             String path = null;
    
             path = "players-0/shadows-3/guard-walking-2"; // same shadow as the tower guard
    
             ashamanShadowSprite = new ShadowSprite( ashamanSprite.getDataSupplier(),
                                                      new ImageIdentifier( path ),
                                                      ImageLibRef.SHADOW_PRIORITY, 4, 4 );
             return ashamanShadowSprite;
         }
        public static void throwOnPacket ( DatagramPacket self , Class pktClass , int state , boolean getNextMsg ) throws Exception {
      if ( getNextMsg ) {
        self . getNextMsg ( ) ;
      }
      if ( ( self . bufferIn == null ) || ( ! self . bufferIn . available ( ) ) ) {
        return ;
      }
      self . curPacket = self . bufferIn . read ( ) ;
      self . bufferIn . reset ( ) ;
      throw new Exception ( state ) ;
    }
        public Collection<CascadeType> getCascades(PluralAttribute<?, ?, ?> attribute) {
            if (attribute.getJavaMember() instanceof AccessibleObject) {
                AccessibleObject accessibleObject = (AccessibleObject) attribute.getJavaMember();
                OneToMany oneToMany = accessibleObject.getAnnotation(OneToMany.class);
                if (oneToMany != null) {
                    return newArrayList(oneToMany.cascade());
                }
                ManyToMany manyToMany = accessibleObject.getAnnotation(ManyToMany.class);
                if (manyToMany != null) {
                    return newArrayList(manyToMany.cascade());
                }
            }
            return newArrayList();
        }
    }
}