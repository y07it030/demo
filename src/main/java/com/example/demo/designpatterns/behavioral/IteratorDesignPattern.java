package com.example.demo.designpatterns.behavioral;

import java.util.ArrayList;
import java.util.List;

enum Channels {
	English, Telugu, Hindi, Kannada, Malayalam;
}

class ChannelsIterator {
	static int position = 0;
	static int position2 = 0;
	List<Channels> allChannels = new ArrayList<Channels>();

	public ChannelsIterator(List<Channels> channels) {
		allChannels.addAll(channels);
		for (Channels c : channels) {
			position++;
		}
		position2 = position;
	}

	public boolean hasNext() {
		while (position > 0) {
			position--;
			return true;
		}
		return false;
	}

	public Channels next() {
		while (position2 > 0) {
			position2--;
			return allChannels.get(position2);
		}
		return null;
	}
}

class GETChannels {
	Channels ch;
	static List<Channels> li;

	public GETChannels(List<Channels> list) {
		this.li = list;
	}

	public static ChannelsIterator iterator() {
		return new ChannelsIterator(li);
	}

	public void execution() {
		ChannelsIterator channel = GETChannels.iterator();
		while (channel.hasNext()) {
			System.out.println(channel.next());
		}
	}

}

public class IteratorDesignPattern {

	public static void main(String[] args) {

		List<Channels> list = new ArrayList<Channels>();
		list.add(Channels.English);
		list.add(Channels.Hindi);
		list.add(Channels.Kannada);
		GETChannels gc = new GETChannels(list);
		gc.execution();
	}
}
