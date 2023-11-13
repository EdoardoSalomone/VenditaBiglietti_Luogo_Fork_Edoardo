package it.dedagroup.venditabiglietti.service.def;

import java.util.List;

import it.dedagroup.venditabiglietti.model.Luogo;

public interface LuogoServiceDef {

	public Luogo save(Luogo luogo);
	public Luogo update(Luogo luogo);
	public void deleteLuogoById(long id);
	public List<Luogo> findAll();
	public Luogo findLuogoById(long id);
	public List<Luogo> findAllLuogoByRiga1AndComune(String riga1, String comune);
	public List<Luogo> findAllLuogoByRiga1(String riga1);
	public Luogo findLuogoByRiga1AndRiga2AndComune(String riga1, String riga2, String comune);
	public List<Luogo> findLuogoByRiga1AndRiga2(String riga1, String riga2);
	public List<Luogo> findAllLuogoByCap(String cap);
	public List<Luogo> findAllLuogoByComune(String comune);
	public List<Luogo> findAllLuogoByProvincia(String provincia);
	public List<Luogo> findAllLuogoByNazionalita(String nazionalita);
	public List<Luogo> findAllLuogoByNazionalitaAndComune(String nazionalita, String comune);
}