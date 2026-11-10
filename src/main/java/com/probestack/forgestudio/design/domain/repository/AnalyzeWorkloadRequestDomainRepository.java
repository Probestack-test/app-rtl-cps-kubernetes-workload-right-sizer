package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.AnalyzeWorkloadRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for AnalyzeWorkloadRequest domain operations.
 */
public interface AnalyzeWorkloadRequestDomainRepository {
    AnalyzeWorkloadRequest save(AnalyzeWorkloadRequest analyzeWorkloadRequest);

    Optional<AnalyzeWorkloadRequest> findById(String id);

    List<AnalyzeWorkloadRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
