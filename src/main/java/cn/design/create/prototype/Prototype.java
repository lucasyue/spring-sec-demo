package cn.design.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Prototype implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// Prototype clone = (Prototype) super.clone();
		return super.clone();
	}

	protected Object deepClone() throws CloneNotSupportedException,
			ClassNotFoundException, IOException {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();
	}
}
