package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.AnalyzeWorkloadRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for AnalyzeWorkloadRequest documents.
 */
public interface AnalyzeWorkloadRequestMongoRepository extends MongoRepository<AnalyzeWorkloadRequestDocument, String> {
}
