/*
 * Veritas Information Classifier (VIC)
 * APIs
 *
 * OpenAPI spec version: Resource Specific
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ErrorResponse;
import io.swagger.client.model.JsonPatchDocument;
import io.swagger.client.model.MetadataDefinitionCollection;
import io.swagger.client.model.Pattern;
import io.swagger.client.model.PatternCollection;
import io.swagger.client.model.Policy;
import io.swagger.client.model.PolicyCollection;
import io.swagger.client.model.Tag;
import io.swagger.client.model.TagPropertyDefinitionCollection;
import io.swagger.client.model.TagsCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VeritasInformationClassifierVICApi
 */
@Ignore
public class VeritasInformationClassifierVICApiTest {

    private final VeritasInformationClassifierVICApi api = new VeritasInformationClassifierVICApi();

    
    /**
     * Create or update tag
     *
     * Create or update a tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createOrUpdateTagTest() throws ApiException {
        String tag = null;
        Tag body = null;
        String tenantId = null;
        Tag response = api.createOrUpdateTag(tag, body, tenantId);

        // TODO: test validations
    }
    
    /**
     * Create pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPatternTest() throws ApiException {
        Pattern body = null;
        String tenantId = null;
        Pattern response = api.createPattern(body, tenantId);

        // TODO: test validations
    }
    
    /**
     * Create policy
     *
     * Create a custom policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPolicyTest() throws ApiException {
        Policy body = null;
        String tenantId = null;
        Policy response = api.createPolicy(body, tenantId);

        // TODO: test validations
    }
    
    /**
     * Delete pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePatternTest() throws ApiException {
        String id = null;
        String tenantId = null;
        api.deletePattern(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * Delete policy
     *
     * Delete a custom policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePolicyTest() throws ApiException {
        String id = null;
        String tenantId = null;
        api.deletePolicy(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * Delete tag
     *
     * Delete a custom tag.  (Built-in tags cannot be deleted.)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tag = null;
        String tenantId = null;
        api.deleteTag(tag, tenantId);

        // TODO: test validations
    }
    
    /**
     * List metadata definitions
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataDefinitionsTest() throws ApiException {
        String tenantId = null;
        MetadataDefinitionCollection response = api.getMetadataDefinitions(tenantId);

        // TODO: test validations
    }
    
    /**
     * Get pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPatternTest() throws ApiException {
        String id = null;
        String tenantId = null;
        Pattern response = api.getPattern(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * List patterns
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPatternCollectionTest() throws ApiException {
        String tenantId = null;
        String ifNoneMatch = null;
        PatternCollection response = api.getPatternCollection(tenantId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List policies that use a pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPoliciesByPatternTest() throws ApiException {
        String id = null;
        String tenantId = null;
        PolicyCollection response = api.getPoliciesByPattern(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * List policies that use a tag
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPoliciesByTagTest() throws ApiException {
        String tag = null;
        String tenantId = null;
        PolicyCollection response = api.getPoliciesByTag(tag, tenantId);

        // TODO: test validations
    }
    
    /**
     * Get policy
     *
     * Retrieve a policy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolicyTest() throws ApiException {
        String id = null;
        String tenantId = null;
        Policy response = api.getPolicy(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * List policies
     *
     * Retrieve the policies for a tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPolicyCollectionTest() throws ApiException {
        String tenantId = null;
        Boolean includeDisabled = null;
        Boolean includeEngineBody = null;
        String ifNoneMatch = null;
        PolicyCollection response = api.getPolicyCollection(tenantId, includeDisabled, includeEngineBody, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get tag
     *
     * Get a tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagTest() throws ApiException {
        String tag = null;
        String tenantId = null;
        Tag response = api.getTag(tag, tenantId);

        // TODO: test validations
    }
    
    /**
     * List tag property definitions
     *
     * Get definitions of properties that can be associated with a tag. This is useful, for example, for user interfaces that need to know the supported values for such properties. Generally the tag properties are application-specific and not part of the core service functionality.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagPropertyDefinitionsTest() throws ApiException {
        String tenantId = null;
        TagPropertyDefinitionCollection response = api.getTagPropertyDefinitions(tenantId);

        // TODO: test validations
    }
    
    /**
     * List tags
     *
     * Retrieve all of the tags for a tenant.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagsCollectionTest() throws ApiException {
        String tenantId = null;
        String ifNoneMatch = null;
        TagsCollection response = api.getTagsCollection(tenantId, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Patch policy
     *
     * Update part of a policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchPolicyTest() throws ApiException {
        String id = null;
        List<JsonPatchDocument> patch = null;
        String tenantId = null;
        Policy response = api.patchPolicy(id, patch, tenantId);

        // TODO: test validations
    }
    
    /**
     * Reset policy to defaults
     *
     * Reset a policy to its default settings.  Only valid for built-in policies.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetPolicyTest() throws ApiException {
        String id = null;
        String tenantId = null;
        api.resetPolicy(id, tenantId);

        // TODO: test validations
    }
    
    /**
     * Update pattern
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePatternTest() throws ApiException {
        String id = null;
        Pattern body = null;
        String tenantId = null;
        Pattern response = api.updatePattern(id, body, tenantId);

        // TODO: test validations
    }
    
    /**
     * Update policy
     *
     * Update a policy.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePolicyTest() throws ApiException {
        String id = null;
        Policy body = null;
        String tenantId = null;
        Policy response = api.updatePolicy(id, body, tenantId);

        // TODO: test validations
    }
    
}