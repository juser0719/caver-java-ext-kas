/*
 * Token History API
 * # Introduction  Token History API allows you to query the transaction history of KLAY, FTs (KIP-7 and Labelled ERC-20), NFTs (KIP-17 and Labelled ERC-721), and MTs (KIP-37 and Labelled ERC-1155). You can track KLAY's transaction history or retrieve NFT-related data of a certain EOA.   For more details on using Token History API, please refer to the [Tutorial](https://docs.klaytnapi.com/tutorial).   For any inquiries on this document or KAS in general, please visit [Developer Forum](https://forum.klaytn.com/).  
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model.FtContract;
import xyz.groundx.caver_ext_kas.rest_client.io.swagger.client.api.tokenhistory.model.Transaction;
/**
 * FtTransfer
 */


public class FtTransfer implements AnyOfTransferArrayItems {
  @SerializedName("contract")
  private FtContract contract = null;

  @SerializedName("formattedValue")
  private String formattedValue = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("transaction")
  private Transaction transaction = null;

  @SerializedName("transferType")
  private String transferType = null;

  @SerializedName("value")
  private String value = null;

  public FtTransfer contract(FtContract contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  @Schema(required = true, description = "")
  public FtContract getContract() {
    return contract;
  }

  public void setContract(FtContract contract) {
    this.contract = contract;
  }

  public FtTransfer formattedValue(String formattedValue) {
    this.formattedValue = formattedValue;
    return this;
  }

   /**
   * Formatted value with contracts &#x60;decimals&#x60;
   * @return formattedValue
  **/
  @Schema(example = "0.000000000000000002", required = true, description = "Formatted value with contracts `decimals`")
  public String getFormattedValue() {
    return formattedValue;
  }

  public void setFormattedValue(String formattedValue) {
    this.formattedValue = formattedValue;
  }

  public FtTransfer from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Sender EOA (20-byte)
   * @return from
  **/
  @Schema(example = "538243955260495079143208573429421427237585534683", required = true, description = "Sender EOA (20-byte)")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public FtTransfer to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Receiver EOA (20-byte)
   * @return to
  **/
  @Schema(example = "1031886162996749679318352520149534827025669355376", required = true, description = "Receiver EOA (20-byte)")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public FtTransfer transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @Schema(required = true, description = "")
  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
  }

  public FtTransfer transferType(String transferType) {
    this.transferType = transferType;
    return this;
  }

   /**
   * Transaction type
   * @return transferType
  **/
  @Schema(example = "ft", required = true, description = "Transaction type")
  public String getTransferType() {
    return transferType;
  }

  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }

  public FtTransfer value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Number of tokens sent (in hexadecimal)
   * @return value
  **/
  @Schema(example = "10", required = true, description = "Number of tokens sent (in hexadecimal)")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FtTransfer ftTransfer = (FtTransfer) o;
    return Objects.equals(this.contract, ftTransfer.contract) &&
        Objects.equals(this.formattedValue, ftTransfer.formattedValue) &&
        Objects.equals(this.from, ftTransfer.from) &&
        Objects.equals(this.to, ftTransfer.to) &&
        Objects.equals(this.transaction, ftTransfer.transaction) &&
        Objects.equals(this.transferType, ftTransfer.transferType) &&
        Objects.equals(this.value, ftTransfer.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, formattedValue, from, to, transaction, transferType, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FtTransfer {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    formattedValue: ").append(toIndentedString(formattedValue)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
