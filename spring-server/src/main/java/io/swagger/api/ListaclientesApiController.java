package io.swagger.api;

import io.swagger.model.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-04-15T05:59:20.910Z")

@Controller
public class ListaclientesApiController implements ListaclientesApi {

    private static final Logger log = LoggerFactory.getLogger(ListaclientesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListaclientesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Cliente> cadastraCliente(@ApiParam(value = ""  )  @Valid @RequestBody Cliente cliente_) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Cliente>(objectMapper.readValue("{  \"valorplano\" : 99.0,  \"vencimentofat\" : 20,  \"cpf\" : \"01234567890\",  \"nome\" : \"Paulo Duarte\",  \"plano\" : \"A\",  \"id\" : 1,  \"email\" : \"ph.duartte97@gmail.com\"}", Cliente.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Cliente>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> consultaCliente(@ApiParam(value = "" ,required=true) @RequestHeader(value="id", required=true) Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deletaCliente(@ApiParam(value = "" ,required=true) @RequestHeader(value="id", required=true) Integer id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
