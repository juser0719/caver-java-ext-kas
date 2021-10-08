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
/**
 * NFTContractSummaryExtras
 */


public class NFTContractSummaryExtras {
  @SerializedName("name")
  private String name = null;

  @SerializedName("symbol")
  private String symbol = null;

  @SerializedName("totalSupply")
  private String totalSupply = null;

  public NFTContractSummaryExtras name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Token name
   * @return name
  **/
  @Schema(example = "KAS NCoin", description = "Token name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NFTContractSummaryExtras symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Token symbol
   * @return symbol
  **/
  @Schema(example = "KNC", description = "Token symbol")
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public NFTContractSummaryExtras totalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
    return this;
  }

   /**
   * Total issued tokens (in hexadecimal)
   * @return totalSupply
  **/
  @Schema(example = "29", description = "Total issued tokens (in hexadecimal)")
  public String getTotalSupply() {
    return totalSupply;
  }

  public void setTotalSupply(String totalSupply) {
    this.totalSupply = totalSupply;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NFTContractSummaryExtras nfTContractSummaryExtras = (NFTContractSummaryExtras) o;
    return Objects.equals(this.name, nfTContractSummaryExtras.name) &&
        Objects.equals(this.symbol, nfTContractSummaryExtras.symbol) &&
        Objects.equals(this.totalSupply, nfTContractSummaryExtras.totalSupply);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, symbol, totalSupply);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NFTContractSummaryExtras {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    totalSupply: ").append(toIndentedString(totalSupply)).append("\n");
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
