package com.example.smartcompta.security.web.ApiRest;

import com.example.smartcompta.security.dto.RoleDto;
import com.example.smartcompta.security.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

import static com.example.smartcompta.security.Root.APP_ROOT;

public interface UserApi {

    @GetMapping(value =APP_ROOT+"/user/liste",produces = MediaType.APPLICATION_JSON_VALUE )
    List<UserDto> findAll();

    @PostMapping(value =APP_ROOT+"/user/create",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    UserDto save(@RequestBody UserDto dto);

    @GetMapping(value =APP_ROOT+"/user/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
    UserDto findById(@PathVariable("id") Long id);

    //@GetMapping(value=APP_ROOT+"/user/email/{email}/password/{password}",produces = MediaType.APPLICATION_JSON_VALUE )
   // UserDto findUserByEmailAndPassword( @PathVariable("email")  String email, String password);

    @GetMapping(value=APP_ROOT+"/user/firstname/{firstname}",produces = MediaType.APPLICATION_JSON_VALUE )
    UserDto findUserByFirstname( @PathVariable("firstname")  String firstname);

    @GetMapping(value=APP_ROOT+"/user/email/{email}",produces = MediaType.APPLICATION_JSON_VALUE )
    UserDto findUserByEmail( @PathVariable("email")  String email );

    @GetMapping(value =APP_ROOT+"/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
    void modifier(@PathVariable("id")  Long id);

    @DeleteMapping(value =APP_ROOT+"/user/delete/{id}" )
    void delete(Long id);
}
