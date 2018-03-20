package co.simplon.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.ModelEntity.ArmeModel;
import co.simplon.Repository.IRepository;

@RestController
public class ArmeController {
	
	@Autowired // instancie la class au démarrage donc va chercher l'interface
	private IRepository iRepositoryArme;
	
	// @RequestMapping(value="/armes", method=RequestMethod.GET)
	@GetMapping(value="/armes")
	public List<ArmeModel> GetArme() {
		
		return iRepositoryArme.findAll();
		// renvoi la liste en format JSON
	}
	
	@PostMapping(value="/ajoutArmes") 
	public ArmeModel PostArme(@RequestBody ArmeModel arme) {
		return iRepositoryArme.save(arme);
	}
	

}
