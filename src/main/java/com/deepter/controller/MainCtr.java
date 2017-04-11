package com.deepter.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainCtr {
	
	@RequestMapping("main")
	@ResponseBody
	public Map<Object, Object> main(){
		HashMap<Object, Object> m=new HashMap<Object, Object>();
		m.put(Date.UTC(2013, 0, 1, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 2, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 3, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 4, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 5, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 6, 0, 0, 0),0.7459);
		return m;
	}
	
	@RequestMapping("main2")
	@ResponseBody
	public JSONPObject getJsonp(String callback){
		System.out.println(callback);
		HashMap<Object, Object> m=new HashMap<Object, Object>();
		m.put(Date.UTC(2013, 0, 1, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 2, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 3, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 4, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 5, 0, 0, 0),0.7459);
		m.put(Date.UTC(2013, 0, 6, 0, 0, 0),0.7459);
		return new JSONPObject(callback, m);
	}
	@RequestMapping("main3")
	@ResponseBody
	public Map<String, String> getStr(){
		Map m=new HashMap<String, String>();
		String t="61315315200000,0.7459,61315488000000,0.7459,61315228800000,0.7459,61315142400000,0.7459,61315574400000,0.7459,61315401600000,0.7459";
		m.put("data", t);
		return m;
	}
}
