/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import net.ausiasmarch.gamingstore.proyectofinal.entity.ClienteEntity;
import net.ausiasmarch.gamingstore.proyectofinal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

   /* @Autowired
    HttpSession oHttpSession; */

    @Autowired
    ClienteRepository oUsuarioRepository;

    @Autowired
    ClienteRepository oTipousuarioRepository;

   /* @Autowired
    FillService oFillService; */

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(value = "id") Long id) {
        if (oUsuarioRepository.existsById(id)) {
                    return new ResponseEntity<ClienteEntity>(oUsuarioRepository.getOne(id), HttpStatus.OK);
                } else {
                    return new ResponseEntity<ClienteEntity>(oUsuarioRepository.getOne(id), HttpStatus.NOT_FOUND);
                }
       
        
    }
    
   /*  @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long id) {
    if (oUsuarioRepository.existsById(id)) {
                    return new ResponseEntity<Long>(id, HttpStatus.NOT_MODIFIED);
                } else {
                    return new ResponseEntity<Long>(0L, HttpStatus.OK);
                }
    }*/
}
    

