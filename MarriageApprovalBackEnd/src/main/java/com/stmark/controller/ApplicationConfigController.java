package com.stmark.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stmark.controller.dto.DTO;
import com.stmark.model.ApplicationConfig;
import com.stmark.service.ApplicationConfigService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/config")
public class ApplicationConfigController {
	
	@Autowired
	ApplicationConfigService applicationConfigService;

		// Get All persons
		@GetMapping("/allApplicationConfigs")
		public ApplicationConfig getAllApplicationConfigs() {
			return applicationConfigService.getAllConfig();
		}
		
		// Update a ApplicationConfig
		@PutMapping("/updateApplicationConfig")
		public ApplicationConfig updateApplicationConfig(@RequestBody DTO dto) {

			return applicationConfigService.update(dto.getConfigName(), dto.getConfigValue());
		}
}
