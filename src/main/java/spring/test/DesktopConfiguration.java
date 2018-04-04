package spring.test;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class DesktopConfiguration {

	private String systemOperatingName;
	
	public DesktopConfiguration() {}
	
	@PostConstruct
	public void init() {
		this.systemOperatingName = System.getProperty("os.name");
	}
	
	public String getSystemOperatingName() {
		return this.systemOperatingName;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("[%s]: name: %s", this.getClass().getSimpleName(), this.systemOperatingName));
		return sb.toString();
	}
}
