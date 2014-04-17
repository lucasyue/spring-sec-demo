package cn.design.create.builder;

import java.util.ArrayList;
import java.util.List;

public class Builder {
	public List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			Sender sender = new MailSender();
			list.add(sender);
		}
	}

	public void produceSmsSender(int count) {
		for (int i = 0; i < count; i++) {
			Sender sender = new SmsSender();
			list.add(sender);
		}
	}
}
