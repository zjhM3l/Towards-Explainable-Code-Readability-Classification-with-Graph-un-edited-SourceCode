class Test {
    public class Example {
    private void setupDraw2D(GL10 gl) {
    		gl.glMatrixMode(GL10.GL_PROJECTION);
    		gl.glLoadIdentity();
    		gl.glOrthof(-100.0f*aspectRatio, 100.0f*aspectRatio, -100.0f, 100.0f, 1.0f, -1.0f);
    		
    		gl.glMatrixMode(GL10.GL_MODELVIEW);
    		gl.glLoadIdentity();
    	}
        public void login(String email,String password) throws IOException, ParseException, URISyntaxException {
      if (null != ws) {
        ws.close();
      }
      this.email=email;
      this.password=password;
      try {
        this.token=(String)((JSONObject)JSON_PARSER.parse(Requests.POST.makeRequest(DiscordEndpoints.LOGIN,new StringEntity("{\"email\":\"" + email + "\",\"password\":\""+ password+ "\"}"),new BasicNameValuePair("content-type","application/json")))).get("token");
      }
     catch (  HTTP403Exception e) {
        e.printStackTrace();
      }
      this.ws=new DiscordWS(new URI(obtainGateway(this.token)));
    }
        public int getPosition() throws NullPointerException {
    		try {
    			if (isGlobal()) {
    				throw new NullPointerException();
    			} else if (position == -1) {
    				Bit[] bitOwnerBits = getOwner().getValue().getBits();
    				for (int i = 0; i < bitOwnerBits.length; i++) {
    					if (bitOwnerBits[i] == this) {
    						return i;
    					}
    				}
    				return -1;
    			} else {
    				return position;
    			}
    		} catch (NullPointerException eNull) {
    			throw (NullPointerException) new NullPointerException(
    					"not a bus bit: " + this).initCause(eNull);
    		}
    	}
    }
}