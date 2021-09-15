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

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model.MultisigAddress;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.wallet.model.TxData;
/**
 * Pending transaction
 */
@Schema(description = "Pending transaction")

public class PendedTransaction {
  @SerializedName("address")
  private String address = null;

  @SerializedName("chainId")
  private Long chainId = null;

  @SerializedName("createdAt")
  private Long createdAt = null;

  @SerializedName("multiSigKeys")
  private List<MultisigAddress> multiSigKeys = null;

  @SerializedName("status")
  private Long status = null;

  @SerializedName("threshold")
  private Long threshold = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("txData")
  private TxData txData = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("updatedAt")
  private Long updatedAt = null;

  public PendedTransaction address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Multisig account or signer account
   * @return address
  **/
  @Schema(example = "594829357172156062717399305168168515568698243350", required = true, description = "Multisig account or signer account")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PendedTransaction chainId(Long chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * Klaytn Chain ID
   * @return chainId
  **/
  @Schema(example = "1001", required = true, description = "Klaytn Chain ID")
  public Long getChainId() {
    return chainId;
  }

  public void setChainId(Long chainId) {
    this.chainId = chainId;
  }

  public PendedTransaction createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Transaction request time
   * @return createdAt
  **/
  @Schema(example = "1616131131", required = true, description = "Transaction request time")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public PendedTransaction multiSigKeys(List<MultisigAddress> multiSigKeys) {
    this.multiSigKeys = multiSigKeys;
    return this;
  }

  public PendedTransaction addMultiSigKeysItem(MultisigAddress multiSigKeysItem) {
    if (this.multiSigKeys == null) {
      this.multiSigKeys = new ArrayList<MultisigAddress>();
    }
    this.multiSigKeys.add(multiSigKeysItem);
    return this;
  }

   /**
   * Get multiSigKeys
   * @return multiSigKeys
  **/
  @Schema(description = "")
  public List<MultisigAddress> getMultiSigKeys() {
    return multiSigKeys;
  }

  public void setMultiSigKeys(List<MultisigAddress> multiSigKeys) {
    this.multiSigKeys = multiSigKeys;
  }

  public PendedTransaction status(Long status) {
    this.status = status;
    return this;
  }

   /**
   * Current status of transaction.
   * @return status
  **/
  @Schema(example = "2", required = true, description = "Current status of transaction.")
  public Long getStatus() {
    return status;
  }

  public void setStatus(Long status) {
    this.status = status;
  }

  public PendedTransaction threshold(Long threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Threshold required for sending the transaction.
   * @return threshold
  **/
  @Schema(example = "4", required = true, description = "Threshold required for sending the transaction.")
  public Long getThreshold() {
    return threshold;
  }

  public void setThreshold(Long threshold) {
    this.threshold = threshold;
  }

  public PendedTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * ID for sign transactions.
   * @return transactionId
  **/
  @Schema(example = "98897783504676112149066341618276840185174142018660629975310106961992018864962", required = true, description = "ID for sign transactions.")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public PendedTransaction txData(TxData txData) {
    this.txData = txData;
    return this;
  }

   /**
   * Get txData
   * @return txData
  **/
  @Schema(required = true, description = "")
  public TxData getTxData() {
    return txData;
  }

  public void setTxData(TxData txData) {
    this.txData = txData;
  }

  public PendedTransaction type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Transaction types (TX)
   * @return type
  **/
  @Schema(example = "TX", description = "Transaction types (TX)")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PendedTransaction updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time of the latest update of transaction
   * @return updatedAt
  **/
  @Schema(example = "1616131131", required = true, description = "The time of the latest update of transaction")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PendedTransaction pendedTransaction = (PendedTransaction) o;
    return Objects.equals(this.address, pendedTransaction.address) &&
        Objects.equals(this.chainId, pendedTransaction.chainId) &&
        Objects.equals(this.createdAt, pendedTransaction.createdAt) &&
        Objects.equals(this.multiSigKeys, pendedTransaction.multiSigKeys) &&
        Objects.equals(this.status, pendedTransaction.status) &&
        Objects.equals(this.threshold, pendedTransaction.threshold) &&
        Objects.equals(this.transactionId, pendedTransaction.transactionId) &&
        Objects.equals(this.txData, pendedTransaction.txData) &&
        Objects.equals(this.type, pendedTransaction.type) &&
        Objects.equals(this.updatedAt, pendedTransaction.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, chainId, createdAt, multiSigKeys, status, threshold, transactionId, txData, type, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PendedTransaction {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    multiSigKeys: ").append(toIndentedString(multiSigKeys)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    txData: ").append(toIndentedString(txData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
