package com.example.smartcompta.security.web.controller;

import com.example.smartcompta.security.dto.LinkaccesDto;
import com.example.smartcompta.security.services.Linkacces;
import com.example.smartcompta.security.web.ApiRest.LinkaccesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LinkaccesController implements LinkaccesApi {

    @Autowired
    Linkacces linkaccesService;
    @Override
    public List<LinkaccesDto> findAll() {
        return linkaccesService.listAccesPermitionRole();
    }

    @Override
    public LinkaccesDto save(LinkaccesDto dto) {

        return linkaccesService.save( dto );
    }

    @Override
    public LinkaccesDto findById(Long id) {
        return linkaccesService.findById( id )
                ;
    }

    @Override
    public List<LinkaccesDto> listePermitionByRole(Long idrole) {
        return linkaccesService.findAllpermissionsByRole( idrole );
    }

    @Override
    public boolean findListeparIdRoleAndIdPermition(Long idrole, Long idpermition) {
      if (
        linkaccesService.findListeByIdRoleAndIdPermition( idrole,idpermition ).isEmpty()

      ){
    return false;}
      else {
        return true;}
    }

    @Override
    public LinkaccesDto findOneByIdRoleAndIdPermition(Long idrole, Long idpermition) {
        return linkaccesService.findOneByIdRoleAndIdPermition( idrole,idpermition );
    }

    @Override
    public void modifier(Long id) {

    }

    @Override
    public void delete(Long id) {
        linkaccesService.delete( id );
    }
}
