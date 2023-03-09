package com.bptn.feedApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bptn.feedApp.jpa.FeedMetaData;
import org.springframework.data.jpa.repository.JpaRepository;

// public interface FeedMetaDataRepository extends JpaRepository<T, ID> {
// }

public interface FeedMetaDataRepository extends JpaRepository<FeedMetaData, Integer> {
	
}
