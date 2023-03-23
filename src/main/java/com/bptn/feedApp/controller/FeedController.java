package com.bptn.feedApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.bptn.feedApp.service.FeedService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.bptn.feedApp.jpa.Feed;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("/feeds")
public class FeedController {
	@Autowired
	FeedService feedService;

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@PostMapping
	public Feed createFeed(@RequestBody Feed feed) {

		logger.debug("Creating Feed");

		return this.feedService.createFeed(feed);
	}
	
	@GetMapping("/{feedId}")
	public Feed getFeed(@PathVariable int feedId) {
			
		logger.debug("Getting Feed, feedId: {}", feedId);
			
		return this.feedService.getFeedById(feedId);	
	}
	
	
	
}
