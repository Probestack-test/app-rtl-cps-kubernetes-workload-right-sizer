package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.ApplyRecommendationRequest;
import com.probestack.forgestudio.design.model.RecommendationApply;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.RecommendationsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-10T15:53:11.090261852Z[GMT]")
@Controller
@RequestMapping("${openapi.kubernetesWorkloadRightSizer.base-path:/v1}")
public class RecommendationsApiController implements RecommendationsApi {

    private static final Logger log = LoggerFactory.getLogger(RecommendationsApiController.class);

    private final RecommendationsService recommendationsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public RecommendationsApiController(RecommendationsService recommendationsService, GeneratedRequestValidator generatedRequestValidator) {
        this.recommendationsService = recommendationsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<RecommendationApply> applyRecommendation(@PathVariable() UUID recommendationId, @RequestBody() ApplyRecommendationRequest applyRecommendationRequest) {
        log.info("Processing applyRecommendation request");
        try {
            generatedRequestValidator.validate("applyRecommendation", applyRecommendationRequest);
            var response = recommendationsService.applyRecommendation(recommendationId, applyRecommendationRequest);
            log.info("applyRecommendation completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process applyRecommendation: {}", e.getMessage(), e);
            throw e;
        }
    }
}
