package com.linkapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkapp.entity.Link;
import com.linkapp.repository.LinkRepository;

@Service
public class LinkService {
	
	@Autowired
	private LinkRepository linkRepository;

	public List<Link> getAllLinks() {
		return linkRepository.findAll();
	}

	public Link addLink(Link link) {
		return linkRepository.save(link);
	}

}
