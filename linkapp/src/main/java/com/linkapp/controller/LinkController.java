package com.linkapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linkapp.entity.Link;
import com.linkapp.service.LinkService;

@RestController
@RequestMapping("/link")
@CrossOrigin("http://localhost:4200")
public class LinkController {
	
	@Autowired
	private LinkService linkService;
	
	@GetMapping("/get-all-links")
	public List<Link> getAllLinks() {
		return linkService.getAllLinks();
	}
	
	@PostMapping("/add-link")
	public Link addLink(@RequestBody Link link) {
		return linkService.addLink(link);
	}

}
