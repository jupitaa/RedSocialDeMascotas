package com.redsocialmascotas2.RedSocialDeMascotas.Services;

import com.redsocialmascotas2.RedSocialDeMascotas.Repository.MascotaRepository;
import com.redsocialmascotas2.RedSocialDeMascotas.Repository.UsuarioRepository;
import com.redsocialmascotas2.RedSocialDeMascotas.models.Mascota;
import com.redsocialmascotas2.RedSocialDeMascotas.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Mascota> obtenerTodasLasMascotas() {
        return mascotaRepository.findAll();
    }

    public Mascota guardarMascota(Mascota mascota, Long usuarioId) {
        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        mascota.setUsuario(usuario);
        return mascotaRepository.save(mascota);
    }

    public Mascota obtenerMascotaPorId(Long id) {
        return mascotaRepository.findById(id).orElse(null);
    }

    public void eliminarMascota(Long id) {
        mascotaRepository.deleteById(id);
    }
}
