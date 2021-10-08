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
 * RLP User Fee Delegation transaction request schema
 */
@Schema(description = "RLP User Fee Delegation transaction request schema")

public class FDUserProcessRLPRequest {
  @SerializedName("rlp")
  private String rlp = null;

  @SerializedName("submit")
  private Boolean submit = null;

  @SerializedName("feePayer")
  private String feePayer = null;

  @SerializedName("feeRatio")
  private Long feeRatio = null;

  public FDUserProcessRLPRequest rlp(String rlp) {
    this.rlp = rlp;
    return this;
  }

   /**
   * The Klaytn RLP formats SigRLP or TxHashRLP are accepted as RLP values and only (partial) fee delegation transaction type is allowed.
   * @return rlp
  **/
  @Schema(example = "889095813917876143351268397079828703837314014574739495786074888917234422693735025858387074589758435571718921931374280515350922805567401976157267807638139124374361487044922248554271529198078974583551598848834507592653238618839610125947506510757479231676551978799166005818943927131184670633246619831738467648995007833327339035905326552664804598178009323314594791570674009545607967067033284441209801775515400561748291514678529106610962455573456469521012269533975358143271194736260906921570756776332443700557466949720979810612109045965898264834670090636670210503443760241271922009433880679753442316860619008834113749196134031932743664506401114075940680775618526024767547074288215289803134788160526684327505467573965748092744987032909502472515925549271855015607252730227251539714782473234380118283817438884848986539753062803840799258934414221698550399029720199638227710604716345061070679096320207653491700535693672304184299239736671380927838059921286769369120071826013012110007481604199958060383689939158314942879151180897335076143385306647833787889311077480579924112077065345962167372435639541882702962137510202420611861331171552365275034796298406268165130538940441827928201256291360018726105156071270062729110802587321788560302373442213370628702059718314634619029300201", required = true, description = "The Klaytn RLP formats SigRLP or TxHashRLP are accepted as RLP values and only (partial) fee delegation transaction type is allowed.")
  public String getRlp() {
    return rlp;
  }

  public void setRlp(String rlp) {
    this.rlp = rlp;
  }

  public FDUserProcessRLPRequest submit(Boolean submit) {
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

  public FDUserProcessRLPRequest feePayer(String feePayer) {
    this.feePayer = feePayer;
    return this;
  }

   /**
   * Account address for user Fee Delegation
   * @return feePayer
  **/
  @Schema(example = "415487481437216765516808935831180170585317837885", required = true, description = "Account address for user Fee Delegation")
  public String getFeePayer() {
    return feePayer;
  }

  public void setFeePayer(String feePayer) {
    this.feePayer = feePayer;
  }

  public FDUserProcessRLPRequest feeRatio(Long feeRatio) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDUserProcessRLPRequest fdUserProcessRLPRequest = (FDUserProcessRLPRequest) o;
    return Objects.equals(this.rlp, fdUserProcessRLPRequest.rlp) &&
        Objects.equals(this.submit, fdUserProcessRLPRequest.submit) &&
        Objects.equals(this.feePayer, fdUserProcessRLPRequest.feePayer) &&
        Objects.equals(this.feeRatio, fdUserProcessRLPRequest.feeRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rlp, submit, feePayer, feeRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDUserProcessRLPRequest {\n");
    
    sb.append("    rlp: ").append(toIndentedString(rlp)).append("\n");
    sb.append("    submit: ").append(toIndentedString(submit)).append("\n");
    sb.append("    feePayer: ").append(toIndentedString(feePayer)).append("\n");
    sb.append("    feeRatio: ").append(toIndentedString(feeRatio)).append("\n");
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
