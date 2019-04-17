/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Cliente;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-15T05:59:20.910Z")

@Api(value = "listaclientes", description = "the listaclientes API")
public interface ListaclientesApi {

    @ApiOperation(value = "Cadastra Cliente", nickname = "cadastraCliente", notes = "Cadastra um novo cliente", response = Cliente.class, tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Cadastro efetuado com sucesso", response = Cliente.class),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servidor") })
    @RequestMapping(value = "/listaclientes/salvar",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Cliente> cadastraCliente(@ApiParam(value = ""  )  @Valid @RequestBody Cliente cliente_);


    @ApiOperation(value = "Consulta Cliente", nickname = "consultaCliente", notes = "Consulta dados de um cliente.", tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/listaclientes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Void> consultaCliente(@ApiParam(value = "" ,required=true) @RequestHeader(value="id", required=true) Integer id);


    @ApiOperation(value = "Deleta Cliente", nickname = "deletaCliente", notes = "Deleta um cliente.", tags={ "Cliente", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Cliente removido com sucesso."),
        @ApiResponse(code = 400, message = "Requisição inválida"),
        @ApiResponse(code = 500, message = "Erro interno no servido") })
    @RequestMapping(value = "/listaclientes/remover/",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deletaCliente(@ApiParam(value = "" ,required=true) @RequestHeader(value="id", required=true) Integer id);

}