//Mustafa Said Çanak	150120020
import java.util.*;
public class Project {
	private String projectName;
	private Calendar startDate;
	private boolean state;
	
	public Project() {
		
	}
	
	public Project(String pName, Calendar startDate, String state) {
		this.projectName = pName;
		this.startDate = startDate;
		setState(state);
	}
	
	public void setState(String state) {
		if (state == "Open")
			this.state = true;
		else if (state == "Close")
			this.state = false;
	}
	
	public String getState() {
		if (state == true)
			return "Open";
		else if(state == false)
			return "Close";
		else 
			return null;
	}
	
	public void close() {
		if (state == true)
			state = false;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Calendar getStartDate() {
		return startDate;
	}

	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", startDate=" + startDate + ", state=" + state + "]";
	}
}
