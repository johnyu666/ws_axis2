package myapp;

import cn.johnyu.client.CaculatorStub;

public class CaculatorApp {
	public static void main(String[] args) throws Exception{
		CaculatorStub stub=new CaculatorStub();
		CaculatorStub.Sum sum=new CaculatorStub.Sum();
		sum.setA(3);
		sum.setB(7);
		int rs=stub.sum(sum).get_return();
		System.out.println(rs);
	}
}
