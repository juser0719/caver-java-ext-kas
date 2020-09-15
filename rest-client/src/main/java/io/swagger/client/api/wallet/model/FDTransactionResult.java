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
 * Klaytn에 전송한 수수료 대납 트랜잭션 정보
 */
@Schema(description = "Klaytn에 전송한 수수료 대납 트랜잭션 정보")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-15T04:27:12.757Z[GMT]")
public class FDTransactionResult {
  @SerializedName("feePayer")
  private String feePayer = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("gas")
  private Long gas = null;

  @SerializedName("gasPrice")
  private String gasPrice = null;

  @SerializedName("input")
  private String input = null;

  @SerializedName("nonce")
  private Long nonce = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("typeInt")
  private Long typeInt = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("rlp")
  private String rlp = null;

  @SerializedName("signatures")
  private List<Signature> signatures = null;

  @SerializedName("transactionHash")
  private String transactionHash = null;

  @SerializedName("accountKey")
  private String accountKey = null;

  public FDTransactionResult feePayer(String feePayer) {
    this.feePayer = feePayer;
    return this;
  }

   /**
   * 트랜잭션 수수료를 대납할 계정 주소
   * @return feePayer
  **/
  @Schema(example = "0x85b98485444c89880cd9c48807cef727c296f2da", description = "트랜잭션 수수료를 대납할 계정 주소")
  public String getFeePayer() {
    return feePayer;
  }

  public void setFeePayer(String feePayer) {
    this.feePayer = feePayer;
  }

  public FDTransactionResult from(String from) {
    this.from = from;
    return this;
  }

   /**
   * 트랜잭션을 보낸 Klaytn 계정 주소
   * @return from
  **/
  @Schema(example = "0xa809284c83b901ed106aba4ccda14628af128e14", description = "트랜잭션을 보낸 Klaytn 계정 주소")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public FDTransactionResult gas(Long gas) {
    this.gas = gas;
    return this;
  }

   /**
   * 해당 트랜잭션을 보낼 때 사용할 트랜잭션 수수료(gas)의 최대값
   * @return gas
  **/
  @Schema(example = "1000000", description = "해당 트랜잭션을 보낼 때 사용할 트랜잭션 수수료(gas)의 최대값")
  public Long getGas() {
    return gas;
  }

  public void setGas(Long gas) {
    this.gas = gas;
  }

