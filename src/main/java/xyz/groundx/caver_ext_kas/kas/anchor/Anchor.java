/*
 * Copyright 2020 The caver-java-ext-kas Authors
 *
 * Licensed under the Apache License, Version 2.0 (the “License”);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an “AS IS” BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package xyz.groundx.caver_ext_kas.kas.anchor;

import com.squareup.okhttp.Call;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiCallback;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiClient;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.ApiException;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.api.DataAnchoringTransactionApi;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.api.OperatorApi;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.anchor.model.*;


import java.security.InvalidParameterException;
import java.util.Map;

/**
 * Representing an wrapping class tha connects Anchor APi.
 */
public class Anchor {

    /**
     * Anchor API rest-client object.
     */
    DataAnchoringTransactionApi dataAnchoringTransactionApi;

    /**
     * Operator API rest-client object.
     */
    OperatorApi operatorApi;

    /**
     * Klaytn network id.
     */
    String chainId;

    /**
     * Creates an AnchorAPI instance
     * @param chainId A Klaytn network chain id.
     * @param anchorApiClient The Api client for connecting with KAS.
     */
    public Anchor(String chainId, ApiClient anchorApiClient) {
        setChainId(chainId);
        setDataAnchoringTransactionApi(new DataAnchoringTransactionApi(anchorApiClient));
        setOperatorApi(new OperatorApi(anchorApiClient));
    }

    /**
     * Sends ChainDataAnchoring transaction to the Klaytn.<p>
     * POST /v1/anchor
     * @param operatorId Operator address to send transaction.
     * @param payload Data to be anchored to the Klaytn.
     * @return AnchorBlockResponse
     * @throws ApiException
     */
    public AnchorBlockStatus sendAnchoringData(String operatorId, AnchorBlockPayload payload) throws ApiException {
        checkPayload(payload);

        AnchorBlockRequest anchorRequest = new AnchorBlockRequest();

        anchorRequest.setOperator(operatorId);
        anchorRequest.setPayload(payload);

        return getDataAnchoringTransactionApi().anchorBlock(getChainId(), anchorRequest);
    }

    /**
     * Sends ChainDataAnchoring transaction to the Klaytn asynchronously.<p>
     * POST /v1/anchor
     * @param operatorId Operator address to send transaction.
     * @param payload Data to be anchored to the Klaytn.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call sendAnchoringDataAsync(String operatorId, AnchorBlockPayload payload, ApiCallback<AnchorBlockStatus> callback) throws ApiException {
        checkPayload(payload);

        AnchorBlockRequest anchorRequest = new AnchorBlockRequest();
        anchorRequest.setOperator(operatorId);
        anchorRequest.setPayload(payload);

        return getDataAnchoringTransactionApi().anchorBlockAsync(getChainId(), anchorRequest, callback);
    }

    /**
     * Gets anchoring transaction list generated by a given operator.<p>
     * GET /v1/operator/{operator_id}/tx
     * @param operatorId An operator address to query the anchoring transaction list.
     * @return RetrieveAnchorBlockResponse
     * @throws ApiException
     */
    public AnchorTransactions getAnchoringTransactionList(String operatorId) throws ApiException {
        AnchorQueryOptions params = new AnchorQueryOptions();
        return getAnchoringTransactionList(operatorId, params);
    }

    /**
     * Gets anchoring transaction list generated by a given operator.<p>
     * GET /v1/operator/{operator_id}/tx
     * @param operatorId An operator address to query the anchoring transaction list.
     * @param queryParams An query options object.
     * @return RetrieveAnchorBlockResponse
     * @throws ApiException
     */
    public AnchorTransactions getAnchoringTransactionList(String operatorId, AnchorQueryOptions queryParams) throws ApiException {
        return dataAnchoringTransactionApi.retrieveAnchorBlock(getChainId(), operatorId, queryParams.getSize(), queryParams.getCursor() , queryParams.getFromTimestamp(), queryParams.getToTimestamp());
    }

    /**
     * Gets anchoring transaction list generated by a given operator asynchronously.<p>
     * GET /v1/operator/{operator_id}/tx
     * @param operatorId An operator address to query the anchoring transaction list.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getAnchoringTransactionListAsync(String operatorId, ApiCallback<AnchorTransactions> callback) throws ApiException {
        AnchorQueryOptions params = new AnchorQueryOptions();
        return getAnchoringTransactionListAsync(operatorId, params, callback);
    }

    /**
     * Gets anchoring transaction list generated by a given operator asynchronously.<p>
     * GET /v1/operator/{operator_id}/tx
     * @param operatorId An operator address to query the anchoring transaction list.
     * @param queryParams A query options object.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getAnchoringTransactionListAsync(String operatorId, AnchorQueryOptions queryParams, ApiCallback<AnchorTransactions> callback) throws ApiException {
        return dataAnchoringTransactionApi.retrieveAnchorBlockAsync(getChainId(), operatorId, queryParams.getSize(), queryParams.getCursor() , queryParams.getFromTimestamp(), queryParams.getToTimestamp(), callback);
    }

    /**
     * Get anchoring transaction with the given transaction hash.<p>
     * GET /v1/operator/{operator_id}/tx/{tx_hash}
     * @param operatorId An operator address to query the anchoring transaction.
     * @param txHash A transaction hash used for getting anchoring transaction.
     * @return AnchorTransactionDetail
     * @throws ApiException
     */
    public AnchorTransactionDetail getAnchoringTransactionByTxHash(String operatorId, String txHash) throws ApiException {
        return dataAnchoringTransactionApi.getAnchorBlockByTx(getChainId(), operatorId, txHash);
    }

