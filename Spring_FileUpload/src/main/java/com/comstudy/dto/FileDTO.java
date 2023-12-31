package com.comstudy.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FileDTO {
	private String uuid;
	private String fileName;
	private String contentType;
	
	public FileDTO(String uuid, String fileName, String contentType) {
		this.uuid = uuid;
		this.fileName = fileName;
		this.contentType = contentType;
		
		System.out.println(">>> " + this.toString());
	}
	
}
