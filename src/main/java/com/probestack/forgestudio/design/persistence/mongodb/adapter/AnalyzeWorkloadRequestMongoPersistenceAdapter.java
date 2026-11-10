package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.AnalyzeWorkloadRequestDomainRepository;
import com.probestack.forgestudio.design.model.AnalyzeWorkloadRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.AnalyzeWorkloadRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.AnalyzeWorkloadRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AnalyzeWorkloadRequestMongoPersistenceAdapter implements AnalyzeWorkloadRequestDomainRepository {
    private final AnalyzeWorkloadRequestMongoRepository repository;

    public AnalyzeWorkloadRequestMongoPersistenceAdapter(
            AnalyzeWorkloadRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AnalyzeWorkloadRequest save(AnalyzeWorkloadRequest analyzeWorkloadRequest) {
        AnalyzeWorkloadRequestDocument document = toDocument(analyzeWorkloadRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<AnalyzeWorkloadRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<AnalyzeWorkloadRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private AnalyzeWorkloadRequestDocument toDocument(
            AnalyzeWorkloadRequest analyzeWorkloadRequest) {
        AnalyzeWorkloadRequestDocument document = new AnalyzeWorkloadRequestDocument();
        BeanUtils.copyProperties(analyzeWorkloadRequest, document);
        return document;
    }

    private AnalyzeWorkloadRequest toDomain(AnalyzeWorkloadRequestDocument document) {
        AnalyzeWorkloadRequest domain = new AnalyzeWorkloadRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
