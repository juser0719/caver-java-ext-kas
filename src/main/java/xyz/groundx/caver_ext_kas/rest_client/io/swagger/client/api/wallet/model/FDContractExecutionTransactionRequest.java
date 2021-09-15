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
/**
 * Fee delegation contract execution transaction request schema
 */
@Schema(description = "Fee delegation contract execution transaction request schema")

public class FDContractExecutionTransactionRequest {
  @SerializedName("from")
  private String from = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("input")
  private String input = null;

  @SerializedName("nonce")
  private Long nonce = null;

  @SerializedName("gas")
  private Long gas = 100000l;

  @SerializedName("submit")
  private Boolean submit = null;

  @SerializedName("feeRatio")
  private Long feeRatio = null;

  public FDContractExecutionTransactionRequest from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Klaytn transaction address to send transaction
   * @return from
  **/
  @Schema(example = "552714228230442729489415054454372803633806727088", required = true, description = "Klaytn transaction address to send transaction")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public FDContractExecutionTransactionRequest value(String value) {
    this.value = value;
    return this;
  }

   /**
   * KLAY converted into PEB
   * @return value
  **/
  @Schema(example = "0", description = "KLAY converted into PEB")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FDContractExecutionTransactionRequest to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Contract address
   * @return to
  **/
  @Schema(example = "43981", required = true, description = "Contract address")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public FDContractExecutionTransactionRequest input(String input) {
    this.input = input;
    return this;
  }

   /**
   * Data that is sent along with the transaction and is used for execution.
   * @return input
  **/
  @Schema(example = "291", required = true, description = "Data that is sent along with the transaction and is used for execution.")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public FDContractExecutionTransactionRequest nonce(Long nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * Unique identifier for the transactions being sent (By entering 0, the nonce will be automatically determined)
   * @return nonce
  **/
  @Schema(example = "0", description = "Unique identifier for the transactions being sent (By entering 0, the nonce will be automatically determined)")
  public Long getNonce() {
    return nonce;
  }

  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }

  public FDContractExecutionTransactionRequest gas(Long gas) {
    this.gas = gas;
    return this;
  }

   /**
   * Maximum gas fee to be used for sending the transaction (By entering 0, it will be set to default value))
   * @return gas
  **/
  @Schema(example = "0", description = "Maximum gas fee to be used for sending the transaction (By entering 0, it will be set to default value))")
  public Long getGas() {
    return gas;
  }

  public void setGas(Long gas) {
    this.gas = gas;
  }

  public FDContractExecutionTransactionRequest submit(Boolean submit) {
    this.submit = submit;
    return this;
  }

   /**
   * Shows whether to send the transaction to Klaytn
   * @return submit
  **/
  @Schema(example = "true", description = "Shows whether to send the transaction to Klaytn")
  public Boolean isSubmit() {
    return submit;
  }

  public void setSubmit(Boolean submit) {
    this.submit = submit;
  }

  public FDContractExecutionTransactionRequest feeRatio(Long feeRatio) {
    this.feeRatio = feeRatio;
    return this;
  }

   /**
   * The ratio of the gas fee to be delegated. When it&#x27;s empty or 0, the entire fee will be delegated.
   * maximum: 99
   * @return feeRatio
  **/
  @Schema(example = "20", description = "The ratio of the gas fee to be delegated. When it's empty or 0, the entire fee will be delegated.")
  public Long getFeeRatio() {
    return feeRatio;
  }

  public void setFeeRatio(Long feeRatio) {
    this.feeRatio = feeRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDContractExecutionTransactionRequest fdContractExecutionTransactionRequest = (FDContractExecutionTransactionRequest) o;
    return Objects.equals(this.from, fdContractExecutionTransactionRequest.from) &&
        Objects.equals(this.value, fdContractExecutionTransactionRequest.value) &&
        Objects.equals(this.to, fdContractExecutionTransactionRequest.to) &&
        Objects.equals(this.input, fdContractExecutionTransactionRequest.input) &&
        Objects.equals(this.nonce, fdContractExecutionTransactionRequest.nonce) &&
        Objects.equals(this.gas, fdContractExecutionTransactionRequest.gas) &&
        Objects.equals(this.submit, fdContractExecutionTransactionRequest.submit) &&
        Objects.equals(this.feeRatio, fdContractExecutionTransactionRequest.feeRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, value, to, input, nonce, gas, submit, feeRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDContractExecutionTransactionRequest {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
    sb.append("    feeRatio: ").append(toIndentedString(feeRatio)).append("\n");
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
