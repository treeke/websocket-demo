package com.treeke.websocket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("web")
public class WebController {

	@RequestMapping("test")
	public void test() throws IOException {
		Map<String, Object> map = new HashMap<>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		ArrayList<Object> list = new ArrayList<>();
		list.add(map);
		list.add("weiye");
		Map<String, Object> map1 = new HashMap<>();
		map1.put("web", "web");
		map1.put("list", list);
		ObjectMapper objectMapper = new ObjectMapper();
		String value = objectMapper.writeValueAsString(map1);
		WebSocketUtil.sendInfo(value); 
	}
}
