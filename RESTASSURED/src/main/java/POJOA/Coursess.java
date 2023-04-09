package POJOA;

import java.util.List;

import POJO.Api;
import POJO.Mobile;
import POJO.WebAutomation;

public class Coursess {
	private API apii;
	private List<WebAutomation> webAutomation;
	private List<Api> api;
	private List<Mobile> mobile;

	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}

	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}

	public List<Api> getApi() {
		return api;
	}

	public void setApi(List<Api> api) {
		this.api = api;
	}

	public List<Mobile> getMobile() {
		return mobile;
	}

	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}
	
	public API getAPII() {
		return apii;
	}
}
