package protocol;

import java.io.Serializable;

public class Protocol implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String version;
	private String method;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

}