    /**
     * Get anchoring transaction with the given transaction hash asynchronously.<p>
     * GET /v1/operator/{operator_id}/tx/{tx_hash}
     * @param operatorId An operator address to query the anchoring transaction.
     * @param txHash A transaction hash used for getting anchoring transaction.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getAnchoringTransactionByTxHashAsync(String operatorId, String txHash, ApiCallback<AnchorTransactionDetail> callback) throws ApiException {
        return dataAnchoringTransactionApi.getAnchorBlockByTxAsync(getChainId(), operatorId, txHash, callback);
    }

    /**
     * Get anchoring transaction with the given payload id.<p>
     * GET /v1/operator/{operator_id}/payload/{payload_id}
     * @param operatorId An operator address to query the anchoring transaction.
     * @param payloadId A payload id used for getting anchoring transaction.
     * @return AnchorTransactionDetail
     * @throws ApiException
     */
    public AnchorTransactionDetail getAnchoringTransactionByPayloadId(String operatorId, String payloadId) throws ApiException {
        return dataAnchoringTransactionApi.getAnchorBlockByPayloadID(getChainId(), operatorId, payloadId);
    }

    /**
     * Get anchoring transaction with the given payload id asynchronously.<p>
     * GET /v1/operator/{operator_id}/payload/{payload_id}
     * @param operatorId An operator address to query the anchoring transaction.
     * @param payloadId A payload id used for getting anchoring transaction.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getAnchoringTransactionByPayloadIdAsync(String operatorId, String payloadId, ApiCallback<AnchorTransactionDetail> callback) throws ApiException {
        return dataAnchoringTransactionApi.getAnchorBlockByPayloadIDAsync(getChainId(), operatorId, payloadId, callback);
    }

    /**
     * Get operator list.<p>
     * GET /v1/operator
     * @return RetrieveOperatorsResponse
     * @throws ApiException
     */
    public Operators getOperatorList() throws ApiException {
        AnchorQueryOptions queryParams = new AnchorQueryOptions();
        return getOperatorList(queryParams);
    }

    /**
     * Get operator list.<p>
     * GET /v1/operator
     * @param queryParams A query options object.
     * @return RetrieveOperatorsResponse
     * @throws ApiException
     */
    public Operators getOperatorList(AnchorQueryOptions queryParams) throws ApiException {
        return getOperatorApi().retrieveOperators(getChainId(), queryParams.getSize(), queryParams.getCursor(), queryParams.getFromTimestamp(), queryParams.toTimestamp);
    }

    /**
     * Get operator list asynchronously.<p>
     * GET /v1/operator
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getOperatorListAsync(ApiCallback<Operators> callback) throws ApiException {
        AnchorQueryOptions queryParams = new AnchorQueryOptions();
        return getOperatorListAsync(queryParams, callback);
    }

    /**
     * Get operator list asynchronously.<p>
     * GET /v1/operator
     * @param queryParams A query options object.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getOperatorListAsync(AnchorQueryOptions queryParams, ApiCallback<Operators> callback) throws ApiException {
        return getOperatorApi().retrieveOperatorsAsync(getChainId(), queryParams.getSize(), queryParams.getCursor(), queryParams.getFromTimestamp(), queryParams.getToTimestamp(), callback);
    }

    /**
     * Get operator information.<p>
     * GET /v1/operator/{operator_id}
     * @param operatorId An operator address.
     * @return GetOperatorResponse
     * @throws ApiException
     */
    public Operator getOperator(String operatorId) throws ApiException {
        return getOperatorApi().getOperator(chainId, operatorId);
    }

    /**
     * Get operator information asynchronously.<p>
     * GET /v1/operator/{operator_id}
     * @param operatorId An operator address.
     * @param callback The callback function to handle response.
     * @return Call
     * @throws ApiException
     */
    public Call getOperatorAsync(String operatorId, ApiCallback<Operator> callback) throws ApiException {
        return getOperatorApi().getOperatorAsync(chainId, operatorId, callback);
    }

    /**
     * Getter function for dataAnchoringTransactionApi.
     * @return DataAnchoringTransactionApi
     */
    public DataAnchoringTransactionApi getDataAnchoringTransactionApi() {
        return dataAnchoringTransactionApi;
    }

    /**
     * Getter function for operatorApi.
     * @return OperatorApi
     */
    public OperatorApi getOperatorApi() {
        return operatorApi;
    }

    /**
     * Getter function for chain id.
     * @return String
     */
    public String getChainId() {
        return chainId;
    }

    /**
     * Setter function for dataAnchoringTransactionApi
     * @param dataAnchoringTransactionApi An rest-client related Anchor API.
     */
    public void setDataAnchoringTransactionApi(DataAnchoringTransactionApi dataAnchoringTransactionApi) {
        this.dataAnchoringTransactionApi = dataAnchoringTransactionApi;
    }

    /**
     * Setter function for operatorApi
     * @param operatorApi An rest-client related Operator API.
     */
    public void setOperatorApi(OperatorApi operatorApi) {
        this.operatorApi = operatorApi;
    }

    /**
     * Setter function for chain id
     * @param chainId The klaytn network chain id.
     */
    public void setChainId(String chainId) {
        this.chainId = chainId;
    }

    private void checkPayload(Map payload) {
        if(payload.get("id") == null) throw new NullPointerException("Payload must have an 'id' of String type.");
        if(!(payload.get("id") instanceof String)) throw new InvalidParameterException("Payload id must be String type.");
    }

}
