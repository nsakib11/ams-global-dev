package com.ams.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import jakarta.validation.constraints.NotBlank;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class UserAuthorizationRequest implements Serializable {

	@NotBlank
	private String url;

}
