package com.stmark.controller;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stmark.controller.dto.DTO;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/Util")
public class UtilController {

	@PostMapping("/upload")
	public String uploadFile(DTO dto) {

		System.out.println(dto.toString());

		byte[] fileContent;
		try {
			fileContent = FileUtils.readFileToByteArray(new File(dto.getBase64Image().getName()));
			String encodedString = Base64.getEncoder().encodeToString(fileContent);
			System.out.println(encodedString);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
}
