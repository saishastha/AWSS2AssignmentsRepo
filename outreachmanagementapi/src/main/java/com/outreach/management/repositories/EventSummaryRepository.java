package com.outreach.management.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.outreach.management.collections.EventReportCollections;

@Repository
public interface EventSummaryRepository extends MongoRepository<EventReportCollections, String> {
	EventReportCollections findByEventId(String eventId);

}
