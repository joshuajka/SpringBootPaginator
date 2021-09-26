package br.ufg.inf.fs.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.ufg.inf.fs.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

	@Query("SELECT h FROM Hotel h WHERE h.nmHotel LIKE %:str%")
	public List<Hotel> findByNmHotel(@Param("str") String str);
	
	
	@Query("SELECT h FROM Hotel h WHERE h.qtdEstrelas = :qtd")
	public List<Hotel> findByQtdEstelas(@Param("qtd") Integer qtd);
}
