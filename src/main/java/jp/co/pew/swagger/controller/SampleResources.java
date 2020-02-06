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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jp.co.pew.swagger.entity.AdswSceneSetting;

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
	
	@ApiOperation(value = "this is sample")
	@ApiResponses(value = {@ApiResponse(code = 400 , message = "UnexpectedAiSEGNumber ")})
	@PostMapping("post")
	public AdswSceneSetting scene(@RequestParam String getStatus , @RequestParam String manipulate ) {
		return new AdswSceneSetting(getStatus, manipulate);
		
	}

}
