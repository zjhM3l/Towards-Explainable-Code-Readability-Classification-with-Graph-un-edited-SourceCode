class Test {
    public class Example {
    public Document addDocument(Document document) {
            Contact contact = document.getContact();
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            // remove the document if exist
            if (document.getIdDocument() != null) {
                contact.getDocumentLinks().remove(document);
            }
            // merge the document, add it and merge the contact
            document = em.merge(document);
            contact.getDocumentLinks().add(document);
            contact = em.merge(contact);
            em.getTransaction().commit();
            em.close();
            // store the contact in the document as a return value
            document.setContact(contact);
            return document;
        }
        public void setShowToolbar(boolean b) {
            if (b == true) {
                showToolbar = "true";
            } else {
                showToolbar = "false";
            }
        }
        @Deprecated public ShapelessRecipe addIngredient(int count,Material ingredient,int rawdata){
      Validate.isTrue(ingredients.size() + count <= 9,"Shapeless recipes cannot have more than 9 ingredients");
      if (rawdata == -1) {
        rawdata=Short.MAX_VALUE;
      }
      while (count-- > 0) {
        ingredients.add(new ItemStack(ingredient,1,(short)rawdata));
      }
      return this;
    }
    }
}