package br.com.alaim.projectJson.repositories;

import br.com.alaim.projectJson.entities.Texto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextoRepository extends JpaRepository<Texto, Long> {

}
