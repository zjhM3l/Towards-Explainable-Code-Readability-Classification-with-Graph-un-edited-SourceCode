class Test {
    public class Example {
    private OptionsLocalProxyPanel getOptionsLocalProxyPanel() {
    		if (optionsLocalProxyPanel == null) {
    			optionsLocalProxyPanel = new OptionsLocalProxyPanel();
    		}
    		return optionsLocalProxyPanel;
    	}
        private void generateIndexMap(int size){
      assert (size % 2 == 1);
      int mapWidth=((size + 1) / 2) + 1;
      mCenterCoefficient=(size - 1) / 2;
      mCenterCoefficientMapIndex=mCenterCoefficient + 1;
      mIndexMap=new int[size][mapWidth];
      for (int x=0; x < mapWidth - 2; x+=2) {
        mIndexMap[0][x]=x;
        mIndexMap[0][x + 1]=size - 1 - x;
      }
      mIndexMap[0][mCenterCoefficientMapIndex]=mCenterCoefficient;
      for (int x=1; x < size; x++) {
        for (int y=0; y < mapWidth; y++) {
          mIndexMap[x][y]=mIndexMap[x - 1][y] + 1;
          if (mIndexMap[x][y] >= size) {
            mIndexMap[x][y]-=size;
          }
        }
      }
    }
        public Element makeLink(String href, String contents) {
    		Element a = makeLink(href);
    		a.appendChild(contents);
    		return a;
    	}
    }
}