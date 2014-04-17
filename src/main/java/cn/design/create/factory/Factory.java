package cn.design.create.factory;

public class Factory {
	public Sender product(String type) {
		if ("sms".equals(type)) {
			return new SmsSender();
		} else if ("email".equals(type)) {
			return new MailSender();
		}
		return null;
	}

	public Sender productSmsSender() {
		return new SmsSender();
	}

	public Sender productMailSender() {
		return new MailSender();
	}
}
