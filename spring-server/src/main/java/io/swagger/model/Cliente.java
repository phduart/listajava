package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cliente
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-15T05:59:20.910Z")

public class Cliente   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("plano")
  private String plano = null;

  @JsonProperty("vencimentofat")
  private Integer vencimentofat = null;

  @JsonProperty("valorplano")
  private Double valorplano = null;

  @JsonProperty("email")
  private String email = null;

  public Cliente id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Cliente nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Get nome
   * @return nome
  **/
  @ApiModelProperty(example = "Paulo Duarte", value = "")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cliente cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(example = "01234567890", value = "")

@Size(min=11,max=11) 
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Cliente plano(String plano) {
    this.plano = plano;
    return this;
  }

  /**
   * Get plano
   * @return plano
  **/
  @ApiModelProperty(example = "A", value = "")


  public String getPlano() {
    return plano;
  }

  public void setPlano(String plano) {
    this.plano = plano;
  }

  public Cliente vencimentofat(Integer vencimentofat) {
    this.vencimentofat = vencimentofat;
    return this;
  }

  /**
   * Get vencimentofat
   * @return vencimentofat
  **/
  @ApiModelProperty(example = "20", value = "")


  public Integer getVencimentofat() {
    return vencimentofat;
  }

  public void setVencimentofat(Integer vencimentofat) {
    this.vencimentofat = vencimentofat;
  }

  public Cliente valorplano(Double valorplano) {
    this.valorplano = valorplano;
    return this;
  }

  /**
   * Get valorplano
   * @return valorplano
  **/
  @ApiModelProperty(example = "99.0", value = "")


  public Double getValorplano() {
    return valorplano;
  }

  public void setValorplano(Double valorplano) {
    this.valorplano = valorplano;
  }

  public Cliente email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "ph.duartte97@gmail.com", value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.id, cliente.id) &&
        Objects.equals(this.nome, cliente.nome) &&
        Objects.equals(this.cpf, cliente.cpf) &&
        Objects.equals(this.plano, cliente.plano) &&
        Objects.equals(this.vencimentofat, cliente.vencimentofat) &&
        Objects.equals(this.valorplano, cliente.valorplano) &&
        Objects.equals(this.email, cliente.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, cpf, plano, vencimentofat, valorplano, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    plano: ").append(toIndentedString(plano)).append("\n");
    sb.append("    vencimentofat: ").append(toIndentedString(vencimentofat)).append("\n");
    sb.append("    valorplano: ").append(toIndentedString(valorplano)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

