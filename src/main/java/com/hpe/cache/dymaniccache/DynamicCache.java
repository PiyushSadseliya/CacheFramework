package com.hpe.cache.dymaniccache;


import com.hpe.cache.interf.CacheInterface;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class DynamicCache extends LinkedHashMap<Integer, String> implements CacheInterface {

	  private static final long serialVersionUID = 1L;
	  private int capacity;


	public DynamicCache(int capacity){//hh
		   super(capacity+1, 1.0f, true);
	       this.capacity = capacity;
	   }
	
	  
	@Override
	public boolean delCache(int key) {
		String s;
		s=remove(key);
		if(s == null)
			return false;
		
		return true;
		
	}

	@Override
	public boolean update(int key, String value) {

		if (containsKey(key)) {
			put(key, value);
			return true;
		} else {
			return false;
		}

	}
	
    @Override
	public void addCache(int key, String value) {

			put(key, value);
		
	}

	@Override
	public String getCache(int key) {
		return get(key);
		
	}


}
