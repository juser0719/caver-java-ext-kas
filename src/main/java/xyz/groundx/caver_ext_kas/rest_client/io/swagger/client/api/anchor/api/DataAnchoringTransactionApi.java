/*
 * Anchor API
 * # Introduction This document describes KAS (Klaytn API Service) Anchor API. Anchor API provides features sending metadata available to verify data reliability to ensure the reliability of service chain data to Klaytn main chain.  For more details on using the Anchor API, please refer to [Tutorial](https://docs.klaytnapi.com/tutorial/anchor-api).    # Error Codes  ## 400: Bad Request   | Code | Messages |   | --- | --- |   | 1071010 | data don't exist 1071615 | its value is out of range; size 1072100 | same payload ID or payload was already anchored 1072101 | all configured accounts have insufficient funds |  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.api;

import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiCallback;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiClient;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiException;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiResponse;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.Configuration;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.Pair;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ProgressRequestBody;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.AnchorBlockRequest;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.AnchorBlockStatus;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.AnchorTransactionDetail;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.AnchorTransactions;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.ErrorResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataAnchoringTransactionApi {
    private ApiClient apiClient;

    public DataAnchoringTransactionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DataAnchoringTransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for anchorBlock
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call anchorBlockCall(String xChainId, AnchorBlockRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v1/anchor";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call anchorBlockValidateBeforeCall(String xChainId, AnchorBlockRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling anchorBlock(Async)");
        }
        
        com.squareup.okhttp.Call call = anchorBlockCall(xChainId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create an anchoring transaction
     * Use for anchoring blockchain data. It creates and manages anchoring transactions by the operator set on the KAS console. For successful anchoring through operator or user&#x27;s feepayer, a balance of 10 times more than the fee needed is required.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body  (optional)
     * @return AnchorBlockStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnchorBlockStatus anchorBlock(String xChainId, AnchorBlockRequest body) throws ApiException {
        ApiResponse<AnchorBlockStatus> resp = anchorBlockWithHttpInfo(xChainId, body);
        return resp.getData();
    }

    /**
     * Create an anchoring transaction
     * Use for anchoring blockchain data. It creates and manages anchoring transactions by the operator set on the KAS console. For successful anchoring through operator or user&#x27;s feepayer, a balance of 10 times more than the fee needed is required.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body  (optional)
     * @return ApiResponse&lt;AnchorBlockStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnchorBlockStatus> anchorBlockWithHttpInfo(String xChainId, AnchorBlockRequest body) throws ApiException {
        com.squareup.okhttp.Call call = anchorBlockValidateBeforeCall(xChainId, body, null, null);
        Type localVarReturnType = new TypeToken<AnchorBlockStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an anchoring transaction (asynchronously)
     * Use for anchoring blockchain data. It creates and manages anchoring transactions by the operator set on the KAS console. For successful anchoring through operator or user&#x27;s feepayer, a balance of 10 times more than the fee needed is required.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call anchorBlockAsync(String xChainId, AnchorBlockRequest body, final ApiCallback<AnchorBlockStatus> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = anchorBlockValidateBeforeCall(xChainId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnchorBlockStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAnchorBlockByPayloadID
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param payloadId Payload ID (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAnchorBlockByPayloadIDCall(String xChainId, String operatorId, String payloadId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/operator/{operator-id}/payload/{payload-id}"
            .replaceAll("\\{" + "operator-id" + "\\}", apiClient.escapeString(operatorId.toString()))
            .replaceAll("\\{" + "payload-id" + "\\}", apiClient.escapeString(payloadId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAnchorBlockByPayloadIDValidateBeforeCall(String xChainId, String operatorId, String payloadId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getAnchorBlockByPayloadID(Async)");
        }
        // verify the required parameter 'operatorId' is set
        if (operatorId == null) {
            throw new ApiException("Missing the required parameter 'operatorId' when calling getAnchorBlockByPayloadID(Async)");
        }
        // verify the required parameter 'payloadId' is set
        if (payloadId == null) {
            throw new ApiException("Missing the required parameter 'payloadId' when calling getAnchorBlockByPayloadID(Async)");
        }
        
        com.squareup.okhttp.Call call = getAnchorBlockByPayloadIDCall(xChainId, operatorId, payloadId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve anchoring transactions with payload
     * Specify a Payload ID and an operator ID to retrieve a list of transactions created by the operator. When creating a transaction, you may check the payload added to the transaction.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param payloadId Payload ID (required)
     * @return AnchorTransactionDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnchorTransactionDetail getAnchorBlockByPayloadID(String xChainId, String operatorId, String payloadId) throws ApiException {
        ApiResponse<AnchorTransactionDetail> resp = getAnchorBlockByPayloadIDWithHttpInfo(xChainId, operatorId, payloadId);
        return resp.getData();
    }

    /**
     * Retrieve anchoring transactions with payload
     * Specify a Payload ID and an operator ID to retrieve a list of transactions created by the operator. When creating a transaction, you may check the payload added to the transaction.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param payloadId Payload ID (required)
     * @return ApiResponse&lt;AnchorTransactionDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnchorTransactionDetail> getAnchorBlockByPayloadIDWithHttpInfo(String xChainId, String operatorId, String payloadId) throws ApiException {
        com.squareup.okhttp.Call call = getAnchorBlockByPayloadIDValidateBeforeCall(xChainId, operatorId, payloadId, null, null);
        Type localVarReturnType = new TypeToken<AnchorTransactionDetail>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve anchoring transactions with payload (asynchronously)
     * Specify a Payload ID and an operator ID to retrieve a list of transactions created by the operator. When creating a transaction, you may check the payload added to the transaction.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param payloadId Payload ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAnchorBlockByPayloadIDAsync(String xChainId, String operatorId, String payloadId, final ApiCallback<AnchorTransactionDetail> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAnchorBlockByPayloadIDValidateBeforeCall(xChainId, operatorId, payloadId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnchorTransactionDetail>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAnchorBlockByTx
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param transactionHash Transaction hash (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAnchorBlockByTxCall(String xChainId, String operatorId, String transactionHash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/operator/{operator-id}/tx/{transaction-hash}"
            .replaceAll("\\{" + "operator-id" + "\\}", apiClient.escapeString(operatorId.toString()))
            .replaceAll("\\{" + "transaction-hash" + "\\}", apiClient.escapeString(transactionHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAnchorBlockByTxValidateBeforeCall(String xChainId, String operatorId, String transactionHash, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling getAnchorBlockByTx(Async)");
        }
        // verify the required parameter 'operatorId' is set
        if (operatorId == null) {
            throw new ApiException("Missing the required parameter 'operatorId' when calling getAnchorBlockByTx(Async)");
        }
        // verify the required parameter 'transactionHash' is set
        if (transactionHash == null) {
            throw new ApiException("Missing the required parameter 'transactionHash' when calling getAnchorBlockByTx(Async)");
        }
        
        com.squareup.okhttp.Call call = getAnchorBlockByTxCall(xChainId, operatorId, transactionHash, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve anchoring transactions with transaction hash value
     * Specify a transaction hash value and an operator ID to retrieve a list of transactions created by the operator. When creating a transaction, you may check the payload added to the transaction.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param transactionHash Transaction hash (required)
     * @return AnchorTransactionDetail
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnchorTransactionDetail getAnchorBlockByTx(String xChainId, String operatorId, String transactionHash) throws ApiException {
        ApiResponse<AnchorTransactionDetail> resp = getAnchorBlockByTxWithHttpInfo(xChainId, operatorId, transactionHash);
        return resp.getData();
    }

    /**
     * Retrieve anchoring transactions with transaction hash value
     * Specify a transaction hash value and an operator ID to retrieve a list of transactions created by the operator. When creating a transaction, you may check the payload added to the transaction.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param transactionHash Transaction hash (required)
     * @return ApiResponse&lt;AnchorTransactionDetail&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnchorTransactionDetail> getAnchorBlockByTxWithHttpInfo(String xChainId, String operatorId, String transactionHash) throws ApiException {
        com.squareup.okhttp.Call call = getAnchorBlockByTxValidateBeforeCall(xChainId, operatorId, transactionHash, null, null);
        Type localVarReturnType = new TypeToken<AnchorTransactionDetail>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve anchoring transactions with transaction hash value (asynchronously)
     * Specify a transaction hash value and an operator ID to retrieve a list of transactions created by the operator. When creating a transaction, you may check the payload added to the transaction.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param transactionHash Transaction hash (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAnchorBlockByTxAsync(String xChainId, String operatorId, String transactionHash, final ApiCallback<AnchorTransactionDetail> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getAnchorBlockByTxValidateBeforeCall(xChainId, operatorId, transactionHash, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnchorTransactionDetail>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveAnchorBlock
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveAnchorBlockCall(String xChainId, String operatorId, String size, String cursor, String fromTimestamp, String toTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/operator/{operator-id}/tx"
            .replaceAll("\\{" + "operator-id" + "\\}", apiClient.escapeString(operatorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (fromTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from-timestamp", fromTimestamp));
        if (toTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to-timestamp", toTimestamp));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xChainId != null)
        localVarHeaderParams.put("x-chain-id", apiClient.parameterToString(xChainId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call retrieveAnchorBlockValidateBeforeCall(String xChainId, String operatorId, String size, String cursor, String fromTimestamp, String toTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling retrieveAnchorBlock(Async)");
        }
        // verify the required parameter 'operatorId' is set
        if (operatorId == null) {
            throw new ApiException("Missing the required parameter 'operatorId' when calling retrieveAnchorBlock(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveAnchorBlockCall(xChainId, operatorId, size, cursor, fromTimestamp, toTimestamp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a list of transactions by the operator
     * Specify an operator ID to retrieve a list of transactions created by the operator.&lt;p&gt;&lt;/p&gt;  ## Size&lt;p&gt;&lt;/p&gt;  * The query parameter &#x60;size&#x60; is optional (Min &#x3D; 1, Max &#x3D; 1000, Default &#x3D; 100)&lt;br&gt; * Returns an error when given a negative number&lt;br&gt; * Uses default value (&#x60;size&#x3D;100&#x60;) when &#x60;size&#x3D;0&#x60;&lt;br&gt; * Uses the maximum value (&#x60;size&#x3D;1000&#x60;) when given a value higher than the maximum value&lt;br&gt;
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @return AnchorTransactions
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AnchorTransactions retrieveAnchorBlock(String xChainId, String operatorId, String size, String cursor, String fromTimestamp, String toTimestamp) throws ApiException {
        ApiResponse<AnchorTransactions> resp = retrieveAnchorBlockWithHttpInfo(xChainId, operatorId, size, cursor, fromTimestamp, toTimestamp);
        return resp.getData();
    }

    /**
     * Retrieve a list of transactions by the operator
     * Specify an operator ID to retrieve a list of transactions created by the operator.&lt;p&gt;&lt;/p&gt;  ## Size&lt;p&gt;&lt;/p&gt;  * The query parameter &#x60;size&#x60; is optional (Min &#x3D; 1, Max &#x3D; 1000, Default &#x3D; 100)&lt;br&gt; * Returns an error when given a negative number&lt;br&gt; * Uses default value (&#x60;size&#x3D;100&#x60;) when &#x60;size&#x3D;0&#x60;&lt;br&gt; * Uses the maximum value (&#x60;size&#x3D;1000&#x60;) when given a value higher than the maximum value&lt;br&gt;
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @return ApiResponse&lt;AnchorTransactions&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AnchorTransactions> retrieveAnchorBlockWithHttpInfo(String xChainId, String operatorId, String size, String cursor, String fromTimestamp, String toTimestamp) throws ApiException {
        com.squareup.okhttp.Call call = retrieveAnchorBlockValidateBeforeCall(xChainId, operatorId, size, cursor, fromTimestamp, toTimestamp, null, null);
        Type localVarReturnType = new TypeToken<AnchorTransactions>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a list of transactions by the operator (asynchronously)
     * Specify an operator ID to retrieve a list of transactions created by the operator.&lt;p&gt;&lt;/p&gt;  ## Size&lt;p&gt;&lt;/p&gt;  * The query parameter &#x60;size&#x60; is optional (Min &#x3D; 1, Max &#x3D; 1000, Default &#x3D; 100)&lt;br&gt; * Returns an error when given a negative number&lt;br&gt; * Uses default value (&#x60;size&#x3D;100&#x60;) when &#x60;size&#x3D;0&#x60;&lt;br&gt; * Uses the maximum value (&#x60;size&#x3D;1000&#x60;) when given a value higher than the maximum value&lt;br&gt;
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param operatorId Operator account address (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveAnchorBlockAsync(String xChainId, String operatorId, String size, String cursor, String fromTimestamp, String toTimestamp, final ApiCallback<AnchorTransactions> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = retrieveAnchorBlockValidateBeforeCall(xChainId, operatorId, size, cursor, fromTimestamp, toTimestamp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AnchorTransactions>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
