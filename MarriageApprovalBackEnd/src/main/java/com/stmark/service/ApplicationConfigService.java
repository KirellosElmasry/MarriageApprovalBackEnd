package com.stmark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stmark.model.ApplicationConfig;
import com.stmark.repository.ApplicationConfigRepository;

@Service
public class ApplicationConfigService {

	@Autowired
	private ApplicationConfigRepository applicationConfigRepository;

	public ApplicationConfig getAllConfig() {
		List<ApplicationConfig> list = applicationConfigRepository.findAll();
		if(!list.isEmpty())
			return list.get(0);
		else 
			return null;
	}

	public ApplicationConfig update(String configName, String configValue) {
		
		ApplicationConfig applicationConfig = applicationConfigRepository.findAll().get(0);

		if (applicationConfig != null) {

			if (configName.equalsIgnoreCase("lastRefeneceNumber"))

				if (applicationConfig.getLastRefeneceNumber() != null) {
					applicationConfig.setLastRefeneceNumber(configValue);
				}		

			return applicationConfigRepository.save(applicationConfig);
		}
		return null;
	}
}
