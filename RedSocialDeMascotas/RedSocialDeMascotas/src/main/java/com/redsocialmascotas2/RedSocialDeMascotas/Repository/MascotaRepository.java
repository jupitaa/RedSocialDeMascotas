package com.redsocialmascotas2.RedSocialDeMascotas.Repository;

import com.redsocialmascotas2.RedSocialDeMascotas.models.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Long> {

}