  public FDTransactionResult gasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
    return this;
  }

   /**
   * 해당 트랜잭션을 보낼 때 사용할 트랜잭션 수수료(gas) 비용
   * @return gasPrice
  **/
  @Schema(example = "0x5d21dba00", description = "해당 트랜잭션을 보낼 때 사용할 트랜잭션 수수료(gas) 비용")
  public String getGasPrice() {
    return gasPrice;
  }

  public void setGasPrice(String gasPrice) {
    this.gasPrice = gasPrice;
  }

  public FDTransactionResult input(String input) {
    this.input = input;
    return this;
  }

   /**
   * 트랜잭션을 Klaytn에 보낼 때 함께 보내는 데이터
   * @return input
  **/
  @Schema(example = "0x6d656d6f", description = "트랜잭션을 Klaytn에 보낼 때 함께 보내는 데이터")
  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public FDTransactionResult nonce(Long nonce) {
    this.nonce = nonce;
    return this;
  }

   /**
   * 현재 해당 트랜잭션을 보내는 이가 과거에 보냈던 모든 트랜잭션의 개수
   * @return nonce
  **/
  @Schema(example = "1", description = "현재 해당 트랜잭션을 보내는 이가 과거에 보냈던 모든 트랜잭션의 개수")
  public Long getNonce() {
    return nonce;
  }

  public void setNonce(Long nonce) {
    this.nonce = nonce;
  }

  public FDTransactionResult status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 해당 트랜잭션 전송 후의 상태(“Submitted” 또는 “Pending”)
   * @return status
  **/
  @Schema(example = "Pending", description = "해당 트랜잭션 전송 후의 상태(“Submitted” 또는 “Pending”)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public FDTransactionResult to(String to) {
    this.to = to;
    return this;
  }

   /**
   * KLAY를 받는 Klaytn 계정 주소
   * @return to
  **/
  @Schema(example = "0x2f87ba64de5526f7880f21481effbf950f70005c", description = "KLAY를 받는 Klaytn 계정 주소")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public FDTransactionResult transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Multisig 트랜잭션의 ID
   * @return transactionId
  **/
  @Schema(example = "0x0416bf52b804211220aca957250d6bc2e2c6ab8688e68dc9096ae035d009c334", description = "Multisig 트랜잭션의 ID")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public FDTransactionResult typeInt(Long typeInt) {
    this.typeInt = typeInt;
    return this;
  }

   /**
   * 해당 트랜잭션 타입을 나타내는 숫자값
   * @return typeInt
  **/
  @Schema(example = "17", description = "해당 트랜잭션 타입을 나타내는 숫자값")
  public Long getTypeInt() {
    return typeInt;
  }

  public void setTypeInt(Long typeInt) {
    this.typeInt = typeInt;
  }

  public FDTransactionResult value(String value) {
    this.value = value;
    return this;
  }

   /**
   * peb 단위로 환산된 KLAY
   * @return value
  **/
  @Schema(example = "0x12", description = "peb 단위로 환산된 KLAY")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FDTransactionResult rlp(String rlp) {
    this.rlp = rlp;
    return this;
  }

   /**
   * 해당 트랜잭션의 RLP 직렬화(serialization) 값
   * @return rlp
  **/
  @Schema(example = "0x11f8e2808505d21dba00830f4240942f87ba64de5526f7880f21481effbf950f70005c1294569a3da2e37b4c08e342820d580122e5283bafbc846d656d6ff847f8458207f5a048a6618e31293c2b05c093b6fe5c5f2513b844b793b3560934169f0fb7fa4fb5a02aaa4645c711bf0cc25dc3a3878462b13276143b30fed875455b62e14ab9a0a29485b98485444c89880cd9c48807cef727c296f2daf847f8458207f6a0307c6e2df0ba301a3a535c4cede427ce3d43a8a0ec2aaad17fcde9f753555a86a026e4d176ebd1e66b32b5bfa383edd60884e87fd5e788729116916c9313d30976", required = true, description = "해당 트랜잭션의 RLP 직렬화(serialization) 값")
  public String getRlp() {
    return rlp;
  }

  public void setRlp(String rlp) {
    this.rlp = rlp;
  }

  public FDTransactionResult signatures(List<Signature> signatures) {
    this.signatures = signatures;
    return this;
  }

  public FDTransactionResult addSignaturesItem(Signature signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<Signature>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * Get signatures
   * @return signatures
  **/
  @Schema(description = "")
  public List<Signature> getSignatures() {
    return signatures;
  }

  public void setSignatures(List<Signature> signatures) {
    this.signatures = signatures;
  }

  public FDTransactionResult transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * 해당 트랜잭션에 대한 해시값
   * @return transactionHash
  **/
  @Schema(example = "0x0b3b7f02640692af371060c311576bc42c3c48122e4f68ca032e5076a3f983d0", description = "해당 트랜잭션에 대한 해시값")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public FDTransactionResult accountKey(String accountKey) {
    this.accountKey = accountKey;
    return this;
  }

   /**
   * 새롭게 업데이트된 계정 키
   * @return accountKey
  **/
  @Schema(example = "0x04f84b04f848e303a102f06c992530e09ba93588b3878c5f575314a73e88d420ff1eba7690eeeb7a20f1e301a103ecc37d272d5ff2cee8c0724f9a94b25a748a766c2491a3c198f08942ca42ff68", description = "새롭게 업데이트된 계정 키")
  public String getAccountKey() {
    return accountKey;
  }

  public void setAccountKey(String accountKey) {
    this.accountKey = accountKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDTransactionResult fdTransactionResult = (FDTransactionResult) o;
    return Objects.equals(this.feePayer, fdTransactionResult.feePayer) &&
        Objects.equals(this.from, fdTransactionResult.from) &&
        Objects.equals(this.gas, fdTransactionResult.gas) &&
        Objects.equals(this.gasPrice, fdTransactionResult.gasPrice) &&
        Objects.equals(this.input, fdTransactionResult.input) &&
        Objects.equals(this.nonce, fdTransactionResult.nonce) &&
        Objects.equals(this.status, fdTransactionResult.status) &&
        Objects.equals(this.to, fdTransactionResult.to) &&
        Objects.equals(this.transactionId, fdTransactionResult.transactionId) &&
        Objects.equals(this.typeInt, fdTransactionResult.typeInt) &&
        Objects.equals(this.value, fdTransactionResult.value) &&
        Objects.equals(this.rlp, fdTransactionResult.rlp) &&
        Objects.equals(this.signatures, fdTransactionResult.signatures) &&
        Objects.equals(this.transactionHash, fdTransactionResult.transactionHash) &&
        Objects.equals(this.accountKey, fdTransactionResult.accountKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feePayer, from, gas, gasPrice, input, nonce, status, to, transactionId, typeInt, value, rlp, signatures, transactionHash, accountKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDTransactionResult {\n");
    
    sb.append("    feePayer: ").append(toIndentedString(feePayer)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    gas: ").append(toIndentedString(gas)).append("\n");
    sb.append("    gasPrice: ").append(toIndentedString(gasPrice)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    typeInt: ").append(toIndentedString(typeInt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    rlp: ").append(toIndentedString(rlp)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    accountKey: ").append(toIndentedString(accountKey)).append("\n");
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
