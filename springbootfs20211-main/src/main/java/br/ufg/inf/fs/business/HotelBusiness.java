package br.ufg.inf.fs.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufg.inf.fs.entities.Hotel;
import br.ufg.inf.fs.exceptions.HotelException;
import br.ufg.inf.fs.repositories.HotelRepository;

@Service
public class HotelBusiness {
	
	@Autowired
	private HotelRepository repository;
	
	public List<Hotel> findAll(){
		return repository.findAll();		
	}
	
	public List<Hotel> findName(String str){
		return repository.findByNmHotel(str);
	}

	public List<Hotel> findEstelas(Integer qtd){
		return repository.findByQtdEstelas(qtd);
	}
	
	public Hotel findById(Integer id) {
		Optional<Hotel> retorno = repository.findById(id);
		return retorno.get();
	}
	
	public Hotel insert(Hotel hotel) throws HotelException {
		this.validaHotel(hotel);
		return repository.save(hotel);
	}
	
	public Hotel update(Hotel hotel) throws HotelException {
		this.validaHotel(hotel);
		return repository.save(hotel);
	}
	
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
	
	private void validaHotel(Hotel hotel) throws HotelException {
		if(hotel.getNmHotel() == null || hotel.getNmHotel().length() == 0) {
			throw new HotelException("0109");
		}
		if(hotel.getQtdEstrelas() < 1 || hotel.getQtdEstrelas() > 5) {
			throw new HotelException("0108");
		}
		if(hotel.getEndereco() == null || hotel.getEndereco().length() == 0) {
			throw new HotelException("0110");
		}
	}
}
