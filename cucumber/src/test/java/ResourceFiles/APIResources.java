package ResourceFiles;

public enum APIResources {
	Login("/api/ecom/auth/login");

	private String resource;

	APIResources(String loginDetails) {
		this.resource = loginDetails;
	}

	public String getResource() {
		return resource;
	}
}
