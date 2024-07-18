package co.simplon.matchmydev.profiles.customValidation;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MaxSizeValidator
		implements ConstraintValidator<MaxSize, MultipartFile> {

	private static final long MB = 1024 * 1024;

	private long maxSizeInMB;

	@Override
	public void initialize(MaxSize maxSize) {
		this.maxSizeInMB = maxSize.maxSizeInMB();
	}

	@Override
	public boolean isValid(MultipartFile avatar,
			ConstraintValidatorContext constraintValidatorContext) {

		if (avatar == null) {
			return true;
		}

		return avatar.getSize() < (maxSizeInMB * MB);
	}
}
