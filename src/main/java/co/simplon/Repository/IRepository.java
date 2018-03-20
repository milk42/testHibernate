package co.simplon.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.simplon.ModelEntity.ArmeModel;

public interface IRepository extends JpaRepository<ArmeModel, Long>{
	
	// les méthodes associées à cette interface sont déjà existantes.

}
