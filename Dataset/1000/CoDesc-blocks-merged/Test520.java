class Test {
    public class Example {
    public static void clearFixedEffect ( FixedEffect self ) {
      self . mA = new float [ ] {
      };
      self . mF = new float [ ] {
      };
      self . mB = new float [ ] {
      };
      self . mA_identity = new float [ ] {
      };
      self . mREML_term = new float [ ] {
      };
      self . mn_terms = 0 ;
      self . mn_fixed_effs = 0 ;
      self . mn_fixed_effs_REML = 0 ;
      indicator . term = new float [ ] {
      };
      indicator . row = new float [ ] {
      };
      indicator . col = new float [ ] {
      };
      clearCache ( "Fstar" , "Astar" , "Xstar" , "Xhat" , "Areml" , "Areml_eigh" , "Areml_chol" , "Areml_inv" , "beta_hat" , "B_hat" , "LRLdiag_Xhat_tens" , "Areml_grad" , "beta_grad" , "Xstar_beta_grad" , "Zstar" , "DLZ" ) ;
    }
        protected int getResourceCount() {
            if (resourceGroup != null) {
                return resourceGroup.getResourceCount();
            }
            return 0;
        }
        private ResultSet getResultSet(boolean async) throws SQLException {
            
            ResultSet rs = getUnfilteredResultSet(async);
            
            if (rs == null) {
            	return null;
            }
            
            if (resultSetFilter == null) {
                return rs;
            } else {
                CachedRowSet filteredRs = new CachedRowSet();
                filteredRs.populate(rs, resultSetFilter);
                return filteredRs;
            }
        }
    }
}