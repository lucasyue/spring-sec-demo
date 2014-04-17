package cn.design.create.abstractfactory;

public class MailProvider implements Factory {

	@Override
	public Sender product() {
		return new MailSender();
	}

}
