package com.jsun.site;

import com.jsun.site.validation.NotBlank;
import org.springframework.validation.annotation.Validated;

import java.security.Principal;

@Validated
public interface AuthenticationService {
  Principal authenticate(
		  @NotBlank(message = "{validate.authenticate.username}")
		  String username, 
		  @NotBlank(message = "{validate.authenticate.password}")
		  String password);
}
