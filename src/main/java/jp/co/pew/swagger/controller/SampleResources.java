package jp.co.pew.swagger.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alpc")
public class SampleResources {

	@GetMapping
	public List<Map<String, String>> sceneInfos() {
		return new ArrayList<>();
	}

	@GetMapping("{aisegId}")
	public Map<String, String> sceneInfo(@PathVariable String aisegId) {
		return new HashMap();

	}
	
	@PutMapping("{sceneNumber}")
	public void updateScene(@PathVariable String sceneNumber) {
		return;
	}
	@PostMapping
	public int insertScene() {
		return 1;
	}
	@DeleteMapping
    public void deleteScene() {
        return;
    }

}
