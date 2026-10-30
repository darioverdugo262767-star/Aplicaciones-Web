package com.example.GameVault.service;

import com.example.GameVault.model.Usuario;
import com.example.GameVault.repository.UsuarioRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private HttpSession session;

    public Usuario registrarUsuario(Usuario usuario){
        usuario.setContrasenia(
                passwordEncoder.encode(usuario.getContrasenia())
        );
        return usuarioRepository.save(usuario);
    }

    public Usuario autenticarUsuario(String email, String password){
        Optional<Usuario> usuarioOpt= usuarioRepository.findByEmail(email);

        if(usuarioOpt.isPresent()){
            Usuario usuario = usuarioOpt.get();
            if(passwordEncoder.matches(password, usuario.getContrasenia())){
                return usuario;
            }
        }
        return null;
    }

    public Usuario obtenerUsuarioLogeado(){
        Long usuarioId = (Long) session.getAttribute("usuario_id");

        if(usuarioId != null){
            Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
            if(usuarioOpt.isPresent()){
                return usuarioOpt.get();
            }
        }
        return null;
    }

    public Usuario obtenerUsuarioLoggeado(){
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(1L);

        if(usuarioOpt.isPresent()){
            return usuarioOpt.get();
        }else{
            Usuario usuario = new Usuario();
            usuario.setNombre("Itson");
            usuario.setEmail("itson@gmail.com");
            usuario.setContrasenia("123");

            return usuarioRepository.save(usuario);

        }
    }
}
