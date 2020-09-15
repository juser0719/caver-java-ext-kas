/*
 * Wallet API
 * # Introduction Wallet API는 클레이튼 계정을 만들어 관리하고 트랜잭션을 전송하는 API입니다. Wallet API로 Klaytn 계정을 만들면 여러분은 개인키를 따로 관리할 필요가 없습니다. Wallet API는 BApp을 위해 Klaytn 계정 개인키를 안전하게 보관하는 지갑을 제공합니다. Wallet API 사용에 관한 자세한 내용은 [튜토리얼](링크)을 확인하십시오.  Wallet API는 크게 Klaytn 계정을 만들고 관리하는 Account 파트와 여러 종류의 트랜잭션을 전송하는 Transaction 파트로 나뉩니다.  Wallet API는 Klaytn 계정을 생성, 삭제, 모니터링하고 계정을 다중 서명 계정(Multisig 계정)으로 업데이트하며 KAS에 등록된 모든 계정의 개인키를 관리합니다.  또 Wallet API는 트랜잭션을 만들어 Klaytn에 전송합니다. 이 트랜잭션에는 다중 서명 계정이 보내는 트랜잭션도 포함됩니다. 다중 서명 시 임계값\\(Threshold\\)을 만족하면 트랜잭션은 Klaytn에 자동으로 전송됩니다. 다중 서명에 관한 자세한 내용은 [다음](링크)을 확인하십시오.  트랜잭션은 크게 기본 트랜잭션과 수수료 대납 트랜잭션으로 나뉩니다. 수수료 대납 트랜잭션은 크게 글로벌 수수료 대납 트랜잭션과 사용자 수수료 대납 트랜잭션으로 나뉩니다. 글로벌 수수료 대납 트랜잭션은 Ground X의 KAS 계정에서 트랜잭션 수수료를 일단 대납해주고 나중에 여러분에게 이 수수료를 청구하는 방식입니다. 사용자 수수료 대납 트랜잭션은 여러분이 직접 트랜잭션 수수료를 대납하는 계정을 만들고, 트랜잭션을 보낼 때 이 대납 계정이 트랜잭션 수수료를 납부하도록 하는 방식입니다.  Wallet API는 아래와 같은 기능 및 제약사항을 갖고 있습니다.  | Version | Item | Description | | :--- | :--- | :--- | | 2.0 | 제약사항 | Cypress(Mainnet), Baobab(Testnet) 지원\\(Service Chain 미지원\\) | |  |  | 외부 관리키에 대한 계정 관리 미지원 | |  |  | RLP 인코딩된 트랜잭션의 다중 서명 미지원 | |  | 계정관리 | 계정 생성, 조회, 삭제 | |  |  | 다중 서명 계정 업데이트 | |  | 트랜잭션 관리 | [Basic](https://ko.docs.klaytn.com/klaytn/design/transactions/basic) 트랜잭션 생성 및 전송 | |  |  | [FeeDelegatedWithRatio](https://ko.docs.klaytn.com/klaytn/design/transactions/partial-fee-delegation) 트랜잭션 생성 및 전송 | |  |  | RLP 인코딩된 트랜잭션\\([Legacy](https://ko.docs.klaytn.com/klaytn/design/transactions/basic#txtypelegacytransaction), [Basic](https://ko.docs.klaytn.com/klaytn/design/transactions/basic), [FeeDelegatedWithRatio](https://ko.docs.klaytn.com/klaytn/design/transactions/partial-fee-delegation)\\) 생성 및 전송 | |  |  | 다중 서명 트랜잭션 관리 및 전송 | |  | 관리자 | 리소스 풀 관리\\(생성, 풀 조회, 삭제, 계정 조회\\) |  
 *
 * OpenAPI spec version: 2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api.wallet.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Pending 트랜잭션
 */
@Schema(description = "Pending 트랜잭션")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T04:27:12.757Z[GMT]")
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
   * Get address
   * @return address
  **/
  @Schema(example = "0xc6C9356887b7F7887918Bf577417E5D8De253295", description = "")
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
   * 클레이튼 체인 ID
   * @return chainId
  **/
  @Schema(example = "1001", required = true, description = "클레이튼 체인 ID")
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
   * 트랜잭션 요청 시간
   * @return createdAt
  **/
  @Schema(example = "1599144020", required = true, description = "트랜잭션 요청 시간")
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
   * 트랜잭션의 현재 상태
   * @return status
  **/
  @Schema(example = "2", required = true, description = "트랜잭션의 현재 상태")
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
   * 이 트랜잭션이 전송되는 데 필요한 가중치 총합
   * @return threshold
  **/
  @Schema(example = "4", required = true, description = "이 트랜잭션이 전송되는 데 필요한 가중치 총합")
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
   * 다중 서명 트랜잭션을 식별하는 ID
   * @return transactionId
  **/
  @Schema(example = "0x65111d4fba621a1bfa3bd97c219b3e0454471cf3c07827396f1202946df51ee2", required = true, description = "다중 서명 트랜잭션을 식별하는 ID")
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
  @Schema(description = "")
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
   * 트랜잭션의 타입 (TX)
   * @return type
  **/
  @Schema(example = "TX", description = "트랜잭션의 타입 (TX)")
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
   * 해당 트랜잭션이 최종 업데이트 된 시간
   * @return updatedAt
  **/
  @Schema(example = "1599144020", required = true, description = "해당 트랜잭션이 최종 업데이트 된 시간")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
