package tests.complexdatastructures;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class DictionaryExample extends Dictionary<String, Object>{

	@Override
	public Enumeration<Object> elements() {
		// TODO Auto-generated method stub
		
		LinkedList<String> linked = new LinkedList<String>();		
		linked.add("aaa");		
		
		return null;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Enumeration<String> keys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object put(String key, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
