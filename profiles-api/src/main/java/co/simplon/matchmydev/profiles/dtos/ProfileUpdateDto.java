package co.simplon.matchmydev.profiles.dtos;

import org.springframework.web.multipart.MultipartFile;

import co.simplon.matchmydev.profiles.customValidation.FileType;
import co.simplon.matchmydev.profiles.customValidation.MaxSize;

public class ProfileUpdateDto {

	private String description;

	@MaxSize(maxSizeInMB = 10)
	@FileType
	private MultipartFile avatar;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getAvatar() {
		return avatar;
	}

	public void setAvatar(MultipartFile avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "ProfileUpdateDto [description=" + description + ", avatar="
				+ avatar + "]";
	}

}
