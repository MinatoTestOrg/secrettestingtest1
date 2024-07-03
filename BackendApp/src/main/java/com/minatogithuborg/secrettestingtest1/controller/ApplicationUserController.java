package com.minatogithuborg.secrettestingtest1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import com.vs.rappit.base.logger.Logger;
import com.vs.rappit.base.logger.LoggerFactory;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatogithuborg.secrettestingtest1.base.controller.ApplicationUserBaseController;
import com.minatogithuborg.secrettestingtest1.service.IApplicationUserService;
import com.minatogithuborg.secrettestingtest1.service.ApplicationUserService;
import com.minatogithuborg.secrettestingtest1.model.ApplicationUser;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping(path = "/rest/applicationusers/", produces = "application/json")
public class ApplicationUserController extends ApplicationUserBaseController<IApplicationUserService<ApplicationUser>, ApplicationUser> {

	public ApplicationUserController(ApplicationUserService applicationUserService) {
		super(applicationUserService);
	}
	
		
	
	
}
