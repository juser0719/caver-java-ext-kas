/*
 * Wallet API
 * # Introduction Wallet API is an API for creating and managing Klaytn accounts as well as sending transactions. If you create your Klaytn account using Wallet API, you don't have to manage your private key yourself. Wallet API provides a wallet for safe storage of your Klaytn account private keys that you would need to use BApps. For more details on how to use Wallet API, please refer to this [tutorial](https://docs.klaytnapi.com/v/en/tutorial).  Wallet API can be divided into the Account part, which creates and manages Klaytn accounts, and the Transaction part, which sends different kinds of transactions.  Wallet API creates, deletes and monitors Klaytn accounts and updates the accounts to multisig, and manages all private keys for all accounts registered on KAS.  Wallet API can also create transaction to send it to Klaytn. These include transactions sent from multisig accounts. In case of muiltisig accounts, a transaction will automatically be sent to Klaytn once \\(Threshold\\) is met. For more detail, please refer to this [tutorial](https://docs.klaytnapi.com/v/en/tutorial).  There are mainly two types of transactions: basic transactions and fee delegation transactions. Fee delegation transactions include Global Fee Delegation transaction and user fee deletation transaction. With the Global Fee Delegation transaction scheme, the transaction fee will initially be paid by GroundX and then be charged to you at a later date. With the User Fee Delegation transaction scheme, you create an account that pays the transaction fees on behalf of the users when a transaction.  The functionalities and limits of Wallet API are shown below:  | Version | Item | Description | | :--- | :--- | :--- | | 2.0 | Limits | Supports Cypress(Mainnet), Baobab(Testnet) \\ Doesn't support (Service Chain \\) | |  |  | Doesn't support account management for external custodial keys | |  |  | Doesn't support multisig for RLP encoded transactions | |  | Account management | Create, retrieve and delete account | |  |  | Multisig account update | |  | Managing transaction | [Basic](https://ko.docs.klaytn.com/klaytn/design/transactions/basic) creating and sending transaction | |  |  | [FeeDelegatedWithRatio](https://ko.docs.klaytn.com/klaytn/design/transactions/partial-fee-delegation) creating and sending transaction | |  |  | RLP encoded transaction\\([Legacy](https://ko.docs.klaytn.com/klaytn/design/transactions/basic#txtypelegacytransaction), [Basic](https://ko.docs.klaytn.com/klaytn/design/transactions/basic), [FeeDelegatedWithRatio](https://ko.docs.klaytn.com/klaytn/design/transactions/partial-fee-delegation)\\) creating and sending | |  |  | Managing and sending multisig transactions | |  | Administrator | Manage resource pool\\(create, query pool, delete, retrieve account \\) | 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.api;

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


import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model.Account;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model.AccountStatus;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model.Accounts;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model.V2FeepayerBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FeepayerApi {
    private ApiClient apiClient;

    public FeepayerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FeepayerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for creatFeePayerAccount
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body You can set whether the FeePayer has been updated to [Role-based account](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) with &#x60;withAccountUpdate&#x60;. The default value is &#x60;false&#x60;, in which case all roles other than **RoleFeePayer** will be set to [AccountKeyFail](https://docs.klaytn.com/klaytn/design/accounts#accountkeyfail), putting the FeePayer role in the foreground. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call creatFeePayerAccountCall(String xChainId, V2FeepayerBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/v2/feepayer";

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call creatFeePayerAccountValidateBeforeCall(String xChainId, V2FeepayerBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling creatFeePayerAccount(Async)");
        }
        
        com.squareup.okhttp.Call call = creatFeePayerAccountCall(xChainId, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create fee payer account
     * Create a Klaytn fee payer account. Generate a Klaytn account address and random private/public key pair and get ID of public key and private key returned. Klaytn fee payer account should be updated to [AccountKeyRoleBased](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) and can only be used for fee delegation.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body You can set whether the FeePayer has been updated to [Role-based account](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) with &#x60;withAccountUpdate&#x60;. The default value is &#x60;false&#x60;, in which case all roles other than **RoleFeePayer** will be set to [AccountKeyFail](https://docs.klaytn.com/klaytn/design/accounts#accountkeyfail), putting the FeePayer role in the foreground. (optional)
     * @return Account
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Account creatFeePayerAccount(String xChainId, V2FeepayerBody body) throws ApiException {
        ApiResponse<Account> resp = creatFeePayerAccountWithHttpInfo(xChainId, body);
        return resp.getData();
    }

    /**
     * Create fee payer account
     * Create a Klaytn fee payer account. Generate a Klaytn account address and random private/public key pair and get ID of public key and private key returned. Klaytn fee payer account should be updated to [AccountKeyRoleBased](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) and can only be used for fee delegation.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body You can set whether the FeePayer has been updated to [Role-based account](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) with &#x60;withAccountUpdate&#x60;. The default value is &#x60;false&#x60;, in which case all roles other than **RoleFeePayer** will be set to [AccountKeyFail](https://docs.klaytn.com/klaytn/design/accounts#accountkeyfail), putting the FeePayer role in the foreground. (optional)
     * @return ApiResponse&lt;Account&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Account> creatFeePayerAccountWithHttpInfo(String xChainId, V2FeepayerBody body) throws ApiException {
        com.squareup.okhttp.Call call = creatFeePayerAccountValidateBeforeCall(xChainId, body, null, null);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create fee payer account (asynchronously)
     * Create a Klaytn fee payer account. Generate a Klaytn account address and random private/public key pair and get ID of public key and private key returned. Klaytn fee payer account should be updated to [AccountKeyRoleBased](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) and can only be used for fee delegation.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param body You can set whether the FeePayer has been updated to [Role-based account](https://docs.klaytn.com/klaytn/design/accounts#accountkeyrolebased) with &#x60;withAccountUpdate&#x60;. The default value is &#x60;false&#x60;, in which case all roles other than **RoleFeePayer** will be set to [AccountKeyFail](https://docs.klaytn.com/klaytn/design/accounts#accountkeyfail), putting the FeePayer role in the foreground. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call creatFeePayerAccountAsync(String xChainId, V2FeepayerBody body, final ApiCallback<Account> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = creatFeePayerAccountValidateBeforeCall(xChainId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for deleteFeePayerAccount
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFeePayerAccountCall(String xChainId, String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/feepayer/{address}"
            .replaceAll("\\{" + "address" + "\\}", apiClient.escapeString(address.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basic" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFeePayerAccountValidateBeforeCall(String xChainId, String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling deleteFeePayerAccount(Async)");
        }
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling deleteFeePayerAccount(Async)");
        }
        
        com.squareup.okhttp.Call call = deleteFeePayerAccountCall(xChainId, address, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete fee payer account
     * Delete a certain Klaytn fee payer account.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @return AccountStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AccountStatus deleteFeePayerAccount(String xChainId, String address) throws ApiException {
        ApiResponse<AccountStatus> resp = deleteFeePayerAccountWithHttpInfo(xChainId, address);
        return resp.getData();
    }

    /**
     * Delete fee payer account
     * Delete a certain Klaytn fee payer account.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @return ApiResponse&lt;AccountStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AccountStatus> deleteFeePayerAccountWithHttpInfo(String xChainId, String address) throws ApiException {
        com.squareup.okhttp.Call call = deleteFeePayerAccountValidateBeforeCall(xChainId, address, null, null);
        Type localVarReturnType = new TypeToken<AccountStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete fee payer account (asynchronously)
     * Delete a certain Klaytn fee payer account.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFeePayerAccountAsync(String xChainId, String address, final ApiCallback<AccountStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFeePayerAccountValidateBeforeCall(xChainId, address, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AccountStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveFeePayerAccount
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveFeePayerAccountCall(String xChainId, String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/feepayer/{address}"
            .replaceAll("\\{" + "address" + "\\}", apiClient.escapeString(address.toString()));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call retrieveFeePayerAccountValidateBeforeCall(String xChainId, String address, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling retrieveFeePayerAccount(Async)");
        }
        // verify the required parameter 'address' is set
        if (address == null) {
            throw new ApiException("Missing the required parameter 'address' when calling retrieveFeePayerAccount(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveFeePayerAccountCall(xChainId, address, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve account 
     * Retrieve a certain Klaytn fee payer account.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @return Account
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Account retrieveFeePayerAccount(String xChainId, String address) throws ApiException {
        ApiResponse<Account> resp = retrieveFeePayerAccountWithHttpInfo(xChainId, address);
        return resp.getData();
    }

    /**
     * Retrieve account 
     * Retrieve a certain Klaytn fee payer account.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @return ApiResponse&lt;Account&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Account> retrieveFeePayerAccountWithHttpInfo(String xChainId, String address) throws ApiException {
        com.squareup.okhttp.Call call = retrieveFeePayerAccountValidateBeforeCall(xChainId, address, null, null);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve account  (asynchronously)
     * Retrieve a certain Klaytn fee payer account.
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param address Klaytn account address (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveFeePayerAccountAsync(String xChainId, String address, final ApiCallback<Account> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveFeePayerAccountValidateBeforeCall(xChainId, address, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Account>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for retrieveFeePayerAccounts
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call retrieveFeePayerAccountsCall(String xChainId, Long size, String cursor, String toTimestamp, String fromTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v2/feepayer";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (size != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("size", size));
        if (cursor != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("cursor", cursor));
        if (toTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("to-timestamp", toTimestamp));
        if (fromTimestamp != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("from-timestamp", fromTimestamp));

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
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call retrieveFeePayerAccountsValidateBeforeCall(String xChainId, Long size, String cursor, String toTimestamp, String fromTimestamp, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'xChainId' is set
        if (xChainId == null) {
            throw new ApiException("Missing the required parameter 'xChainId' when calling retrieveFeePayerAccounts(Async)");
        }
        
        com.squareup.okhttp.Call call = retrieveFeePayerAccountsCall(xChainId, size, cursor, toTimestamp, fromTimestamp, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a list of fee payer accounts
     * Retrieve a list of all Klaytn fee payer accounts.&lt;p&gt;&lt;/p&gt;  ##### Size&lt;p&gt;&lt;/p&gt;  * The query parameter &#x60;size&#x60; is optional. (Min &#x3D; 1, Max &#x3D; 1000, Default &#x3D; 100)&lt;br&gt; * Returns an error when given a negative number&lt;br&gt; * Uses default value (&#x60;size&#x3D;100&#x60;) when &#x60;size&#x3D;0&#x60;&lt;br&gt; * Uses the maximum value (&#x60;size&#x3D;1000&#x60;) when given a value higher than the maximum value.&lt;br&gt;
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @return Accounts
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Accounts retrieveFeePayerAccounts(String xChainId, Long size, String cursor, String toTimestamp, String fromTimestamp) throws ApiException {
        ApiResponse<Accounts> resp = retrieveFeePayerAccountsWithHttpInfo(xChainId, size, cursor, toTimestamp, fromTimestamp);
        return resp.getData();
    }

    /**
     * Retrieve a list of fee payer accounts
     * Retrieve a list of all Klaytn fee payer accounts.&lt;p&gt;&lt;/p&gt;  ##### Size&lt;p&gt;&lt;/p&gt;  * The query parameter &#x60;size&#x60; is optional. (Min &#x3D; 1, Max &#x3D; 1000, Default &#x3D; 100)&lt;br&gt; * Returns an error when given a negative number&lt;br&gt; * Uses default value (&#x60;size&#x3D;100&#x60;) when &#x60;size&#x3D;0&#x60;&lt;br&gt; * Uses the maximum value (&#x60;size&#x3D;1000&#x60;) when given a value higher than the maximum value.&lt;br&gt;
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @return ApiResponse&lt;Accounts&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Accounts> retrieveFeePayerAccountsWithHttpInfo(String xChainId, Long size, String cursor, String toTimestamp, String fromTimestamp) throws ApiException {
        com.squareup.okhttp.Call call = retrieveFeePayerAccountsValidateBeforeCall(xChainId, size, cursor, toTimestamp, fromTimestamp, null, null);
        Type localVarReturnType = new TypeToken<Accounts>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a list of fee payer accounts (asynchronously)
     * Retrieve a list of all Klaytn fee payer accounts.&lt;p&gt;&lt;/p&gt;  ##### Size&lt;p&gt;&lt;/p&gt;  * The query parameter &#x60;size&#x60; is optional. (Min &#x3D; 1, Max &#x3D; 1000, Default &#x3D; 100)&lt;br&gt; * Returns an error when given a negative number&lt;br&gt; * Uses default value (&#x60;size&#x3D;100&#x60;) when &#x60;size&#x3D;0&#x60;&lt;br&gt; * Uses the maximum value (&#x60;size&#x3D;1000&#x60;) when given a value higher than the maximum value.&lt;br&gt;
     * @param xChainId Klaytn Chain Network ID (1001 or 8217) (required)
     * @param size Maximum size to be queried (optional, default to 100)
     * @param cursor Information on the last cursor (optional)
     * @param toTimestamp Limit of the time range to be queried (timestamp in seconds) (optional)
     * @param fromTimestamp Starting point of the time range to be queried (timestamp in seconds) (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call retrieveFeePayerAccountsAsync(String xChainId, Long size, String cursor, String toTimestamp, String fromTimestamp, final ApiCallback<Accounts> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = retrieveFeePayerAccountsValidateBeforeCall(xChainId, size, cursor, toTimestamp, fromTimestamp, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Accounts>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
