/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.ausiasmarch.gamingstore.proyectofinal.repository;


import net.ausiasmarch.gamingstore.proyectofinal.entity.ClienteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

   /* UsuarioEntity findByLoginAndPassword(String login, String password);
    
    @Query(value = "SELECT * FROM usuario u WHERE c.id_tipousuario = :id_tipousuario", nativeQuery = true)
    Page<UsuarioEntity> findByUsuarioXTipousuario(Long id_tipousuario, Pageable pageable);

    Page<UsuarioEntity> findByTipousuario(TipousuarioEntity oTipousuarioEntity, Pageable oPageable);*/
}
