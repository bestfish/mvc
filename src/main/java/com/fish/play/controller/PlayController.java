package com.fish.play.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PlayController {

	@ResponseBody
	@RequestMapping(value = "/test", produces = "application/json;charset=utf-8")
	public Map<String, String> test() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("game", "金庸群侠传");
		return map;
	}

	@RequestMapping(value = "/game")
	public String game(Model model) {
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list_m = new ArrayList<String>();
		list_m.add("192.168.192.1:11211");
		list_m.add("192.168.192.1:11212");
		list_m.add("192.168.192.1:11213");
		list_m.add("192.168.192.1:11211");
		list_m.add("192.168.192.1:11212");
		list_m.add("192.168.192.1:11213");
		list_m.add("192.168.192.1:11211");
		list_m.add("192.168.192.1:11212");
		list_m.add("192.168.192.1:11213");
		list_m.add("192.168.192.1:11211");
		list_m.add("192.168.192.1:11212");
		list_m.add("192.168.192.1:11213");
		list_m.add("192.168.192.1:11211");
		list_m.add("192.168.192.1:11212");
		list_m.add("192.168.192.1:11213");
		list_m.add("192.168.192.1:11211");
		list_m.add("192.168.192.1:11212");
		list_m.add("192.168.192.1:11213");
		map.put("m", list_m);

		List<String> list_gw = new ArrayList<String>();
		list_gw.add("192.168.192.2:11211");
		list_gw.add("192.168.192.2:11212");
		list_gw.add("192.168.192.2:11213");
		map.put("gw", list_gw);

		List<String> list_waresoa = new ArrayList<String>();
		list_waresoa.add("192.168.192.3:11211");
		list_waresoa.add("192.168.192.3:11212");
		list_waresoa.add("192.168.192.3:11213");
		map.put("waresoa", list_waresoa);

		model.addAttribute("map", map);

		return "game.vm";
	}
	
	@RequestMapping(value = "/game1")
	public String game1(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("192.168.192.11:11211");
		list.add("192.168.192.11:11212");
		list.add("192.168.192.11:11213");

		model.addAttribute("list", list);
		System.out.println("--------------game1---------------");

		return "game1.vm";
	}
	
	@RequestMapping(value = "/del")
	public String del(@RequestParam(value="name") String name) {
		System.out.println("name:" + name);
		return "suc.vm";
	}

	@ResponseBody
	@RequestMapping(value = "/reach")
	public Map<String, String> reach(
			@RequestParam(value = "content", required = false) String content) {
		System.out.println("content:" + content);
		Map<String, String> map = new HashMap<String, String>();
		map.put("test", "hello");
		return map;
	}

}
