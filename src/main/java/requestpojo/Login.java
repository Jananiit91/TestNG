package requestpojo;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Login implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@SerializedName("username")
@Expose
private String username;
@SerializedName("password")
@Expose
private String password;

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

}