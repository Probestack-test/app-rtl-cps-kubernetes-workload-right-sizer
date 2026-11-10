package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AnalysisJob;
import com.probestack.forgestudio.design.model.AnalyzeWorkloadRequest;
import com.probestack.forgestudio.design.model.RegisterWorkloadRequest;
import java.util.UUID;
import com.probestack.forgestudio.design.model.Workload;
import com.probestack.forgestudio.design.model.WorkloadList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.WorkloadsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")
@Controller
@RequestMapping("${openapi.kubernetesWorkloadRightSizer.base-path:/v1}")
public class WorkloadsApiController implements WorkloadsApi {

    private static final Logger log = LoggerFactory.getLogger(WorkloadsApiController.class);

    private final WorkloadsService workloadsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public WorkloadsApiController(WorkloadsService workloadsService, GeneratedRequestValidator generatedRequestValidator) {
        this.workloadsService = workloadsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<AnalysisJob> analyzeWorkload(@PathVariable() UUID workloadId, @RequestBody() AnalyzeWorkloadRequest analyzeWorkloadRequest) {
        log.info("Processing analyzeWorkload request");
        try {
            generatedRequestValidator.validate("analyzeWorkload", analyzeWorkloadRequest);
            var response = workloadsService.analyzeWorkload(workloadId, analyzeWorkloadRequest);
            log.info("analyzeWorkload completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process analyzeWorkload: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Workload> getWorkload(@PathVariable() UUID workloadId, @RequestParam(value = "includeUsageHistory", required = false, defaultValue = "true") Boolean includeUsageHistory) {
        log.info("Processing getWorkload request");
        try {
            var response = workloadsService.getWorkload(workloadId, includeUsageHistory);
            log.info("getWorkload completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getWorkload: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<WorkloadList> listWorkloads(@RequestParam(value = "clusterName", required = false) String clusterName, @RequestParam(value = "namespace", required = false) String namespace, @RequestParam(value = "owner", required = false) String owner, @RequestParam(value = "criticality", required = false) String criticality, @RequestParam(value = "hasActiveRecommendation", required = false) Boolean hasActiveRecommendation, @RequestParam(value = "sortBy", required = false, defaultValue = "POTENTIAL_SAVINGS") String sortBy, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listWorkloads request");
        try {
            var response = workloadsService.listWorkloads(clusterName, namespace, owner, criticality, hasActiveRecommendation, sortBy, page, size);
            log.info("listWorkloads completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listWorkloads: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Workload> registerWorkload(@RequestBody() RegisterWorkloadRequest registerWorkloadRequest) {
        log.info("Processing registerWorkload request");
        try {
            generatedRequestValidator.validate("registerWorkload", registerWorkloadRequest);
            var response = workloadsService.registerWorkload(registerWorkloadRequest);
            log.info("registerWorkload completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process registerWorkload: {}", e.getMessage(), e);
            throw e;
        }
    }
}
