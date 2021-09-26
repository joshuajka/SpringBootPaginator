package br.ufg.inf.fs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.ufg.inf.fs.entities.Hospede;

public interface HospedeRepository extends JpaRepository<Hospede, Integer>{

	@Query("SELECT h FROM Hospede h WHERE h.nmHospede LIKE %:str%")
	public List<Hospede> findByNomeHospede(@Param("str") String str);

}