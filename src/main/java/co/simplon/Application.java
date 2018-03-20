package co.simplon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.simplon.ModelEntity.ArmeModel;
import co.simplon.Repository.IRepository;

@SpringBootApplication
public class Application implements CommandLineRunner{

	@Autowired
	private IRepository iRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("ça marche !");
		iRepository.save(new ArmeModel("modelArme", "typeArme"));
		iRepository.save(new ArmeModel("modelArme2", "typeArme2"));
		// Pour enregistrer un nouvel objet dans la base avec les données en dur ici à la place du formulaire 
		// dans la vue qui permet d'ajouter une arme
	}
}


// RUN l'application en Java Application