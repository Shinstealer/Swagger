package jp.co.pew.swagger.entity;

import lombok.NoArgsConstructor;


@NoArgsConstructor
public class AdswSceneSetting {
	
	private String getStatus;
	private String manipulate;
	
	public AdswSceneSetting(String getStatus , String manipulate) {

		this.getStatus = getStatus;
		this.manipulate = manipulate;
	}

	public String getGetStatus() {
		return getStatus;
	}


	public String getManipulate() {
		return manipulate;
	}


}
