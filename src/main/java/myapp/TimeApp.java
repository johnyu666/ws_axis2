package myapp;

import cn.johnyu.client.TimerStub;

public class TimeApp {

	public static void main(String[] args) throws Exception{
		TimerStub stub=new TimerStub();
		TimerStub.GetTime getTime=new TimerStub.GetTime();
		String rs=stub.getTime(getTime).get_return();
		System.out.println(rs);

	}

}
