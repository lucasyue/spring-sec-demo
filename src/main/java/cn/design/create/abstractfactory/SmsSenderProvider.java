package cn.design.create.abstractfactory;

public class SmsSenderProvider implements Factory {
	@Override
	public Sender product() {
		return new SmsSender();
	}

}
