package cn.design.behavior;

import org.junit.Assert;
import org.junit.Test;

import cn.design.behavior.chainofresponsib.MyHandler;
import cn.design.behavior.command.Invoker;
import cn.design.behavior.command.KillCommand;
import cn.design.behavior.command.Person;
import cn.design.behavior.command.Receiver;
import cn.design.behavior.command.SaveCommand;
import cn.design.behavior.interpreter.Context;
import cn.design.behavior.interpreter.Minus;
import cn.design.behavior.interpreter.Plus;
import cn.design.behavior.mediator.TheMediator;
import cn.design.behavior.memento.Original;
import cn.design.behavior.memento.Storage;
import cn.design.behavior.observer.Observer1;
import cn.design.behavior.observer.Observer2;
import cn.design.behavior.state.State;
import cn.design.behavior.visitor.MySubject;
import cn.design.behavior.visitor.MyVistor;

public class Tester {
	@Test
	public void test() {
		// 23.inerpreter calculat 8.0+7.2-9.1
		double rs = new Minus().interpreter(new Context(new Plus()
				.interpreter(new Context(8.0, 7.2)), 9.1));
		Assert.assertTrue(rs == 6.1);
		// 22.mediator
		TheMediator mediator = new TheMediator();
		mediator.createMediator().workAll();
		// 21.vistor??
		MySubject sub = new MySubject();
		sub.accept(new MyVistor());
		// 20. state
		cn.design.behavior.state.Context context = new cn.design.behavior.state.Context(
				new State("s1"));
		context.method();

		context.setState(new State("s2"));
		context.method();
		// 19.memento
		Original orig = new Original();
		orig.setValue("LucasYue");
		Storage stor = new Storage(orig.createMemento());
		Assert.assertEquals("LucasYue", orig.getValue());
		orig.setValue("jake wang");
		Assert.assertEquals("jake wang", orig.getValue());
		orig.restoreMemento(stor.getMemento());
		Assert.assertEquals("LucasYue", orig.getValue());
		// 18 command
		// 18.1
		cn.design.behavior.command.c.Receiver receiver1 = new cn.design.behavior.command.c.Receiver();
		cn.design.behavior.command.c.Command command1 = new cn.design.behavior.command.c.MyCommand(
				receiver1);
		cn.design.behavior.command.c.Invoker invoker1 = new cn.design.behavior.command.c.Invoker();
		invoker1.invoke(command1);
		// 18.2
		Receiver receiver = new Receiver();
		Person p = new Person();
		p.setLife(true);
		Assert.assertTrue(p.isLife());
		KillCommand killCommand = new KillCommand(p, receiver);
		Invoker invoker = new Invoker();
		invoker.invoke(killCommand);
		Assert.assertFalse(p.isLife());
		Assert.assertFalse(p.isLife());
		p.setSafe(false);
		Assert.assertFalse(p.isSafe());
		SaveCommand saveCommand = new SaveCommand(p, receiver);
		invoker.invoke(saveCommand);
		Assert.assertTrue(p.isSafe());
		// 17 chain of responsibility
		MyHandler handler1 = new MyHandler("h1");
		MyHandler handler2 = new MyHandler("h2");
		handler1.setHandler(handler2);
		MyHandler handler3 = new MyHandler("h3");
		handler2.setHandler(handler3);
		handler1.operation();
		// 16 observer
		Observer1 ob1 = new Observer1();
		Observer2 ob2 = new Observer2();
		cn.design.behavior.observer.Subject sb = new cn.design.behavior.observer.MySubject();
		sb.addObserver(ob1);
		sb.addObserver(ob2);
		sb.operator();
		// 15 template method
		cn.design.behavior.template.AbstractTemplate m1 = new cn.design.behavior.template.Minus();
		int s1 = m1.calculate("2,1");
		Assert.assertTrue(s1 == 3);
		cn.design.behavior.template.AbstractTemplate m2 = new cn.design.behavior.template.Plus();
		int s2 = m2.calculate("2,1");
		Assert.assertTrue(s2 == 5);
		// 14 strategy
		cn.design.behavior.strategy.ICacluatorStategy c1 = new cn.design.behavior.strategy.Minus();
		int he1 = c1.calclulate("1-2");
		Assert.assertTrue(he1 == -1);
		cn.design.behavior.strategy.ICacluatorStategy c2 = new cn.design.behavior.strategy.Plus();
		int he2 = c2.calclulate("1+2");
		Assert.assertTrue(he2 == 3);
		cn.design.behavior.strategy.ICacluatorStategy c3 = new cn.design.behavior.strategy.Muliply();
		int he3 = c3.calclulate("1*2");
		Assert.assertTrue(he3 == 2);

	}
}
