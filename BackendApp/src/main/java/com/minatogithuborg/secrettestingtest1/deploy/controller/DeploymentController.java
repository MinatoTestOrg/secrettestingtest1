package com.minatogithuborg.secrettestingtest1.deploy.controller;


import com.minatogithuborg.secrettestingtest1.deploy.service.DeploymentService;
import com.minatogithuborg.secrettestingtest1.base.deploy.controller.DeploymentBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
@RestController
@RequestMapping(path = "/rest/deploy/", produces = "application/json")
public class DeploymentController extends DeploymentBaseController<DeploymentService> {

	public DeploymentController(DeploymentService deploymentService) {
		super(deploymentService);
	}
	
}
