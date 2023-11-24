class Test {
    public class Example {
    public void setType(IType type) {
            // validate the type
            if (!TypeStatus.getStatus(type).isOK())
                return;
            setProject(type.getJavaProject());
            fqClassName = type.getFullyQualifiedName();
        }
        public void writeR820TRegister(Register register,byte value,boolean controlI2C) throws UsbException {
      if (register.isMasked()) {
        int current=mShadowRegister[register.getRegister()];
        value=(byte)((current & ~register.getMask()) | (value & register.getMask()));
      }
      writeI2CRegister(mDeviceHandle,mI2CAddress,(byte)register.getRegister(),value,controlI2C);
      mShadowRegister[register.getRegister()]=value;
    }
        public InteractionType loadFromCursor(Cursor cursor, int pos) {
    		
    		cursor.moveToPosition(pos);
    		
    		Uri iconUri = Uri.parse(cursor.getString(COLUMN_ICON_URI)); 
    		String actionTitle = cursor.isNull(COLUMN_INTERACT_ACTION_TITLE) ? 
    				cursor.getString(COLUMN_NAME) : 
    				cursor.getString(COLUMN_INTERACT_ACTION_TITLE);
    		String intentAction = cursor.getString(COLUMN_INTERACT_INTENT);
    		
    		return new InteractionType(iconUri, actionTitle, intentAction);
    	}
    }
}