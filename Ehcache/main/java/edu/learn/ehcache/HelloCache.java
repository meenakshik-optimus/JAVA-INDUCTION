package edu.learn.ehcache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * HelloCache class for demonstration of EHCACHE
 * @author optimus157
 *
 */
public class HelloCache {
	
public static void main(String[] args) {
	
	/**
	 * variables declaration
	 */
	Element element=null;
	String output;
	List<String> list=new ArrayList<String>();
	Map<Object,Element> map=new HashMap<Object,Element>();
	
		/**
		 *  Create a cache manager
		 */
		CacheManager cacheManager = CacheManager.getInstance();
		
		/**
		 *  Create a cache called "cachemonth"
		 */
		cacheManager.addCache("cachemonth");
		
		/**
		 *  Get a cache called "cachemonth"
		 */
		Cache cache = cacheManager.getCache("cachemonth");
		
		/**
		 *  Put few elements in cache
		 */
		cache.put(new Element("1","January"));
		list.add("1");
		cache.put(new Element("2","February"));
		list.add("2");
		cache.put(new Element("3","March"));
		list.add("3");
		cache.put(new Element("4","April"));
		list.add("4");
		
		/**
		 * Get element from cache
		 */
	 element = cache.get("1");
		
		/**
		 * Print out the element
		 */
		output= (element == null ? null : element.getObjectValue().toString());
		System.out.println(output);
		
		/**
		 * Get element from cache
		 */
		element = cache.get("2");
		
		/**
		 * Print out the element
		 */
		 output = (element == null ? null : element.getObjectValue().toString());
		System.out.println(output);
		
		/**
		 * Getting all the elements from cache
		 */
		map=cache.getAll(list);
		Iterator it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	    }
	
		/**
		 *  checking if key is in cache?
		 */
		System.out.println(cache.isKeyInCache("1"));
		System.out.println(cache.isKeyInCache("5"));
		
		System.out.println("cache size is:-"+ cache.getSize());
		
		/**
		 *  shut down the cache manager
		 */
		cacheManager.shutdown();
		
	}
	
}
