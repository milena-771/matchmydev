package co.simplon.matchmydev.profiles.dtos;

public class AvatarDto {

	private String avatar;

	public AvatarDto() {
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Override
	public String toString() {
		return "{avatar=" + avatar + "}";
	}
}
