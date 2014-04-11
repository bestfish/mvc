package com.fish.play.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

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
    public String game() {
        return "game.vm";
    }

    @ResponseBody
    @RequestMapping(value = "/reach")
    public String reach(@RequestParam(value = "content", required = true) String content) {
        System.out.println("content:" + content);
        return "hello";
    }

}
