package service;

import java.util.Date;

public class TimeService {
	public String getTime() {
		return new Date().toGMTString();
	}
}
