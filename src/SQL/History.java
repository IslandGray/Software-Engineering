package SQL;

public class History {
	private String Developer;
	private String Project;
	private String Status;
	
	public History(String developer, String project, String status) {
		
		this.Developer = developer;
		this.Project = project;
		this.Status = status;
	}

	public String getDeveloper() {
		return Developer;
	}

	public void setDeveloper(String developer) {
		Developer = developer;
	}

	public String getProject() {
		return Project;
	}

	public void setProject(String project) {
		Project = project;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
	
	
}
