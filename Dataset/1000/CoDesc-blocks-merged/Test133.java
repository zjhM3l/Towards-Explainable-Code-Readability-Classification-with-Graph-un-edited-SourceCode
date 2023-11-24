class Test {
    public class Example {
    @Override public Object eGet(int featureID,boolean resolve,boolean coreType){
    switch (featureID) {
    case UmplePackage.GEN_EXPR___NAME_1:
        return getName_1();
    case UmplePackage.GEN_EXPR___ANONYMOUS_GEN_EXPR_11:
      return getAnonymous_genExpr_1_1();
    case UmplePackage.GEN_EXPR___EQUALITY_OP_1:
    return getEqualityOp_1();
    case UmplePackage.GEN_EXPR___NAME_2:
    return getName_2();
    case UmplePackage.GEN_EXPR___ANONYMOUS_GEN_EXPR_21:
    return getAnonymous_genExpr_2_1();
    }
    return super.eGet(featureID,resolve,coreType);
    }
        protected void init() {
            // �e�L�X�g�̓o�^
            setText(Messages.getString("TranslationView.TextCopyAction.text")); //$NON-NLS-1$
            // �A�C�R���̓o�^
            ImageDescriptor descriptor =
                TranslationViewPlugin.getInstance().getImageRegistry().getDescriptor(
                        TranslationViewConstants.ICON_COPY);
            setImageDescriptor(descriptor);
            // �A�N�Z�����[�^�̓o�^
            setAccelerator(SWT.CONTROL | 'C');
        }
        public void attributeReplaced(HttpSessionBindingEvent event) {
    
            logger.info("attributeReplaced('" + event.getSession().getId() + "', '" +
                event.getName() + "', '" + event.getValue() + "')");
        }
    }
}