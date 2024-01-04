package br.com.petz.clientepet.pet.infra;

import br.com.petz.clientepet.pet.domain.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PetStringDataJPARepository extends JpaRepository<Pet, UUID> {
}
