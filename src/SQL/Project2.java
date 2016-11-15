package SQL;

import java.util.function.Predicate;

public class Project2 {
	private String name;
	private String summary;
	private int num;
	private String education;
	private String language;
	private String platform;
	private String experience;
	private String time;
	private String price;
	private String id;
	private String needer;
	private String status;
	private String[] worker;
	private String[] waiter;
	
	public Project2(String name,String summary,int num,String education,String language,String platform,String experience,
			String time,String price,String id,String needer,String status,String[] worker,String[] waiter){
		this.experience=experience;
		this.id=id;
		this.language=language;
		this.name=name;
		this.needer=needer;
		this.num=num;
		this.price=price;
		this.summary=summary;
		this.time=time;
		this.education=education;
		this.platform=platform;
		this.status=status;
		this.worker=worker;
		this.waiter=waiter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNeeder() {
		return needer;
	}

	public void setNeeder(String needer) {
		this.needer = needer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String[] getWorker() {
		return worker;
	}

	public void setWorker(String[] worker) {
		this.worker = worker;
	}

	public String[] getWaiter() {
		return waiter;
	}

	public void setWaiter(String[] waiter) {
		this.waiter = waiter;
	}

	
	
}
