/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.comedia.divina.repository.crud;

//import Model.User;
import com.comedia.divina.model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.ui.Model;

/**
 *
 * @author 57318
 */
public interface UserCrudRepository extends CrudRepository <User, Integer>  {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
