package com.example.demo.designpatterns.structural;
//This pattern is useful to implement relation between two individual interfaces and perform operations together using an Adapter class.

//This is an example socket and socketadapter used to charge devices of 3,12,120 volts respectively.

class Volts {
	int volts;

	public Volts(int volts) {
		this.volts = volts;
	}
}

class Socket {
	public Volts socket() {
		return new Volts(120);
	}
}

abstract class SocketAdapter {
	public abstract Volts get3Volts();

	public abstract Volts get12Volts();

	public abstract Volts get120Volts();
}

class device extends SocketAdapter {
	Socket sock = new Socket();

	@Override
	public Volts get3Volts() {
		Volts v = sock.socket();
		Volts volts3 = convertVolts(v, 40);
		return volts3;
	}

	@Override
	public Volts get12Volts() {
		Volts v = sock.socket();
		Volts volts3 = convertVolts(v, 10);
		return volts3;
	}

	@Override
	public Volts get120Volts() {

		return sock.socket();
	}

	public Volts convertVolts(Volts v, int i) {
		return new Volts(v.volts / i);
	}

}

public class AdapterDesignPattern {
public static void main(String[] args) {
	SocketAdapter sa=new device();
	Volts fordeviceWith120Volts=sa.get120Volts();
	Volts fordeviceWith12Volts	=sa.get12Volts();
	Volts fordeviceWith3Volts=sa.get3Volts();
	System.out.println(fordeviceWith120Volts.volts);
	System.out.println(fordeviceWith12Volts.volts);
	System.out.println(fordeviceWith3Volts.volts);
}
}
