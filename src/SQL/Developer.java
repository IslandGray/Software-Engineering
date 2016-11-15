package SQL;

public class Developer {
	private String name;
	private String graduate;
	private String sex;
	private String account;
	
	private String language;
	private String platform;
	private String experience;
	private String price;
	

	public Developer(String name, String graduate, String sex, String account, String language, String platform,
			String experience, String price) {
		super();
		this.name = name;
		this.graduate = graduate;
		this.sex = sex;
		this.account = account;
		this.language = language;
		this.platform = platform;
		this.experience = experience;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGraduate() {
		return graduate;
	}

	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
